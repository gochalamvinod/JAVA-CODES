//Clean a sentence and count words.
import java.util.*;
public class Count{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the String : ");
        String vinod = input.nextLine();
        vinod = vinod.replaceAll("[^a-zA-Z0-9]"," ");
        vinod = vinod.replaceAll("\\s+"," ");
        System.out.print(vinod.split(" ").length);
    }
}