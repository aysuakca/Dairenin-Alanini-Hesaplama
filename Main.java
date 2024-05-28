import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int r;
        double alan, x;
        double pi=3.14;

        Scanner inp= new Scanner(System.in);

        System.out.print("Dairenin yari capini(r) giriniz :  ");
        r= inp.nextInt();

        System.out.print("Merkez acisinin(x)olcusunu giriniz :  ");
        x= inp.nextInt();


        alan = (pi*(r*r)*x)/360;

        System.out.println("Dairenin alani :  " + alan);
    }
}