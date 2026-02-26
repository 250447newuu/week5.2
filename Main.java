package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String word= scanner.nextLine();
        String unique = removeDuplicates(word);
        System.out.println(unique);
    }
   public static String removeDuplicates(String word){
        String str="";
        for(int i=0;i<word.length();i++){
            String currentChar=word.substring(i,i+1);
            if(str.indexOf(currentChar)==-1){
                
            }
        }
   }
}