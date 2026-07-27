import java.util.*;

class SolidSquare{
    static void print(){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES : ");
        int number = input.nextInt();
        for (int i = 1;i<=number;i++){
            for ( int j = 1;j<=number;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    } 
}



class IncreasingStarTriangle{
    static void print(){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES : ");
        int number = input.nextInt();
         for (int i =1;i<=number;i++){
            System.out.println("* ".repeat(i));
        }
    }
}

class DecreasingStarTriangle{
    static void print(){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES : ");
        int number = input.nextInt();
        while (number>0){
            System.out.println("* ".repeat(number));
            number--;
        }
    }
}

class IncreasingNumberTriangle{
    static void print(){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES : ");
        int number = input.nextInt();
        for (int i = 1 ; i<=number ; i++){
            for ( int j =1 ; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}

class RepeatedNumberTriangle{
    static void print(){
        Scanner input = new Scanner (System.in);
        System.out.print("ENTER THE NUMBER OF LINES : ");
        int number = input.nextInt();
        for (int i = 1 ; i<=number;i++){
            System.out.println(Integer.toString(i).repeat(i));
        }
        
    }
}

class AlphabetTriangle{
    static void print(){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF LINES : ");
        int number = input.nextInt();
        while (true){
            if (number>0 && number<=26){
                
            }
            else{
                System.out.print("TRY WITH NUMBER IN RANGE OF 0 TO 26");
            }
        }

    }
}

class Main{
    public static void main(String args[]){
        // SolidSquare.print();
        // IncreasingStarTriangle.print();
        // DecreasingStarTriangle.print();
        // IncreasingNumberTriangle.print();
        // RepeatedNumberTriangle.print();
        AlphabetTriangle.print();

    }
}