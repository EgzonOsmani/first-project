import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello world");
        int name = Integer.valueOf(scanner.nextLine());// test
        if (name < 100) {
            System.out.println("I'm the best");
        } else {
            System.out.println("test test test");
        }
        System.out.println("test");

    }
}