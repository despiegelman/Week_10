import java.util.*;
public class RemoveString {
    public static void main(String[]args){
        String sentence;
        String phrase;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();
        System.out.print("Enter a string: ");
        phrase = input.nextLine();
        input.close();
        System.out.println(sentence.replace(phrase + " ", ""));
    }
}