package sem2w2;
   import java.util.Scanner;
public class pertemuan_2 {
 
   public static void main(String[] args){
       Scanner T1 = new Scanner(System.in);
       Scanner B1 = new Scanner(System.in);
       int barang = 5;
       int [] hargaB = new int[barang];
       int harga = 0 ;
       int minim = 10000;
       System.out.println("------------------------------------------------------------");
       System.out.println("         Kharisma Agung Plaza <KAP>");
       System.out.println("          Promo Belanja Berhadiah");
       System.out.println("      Khusus Pembelian 5 Barang pertama");
       System.out.println("       Dengan Harga Minimum RP 10000.00");
         System.out.println("------------------------------------------------------------");
         System.out.print("Masukan nama pembeli = " ); 
         String nama = B1.nextLine();
         System.out.println("");
           for (int i = 0; i < barang ; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + " : ");
            hargaB[i] = T1.nextInt();
            harga += hargaB[i];
        }
           
       System.out.println("Total harga pembelian atas nama "+ nama +" adalah "+harga);
       System.out.println("");
       if (harga >= minim ){
           System.out.println("Selamat .....");
           System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
       }
          System.out.println("------------------------------------------------------------");
         System.out.println("           Terima Kasih");
         System.out.println("Anda suah belanja di Kharisma Agung Plaza");
      
   }  
}
