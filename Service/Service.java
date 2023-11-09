package Service;

import Model.Toy;
import Model.ToysList;

import java.util.Random;

public class Service {
    public static void delete(ToysList toyList){
        for (int i = 0; i < toyList.size(); i++) {
            if(toyList.get(i).getQuantity()== 0){
                toyList.remove(i);
            }
        }
    }
    public static Toy decreaseDrop(Toy toy){
        int num = toy.getQuantity()-1;
        if(num<0){
            num = 0;
        }
        Toy toyNew = new Toy(toy.getName(), toy.getDrop(), num);
        return toyNew;
    }

    public static Toy drawToys(ToysList toys){
        int sum =0;
        Toy toyMax = toys.get(0);
        Random rand = new Random();
        for (int i = 0; i < toys.size(); i++) {
            sum = sum +toys.get(i).getDrop();
            if(toys.get(i).getDrop() > toyMax.getDrop()){
                toyMax = toys.get(i);
            }
        }
        for (int i = 0; i < toys.size(); i++) {
            if(toys.get(i).getDrop() == toyMax.getDrop()){
                toys.remove(i);
            }
        }
        int num = rand.nextInt(sum+1);
        for (int i = 0; i < toys.size(); i++) {
            if( num <= toys.get(i).getDrop()){
                return toys.get(i);
            }
        }
        return toyMax;
    }

    public static ToysList winList(Toy toy){
        ToysList list = new ToysList();
        if(list.size() > 10){
            list.remove(0);
        }
        list.add(toy);
        return list;
    }
}
