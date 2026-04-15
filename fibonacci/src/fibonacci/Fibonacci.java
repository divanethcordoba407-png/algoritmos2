/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author ASUS
 */
public class Fibonacci {

    public static void generar() {

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < 50; i++) {
            int siguiente = a + b;
            System.out.print(siguiente + " ");

            a = b;
            b = siguiente;
        }
    }
}
