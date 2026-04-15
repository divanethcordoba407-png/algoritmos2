/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anagrama.noche;

/**
 *
 * @author ASUS
 */
   public class principal {
     public static void main(String[] args) {

        String p1 = "roma";
        String p2 = "amor";

        if (AnagramaNoche.esAnagrama(p1, p2)) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }
    }
}

