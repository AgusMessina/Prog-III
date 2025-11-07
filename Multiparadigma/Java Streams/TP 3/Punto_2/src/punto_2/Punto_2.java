/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_2;

import java.util.stream.Stream;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

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
        System.out.println("Nombre mas largo (Collector): " + nombreCollector.get());
        
        //b)
        String nombreReduce = names
                .reduce("", (a,b) -> (a.length() > b.length()) ?  a : b);               // EL ? SIRVE PARA COMPARAR b CON a        
        
        
        
        Optional <String> nombreReduceO = names                         
                .reduce((a,b) -> (a.length() > b.length()) ?  a : b);                   // EL ? SIRVE PARA COMPARAR b CON a  
        
                
        
        System.out.println("Nombre mas largo (Reduce): " + nombreReduce);
        System.out.println("Nombre mas largo (Reduce Optional): " + nombreReduceO.get());
    }
    
}


