package org.floresmateo.vista;

import org.floresmateo.model.figura.Figura;

public class Menu
{
    public static void principal( )
    {
        System.out.println("\n\t::: ¡Bienvenido al programa de figuras! :::");
        System.out.println("\t> Selecciona una opción:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo equilátero");
        System.out.println("3. Triángulo isósceles");
        System.out.println("4. Triángulo escaleno");
        System.out.println("5. Círculo");
        System.out.println("6. Salir");
    }

    public static void principal2( )
    {
        System.out.println("\n\t::: Menú principal :::");
        System.out.println("\t> Selecciona una opción:");
        System.out.println("1. Consola");
        System.out.println("2. Ventana");
        System.out.println("3. Historial de operaciones");
        System.out.println("4. Salir");
    }

    public static void opcionInvalida( )
    {
        System.out.println("\t¡ERROR!¡La opción no es correcta!");
    }

    public static void seleccionaOpcion( )
    {
        System.out.print("> Dame una opción: ");
    }

    public static void errorDato( )
    {
        System.out.println("\t¡ERROR!¡Ese no es un dato válido!");
    }

    public static void leeLado( )
    {
        System.out.print( "> Dame la medida del lado en cm: " );
    }

    public static void leeBase( )
    {
        System.out.print( "> Dame la medida de la base en cm: " );
    }

    public static void leeAltura( )
    {
        System.out.print( "> Dame la medida de la altura en cm: " );
    }

    public static void leeLado1( )
    {
        System.out.print( "> Dame la medida de un lado en cm: " );
    }

    public static void leeLado2( )
    {
        System.out.print( "> Dame la medida del segundo lado en cm: " );
    }

    public static void leeLado3( )
    {
        System.out.print( "> Dame la medida del tercer lado en cm: " );
    }

    public static void leeRadio( )
    {
        System.out.print( "> Dame la medida del radio en cm: " );
    }

    public static void encabezadoHistorial( )
    {
        System.out.println("\n\t::: Historial de operaciones :::");
        System.out.println("\t> ");
    }

    public static void calcula( Figura figura )
    {
        System.out.println( "> A = " + figura.area( ) +"cm²" );
        System.out.println( "> P = " + figura.perimetro( ) +"cm" );
    }

}
