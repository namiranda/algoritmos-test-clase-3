package com.redbee.academy.clase3;

public class Digitos {


    /**
     * Escriba un programa que determine la cantidad de dígitos en un número
     *
     * @return
     */
    public static Integer resolver(Long numero) {
        int digitos = 0;

        for(int i = 20; i >= 1 ; i--){
            if(numero < Math.pow(10, i)){
                digitos = i;
            }
        }
        return digitos;
    }
}
