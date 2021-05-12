package by.bsu.frct.entity;

import java.util.Objects;

public class Thermometer {

    private String name;
    private double componentA;
    private double componentB;
    private double componentC;

    public Thermometer(){ };

    public Thermometer(String name, double componentA, double componentB, double componentC) {
        super();
        this.name = name;
        this.componentA = componentA;
        this.componentB = componentB;
        this.componentC = componentC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getComponentA() {
        return componentA;
    }

    public void setComponentA(double componentA) {
        this.componentA = componentA;
    }

    public double getComponentB() {
        return componentB;
    }

    public void setComponentB(double componentB) {
        this.componentB = componentB;
    }

    public double getComponentC() {
        return componentC;
    }

    public void setComponentC(double componentC) {
        this.componentC = componentC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thermometer that = (Thermometer) o;
        return Double.compare(that.componentA, componentA) == 0 &&
                Double.compare(that.componentB, componentB) == 0 &&
                Double.compare(that.componentC, componentC) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, componentA, componentB, componentC);
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "name='" + name + '\'' +
                ", componentA=" + componentA +
                ", componentB=" + componentB +
                ", componentC=" + componentC +
                '}';
    }
}
