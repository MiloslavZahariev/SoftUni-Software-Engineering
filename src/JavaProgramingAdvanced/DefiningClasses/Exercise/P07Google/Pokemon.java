package JavaProgramingAdvanced.DefiningClasses.Exercise.P07Google;

public class Pokemon {
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    @Override
    public String toString() {
        return String.format("%s %s", pokemonName, pokemonType);
    }
}