package org.floresmateo.util;

import org.floresmateo.model.figura.*;
import org.floresmateo.model.figura.figura2.Escaleno;
import org.floresmateo.model.figura.figura2.Isosceles;

public class FiguraFactory
{
    public static Figura getFiguraByFiguraEnum( FiguraEnum figuraEnum )
    {
        switch (figuraEnum)
        {
            case CUADRADO:
                return new Cuadrado( "Cuadrado" );
            case ESCALENO:
                return new Escaleno( "Triángulo escaleno" );
            case ISOSCELES:
                return new Isosceles("Triángulo isósceles" );
            case EQUILATERO:
                return new Equilatero( "Triángulo equilátero" );
            case CIRCULO:
                return new Circulo( "Círculo" );
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}
