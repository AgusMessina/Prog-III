/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test_calculadora;
import java.util.function.BinaryOperator;
import java.util.function.Function;


/**
 *
 * @author Usuario
 */

public class Test_caluladora{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valorA = 24.5;
        double valorB = 3.755;
        Double resultado;
        
        //Para usar una Operacion Lambda se tiene que utilizar el metodo ".apply()" sobre la operacion correspondiente
        //Operaciones Lambda (Un parametro)
        Function<Double, Double> raizCuadrada = a -> Math.sqrt(a);
        Function<Double, Double> cuadrado = a -> a*a;
        
        //Operaciones Lambda (Dos parametros)
        BinaryOperator<Double> multiplicacion = (a,b) -> a * b;
        BinaryOperator<Double> division = (a,b) -> a/b;
        BinaryOperator<Double> suma = (a,b) -> a + b;
        BinaryOperator<Double> resta = (a,b) -> a - b;
        
        
        
        
        System.out.println("Valor 1: " + valorA + "\nValor 2: " + valorB + "\n");
        
       
        resultado = raizCuadrada.apply(valorA);
        System.out.println("Raiz cuadrada de Valor 1: " + resultado + "\n");
        resultado = raizCuadrada.apply(valorB);
        System.out.println("Raiz cuadrada de Valor 2: " + resultado + "\n");
        
        resultado = cuadrado.apply(valorA);
        System.out.println("Cuadrado del Valor 1: " + resultado + "\n");
        resultado = cuadrado.apply(valorB);
        System.out.println("Cuadrado del Valor 2: " + resultado + "\n");
        
        resultado = multiplicacion.apply(valorA, valorB);
        System.out.println("Multiplicacion: " + resultado + "\n");
        
        resultado = division.apply(valorA, valorB);
        System.out.println("Division: " + resultado + "\n");
        
        resultado = suma.apply(valorA, valorB);
        System.out.println("Suma: " + resultado + "\n");
        
        resultado = resta.apply(valorA, valorB);
        System.out.println("Resta: " + resultado + "\n");
        
    }
}
