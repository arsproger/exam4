package Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pet {
    String name;
    double age;

    public Pet(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public static void infoKeyList(HashMap<String, Pet> hashMap) {
        for(Map.Entry<String, Pet> map : hashMap.entrySet()) {
            System.out.println(map.getKey());
        }
    }
}
