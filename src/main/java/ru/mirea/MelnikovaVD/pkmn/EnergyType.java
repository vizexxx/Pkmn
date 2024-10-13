package ru.mirea.MelnikovaVD.pkmn;

public enum EnergyType {
    FIRE("Fire"),
    GRASS("Grass"),
    WATER("Water"),
    LIGHTNING("Lightning"),
    PSYCHIC("Psychic"),
    FIGHTING("Fighting"),
    DARKNESS("Darkness"),
    METAL("Metal"),
    FAIRY("Fairy"),
    DRAGON("Dragon"),
    COLORLESS("Colorless");

    private String energyType;

    EnergyType(String energyType)
    {
        this.energyType = energyType;
    }

    public String getEnergyType()
    {
        return energyType;
    }
}
