package org.floresmateo.inicio;

import org.floresmateo.historial.Historia;
import org.floresmateo.historial.Historiales;
import org.floresmateo.model.figura.TipoEjecutable;
import org.floresmateo.util.ReadUtil;
import org.floresmateo.vista.Ejecutable;
import org.floresmateo.vista.Menu;

public class Inicio {
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        TipoEjecutable tipoEjecutable = null;
        Historiales historiales = Historia.getInstance();
        /*
        Crea un objeto Historiales que accede a la instancia de
        Historia, permitiendo manipular el ArrayList e imprimirla.
         */
        Ejecutable ejecutable = null;

        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            tipoEjecutable = TipoEjecutable.getTipoEjecutableById( opcion );

            if( TipoEjecutable.SALIR.equals( tipoEjecutable ) )
            {
                flag = false;
            }
            if( TipoEjecutable.HISTORIAL.equals( tipoEjecutable ))
            {
                //Imprime el ArrayList contenido en Historia
                historiales.imprimir();
            }
            if( TipoEjecutable.OPCION_ERRONEA.equals( tipoEjecutable ) )
            {
                Menu.opcionInvalida( );
            }
            if( tipoEjecutable.getEjecutable( ) != null )
            {
                ejecutable = tipoEjecutable.getEjecutable( );
                ejecutable.addHistoriales(historiales);
                ejecutable.run();
            }
        }
    }
}