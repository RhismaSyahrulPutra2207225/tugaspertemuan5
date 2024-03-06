/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method2;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Batas Awal\t:");
        int batasAwal = scanner.nextInt();
        System.out.println("Masukkan Batas Akhir\t:");
        int batasAkhir = scanner.nextInt();
        
        int banyakGanjil = hitungGanjil(batasAwal, batasAkhir);
        int banyakGenap = hitungGenap(batasAwal, batasAkhir);
        
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + banyakGanjil);
        System.out.println("Banyaknya bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + banyakGenap);
        
    }
    public static int hitungGanjil(int batasAwal, int batasAkhir){
        int banyakGanjil = 0;
        
        for(int i = batasAwal; i <= batasAkhir; i++){
            if (i % 2 != 0){
                banyakGanjil++;
            }
        }
        return banyakGanjil;
    }
    
    public static int hitungGenap(int batasAwal, int batasAkhir){
        int banyakGenap = 0;
        
        for(int i = batasAwal; i <= batasAkhir; i++){
            if (i % 2 == 0){
                banyakGenap++;
            }
        }
        return banyakGenap;
    }
    
}
