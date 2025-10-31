/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_2;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.Arrays.asList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 *
 * @author Usuario
 */
public class Punto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
        
        //a)
        Optional<String> nombreCollector = names
                .collect(
                        Collectors.maxBy(
                                Comparator.comparingInt(String::length)));
        
        //b)
        int t;
        Optional<String> nombreReduce = names
                .reduce(t, Integer::Length)         //CORREGIR, FUNCIONA COMO UN FOLD DE HASKELL Y USAR EL ACUMULADOR
                .collect(toList());
                
        
        //names.forEach(System.out::println);
        //String auxString = names.collect(Collectors.joining(", "));
       // System.out.println("Nombres: \n" + auxString);
        //Supuestamente eso imprime al Stream, pero por alguna razon (Seguramente version del IDE) no anda
        
        System.out.println("Nombre mas largo (Collector): " + nombreCollector.get());
    }
    
}
