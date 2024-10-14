package ru.mirea.pkmn.MelnikovaVD;

import ru.mirea.pkmn.Card;

import java.io.*;

public class CardExport
{
    public static final long serialVersionUID = 1L;
    public static void ExportToFile(Card card)
    {
        String fileName = card.getName() + ".crd";
        FileOutputStream myFile = null;
        try
        {
            myFile = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(myFile);
            out.writeObject(card);
            System.out.println("Сериализация выполнена.");
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
