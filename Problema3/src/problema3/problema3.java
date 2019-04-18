/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String nota1; 
    String nota2; 
    String nota3; 
    String bandera;
    Scanner entrada = new Scanner(System.in);
    //  entrada de datos
        System.out.println("Ingrese la nota 1: ");
        nota1 = entrada.nextLine();
        System.out.println("Ingrese la nota 2: ");
        nota2 = entrada.nextLine();
        System.out.println("Ingrese la nota 3");
        nota3 = entrada.nextLine();
    //  conversion de datos
        double valor1 = Double.parseDouble(nota1);
        double valor2 = Double.parseDouble(nota2);
        double valor3 = Double.parseDouble(nota3);
    //  calculo y salida de datos
    double promedio = ((valor1 + valor2 + valor3)/3);
    bandera = promedio> 14? "Usted paso el año" : "Usted no paso el año";
        System.out.println(bandera);
    }
   
   
}
