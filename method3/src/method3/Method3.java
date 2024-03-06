/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method3;

import java.util.Scanner;
/**
 *
 * @author putra
 */
public class Method3 {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
       int pilihan;
       
        do {
            
            System.out.println("masukan nilai n\t: ");
            int n = scanner.nextInt();
            
            if (n < 0) {
                System.out.println("Nilai n harus lebih besar atau sama dengan 0");
            return;
            
            } else if (n == 0) {
                System.out.println("nilai " + n + "! = 1");
            } else {
                int factorial = menghitungFaktorial(n);
            
                System.out.println(n + "! = " + menampilkanHasilFaktorial(n) + " = " + factorial);
            }
            
            System.out.println("\nProgram Selesai. mau melakukan lagi?");
            System.out.println("(1 = y/0 = n) : ");
            pilihan = scanner.nextInt();
            
        } while(pilihan == 1);
    }
    
    public static int menghitungFaktorial(int n){
        if (n == 0){
            return 1;
        } else {
            return n * menghitungFaktorial(n - 1);
        }
    }
    
    public static String menampilkanHasilFaktorial(int n) {
        if (n == 0){
            return "1";
        }
        
        String faktorial = "";
        
        for  (int i = n; i >= 1; i--) {
            faktorial += i;
            
            if (i > 1){
                faktorial += "*";
            }
        }
        return faktorial;
    }
    
}
