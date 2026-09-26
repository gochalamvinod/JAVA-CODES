//Count the frequency of each word.
import java.util.*;
public class CountFrequency{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE LINE : ");
        String vinod = input.nextLine();
        vinod = vinod.replaceAll("[^a-zA-Z0-9]"," ").replaceAll("\\s+"," ").strip().toLowerCase();
        String[] list = vinod.split(" ");
        System.out.println(list);
        
    }
}