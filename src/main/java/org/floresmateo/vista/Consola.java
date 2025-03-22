package org.floresmateo.vista;

import org.floresmateo.historial.Historiales;
import org.floresmateo.model.figura.Figura;
import org.floresmateo.util.FiguraFactory;
import org.floresmateo.util.ReadUtil;
import org.floresmateo.model.figura.FiguraEnum;

public class Consola implements Ejecutable
{
    private static Consola consola;
    private Historiales historiales;

    private Consola()
    {
    }

    public static Consola getInstance( )
    {
        if(consola==null)
        {
            consola = new Consola();
        }
        return consola;
    }

    @Override
    public void run( )
    {
        boolean flag = true;
        int opcion = 0;
        FiguraEnum figuraEnum = null;
        Figura figura = null;

        while( flag )
        {
            Menu.principal( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );

            figuraEnum = FiguraEnum.getFiguraEnumById( opcion );

            if( FiguraEnum.SALIR.equals( figuraEnum ) )
            {
                flag = false;
            }
            if( FiguraEnum.OPCION_ERRONEA.equals( figuraEnum ) )
            {
                Menu.opcionInvalida( );
            }

            figura = FiguraFactory.getFiguraByFiguraEnum( figuraEnum );
            if( figura != null )
            {
                figura.leeDatos( );
                Menu.calcula( figura );
                /*
                Si historiales no es nulo, es decir, existe un
                ArrayList, se agrega la figura creada.
                 */
                if( historiales!=null )
                {
                    historiales.addFigura(figura);
                }
            }
        }
    }

    @Override
    public void addHistoriales(Historiales historiales)
    {
        this.historiales = historiales;
    }
}
