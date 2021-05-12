package by.bsu.frct.view.utils;

import by.bsu.frct.entity.Thermometer;

public class Function {

    private static Function instance;

    private Function(){

    }

    public static Function getInstance() {
        if (instance == null){
            instance = new Function();
        }
        return instance;
    }

    public double function1(double zeroResist, double fromT, Thermometer thermometer){
        return zeroResist*(1+thermometer.getComponentA()*fromT
                +thermometer.getComponentB()*Math.pow(fromT,2)
                +thermometer.getComponentC()*(fromT-100)*Math.pow(fromT,3));
    }

    public double function2(double zeroResist, double fromT, Thermometer thermometer){
        return zeroResist*(1
                +thermometer.getComponentA()*fromT
                +thermometer.getComponentB()*Math.pow(fromT,2));
    }
}
