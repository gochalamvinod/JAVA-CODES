import java.util.*;
public class StringToUpper{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String vinod = input.nextLine();
        vinod = vinod.toUpperCase();
        System.out.print(vinod);
    }
}