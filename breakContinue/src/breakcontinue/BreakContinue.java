/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakcontinue;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class BreakContinue {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        int num = 0;
        int cont = 0;
        int sum = 0;
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el nª " + (i + 1) + ": ");
            num = sn.nextInt();
            cont++;
            sum += num;
            if (num == 10) {
                break;
            } else {
                continue;
            }
        }
        System.out.println("Has introducido " + cont + " números");
        System.out.println("La suma de todos ellos es: " + sum);
        System.out.println((sum % 2 == 0) ? "Y es es par" : "Y es impar");
    }

}
