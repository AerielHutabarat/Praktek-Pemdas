import java.util.Scanner;
public class JumlahHari
{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        switch(month) {
            case 1 : System.out.println("Januari");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 31");
                break;
            case 2: System.out.println("Februari");
                System.out.println("Tahun "+year);
                if (year%4 == 0) {System.out.println("Jumlah hari = 29");}
                else System.out.println("Jumlah hari = 28");
                break;
            case 3 : System.out.println("Maret");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 31");
                break;
            case 4: System.out.println("April");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 30");
                break;
            case 5 : System.out.println("Mei");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 31");
                break;
            case 6 : System.out.println("Juni");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 30");
                break;
            case 7 : System.out.println("Juli");
                System.out.println("Tahun "+year);
                System.out.println("Jumalah hari 31");
                break;
            case 8 : System.out.println("Agustus");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 31");
                break;
            case 9 : System.out.println("September");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 30");
                break;
            case 10 : System.out.println("Oktober");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 31");
                break;
            case 11 : System.out.println("November");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 30");
                break;
            case 12 : System.out.println("Desember");
                System.out.println("Tahun "+year);
                System.out.println("Jumlah hari = 31");
                break;
            default : if(month<=0) {System.out.println("Bulan "+ month+ " tidak ada");}
            else {System.out.println("Maaf bulan hanya sampai 12");}
        }


    }

}
