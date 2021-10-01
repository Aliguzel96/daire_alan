package giris;
import java.util.Scanner;


public class alanBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Daire diliminin sırasıyla yaricapini ve merkez acisini giriniz: ");
        int r = input.nextInt();
        int a = input.nextInt();
        double alan = (3.14*(Math.pow(r,2))*a)/360;
        System.out.println("Alan: " + alan);
    }
}
