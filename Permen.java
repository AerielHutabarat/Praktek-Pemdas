import java.util.Scanner;
public class Permen {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int user = input.nextInt();
        if(user%2 == 0 && user % 5 == 0) { System.out.println("kotak permen");
        }else if (user % 2 == 0 ) { System.out.println("kotak");
        }else if (user % 5 == 0 ) {System.out.println("permen");
        }else {System.out.println(user);}
    }
}