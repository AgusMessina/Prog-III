/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.Punto_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author agusg
 */
public class Punto6 {
    public long contadorMinusculasString(String x){
        return x.chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .count();      
    }
    
    public Optional<String> mayorMinusculas(List<String> x){
        return x.stream()
                .max(Comparator.comparingLong(s -> contadorMinusculasString(s)));
    }
}
