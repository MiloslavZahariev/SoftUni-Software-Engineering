package WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
            super.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.###");
        return String.format("%s[%s, %s, %s, %s, %s]"
                ,getAnimalType(),getAnimalName(),breed,df.format(getAnimalWeight()),getLivingRegion(),getFoodEaten());
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
