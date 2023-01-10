package Task2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите числа: ");
        String number = scanner.nextLine();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < number.length(); i++) {
            String n = String.valueOf(number.charAt(i));
            if(n.matches("[1-9]+")) hashSet.add(Integer.valueOf(n));
        }
        System.out.println(hashSet);
    }
}
