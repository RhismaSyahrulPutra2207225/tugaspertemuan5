/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method1;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Method1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ulang;
        
        do{
            System.out.println("masukkan nilai N : ");
            int N = scanner.nextInt();
            
            penjumlahanDeret(N);
            
            System.out.println("\nApakah anda ingin mengulang program?\n(1=iya/0=tidak) : ");
            ulang = scanner.nextInt();
            
        }while (ulang == 1);
    }
    public static void penjumlahanDeret(int N) {
        int total = 0;
        String hasil = "";
        
        if(N < 1) {
            System.out.println("nilai bilangan ke N harus lebih besar sama dengan 1");
        } else {
            for(int i = 1; i <= N; i++){
                total += i;
                hasil += i;
                
                if(i < N){
                    hasil += "+";
                }
            }
            System.out.println("\n" + hasil + "=" + total);
        }
    }
}
