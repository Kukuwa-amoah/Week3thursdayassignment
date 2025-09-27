import java.util.Scanner;
public class classwork {
    public static void main (String[] args){
        //Task 5
        System.out.println("Please input a word: \n");
        Scanner input = new Scanner (System.in);
        String word = input.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < word.length(); i++){
            char y = word.charAt(i);

            if(y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u'){
                count++;
            }
        }
        System.out.println("Your word has "+ count +" number of vowels.");



    }
}
