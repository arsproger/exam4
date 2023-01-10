package Task4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Cat("Муся", 1.2);
        Pet pet2 = new Dog("Шарик", 3.4);
        Pet pet3 = new Parrot("Гари", 0.6);
        HashMap<String, Pet> hashMap = new HashMap<>();
        hashMap.put(pet1.name, pet1);
        hashMap.put(pet2.name, pet2);
        hashMap.put(pet3.name, pet3);

        Pet.infoKeyList(hashMap);
    }
}
