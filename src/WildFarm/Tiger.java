package WildFarm;

public class Tiger extends Felime {

    private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            super.setFoodEaten(food.getQuantity());
        } else {
            String errorMessage = String.format("%ss are not eating that type of food!", getClass().getSimpleName());
            throw new IllegalArgumentException(errorMessage);

        }


    }
}
