package JavaProgramingAdvanced.DefiningClasses.Exercise.P06PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Tournament")) {
            String trainerName = input.split(" ")[0];
            String pokemonName = input.split(" ")[1];
            String element = input.split(" ")[2];
            int health = Integer.parseInt(input.split(" ")[3]);

            Pokemon pokemon = new Pokemon(pokemonName, element, health);

            trainers.putIfAbsent(trainerName, new Trainer(trainerName));
            List<Pokemon> currentPokemonList = trainers.get(trainerName).getPokemons();
            currentPokemonList.add(pokemon);
            trainers.get(trainerName).setPokemons(currentPokemonList);


            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            for (var entry : trainers.entrySet()) {
                boolean containType = false;
                List<Pokemon> currentPokemons = entry.getValue().getPokemons();
                for (Pokemon currentPokemon : currentPokemons) {
                    if (currentPokemon.getElement().equals(input)) {
                        entry.getValue().setBadges(entry.getValue().getBadges() + 1);
                        containType = true;
                        break;
                    }
                }

                if (!containType) {
                    for (int i = 0; i < currentPokemons.size(); i++) {
                        currentPokemons.get(i).setHealth(currentPokemons.get(i).getHealth() - 10);
                        if (currentPokemons.get(i).getHealth() <= 0) {
                            currentPokemons.remove(currentPokemons.get(i));
                        }
                    }
                }


            }


            input = scanner.nextLine();
        }

        printingTrainers(trainers);

    }

    private static void printingTrainers(Map<String, Trainer> trainers) {
        List<Trainer> trainerList = new ArrayList<>(trainers.values());

        trainerList.sort(Comparator.comparing(Trainer::getBadges).reversed());

        for ( Trainer trainer: trainerList) {
            System.out.println(trainer);

        }
    }

}
