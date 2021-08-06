package com.redbee.academy.clase3;

import java.util.Locale;

public class Palindromo {

    /**
     * Generar un algoritmo que resuelva si una palabra es palindramo.
     *
     * Una palabra es palindromo cuando se lee de izquierda a derecha y de derecha a izquierda.
     * Por ej: neuquen
     *
     * @param palabra
     * @return
     */
    public static Boolean esPalindromo(String palabra) {
        String nuevaPalabra = palabra.toLowerCase(Locale.ROOT).replaceAll("\\s","");

        for(int i = 0; i < nuevaPalabra.length() / 2; i++){
            if(nuevaPalabra.charAt(i) != nuevaPalabra.charAt(nuevaPalabra.length() - (i + 1) )){
                return false;
            }
        }
        return  true;
    }
}
