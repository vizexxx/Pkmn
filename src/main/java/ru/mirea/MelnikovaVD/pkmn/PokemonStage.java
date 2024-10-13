package ru.mirea.MelnikovaVD.pkmn;

public enum PokemonStage {
    BASIC("Basic"),
    STAGE1("Stage 1"),
    STAGE2("Stage 2"),
    VSTAR("VStar"),
    VMAX("VMax");

    private String pokemonStage;

    PokemonStage(String pokemonStage)
    {
        this.pokemonStage = pokemonStage;
    }

    public String getPokemonStage()
    {
        return pokemonStage;
    }
}
