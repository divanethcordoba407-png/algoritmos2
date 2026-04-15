/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anagrama.noche;

/**
 *
 * @author ASUS
 */
public class AnagramaNoche {

    /**
     * @param args the command line arguments
     */
    public static boolean esAnagrama(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.equals(b)) {
            return false;
        }

        if (a.length() != b.length()) {
            return false;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
}