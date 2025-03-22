package org.floresmateo.model.figura.figura2;

import org.floresmateo.model.figura.Equilatero;
import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Menu;

public class Isosceles extends Equilatero
{
    protected double lado2;

    public Isosceles(double base, double altura, double lado1, double lado2)
    {
        super(base, altura, lado1);
        this.lado2 = lado2;
    }

    public Isosceles(String nombre) {
        super(nombre);
    }

    public Isosceles()
    {
    }

    public double getLado2()
    {
        return lado1;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }

    @Override
    public double perimetro()
    {
        return (2*lado1) + lado2;
    }

    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado2( );
        lado2 = ReadUtil.readInt( );
    }
}
