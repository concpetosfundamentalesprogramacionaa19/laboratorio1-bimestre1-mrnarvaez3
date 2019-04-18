/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Problema1 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
       double costo;
       int hora;
       //entrada de datos
        System.out.println("Por favor ingrese el numero de horas: ");
        hora = entrada.nextInt();
        System.out.println("Por favor ingrese el costo por hora: ");
        costo = entrada.nextDouble();
        //calculo datos
        double sueldo = costo*hora;
        double descuento = (sueldo * 0.10);
        double total = sueldo - descuento;
        //salida de datos
        System.out.printf("Su descuento del seguro social es "
                + "de: %.2f$\n",descuento);
        System.out.printf("El sueldo mensual del trabajador es: %.2f$\n",total);
    }
    
}
