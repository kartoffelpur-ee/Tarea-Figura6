package org.floresmateo.model.figura;

import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

public class Circulo extends Figura
{
    private double radio;

    public Circulo()
    {
    }

    public Circulo(double radio, String nombre)
    {
        this.radio = radio;
    }

    public Circulo(String nombre) {
        super(nombre);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }

    @Override
    public double perimetro() {
        return Math.PI*radio*2;
    }

    @Override
    public void leeDatos() {
        Menu.leeRadio( );
        radio = ReadUtil.readDouble( );
    }
}
