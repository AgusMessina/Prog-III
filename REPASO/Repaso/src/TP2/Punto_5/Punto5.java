/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.Punto_5;
/**
 *
 * @author agusg
 */
public class Punto5 {
    public long contadorMinusculasString(String x){
        return x.chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .count();      
    }
}
