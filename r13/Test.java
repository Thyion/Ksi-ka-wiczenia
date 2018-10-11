/**
 
* Testowanie algorytmów sortowania talii kart.
 *
/
public class Test {

    
/**
     
* Sprawdza, czy talia jest uporządkowana.
     
*/
    
public static void checkSorted(Deck deck) {
        
Card[] cards = deck.getCards();
        
for (int i = 0; i < cards.length - 1; i++) {
            
if (cards[i].compareTo(cards[i + 1]) >= 0) {
                
System.out.println("Karta #" + i + " nie posortowana!");
            
}
        
}
    
}

    
/**
     
* Prezentuje sposób wywoływania metod sortowania.
     
*/
    
public static void main(String[] args) {
        
Deck deck;

        
System.out.println("Testuje sortowanie przez wybieranie...");
        
deck = new Deck();
        
deck.shuffle();
        
deck.selectionSort();
        
checkSorted(deck);

       
System.out.println("Testuje sortowanie przez scalanie...");
        
deck = new Deck();
        
deck.shuffle();
        
deck = deck.mergeSort();
        
checkSorted(deck);

        
System.out.println("Testuje sortowanie przez wstawianie...");
        
deck = new Deck();
        
deck.shuffle();
        
deck.insertionSort();
        
checkSorted(deck);
    
}


}
