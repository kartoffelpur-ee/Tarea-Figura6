package org.floresmateo.vista;

import org.floresmateo.historial.Historiales;

public interface Ejecutable
{
    void run( );
    void addHistoriales( Historiales historiales );
    /*
    El ejecutable, independientemente del tipo de ejecutable,
    será el responsable de añadir las figuras al ArrayList
    del historial de cálculos realizados.
     */
}