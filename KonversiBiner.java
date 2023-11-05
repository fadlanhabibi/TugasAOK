//FADLAN HABIBI TM 235150707111007

import java.util.Scanner;

public class KonversiBiner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Program Konversi Bilangan");

        System.out.println("1. Biner ke Desimal");
        System.out.println("2. Desimal ke Biner");
        System.out.println("3. Biner ke Hexa");
        System.out.println("4. Hexa ke Biner");
        System.out.println("5. Desimal ke Hexa");
        System.out.println("6. Hexa ke Desimal");

        System.out.print("\nSilahkan Pilih Bilangan Yang akan dikonversi : ");
        int pilihan = input.nextInt();

        input.nextLine();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan biner: ");
                String bilanganBiner = input.nextLine();
                int desimal = Integer.parseInt(bilanganBiner, 2);
                System.out.println("Bilangan desimal nya : " + desimal);
                break;

            case 2:
                System.out.print("Masukkan bilangan Desimal : ");
                int desimal2 = input.nextInt();
                String bilanganBiner2 = Integer.toBinaryString(desimal2);
                System.out.println("Bilangan Biner nya : " + bilanganBiner2);
                break;

            case 3 :
                System.out.print("Masukkan bilangan Biner : ");
                String biner3 = input.nextLine();
                int desimal3 = Integer.parseInt(biner3,2);
                String bilanganHeksa = Integer.toHexString(desimal3).toUpperCase();
                System.out.print("Bilangan Heksadesimalnya : " + bilanganHeksa);
                break;

            case 4 :
                System.out.print("Masukkan bilangan Heksadesimal : ");
                String bilanganHeksa2 = input.nextLine();
                int desimal4 = Integer.parseInt(bilanganHeksa2,16);
                String biner4 = Integer.toBinaryString(desimal4);
                System.out.print("Bilangan Biner nya adalah : " + biner4);
                break;

            case 5 :
                System.out.print("Masukkan bilangan Desimal : ");
                int desimal5 = input.nextInt();
                String bilanganHeksa5 = Integer.toHexString(desimal5).toUpperCase();
                System.out.print("Bilangan Heksadesimalnya adalah : " + bilanganHeksa5);
                break;

            case 6 :
                System.out.print("Masukkan bilangan Heksadesimal : ");
                String bilanganHeksa6 = input.nextLine();
                int desimal6 = Integer.parseInt(bilanganHeksa6,16);
                System.out.print("Bilangan Desimal nya adalah : " + desimal6);
                break;

            default :
                System.out.println("Masukkan Pilihan 1-6");

        }
    }
}
