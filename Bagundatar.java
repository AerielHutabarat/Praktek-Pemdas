import java.util.Scanner;
public class Bagundatar {

    public static void main(String[] args) {
        Scanner persegipanjang = new Scanner (System.in);
        System.out.println("Masukkan panjang");
        int p=persegipanjang.nextInt();
        System.out.println("Masukkan lebar");
        int l=persegipanjang .nextInt();
        int luas = p*l;
        System.out.print("Hasil luas persegi panjang ="+luas );


    }
}
