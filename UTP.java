import java.util.Scanner;
public class UTP {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int permen = input.nextInt();if (permen<0) {System.out.print("Jumlah Permen tidak valid."); System.exit(0);}
        int anak1 = input.nextInt();if (anak1<0) {System.out.println("Jumlah Anak Sesi Pertama tidak valid.");System.exit(0);}
        int anak2 = input.nextInt();if (anak2<0) {System.out.println("Jumlah Anak Sesi Kedua tidak valid.");
            System.exit(0);}

        int totalanak=anak1+anak2;
        int pembagi= permen/2;
        int sisa1 = permen%2;
        int sisa2=pembagi%anak1;
        int sesi2= sisa1/anak2;
        int sesi1=sisa1+pembagi;


        if (permen<=anak1+anak2) {System.out.println("Jumlah Permen tidak mencukupi untuk dibagikan ke semua anak pada Sesi Pertama.");
            System.exit(0);}
        else if(permen<=anak2+anak1) {System.out.println("Jumlah Permen tidak mencukupi untuk dibagikan ke semua anak pada Sesi Kedua.");
            System.exit(0);}



        System.out.println("Setiap anak pada Sesi Pertama mendapat "+pembagi/anak1+" permen.");


        System.out.println("Setiap anak pada Sesi Kedua mendapat "+sesi1/anak2+" permen.");

        System.out.println("Sisa permen adalah "+sisa2+" permen.");
    }


}
