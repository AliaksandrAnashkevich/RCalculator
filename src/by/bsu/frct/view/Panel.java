package by.bsu.frct.view;

import by.bsu.frct.entity.Thermometer;
import by.bsu.frct.dao.CreateThermometer;
import by.bsu.frct.view.utils.Function;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.stream.Collectors;

public class Panel extends JPanel {

    private List<Thermometer> thermometerList;

    public Panel(Frame frame){
        thermometerList = CreateThermometer.getListThermometer();
        JTextField input1 = new JTextField("0", 10);
        JTextField input2 = new JTextField("0", 10);
        JTextField output2 = new JTextField("0", 10);
        JButton buttonResult = new JButton("Result");
        GridLayout layout = new GridLayout(3, 4, 60, 60);
        setLayout(layout);
        JComboBox<String> box = new JComboBox<>();

        for (Thermometer thermometer : thermometerList) {
            box.addItem(thermometer.getName());
        }

        add(new JLabel("Type TR"));
        add(box);
        add(new JLabel("R0, Om"));
        add(input1);
        add(new JLabel("   "));
        add(new JLabel("   "));
        add(new JLabel("T, C"));
        add(input2);
        add(new JLabel("Rt, Om"));
        add(output2);
        add(new JLabel("   "));
        add(new JLabel("   "));
        add(new JLabel("   "));
        add(buttonResult);
        buttonResult.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    double result = 0;
                    double zeroResist = Double.parseDouble(input1.getText());
                    double fromT = Double.parseDouble(input2.getText());
                    String fromType = String.valueOf(box.getSelectedItem());
                    Thermometer thermometer = thermometerList
                            .stream()
                            .filter(u -> u.getName().equals(fromType))
                            .collect(Collectors.toList()).get(0);
                    if (fromT >= -200 && fromT < 0) {
                        result = Function.getInstance().function1(zeroResist, fromT, thermometer);
                    } else if (fromT>=0 && fromT<=850){
                        result = Function.getInstance().function2(zeroResist, fromT, thermometer);
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "Error",
                                "Incorrect Data",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    output2.setText(String.format("%.5f", result));
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(frame,
                            "Error",
                            "Incorrect Data Type",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
