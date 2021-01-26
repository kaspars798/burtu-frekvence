package com.company;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    private static int indexInArray(char c, char[] arr){
        for(int i=0; i < arr.length; i++){
            if(c==arr[i]){
                return i;
            }
        }
        return -1;
    }

    private static void buildFrequency(String str){
        str = str.toLowerCase();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] answer = new int[alphabet.length];
        for (int i=0; i < alphabet.length; i++){
            answer[i] = 0;
        }
        for (int i=0; i < str.length(); i++){
            if(indexInArray(str.charAt(i),alphabet)!=-1) {
                answer[indexInArray(str.charAt(i),alphabet)]++;
            }
        }
        for (int i=0; i < alphabet.length; i++){
            System.out.println(alphabet[i] + " = " + answer[i]);
        }
    }

    public static void main(String[] args) {
        try
        {
            File file=new File("/Users/apimo/IdeaProjects/burti/src/demo.txt");    //creates a new file instance
            Scanner scan = new Scanner(file);

            String fileContent = "";
            while(scan.hasNextLine()) {
                fileContent = fileContent.concat(scan.nextLine() + " ");
            }
            buildFrequency(fileContent);

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
