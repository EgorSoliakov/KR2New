package Service;

import Model.ToysList;

import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    public static void saver(ToysList toys){
        try(FileWriter writer = new FileWriter("text.txt")){
            for (int i = 0; i < toys.size(); i++) {
                writer.write(toys.get(i).getName());
                writer.write("\n");
            }
        }catch (IOException e){
            System.out.println("Не удалось сохранить файл!");
        }
    }
}
