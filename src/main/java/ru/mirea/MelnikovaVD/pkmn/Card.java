package ru.mirea.MelnikovaVD.pkmn;

import java.util.List;

public class Card {
    private PokemonStage pokemonStage;
    private String name;
    private Integer hp;
    private EnergyType pokemonType;
    private Card evolvesFrom;
    private List<AttackSkill> skills;
    private EnergyType weaknessType;
    private EnergyType resistanceType;
    private String retreatCost;
    private String gameSet;
    private char regulationMark;
    private Student pokemonOwner;

    public Card(PokemonStage pokemonStage, String name, Integer hp, EnergyType pokemonType,
                Card evolvesFrom, List<AttackSkill> skills, EnergyType weaknessType, EnergyType resistanceType,
                String retreatCost, String gameSet, char regulationMark, Student pokemonOwner)
    {
        this.pokemonStage = pokemonStage;
        this.name = name;
        this.hp = hp;
        this.pokemonType = pokemonType;
        this.evolvesFrom = evolvesFrom;
        this.skills = skills;
        this.weaknessType = weaknessType;
        this.resistanceType = resistanceType;
        this.retreatCost = retreatCost;
        this.gameSet = gameSet;
        this.regulationMark = regulationMark;
        this.pokemonOwner = pokemonOwner;
    }

    public PokemonStage getPokemonStage()
    {
        return pokemonStage;
    }
    public void setPokemonStage(PokemonStage pokemonStage)
    {
        this.pokemonStage = pokemonStage;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getHp()
    {
        return hp;
    }
    public void setHp(Integer hp)
    {
        this.hp = hp;
    }

    public EnergyType getPokemonType()
    {
        return pokemonType;
    }
    public void setPokemonType(EnergyType pokemonType)
    {
        this.pokemonType = pokemonType;
    }

    public Card getEvolvesFrom()
    {
        return evolvesFrom;
    }
    public void setEvolvesFrom(Card evolvesFrom)
    {
        this.evolvesFrom = evolvesFrom;
    }

    public List<AttackSkill> getSkills()
    {
        return skills;
    }
    public void setSkills(List<AttackSkill> skills)
    {
        this.skills = skills;
    }

    public EnergyType getWeaknessType()
    {
        return weaknessType;
    }
    public void setWeaknessType(EnergyType weaknessType)
    {
        this.weaknessType = weaknessType;
    }

    public EnergyType getResistanceType()
    {
        return resistanceType;
    }
    public void setResistanceType(EnergyType resistanceType)
    {
        this.resistanceType = resistanceType;
    }

    public String getRetreatCost()
    {
        return retreatCost;
    }
    public void setRetreatCost(String retreatCost)
    {
        this.retreatCost = retreatCost;
    }

    public String getGameSet()
    {
        return gameSet;
    }
    public void setGameSet(String gameSet)
    {
        this.gameSet = gameSet;
    }

    public char getRegulationMark()
    {
        return regulationMark;
    }
    public void setRegulationMark(char regulationMark)
    {
        this.regulationMark = regulationMark;
    }

    public Student getPokemonOwner()
    {
        return pokemonOwner;
    }
    public void setPokemonOwner(Student pokemonOwner)
    {
        this.pokemonOwner = pokemonOwner;
    }

    @Override
    public String toString() {
        return "1. " + pokemonStage + "\n" + "2. " + name + "\n" + "3. " + hp + "\n" +
                "4. " + pokemonType + "\n" + "5. " + evolvesFrom + "\n" + "6. " + skills + "\n" +
                "7. " + weaknessType + "\n" + "8. " + resistanceType + "\n" + "9. " + retreatCost + "\n" +
                "10. " + gameSet + "\n" + "11. " + regulationMark + "\n" + "12. " + pokemonOwner;
    }
}
