package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String word = userInput.nextLine();
        
        boolean result = isAbecedarian(word);
        if (result) {
            System.out.println(word + " is Abecedarian");
        }
        else {
            System.out.println(word + " is not Abecedarian");
        }
    }

    public static boolean isAbecedarian(String s){
        String testString = s.toLowerCase();
        for(int index = 1;index < testString.length();index++) {
            if (testString.charAt(index-1) <= testString.charAt(index)){
                // do nothing
            }
            else {
                return false;
            }
        }
        return true;
    }
}
