import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculo cal = new Calculo();
        System.out.print("What is the dollar price? ");
        cal.dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        cal.price = sc.nextInt();
        System.out.print("Amount to be paid in reais: " + cal.conversor());
        sc.close();
    }
}