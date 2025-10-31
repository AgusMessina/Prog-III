/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_1;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.Arrays.asList;
/**
 *
 * @author Usuario
 */
public class Punto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PUNTO A)\n");
        //a)
        List<String> collected = Stream.of("a", "b", "hello")
        .map(string -> string.toUpperCase())
        .collect(toList());
        System.out.println("Lista collected: " + collected.toString() + "\n");
        
        //RESULTADO
        List<String> resA = Stream.of("a", "b", "hello")
        .map(String::toUpperCase)
        .collect(toList());
        System.out.println("Lista resA: " + resA.toString() + "\n");
        
        System.out.println("PUNTO B)\n");
        //b)
        int count = Stream.of(1, 2, 3)
        .reduce(0, (acc, element) -> acc + element);
        System.out.println("Count tiene que ser igual a 6");
        System.out.println("Count: " + count + "\n");
        
        //resultado
        int resB = Stream.of(1, 2, 3)
        .reduce(0, Integer :: sum);
        System.out.println("resB tiene que ser igual a 6");
        System.out.println("resB: " + resB + "\n");
        
        System.out.println("PUNTO C)\n");
        //c)
        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
        .flatMap(numbers -> numbers.stream())
        .collect(toList());
        System.out.println("Together tiene que ser [1, 2, 3, 4]");
        System.out.println("Together: " + together.toString() + "\n");
        
        //resultado
        List<Integer> resC = Stream.of(asList(1, 2), asList(3, 4))
        .flatMap(List::stream)
        .collect(toList());
        System.out.println("resC tiene que ser [1, 2 ,3, 4]");
        System.out.println("resC: " + resC.toString() + "\n\n");
    }
}
