package by.bsu.frct.dao;

import by.bsu.frct.entity.Thermometer;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CreateThermometer {
    private static final Thermometer Platina1 = new Thermometer("Платиновые ТС и ЧЭ, a = 0,00385 C-1",
            3.9083 * 10e-3,
            -5.775 * 10e-7,
            -4.183 * 10e-12);
    private static final Thermometer Platina2 = new Thermometer("Платиновые ТС и ЧЭ, a = 0,00391 C-1",
            3.9690 * 10e-3,
            -5.841 * 10e-7,
            -4.330 * 10e-12);
    private static final Thermometer Med = new Thermometer("Медные ТС и ЧЭ, a = 0,00428 C-1",
            3.280 * 10e-3,
            -6.2032 * 10e-7,
            8.5154 * 10e-12);
    private static final Thermometer Nikel = new Thermometer("Никелевые ТС и ЧЭ, a = 0,00617 C-1",
            5.4963 * 10e-3,
            -6.7756 * 10e-7,
            -9.2004 * 10e-10);
    private static final List<Thermometer> list = Collections.unmodifiableList(
            new ArrayList<Thermometer>() {{
                add(Platina1);
                add(Platina2);
                add(Med);
                add(Nikel);
            }}
    );

    public static List<Thermometer> getListThermometer(){
        return list;
    }
}
