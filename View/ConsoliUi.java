package View;

import Model.Toy;

import java.util.PriorityQueue;
import java.util.Scanner;

import static Service.QuequeAdd.queue;

public class ConsoliUi {
    public static int choice(){
        System.out.println("выберете действие:\n" +
                "1.Добавить игрушку.\n" +
                "2.Показать все игрушки участвующие в розыгреше\n" +
                "3.Провести розыгрыш.\n" +
                "4.Выход.\n");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        return num;
    }

}
