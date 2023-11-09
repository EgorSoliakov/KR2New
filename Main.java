import Model.Toy;
import Model.ToysList;
import Service.Saver;
import View.ConsoleChange;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

import static Service.QuequeAdd.queue;
import static Service.Service.*;
import static View.ConsoliUi.choice;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Конструктор", 2, 3);
        Toy toy2 = new Toy("Кукла", 3, 4);
        Toy toy3 = new Toy("Робот", 4, 4);
        ToysList list = new ToysList();
        list.add(toy1);
        list.add(toy2);
        list.add(toy3);
        int num = choice();
        while (true) {
            if (num == 1) {
                Toy toy = ConsoleChange.runAdd();
                if (toy.getName() == null || toy.getDrop() == 0 || toy.getQuantity() == 0) {
                    throw new NullPointerException("Значения не введены или равны нулю!");
                }
                try {
                    list.add(toy);

                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }

            if(num == 2){
                PriorityQueue<Toy> toys = queue(list);
                System.out.println(toys);
                break;
            }
            if (num == 3) {
                Toy toyDrop = drawToys(list);
                System.out.println(toyDrop);
                toyDrop = decreaseDrop(toyDrop);
                for (int i = 0; i < list.size(); i++) {
                    if (toyDrop.getName() == list.get(i).getName()) {
                        list.set(i, toyDrop);
                    }
                }
                ToysList win = winList(toyDrop);
                Saver.saver(win);
                delete(list);
                break;
            }
            else{
                break;
            }
        }
    }
}
