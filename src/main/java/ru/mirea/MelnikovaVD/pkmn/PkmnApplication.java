package ru.mirea.MelnikovaVD.pkmn;

public class PkmnApplication
{
    public static void main(String[] args)
    {
        CardImport cardImport = new CardImport();
        Card myCard = cardImport.readFromFile("D:\\Java\\Pkmn\\src\\main\\resources\\my_card.txt");
        System.out.printf("Карточка покемона:\n");
        System.out.printf(String.valueOf(myCard));
    }
}
