package org.floresmateo.model.figura;

import org.floresmateo.vista.SolicitaDatos;

public abstract class Figura implements SolicitaDatos
{
    private String nombre;

    public Figura()
    {
    }

    /*
    Constructor y getter del atributo "nombre", al que posteriormente todas las figuras
    le asignaran su nombre cuando llamen al constructor del super (de esta clase).
     */
    public Figura(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double area( );

    public abstract double perimetro();
}
