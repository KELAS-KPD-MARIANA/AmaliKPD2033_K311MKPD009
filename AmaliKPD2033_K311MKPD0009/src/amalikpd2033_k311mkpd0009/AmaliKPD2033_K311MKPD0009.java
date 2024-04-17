/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amalikpd2033_k311mkpd0009;

import java.util.Scanner;
public class AmaliKPD2033_K311MKPD0009 {
    public static void main(String[] args) {
        
         String nama;
         int hari,gajisebulan;
         int gajiharian = 160 ;
         
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nama: ");
         nama = input.nextLine();
         
         do{
             System.out.print("Masukkan bilangan hari bekerja: ");
             hari = input.nextInt();
        
              if(hari>31){
               System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
              }
           }
         while(hari>31);
         gajisebulan = hari*gajiharian;
            System.out.println("Rumusan gaji bulanan bagi "+nama);
            System.out.println("Jumlah hari bekerja "+hari);
            System.out.println("GAJI SEBULAN ADALAH "+gajisebulan);
         
    }
    
}
