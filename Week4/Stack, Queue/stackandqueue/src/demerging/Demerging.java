package demerging;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void checkDemerging(String name, String gender, int date){
        Queue<String> NU = new LinkedList<>();
        Queue<String> NAM = new LinkedList<>();
        if (gender.toLowerCase() == "nu") NU.add(name);
        else NAM.add(name);
    }
}
