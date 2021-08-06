package com.redbee.academy.clase3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cuil {

    /**
     * Un CUIL es un número que consta de 11 dígitos y está conformado de la siguiente manera:
     *
     * XX-12345678-Y
     *
     * Donde XX es el tipo de persona física o jurídica y pueden ser los siguientes:
     * 27 es para mujeres
     * 20 es para hombres
     * 23 puede ser ambos (se usa cuando hay otro número igual)
     * 30 empresas
     *
     * Generar un algoritmo para poder calcular el valor de Y que se hace de la siguiente forma:
     * A cada uno de los 10 dígitos que conocemos, se multiplica por: 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 respectivamente
     *
     *
     * Se suman los valores obtenidos, el resultado se divide por 11, y del resultado  se toma el primer decimal.
     * Ese primer decimal se resta a 11 y el resultado es el numero verificador.
     *
     *
     * EJEMPLO
     * DNI 12.345.678 Masculino
     *
     * 2 0 1 2 3 4 5 6 7 8
     * x
     * 5 4 3 2 7 6 5 4 3 2
     * ————————————————————
     * 10+0+3+4+21+24+25+24+21+16= 148
     *
     *
     * 148 dividido 11 = 5 ( porque 148/11= 13,454 –; .454 se redondea a 5).
     * 11-5 = 6
     *
     * Entonces, el CUIL es 20-12345678-6
     *
     * @param tipoPersona
     * @param dni
     * @return
     */
    public static Integer calcular(Integer tipoPersona, Integer dni) {
        //TODO refactorizar
        int aux = 0;
        int digito;
        int suma = 0;
        int resultado;
        Float division;
        List<Integer> digitosDni = new ArrayList<>();
        List<Integer> multiplicadores =  Arrays.asList(5, 4, 3, 2, 7, 6, 5, 4, 3, 2);


        for(int i = 10; i > 0; i--){
            digito = (dni + tipoPersona* (int) Math.pow(10,8))/ (int) Math.pow(10, i-1);
            digitosDni.add( digito - (aux*10) );
            aux = digito;
        }

        for(int j = 0; j < digitosDni.size(); j++){
            suma += digitosDni.get(j) * multiplicadores.get(j);
        }

        division = (float) suma / 11 ;

        resultado = Math.round((division - division.intValue()) * 10) ;

        return 11 - resultado;
    }
}
