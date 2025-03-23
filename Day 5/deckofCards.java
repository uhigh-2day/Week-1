import java.util.Scanner;

public class deckofCards
{
    public static String[][] distribute(String[] suffled_Deck, int n, int noOfCards)
    {
        int cardsPerPerson = (noOfCards /n);
        String[][] players= new String[n][cardsPerPerson];
        if(cardsPerPerson*n>noOfCards)
        {
            System.out.println("Not Enough Cards");
        }
        else
        {
            int count=0;
            for (int i=0; i<n; i++)
            {
                for(int j=0; j<cardsPerPerson; j++)
                {
                    players[i][j] = suffled_Deck[count];
                    count++;
                }
            }
        }
        return players;
    }

    public static String[] suffle(String[] deck, int noOfCards)
    {
        for(int i=0; i<noOfCards; i++)
        {
            int randomCardNumber = i + (int) (Math.random() * (noOfCards - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;

        }
        return deck;
    }

    public static String[] initialize(String[] suits, String[] ranks, int noOfCards)
    {
        String[] suitsranks = new String[noOfCards];
        int count = 0;
        for(int i=0; i<suits.length; i++)
        {
            for(int j=0; j<ranks.length; j++)
            {
                suitsranks[count++] = ranks[j] + " of " + suits[i];
            }
        }
        return suitsranks;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int noOfCards = suits.length * ranks.length;
        String[] deck = deckofCards.initialize(suits,ranks,noOfCards);
        String[] suffled_cards = deckofCards.suffle(deck,noOfCards);
        System.out.print("Enter the number of Players: ");
        int n = input.nextInt();
        int cardsPerPerson = (noOfCards /n);
        String[][] players = deckofCards.distribute(suffled_cards,n,noOfCards);
        for(int i=0; i<n; i++)
        {
            System.out.println("Player "+(i+1)+" cards are: ");
            for (int j=0; j<cardsPerPerson; j++)
            {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}