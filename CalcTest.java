import java.util.Scanner;
public class CalcTest {
    public static void main(String[] args) throws Exception {
        Calc c = new Calc();
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите формулу");
            str = sc.nextLine();
            c.compile(str.toCharArray());
        }
    }
}