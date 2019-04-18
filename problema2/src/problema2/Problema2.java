/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String x;
     String y;
     String z;
     double m;
    Scanner entrada;
        entrada = new Scanner(System.in);
    //entrada de datos
        System.out.println("Por favor ingrese la variable X: ");
        x = entrada.nextLine();
        System.out.println("Por favor ingrese la variable Y: ");
        y = entrada.nextLine();
        System.out.println("Por favor ingrese la variable Z: ");
        z = entrada.nextLine();
        double valorx = Double.parseDouble(x);
        double valory = Double.parseDouble(y);
        double valorz = Double.parseDouble(z);
        //calculo
         m = (valorx+(valory/valorz))/(valorx-(valory/valorz));
         //salida de datos
         System.out.printf("El valor m, en base a las variables:\n"
                 + "x= %s\n  y= %s\n\tz= %s\n",x,y,z);
         System.out.printf("da como resultado \n\t\tm= %.2f\n",m);
    }
    
}
