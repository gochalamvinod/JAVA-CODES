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
                System.out.println("TRY AGAIN ");
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
                System.out.println("TRY AGAIN ");
            }
            break Main;
        }
    }
}

class PlusPattern{
    static void print(){
        Main:
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number = input.nextInt();
            if (number>0){
                for ( int i = 1; i <= number ; i++){
                    if (i==number/2){
                        System.out.println("*".repeat(number));
                    }
                    else{
                        System.out.println(" ".repeat(number/2)+"*"+" ".repeat(number/2));
                    }
                }break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER : ");
            }
            
        }
    }
}
class FloydTriangle{
    static void print(){
        Main:
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number = input.nextInt();
            int val=1;
            if (number>0){
                for (int i = 1; i <= number ; i++){
                    for(int j = 1 ; j <=i ; j++ ){
                        System.out.print(val+" ");
                        val++;
                    }
                    System.out.println("");
                }
                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}
class ReverseFloydTriangle{
    static void print(){
        Main:
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number = input.nextInt();

            if (number>0){
                int val = (number*(number+1))/2;

                for (int i=number ; i>=1 ; i--){
                    for (int j=1 ; j<=i ; j++){
                        System.out.print(val+" ");
                        val--;
                    }
                    System.out.println("");
                }
                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class PalindromeNumberPyramid{
    static void print(){
        Main:
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if (number>0){

                for(int i=1 ; i<=number ; i++){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=i ; j>=1 ; j--){
                        System.out.print(j);
                    }

                    for(int j=2 ; j<=i ; j++){
                        System.out.print(j);
                    }

                    System.out.println("");
                }
                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class PalindromeAlphabetPyramid{
    static void print(){
        Main:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if(number>0){

                for(int i=1 ; i<=number ; i++){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=i ; j>=1 ; j--){
                        System.out.print((char)('A'+j-1));
                    }

                    for(int j=2 ; j<=i ; j++){
                        System.out.print((char)('A'+j-1));
                    }

                    System.out.println("");
                }

                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class NumberHourGlass{
    static void print(){
        Main:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if(number>0){

                for(int i=number ; i>=1 ; i--){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){
                        System.out.print(i+" ");
                    }

                    System.out.println("");
                }

                for(int i=2 ; i<=number ; i++){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){
                        System.out.print(i+" ");
                    }

                    System.out.println("");
                }

                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class StarHourGlass{
    static void print(){
        Main:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if(number>0){

                for(int i=number ; i>=1 ; i--){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){
                        System.out.print("* ");
                    }

                    System.out.println("");
                }

                for(int i=2 ; i<=number ; i++){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){
                        System.out.print("* ");
                    }

                    System.out.println("");
                }

                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class HollowHourGlass{
    static void print(){
        Main:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if(number>0){

                for(int i=number ; i>=1 ; i--){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){

                        if(i==number || j==1 || j==i){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }

                    System.out.println("");
                }


                for(int i=2 ; i<=number ; i++){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){

                        if(i==number || j==1 || j==i){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }

                    System.out.println("");
                }

                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class ContinuousAlphabetTriangle{
    static void print(){
        Main:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if(number>0){

                char val='A';

                for(int i=1 ; i<=number ; i++){

                    for(int j=1 ; j<=i ; j++){

                        System.out.print(val+" ");

                        val++;

                        if(val>'Z'){
                            val='A';
                        }
                    }

                    System.out.println("");
                }

                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class MultiplicationTriangle{
    static void print(){
        Main:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if(number>0){

                for(int i=1 ; i<=number ; i++){

                    for(int j=1 ; j<=i ; j++){

                        System.out.print((i*j)+" ");
                    }

                    System.out.println("");
                }

                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}


class NumberDiamond{
    static void print(){
        Main:
        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("ENTER THE NUMBER : ");
            int number=input.nextInt();

            if(number>0){

                for(int i=1 ; i<=number ; i++){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){
                        System.out.print(j);
                    }

                    for(int j=i-1 ; j>=1 ; j--){
                        System.out.print(j);
                    }

                    System.out.println("");
                }


                for(int i=number-1 ; i>=1 ; i--){

                    for(int j=1 ; j<=number-i ; j++){
                        System.out.print(" ");
                    }

                    for(int j=1 ; j<=i ; j++){
                        System.out.print(j);
                    }

                    for(int j=i-1 ; j>=1 ; j--){
                        System.out.print(j);
                    }

                    System.out.println("");
                }

                break Main;
            }
            else{
                System.out.println("TRY WITH POSITIVE NUMBER");
            }
        }
    }
}
public class LEVEL_3{
    public static void main(String args[]){

        HollowDiamond.print();
        ButterFlyPattern.print();
        HollowButterFlyPattern.print();
        X_Pattern.print();
        PlusPattern.print();
        FloydTriangle.print();

        ReverseFloydTriangle.print();
        PalindromeNumberPyramid.print();
        PalindromeAlphabetPyramid.print();
        NumberHourGlass.print();
        StarHourGlass.print();
        HollowHourGlass.print();
        ContinuousAlphabetTriangle.print();
        MultiplicationTriangle.print();
        NumberDiamond.print();
    }
}