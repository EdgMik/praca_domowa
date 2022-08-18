import java.util.Scanner;

public class Klub {
    public static void main(String[] args) {
        System.out.println("Jak Ci na imię ?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Witaj "+ name);
        System.out.println("Ile masz lat ?");
        Integer age = Integer.valueOf(scanner.nextLine());


        if (age >= 18) {
            System.out.println("Proszę, możesz wejść");
        }
        else {
                System.out.println("Niestety nie możesz wejść!");
        }



        }
    }

