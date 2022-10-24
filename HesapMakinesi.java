/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hesapmakinesi;

import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author Özgür
 */
public class HesapMakinesi {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int select;
        
        System.out.println("HOŞ GELDİNİZ.\n");
        //  Menu Ekranı
        String menu ="1 - Toplama İşlemi\n"
                +"2 - Çıkarma İşlemi\n"
                +"3 - Çarpma İşlemi\n"
                +"4 - Bölme İşlemi\n"
                +"5 - Üslü Sayı Hesaplama\n"
                +"6 - Dikdörtgen Alan ve Çevre Hesaplama\n"
                +"7 - Küpkök Hesaplama\n"
                +"0 - Çıkış Yap\n";
        
        System.out.println(menu);
        System.out.println("Bir İşlem Seçiniz :");
        select= sc.nextInt();
         if(select == 1)
         {
             //Eğer Toplama İşlemi Seçildiyse
             System.out.println("1.Sayıyı Giriniz: ");
             int a= sc.nextInt();
             System.out.println("2.Sayıyı Giriniz: ");
             int b= sc.nextInt();
             if(select == 1)
             {
                 Topla(a,b);
             }
         }
         if(select == 2)
         {
             //Eğer Çıkarma İşlemi Seçildiyse
             System.out.println("1.Sayıyı Giriniz: ");
             int a= sc.nextInt();
             System.out.println("2.Sayıyı Giriniz: ");
             int b= sc.nextInt();
             if(select == 2)
             {
                 Cikar(a,b);
             }
         }
         if(select == 3)
         {
             //Eğer Çarpma İşlemi Seçildiyse
             System.out.println("1.Sayıyı Giriniz: ");
             int a= sc.nextInt();
             System.out.println("2.Sayıyı Giriniz: ");
             int b= sc.nextInt();
             if(select == 3)
             {
                 Carp(a,b);
             }
         }
         if(select == 4)
         {
             //Eğer Bölme İşlemi Seçiliyse
             System.out.println("1.Sayıyı Giriniz: ");
             int a= sc.nextInt();
             System.out.println("2.Sayıyı Giriniz: ");
             int b= sc.nextInt();
             if(select == 4)
             {
                 Bol(a,b);
             }
         }
        if(select == 5)
         {
             //Eğer Üs Alma İşlemi Seçiliyse
             System.out.println("Sayıyı Giriniz: ");
             int a= sc.nextInt();
             System.out.println("Üslü Sayıyı Giriniz: ");
             int b= sc.nextInt();
             if(select == 5)
             {
                 Us(a,b);
             }
         }
        if(select == 6)
         {
             //Eğer Dikdörtgen Alan ve Çevre İşlemi Seçiliyse
             System.out.println("Kısa Kenar Giriniz: ");
             int a= sc.nextInt();
             System.out.println("Uzun Kenar Giriniz: ");
             int b= sc.nextInt();
             if(select == 6)
             {
                 DikAlanCevre(a,b);
             }
         }
         if(select == 7)
         {
             //Eğer Küpkök İşlemi Seçiliyse
             System.out.println("Bir Sayı Giriniz: ");
             int a= sc.nextInt();
             if(select == 7)
             {
                 Kupkok(a);
             }
         }
         System.out.println("Güle Güle!!");
    }
    
    static int Topla(int a,int b)
    {
        int sonuc=a+b;
        System.out.println("Toplam : "+sonuc);
        return sonuc;
    }
    static int Cikar(int a,int b)
    {
        int sonuc=a-b;
        System.out.println("Fark : "+sonuc);
        return sonuc;
    }
    static int Carp(int a,int b)
    {
        int sonuc=a*b;
        System.out.println("Çarpım : "+sonuc);
        return sonuc;
    }
    static int Bol(int a,int b)
    {
        int sonuc=a/b;
        System.out.println("Bölüm : "+sonuc);
        return sonuc;
    }
    static int Us(int a,int b)
    {
        int sonuc =1;
                for(int i=1;i<=b;i++)
                {
                    sonuc*=a;
                }
        System.out.println("Üs Alma İşlemi : "+sonuc);
        return sonuc;
    }
    static void DikAlanCevre(int a,int b)
    {
        System.out.println("Çevresi : "+2*(a+b));
        System.out.println("Alanı : "+a*b);
    }
    static int Kupkok(int a)
    {
        int sonuc =a*a*a;
        System.out.println("Küpkökü : "+sonuc);
        return sonuc;
    }
}
