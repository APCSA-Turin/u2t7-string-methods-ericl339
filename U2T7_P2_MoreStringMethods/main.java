package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wordCount = 0;
        int score = 0;
        String word1;
        String word2;
        String firstTwo;
        String lastTwo;
        String firstLetter;
        

        System.out.print("Enter first word: ");
        word1 = scan.nextLine();
        wordCount++;

        while (score < 50) {
            //game asking player
            System.out.print("Enter the next word: ");
            word2 = scan.nextLine();
            wordCount++;

            //computing score
            if(word2.compareTo(word1) > 0){
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else if (word2.compareTo(word1) < 0 ){
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            } else {
                score -= 10;
                System.out.println("-10 points: current word is the exact same word; SCORE: " + score);
            }

            firstTwo = word2.substring(0,2);
            lastTwo = word1.substring(word1.length() - 2);

            if(firstTwo.equals(lastTwo)){
                score += 5;
                System.out.println("+5 points: Last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }
            
            firstLetter = word1.substring(0, 1);

            if(word2.indexOf(firstLetter) > -1){
                score+=3;
                System.out.println("+3 Points: First letter of previous word found in current word; SCORE: " + score);
            }
            
            if(word1.length() == word2.length()) {
                score += 5;
                System.out.println("+5 Points: The ammount of letters found in the previous word is the same amount; SCORE: "+ score);
            }

            word1 = word2;
          }

        System.out.println("You win! It took you " + wordCount + " words! Try again for a lower word count!");

    }
}