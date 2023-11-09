package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToysList {
    private List<Toy> toys;
    
    public ToysList(){
        this(new ArrayList<Toy>());
    }
    public ToysList(List<Toy> toys){
        this.toys = toys;
    }
    public boolean add(Toy toy){
        if (toy == null){
            return false;
        }
        if (!toys.contains(toy)){
            toys.add(toy);
            return true;
        }
        return false;
    }
    public String getToyName(){
        StringBuilder sb = new StringBuilder();
        sb.append("Список игрушек:\n");
        for(Toy toy: toys){
            sb.append(toy);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getToyName();
    }

    public int size() {
        return toys.size();
    }

    public Toy get(int i) {
        Toy toy = null;
        for (int j = 0; j < toys.size(); j++) {
            if (i == j) {
                toy = toys.get(j);
            }
        }
        return toy;
    }

    public void remove(int i) {
        toys.remove(i);
    }

    public void set(int i, Toy toy) {
        toys.set(i, toy);
    }

    //Scanner scanner = new Scanner(System.in);
    //Toy toy1 = new Toy("Конструктор", 2, 10);


}
