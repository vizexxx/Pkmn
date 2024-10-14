package ru.mirea.MelnikovaVD.pkmn;

import java.io.Serializable;

public class AttackSkill implements Serializable {
    private String name;
    private String description;
    private String cost;
    private Integer damage;
    public static final long serialVersionUID = 1L;

    public AttackSkill(String name, String description, String cost, Integer damage)
    {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.damage = damage;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCost()
    {
        return cost;
    }
    public void setCost(String cost)
    {
        this.cost = cost;
    }

    public Integer getDamage()
    {
        return damage;
    }
    public void setDamage(Integer damage)
    {
        this.damage = damage;
    }

    @Override
    public String toString()
    {
        return  cost + "/" + name + "/" + damage;
    }
}
