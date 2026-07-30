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

class NumberSpiral{
    static void print(){
    Scanner Input = new Scanner(System.in);
    Main:
    while (true){
        System.out.print("ENTER THE NUMBER : ");
        int number = Input.nextInt();
        if (number > 0){
            for(int i = 1 ; i <=number ; i++){
                for(int j = 1 ; j <=number ; j++){
                    System.out.print(j+" ");
                }
                System.out.print(i+" ");
            }
            break Main;
        }
        else {
            System.out.print("ENTER THE NUMBER GREATER THAN 0");
        }
    }
    }
}

class MatrixBoundry{
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

class SquareMatrix{
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

class Zig_Zag{
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

class Wave{
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

class SnakeMatrix{
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
        NumberSpiral.print();
        // MatrixBoundry.print();
        // SquareMatrix.print();
        // Zig_Zag.print();
        // Wave.print();
        // SnakeMatrix.print();
        // ConcentricNumberSquare.print();
        // ConcentricAplhabetSquare.print();
        // SprialOrder.print();
    }
}