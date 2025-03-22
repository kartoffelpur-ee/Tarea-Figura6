package org.floresmateo.historial;

import org.floresmateo.model.figura.Figura;

import java.util.ArrayList;
import java.util.List;

public class Historia implements Historiales
{
    private static Historia historia;
    private List<Figura> list;

    private Historia()
    {
    }

    public static Historia getInstance()
    {
        if(historia == null)
        {
            historia = new Historia();
        }
        return historia;
    }

    @Override
    public void imprimir() {
        if(list == null||list.isEmpty())
        //Si la lista es nula o está vacía...
        {
            System.out.println(":( NO se han realizado operaciones :(");
            return;
        }
        /*
        Recorre todos los elementos de tipo figura e imprime
        lo de abajo para cada uno.
         */
        list.forEach(f -> {
            System.out.println("");
            /*
            Se mandan a llamar directamente los métodos área
            y perímetro con "f", porque "f" está actuando como
            el objeto Figura de la lista dentro de la lambda.
             */
            System.out.println(f.getNombre());
            System.out.println( "\t> A = " + f.area( ) +"cm²" );
            System.out.println( "\t> P = " + f.perimetro( ) +"cm" );
        });
    }

    @Override
    public void addFigura(Figura figura) {
        if(list == null)
        /*
        Si la lista es nula, crea una. Similar a
        lo que pasa con getInstance.
         */
        {
            list = new ArrayList<>();
        }
        //Ya que existe la lista, añade figura cuando se llama.
        list.add(figura);
    }
}
