package WildFarm;

public class Zebra extends Mammal{

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
            if (food instanceof Vegetable) {
                super.setFoodEaten(food.getQuantity());
            } else {
                String errorMessage = String.format("%ss are not eating that type of food!", getClass().getSimpleName());
                throw new IllegalArgumentException(errorMessage);

            }
    }
}
