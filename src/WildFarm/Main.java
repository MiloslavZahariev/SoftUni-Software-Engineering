package WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<Mammal> mammals = new ArrayList<>();

        while (!input.equals("End")) {
            String[] animalData = input.split(" ");
            String[] foodData = scanner.nextLine().split(" ");

            String animalType = animalData[0];
            String animalName = animalData[1];
            Double animalWeight = Double.parseDouble(animalData[2]);
            String livingRegion = animalData[3];

            Mammal mammal = null;

            switch (animalType) {
                case "Mouse":
                    mammal = new Mouse(animalName, animalType, animalWeight, livingRegion);
                    break;
                case "Zebra":
                    mammal = new Zebra(animalName, animalType, animalWeight, livingRegion);
                    break;
                case "Cat":
                    String breed = animalData[4];
                    mammal = new Cat(animalName, animalType, animalWeight, livingRegion, breed);
                    break;
                case "Tiger":
                    mammal = new Tiger(animalName, animalType, animalWeight, livingRegion);
                    break;
            }

            String foodType = foodData[0];
            Integer foodQuantity = Integer.parseInt(foodData[1]);

            Food food = null;
            switch (foodType) {
                case "Vegetable":
                    food = new Vegetable(foodQuantity);
                    break;
                case "Meat":
                    food = new Meat(foodQuantity);
                    break;
            }

            mammal.makeSound();
            try {
                mammal.eat(food);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            mammals.add(mammal);

            input = scanner.nextLine();
        }

        mammals.forEach(System.out::println);
    }
}
