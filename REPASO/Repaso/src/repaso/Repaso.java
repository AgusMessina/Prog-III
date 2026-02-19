/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author agusg
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //PRACTICO 3
        
        List<String> collected = Stream.of("a", "b", "hello")
            .map(string -> string.toUpperCase())
            .toList();
        
        List<String> mod = Stream.of("a", "b", "hello")
            .map(String::toUpperCase)
            .toList();
        
        System.out.println("Funcion normal: " + collected);
        System.out.println("Referencia a metodo: " + mod);
        //assertEquals(asList("A", "B", "HELLO"), collected);
        
        System.out.println("---------------------------");
        
        int count = Stream.of(1, 2, 3)
            .reduce(0, (acc, element) -> acc + element);
        
        Optional<Integer> countt = Stream.of(1,2,3)
                .reduce(Integer::sum);
        
        System.out.println("Funcion normal: " + count);
        System.out.println("Referencia a metodo: " + countt);
        
        System.out.println("----------------------------");
        
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
            .flatMap(numbers -> numbers.stream())
            .toList();
        
        List<Integer> juntos = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(List::stream)
                .toList();
        
        System.out.println("Funcion normal: " + together);
        System.out.println("Referencia a metodo: " + juntos);
        
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        
        List<String> names = Arrays.asList("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
        
        //a)
        Optional <String> collector = names.stream()
                .max(Comparator.comparing(String::length));
        
        System.out.println("El nombre mas largo es (Collector): " + collector.get());
        
       
        
        //b)
        Optional <String> reduce = names.stream()
                .reduce((a, b) -> a.length() >= b.length() ? a : b);
        
        System.out.println("El nombre mas largo es (Reduce): " + reduce.get());
    }
    
}
