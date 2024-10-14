package ru.mirea.MelnikovaVD.pkmn;

public class PkmnApplication
{
    public static void main(String[] args)
    {
        CardImport cardImport = new CardImport();
        Card myCard = cardImport.readFromFile("D:\\Java\\Pkmn\\src\\main\\resources\\my_card.txt");
        System.out.printf("\u001b[38;5;111m\nTask PKMN:\u001b[38;5;0m\n");
        CardExport.ExportToFile(myCard.toString(),myCard);
        myCard = cardImport.importFromFile("D:\\Java\\Pkmn\\Corvisquire.crd");
        System.out.printf(myCard.toString());
    }
}
