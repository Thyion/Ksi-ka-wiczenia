import java.util.Random;


/**
 
* Początkowy kod dla przykładu "Odgadnij moją liczbę".
 
*/

public class GuessStarter {

    
public static void main(String[] args) {
        
// wybierz losową liczbę
        
Random random = new Random();
        
int number = random.nextInt(100) + 1;
        
System.out.println(number);
    }

}
