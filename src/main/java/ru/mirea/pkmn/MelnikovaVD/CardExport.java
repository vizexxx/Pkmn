package ru.mirea.pkmn.MelnikovaVD;

import ru.mirea.pkmn.Card;

import java.io.*;

public class CardExport
{
    public static void ExportToFile(String stringCard, Card card)
    {
        String fileName = card.getName() + ".crd";
        FileOutputStream myFile = null;
        try
        {
            myFile = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(myFile);
            out.writeObject(stringCard);
            System.out.println("Exported to " + fileName);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
