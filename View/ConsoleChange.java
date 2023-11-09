package View;

import Model.Toy;

import java.util.Scanner;

public class ConsoleChange {
    public static Toy runAdd(){
        System.out.println("Введите название игрушки:\n");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите вес игрушки:\n");
        int drop = Integer.parseInt(scanner.nextLine());
        System.out.println("введите кол-во игрушек:\n");
        int quantity = Integer.parseInt(scanner.nextLine());

            Toy toy = new Toy(name, drop, quantity);

        return toy;
    }
}
