package sem2w2;

import java.util.Scanner;

public class pertemuan_2_2 {
     public static void main(String[] args){
         Scanner IN = new Scanner(System.in);
         String pilih ;
         String nama ;
         String [] menu ={"Soft drink","Mix juice","Nescave","Soda milk","Tea"};
         System.out.println("       Cafe Ceria");
         System.out.println("     Aneka Minuman");
           System.out.println("------------------------------------------------------------");
           System.out.println("     SEPECIAL MENU");
            for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.println("------------------------------------------------------------");
            System.out.print("Masukan nama pembeli = " );
            nama= IN.nextLine();
            System.out.println("");
            System.out.print("Silahkan masukan pilihan anda =");
            pilih = IN.nextLine();
            switch(pilih){
                case "1":
                    System.out.println("Minuman yang anda pesan adalah Soft drink");
                    break;
                case "2":
                   System.out.println("Minuman yang anda pesan adalah Mix juice");  
                  break;
                case "3":
                     System.out.println("Minuman yang anda pesan adalah Nescave");
                     break;
                case "4":
                     System.out.println("Minuman yang anda pesan adalah Soda milk");
                     break;
                case "5":
                     System.out.println("Minuman yang anda pesan adalah Tea");
                     break;
                default:
                    System.out.println("MINUMAN YANG ANDA PESAN TIDAK ADA");
            }
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("TERIMA KASIH "+nama+" telah berkunjung di Cafe Ceria");
     }
}
