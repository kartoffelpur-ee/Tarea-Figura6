package org.floresmateo.model.figura.figura2;

import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

public class Escaleno extends Isosceles
{
    private double lado3;

    public Escaleno(double base, double altura, double lado1, double lado2, double lado3)
    {
        super(base, altura, lado1, lado2);
        this.lado3 = lado3;
    }

    public Escaleno()
    {
    }

    public Escaleno(String nombre) {
        super(nombre);
    }

    public double getLado3()
    {
        return lado3;
    }

    public void setLado3(double lado3)
    {
        this.lado3 = lado3;
    }

    @Override
    public double perimetro()
    {
        return lado1+lado2+lado3;
    }

    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado3( );
        lado3 = ReadUtil.readInt( );
    }
}