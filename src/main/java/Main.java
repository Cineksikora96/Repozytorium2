import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj dzialanie (add, substract, div, mul, pow)");
        String dzialanie = sc.nextLine();
        System.out.println("Podaj liczbe 1:");
        double liczba1 = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj liczbe 2:");
        double liczba2 = Integer.parseInt(sc.nextLine());
        
        if (dzialanie.equals("add")) {
            SumEquation add = new SumEquation(liczba1, liczba2);
            System.out.println(add.calculate());
        } else if (dzialanie.equals("substract")) {
            SubstractEquation sub = new SubstractEquation(liczba1, liczba2);
            System.out.println(sub.calculate());
        } else if (dzialanie.equals("divide")) {
            DivEquation div = new DivEquation(liczba1, liczba2);
            System.out.println(div.calculate());
        } else if (dzialanie.equals("mul")) {
            MulEquation mul = new MulEquation(liczba1, liczba2);
            System.out.println(mul.calculate());
        } else if (dzialanie.equals("pow")){ PowEquation pow = new PowEquation(liczba1, liczba2);
            System.out.println(pow.calculate());
        }

    }
}
