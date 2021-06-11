package com.atos;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
    // Write your code here
        char ch[]=s.toCharArray();
        char temp='\u0000';
        int count=0;
        System.out.println(ch.length);
        for(int i=0;i<ch.length-1;){
        	System.out.println("i val is : "+i);
         //   temp=ch[i];
        	
        		if(ch[i]==ch[i+1]){
                	System.out.println("if");
                    count++;       
                }	
        	
            
            i++;
        }
        System.out.println(count);
        return count;
    }

}

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
        System.out.println("enter val");
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
        	System.out.println("enter string ");
            String s = bufferedReader.readLine();

            int result = Result.alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
