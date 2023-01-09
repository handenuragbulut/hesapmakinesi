/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapmakinesikullanıcıgirisli;
import java.util.Scanner;


public class HesapMakinesiKullanıcıGirisli {
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("Hesap Makinesi");
        System.out.println();
        System.out.println("İşlem Menüsü"
                           + "\n 1-Toplama"
                           + "\n 2-Çıkarma"
                           + "\n 3-Çarpma"
                           + "\n 4-Bölme\n");
        
        int tercih;
        while(true){
            
            System.out.println("Lütfen İşlem Numarası Seçiniz (1-4) :");
            tercih = scanner.nextInt();
 
            if(tercih > 0 && tercih < 5) {
                System.out.println("Lütfen 1 ile 4 arasında tercih sayısı giriniz");
                break;
 
            }
        }
 
        System.out.println("1.Sayı:");
        int s1 = scanner.nextInt();
 
        System.out.println("2.Sayı:");
        int s2 = scanner.nextInt();
        
        System.out.println("3.Sayı:");
        int s3 = scanner.nextInt();
        
        System.out.println("4.Sayı:");
        int s4 = scanner.nextInt();
        
        if(tercih == 1){
            
            System.out.println(s1 + " + " + s2 + " + " + s3 + " + " + s4 + " = " + ("Toplam Sonuc: " + (s1 + s2 + s3 + s4)));
 
        }
        else if(tercih == 2){
 
            System.out.println(s1 + " - " + s2 + " - " + s3 + " - " + s4 + " = " + ("Çıkarma Sonucu:"+ (s1 - s2 - s3 - s4)));
 
        }
        else if(tercih == 3){
 
            System.out.println(s1 + " * " + s2 + " * " + s3 + " * " + s4 + " = " + ("Çarpım Sonucu:" + (s1 * s2 * s3 * s4)));
 
        }
        else if(tercih == 4){
 
            System.out.println(s1 + " / " + s2 + " / " + s3 + " / " + s4 + " = " + ("Bölüm Sonucu:" + ((float)s1/(float)s2/(float)s3/(float)s4)));
 
        }
        
    }
 
}
