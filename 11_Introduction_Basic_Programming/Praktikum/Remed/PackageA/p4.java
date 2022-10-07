package PackageA;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan bilangan yang ingin di cari faktornya = ");
        bilangan = input.nextInt();

        faktor(bilangan);
    }
    public static void faktor(int bilangan){
        int i;
        for (i = 1; i <= bilangan; i++) {
            if(bilangan % i == 0) {
                System.out.println(i);
            }
        }
    }
}
