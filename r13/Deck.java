import java.util.Arrays;

import java.util.Random;


/**
 
* Talia kart do gry (ustalonej wielkości).
 
*/

public class Deck {

    
private Card[] cards;

    
/**
     
* Konstruuje standardową talię 52 kart.
     
*/
    
public Deck() {
        
this.cards = new Card[52];
        
int index = 0;
        
for (int suit = 0; suit <= 3; suit++) {
            
for (int rank = 1; rank <= 13; rank++) {
                
this.cards[index] = new Card(rank, suit);
                
index++;
            
}
        
}
    
}

    
/**
     
* Konstruuje talię n kart (null).
     
*/
    
public Deck(int n) {
        
this.cards = new Card[n];
    
}

    
/**
     
* Pobiera wewnętrzną tablicę kart.
     
*/
    
public Card[] getCards() {
        
return this.cards;
    }

    
/**
     
* Wyświetla każdą kartę z talii.
     
*/
    
public void print() {
        
for (int i = 0; i < this.cards.length; i++) {
           
System.out.println(this.cards[i]);
        
}
   
}

    
/**
     
* Zwraca tekstową reprezentację talii.
    
*/
    
public String toString() {
        
return Arrays.toString(this.cards);
    
}

    
/**
     
* Wybiera losową liczbę z przedziału od low do high włącznie z tymi wartościami.
     
*/
    
public int randomInt(int low, int high) {
        
return 0;
    
}

    
/**
     
* Zamienia miejscami karty, których indeksy to i oraz j.
     
*/
    
public void swapCards(int i, int j) {
    
}

    
/**
     
* Losowo tasuje tablicę kart.
     
*/
    
public void shuffle() {
    
}

    
/**
     
* Odnajduje indeks najniższej karty
     
* pomiędzy low i high (włącznie z nimi).
     
*/
    
public int indexLowest(int low, int high) {
        
return 0;
    }

    
/**
     
* Porządkuje karty (w samej tablicy) za pomocą sortowania przez wybieranie.
     
*/
    
public void selectionSort() {
    }

    /**
     * Zwraca podzbiór kart należących do talii.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Łączy dwie wcześniej uporządkowane podtalie.
     */
    public static Deck merge(Deck d1, Deck d2) {
        return null;
    }

    /**
     * Zwraca kopię talii uporządkowaną za pomocą sortowania przez scalanie.
     */
    public Deck mergeSort() {
        return this;
    }

    /**
     * Zmienia porządek kart (w samej tablicy) za pomocą sortowania przez wstawianie.
     */
    public void insertionSort() {
    }

}
