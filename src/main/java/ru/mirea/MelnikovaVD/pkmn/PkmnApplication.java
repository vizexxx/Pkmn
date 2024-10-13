package ru.mirea.MelnikovaVD.pkmn;

public class PkmnApplication
{
    public static void main(String[] args)
    {
        CardImport cardImport = new CardImport();
        Card myCard = cardImport.readFromFile("D:\\Java\\Pkmn\\src\\main\\resources\\my_card.txt");
        System.out.printf("\u001b[38;5;111m\nTask PKMN:\u001b[38;5;0m\n");
        System.out.printf(String.valueOf(myCard));
    }
}
