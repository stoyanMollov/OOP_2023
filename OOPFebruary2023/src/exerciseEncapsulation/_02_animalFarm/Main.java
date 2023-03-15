package _02_animalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Chiken chiken = new Chiken(name, age);

        System.out.println(chiken);
    }
}
