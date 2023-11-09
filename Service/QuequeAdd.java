package Service;

import Model.Toy;
import Model.ToysList;

import java.util.PriorityQueue;

public class QuequeAdd {
    public static PriorityQueue<Toy> queue(ToysList toys){
        PriorityQueue<Toy> queue = new PriorityQueue<Toy>((t1,t2) -> t2.getDrop() - t1.getDrop());
        if(toys == null) {
            throw new NullPointerException("Список игрушек пуст!");
        }
        try {
            for (int i = 0; i < toys.size(); i++) {
                queue.add(toys.get(i));
            }

        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        return queue;
    }
}
