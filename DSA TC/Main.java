import java.util.*;
class MyString{
    /////////////////////////////////////////////////////
    public int myLength(String s){
        if(s==null){
            return 0;
        }
        else{
            int length = 1;
            loop:while(true){
                try{
                    char temp = s.charAt(length);
                    length++;
                }
                catch(Exception e){
                    break loop;
                }
            }
            return length;
        }
    }  
    ////////////////////////////////////////////////////////
    public String SwitchCase(String s){
        String output="";
        for(int i=0;i<myLength(s)-1;i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                output = output+(char)(s.charAt(i) + 32);
                
            }
            else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                output = output+(char)(s.charAt(i)-32);
            }
            else{
                output = output+(char)(s.charAt(i));
            }
        }
        return output;
    } 
////////////////////////////////////////////////////////
    public String myToUpperCase(String s){
        String output="";
        for(int i=0 ; i<myLength(s)-1;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                output=output+(char)(s.charAt(i)-32);
            }
            else{
                output = output+(char)(s.charAt(i));
            }
        }
        return output;
    }
////////////////////////////////////////////////////////
    public String myToLowerCase(String s){
        String output="";
        for(int i=0 ; i<myLength(s)-1;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                output=output+(char)(s.charAt(i)+32);
            }
            else{
                output = output+(char)(s.charAt(i));
            }
        }
        return output;
    }

///////////////////////////////////////////////////////
    public HashMap myOccurence(String s){
        HashMap<Character,Integer> output = new HashMap<>();
        for(char i:s.toCharArray()){
            if(output.containsKey(i)){
                output.put(i,output.get(i)+1);
            }
            else{
                output.put(i,1);
            }
        }
        return output;
    } 
///////////////////////////////////////////////////
    public String myReverse(String s){
        char[] reverse=s.toCharArray();
        int i = 0;
        int j = reverse.length-1;
        while(i<j){
            char temp=reverse[i];
            reverse[]

        }
        return String.valueOf(reverse);
    }
}
public class Main{
    public static void main(String args[]){
        MyString Ms=new MyString();

        // System.out.println(Ms.myLength("Hello"));
        // System.out.println(Ms.myToUpperCase("Hello I am Vinod"));
        // System.out.println(Ms.myToLowerCase("Hello I am Vinod"));
        System.out.println(Ms.myOccurence("Hello I am Vinod"));
    }
}