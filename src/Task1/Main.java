package Task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("�����", "id - 1, data - 2022");
        hashMap.put("�������", "id - 2, data - 2020");
        hashMap.put("����", "id - 3, data - 2021");
        hashMap.put("����������", "id - 4, data 2019");
        hashMap.put("���", "id - 5, data 2023");
        Main.entrySet(hashMap);
        Main.keySet(hashMap);
        Main.values(hashMap);
    }

    public static void entrySet(HashMap<String, String> hashMap) {
        for (Map.Entry<String, String> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + " -> " + map.getValue());
        }
    }

    public static void keySet(HashMap<String, String> hashMap) {
        for(Map.Entry<String, String> map : hashMap.entrySet()) {
            System.out.println(map.getKey());
        }
    }

    public static void values(HashMap<String, String> hashMap) {
        for(Map.Entry<String, String> map : hashMap.entrySet()) {
            System.out.println(map.getValue());
        }
    }
}

