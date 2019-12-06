import java.util.Scanner;

public class CompfTest {
    public static void main(String[] args) throws Exception {
        Compf c = new Compf();
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите формулу");
            str = sc.nextLine();
            c.compile(str.toCharArray());
        }
    }
}