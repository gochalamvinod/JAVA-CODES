import java.util.*;

class HollowDiamond{
    static void print(){
        Main: 
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number = input.nextInt();
            if (number%2==0){
                System.out.println("ROUNDING THE NUMBER TO NEXT ODD NUMBER : ");
                number = number+1;
            }
            if (number>0){
                int k1=(number+1)/2;
                int k2=(number+1)/2;
                for (int i = 1; i<=number;i++){
                    for ( int j = 1 ; j<=number;j++){
                        if(j==k1 || j == k2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }   
                    }
                    System.out.println("");
                    if (i<(number+1)/2){
                        k1--;
                        k2++;
                    }
                    else{
                        k1++;
                        k2--;
                    }
                }
                break Main;
            }
            else{
                System.out.println("ENTER THE NUMBER GREATER THAN ZERO ");
            }
        }
    }
}   

class ButterFlyPattern{
    static void print(){
        Main : 
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number = input.nextInt();
            if (number>0){
                int k1 = 1;
                int k2 = number;
                for ( int i = 1 ; i <= number;i++){
                    for ( int j = 1 ; j <= number ; j++){
                        if (j<=k1 || j>=k2){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                    if (i<number/2){
                        k1++;
                        k2--;
                    }
                    else{
                        k1--;
                        k2++;
                    }
                }
            }
            else {
                System.out.print("TRY AGAIN ");
            }
            break Main;
        }
    }
}

class HollowButterFlyPattern{
    static void print(){
        Main : 
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number = input.nextInt();
            if (number>0){
                int k1 = 1;
                int k2 = number;
                for ( int i = 1 ; i <= number;i++){
                    for ( int j = 1 ; j <= number ; j++){
                        if (j==k1 || j==k2 || j==1 || j==number){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                    if (i<number/2){
                        k1++;
                        k2--;
                    }
                    else{
                        k1--;
                        k2++;
                    }
                }
            }
            else {
                System.out.print("TRY AGAIN ");
            }
            break Main;
        }
    }
}

class X_Pattern{
    static void print(){
        Main : 
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number = input.nextInt();
            if (number>0){
                int k1 = 1;
                int k2 = number;
                for ( int i = 1 ; i <= number;i++){
                    for ( int j = 1 ; j <= number ; j++){
                        if (j==k1 || j==k2 ){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                    if (i<number/2){
                        k1++;
                        k2--;
                    }
                    else{
                        k1--;
                        k2++;
                    }
                }
            }
            else {
                System.out.print("TRY AGAIN ");
            }
            break Main;
        }
    }
}

public class LEVEL_3{
    public static void main(String args[]){
        // HollowDiamond.print();
        // ButterFlyPattern.print();
        // HollowButterFlyPattern.print();
        // X_Pattern.print();
    }
}