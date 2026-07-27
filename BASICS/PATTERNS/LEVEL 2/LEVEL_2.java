import java.util.*;

class RightAlignedTriangle{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 1 ; i <= number ; i++){
                    System.out.println(" ".repeat(number-i)+"*".repeat(i));
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class ReverseRightAlignedTriangle{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 0 ; i < number ; i++){
                    System.out.println(" ".repeat(i)+"*".repeat(number-i));
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class StarPyramid{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 1 ; i <= number ; i++){
                    System.out.println(" ".repeat(number-i)+"*".repeat(2*i-1));
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class InvertedStarPyramid{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = number ; i > 0 ; i--){
                    System.out.println(" ".repeat(number-i)+"*".repeat(2*i-1));
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class NumberPyramid{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0 && number<=5){
                for ( int i = 1 ; i <= number ; i++){
                    System.out.println(" ".repeat(number-i)+"123456789".substring(0,2*i-1));
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER BETWEEN 1 AND 5");
            }
        }
    }
}


class RepeatedNumberPyramid{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 1 ; i <= number ; i++){
                    System.out.println(" ".repeat(number-i)+Integer.toString(i).repeat(2*i-1));
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class AlphabetPyramid{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0 && number<=13){
                for ( int i = 1 ; i <= number ; i++){
                    for (int j = 0 ; j < number-i ; j++){
                        System.out.print(" ");
                    }
                    for (int j = 0 ; j < 2*i-1 ; j++){
                        System.out.print((char)('A'+j));
                    }
                    System.out.println("");
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER BETWEEN 1 AND 13");
            }
        }
    }
}


class HollowSquare{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 1 ; i <= number ; i++){
                    for ( int j = 1 ; j <= number ; j++){
                        if (i==1 || i==number || j==1 || j==number){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class HollowTriangle{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 1 ; i <= number ; i++){
                    for ( int j = 1 ; j <= i ; j++){
                        if (j==1 || j==i || i==number){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class HollowPyramid{
    static void print(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("ENTER THE NUMBER OF LINES : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 1 ; i <= number ; i++){
                    for (int j = 1 ; j <= number-i ; j++){
                        System.out.print(" ");
                    }
                    for (int j = 1 ; j <= 2*i-1 ; j++){
                        if (j==1 || j==2*i-1 || i==number){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;
            }
            else{
                System.out.print("ENTER THE NUMBER GREATER THAN ZERO");
            }
        }
    }
}


class LEVEL_2{
    public static void main(String args[]){
        RightAlignedTriangle.print();
        ReverseRightAlignedTriangle.print();
        StarPyramid.print();
        InvertedStarPyramid.print();
        NumberPyramid.print();
        RepeatedNumberPyramid.print();
        AlphabetPyramid.print();
        HollowSquare.print();
        HollowTriangle.print();
        HollowPyramid.print();
    }
}