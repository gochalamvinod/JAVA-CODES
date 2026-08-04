/*
             num row
0            0 + 1           remove this row and row -1 
1            1 + 2
23           3  + 3
456          6  + 4
769 10       10  + 5

24

*/

import java.util.*;
class PATTERN_WITHOUT_ROWS{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int number = input.nextInt();
        int temp = 0 ;
        int row = 1;
        while (temp <=number){
            temp = temp + row;
            row++; 
        }
        row = row - 2;
        number = 1;
        // System.out.print(row);
        for (int i = 1 ; i <= row ; i++){
            System.out.print(" ".repeat(row - i));
            for(int j = 0 ; j<i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println("");
        }
    }
}