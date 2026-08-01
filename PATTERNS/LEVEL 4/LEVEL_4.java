import java.util.*;

class PascalTriangle{                                         //formula is number = number*(i-j)/(j+1) where i , j start from 0 and j< i 
    static void print(){
    Scanner Input = new Scanner(System.in);
    Main:
    while (true){
        System.out.print("ENTER THE NUMBER : ");
        int number = Input.nextInt();
        if (number > 0){
            int temp = 1;
            for (int i = 0 ; i < number ; i++){
                System.out.print(" ".repeat(number-i-1)+1+" ");
                for ( int j = 0 ; j < i ; j++){
                    temp = temp*(i-j)/(j+1);
                    System.out.print(temp + " ");
                }
                System.out.println("");
            }
            break Main;
        }
        else {
            System.out.print("ENTER THE NUMBER GREATER THAN 0");
        }
    }
    }
}

// class NumberSpiral{
//     static void print(){
//     Scanner Input = new Scanner(System.in);
//     Main:
//     while (true){
//         System.out.print("ENTER THE NUMBER : ");
//         int number = Input.nextInt();
//         if (number > 0){
//             int matrix[][] = new int[number][number];      //  loop stop at (number/2,number/2)
//             boolean isColumn = true ;
//             boolean isRow = false;
//             int end = number-1;
//             int row = 0;
//             int turns = 1;
//             int column = 0;
//             for ( int i = 1 ; i<=number*number;i++){
//                 matrix[column][row]=i;
//                 if (turns%3!=0){
//                     if(isColumn){
//                         if (column != end){
//                             column++;
//                         }
//                         else{
//                             isColumn = false;
//                             isRow = true;
//                             turns++;
//                         }
//                     }
//                     else if (isRow){
//                         if ( row != end){
//                             row++;
//                         }
//                         else{
//                             isColumn=true;
//                             isRow=false;
//                             turns++;
//                         }
//                     }
//                 }
//                 else{
//                     end--;
//                 }
                
//             }
//             System.out.print(matrix[1][3]);
//             break Main;
//         }
//         else {
//             System.out.print("ENTER THE NUMBER GREATER THAN 0");
//         }
//     }
//     }
// }

class MatrixBoundry{
    static void print(){
    Scanner Input = new Scanner(System.in);
    Main:
    while (true){
        System.out.print("ENTER THE NUMBER : ");
        int number = Input.nextInt();
        int val = 1;
        if (number > 0){
            for(int i = 1;i<=number;i++){
                if ( i == 1 || i == number){
                    for ( int j = 1 ; j<=number ; j++){
                        System.out.print(val+" ");
                        val++;
                    }
                }
                else{
                    for(int j = 1 ; j <= number;j++){
                        if ( j == 1 || j == number){
                            System.out.print(val+" ");
                            val++;
                        }
                        else{
                            System.out.print("  ");
                            val++;
                        }
                    }
                }
                System.out.println();
            }
            break Main;
        }
        else {
            System.out.print("ENTER THE NUMBER GREATER THAN 0");
        }
    }
    }
}

class SquareMatrix{
    static void print(){
    Scanner Input = new Scanner(System.in);
    Main:
    while (true){
        System.out.print("ENTER THE NUMBER : ");
        int number = Input.nextInt();
        int temp = 1;
        if (number > 0){
            for(int i = 1 ; i <= number ; i++){
                for ( int j = 1; j <= number;j++){
                    System.out.print(temp + " ");
                    temp++;
                }
                System.out.println();
            }
            break Main;
        }
        else {
            System.out.print("ENTER THE NUMBER GREATER THAN 0");
        }
    }
    }
}

class Zig_Zag{
    static void print(){
    Scanner Input = new Scanner(System.in);
    Main:
    while (true){
        System.out.print("ENTER THE NUMBER : ");
        int number = Input.nextInt();
        if (number > 0){
            int num = 1;
            int zigzag = number*2-1;
            int[][] matrix = new int[number][number];
            for (int i = 0 ; i < number;i++){
                for(int j = 0 ; j < number;j++){
                    matrix[i][j] = num;
                    num++;
                }
            }
            for ( int i = 0 ; i<=zigzag ; i++){
                System.out.print("Diagonal : " + i + " ");
                for (int j = 0 ; j<number; j++){
                    for(int k = 0 ; k<number;k++){
                        if (j+k==i){
                            System.out.print(matrix[j][k]+" ");
                        }
                    }
                }
                System.out.println("");
            }
                break Main;
        }
        else {
            System.out.print("ENTER THE NUMBER GREATER THAN 0");
        }
    }
    }
}

class Wave{
    static void print(){
        Scanner Input = new Scanner(System.in);
        Main:
        while (true){
            System.out.print("ENTER THE NUMBER : ");
            int number = Input.nextInt();
            if (number > 0){
                int value = 1;
                int[][] matrix = new int[number][number];
                System.out.print("Wave Format : ");
                for(int i = 0 ; i<number;i++){
                    for(int j = 0 ; j<number;j++){
                        matrix[i][j]= value;
                        value++;
                    }
                }
                for (int column = 1 ; column <= number ; column++){
                    if (column % 2 ==0){
                        for(int row = number-1 ; row >= 0 ; row--){
                            System.out.print(matrix[column-1][row] + " ");
                        }
                    }
                    else{
                        for(int row = 0 ; row < number ; row++){
                            System.out.print(matrix[column-1][row] + " ");
                        }
                    }
                }
                break Main;
            }
            else {
                System.out.print("ENTER THE NUMBER GREATER THAN 0");
            }
        }
    }
}

class SnakeMatrix{
    static void print(){
        Scanner Input = new Scanner(System.in);
        Main:
        while (true){
            System.out.print("ENTER THE NUMBER : ");
            int number = Input.nextInt();
            if (number > 0){
                int value = 1;
                int[][] matrix = new int[number][number];
                for(int i = 0 ; i<number;i++){
                    for(int j = 0 ; j<number;j++){
                        matrix[i][j]= value;
                        value++;
                    }
                }
                System.out.print("THE SNAKE MATRIX IS : ");
                for(int row = 1 ; row <= number ; row++){
                    if (row%2==0){
                        for (int column=number-1;column<=0;column--){
                            System.out.print(matrix[row-1][column]+" ");
                        }
                    }
                    else{
                        for (int column=0 ; column<number ; column++){
                            System.out.print(matrix[row-1][column]+" ");
                        }
                    }
                }
                break Main;
            }
            else {
                System.out.print("ENTER THE NUMBER GREATER THAN 0");
            }
        }
    }
}

class ConcentricNumberSquare{
    static void print(){
        Scanner Input = new Scanner(System.in);
        Main:
        while (true){
            System.out.print("ENTER THE NUMBER : ");
            int number = Input.nextInt();
            if (number > 0){

                break Main; 
            }
            else {
                System.out.print("ENTER THE NUMBER GREATER THAN 0");
            }
        }
    }
}

class ConcentricAplhabetSquare{
    static void print(){
        Scanner Input = new Scanner(System.in);
        Main:
        while (true){
            System.out.print("ENTER THE NUMBER : ");
            int number = Input.nextInt();
            if (number > 0){

                break Main;
            }
            else {
                System.out.print("ENTER THE NUMBER GREATER THAN 0");
            }
        }
    }
}

class SprialOrder{
    static void print(){
    Scanner Input = new Scanner(System.in);
        Main:
        while (true){
            System.out.print("ENTER THE NUMBER : ");
            int number = Input.nextInt();
            if (number > 0){

                break Main;
            }
            else {
                System.out.print("ENTER THE NUMBER GREATER THAN 0");
            }


        }
    }
}

public class LEVEL_4{
    public static void main(String[] args){
        // PascalTriangle.print();
        // NumberSpiral.print();
        // MatrixBoundry.print();
        // SquareMatrix.print();
        // Zig_Zag.print();
        // Wave.print();
        SnakeMatrix.print();
        // ConcentricNumberSquare.print();
        // ConcentricAplhabetSquare.print();
        // SprialOrder.print();
    }
}