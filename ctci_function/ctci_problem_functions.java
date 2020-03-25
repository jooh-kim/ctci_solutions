package ctci_function;

import java.lang.Boolean;
import java.lang.Math;
import java.lang.StringBuilder;

public class ctci_problem_functions{
    
    // Problem 1.5
    public static Boolean oneDiff(String s1, String s2){
        System.out.println("Is \""+s1+"\" one edit away from \""+s2+"\"?");
        /* For this problem, because it is only one difference either in string length or character difference, 
        if length difference is greater than 2 or if there are 2 differences then it is false.
        */
        int length_diff = Math.abs(s1.length()-s2.length());
        if(length_diff > 1){
            System.out.println("No.");
            return false;
        }
        // If there is more than 1 difference, it should be false.
        boolean diff = false;

        // put s1 as longer string, s2 shorter
        if(s2.length() > s1.length()){
            String temp = s2;
            s2 = s1;
            s1 = temp;
        }

        int s1_ind = 0;
        int s2_ind = 0;
        while( s1_ind < s1.length() && s2_ind < s2.length()){
            // difference found.
            if (s1.charAt(s1_ind) != s2.charAt(s2_ind)){
                if(diff){
                    // it will enter this block if diff is found twice.
                    System.out.println("No.");
                    return false;
                }
                else{
                    if(s1.length() == s2.length()){
                        s1_ind++;
                        s2_ind++;
                    }
                    else
                        s1_ind++;
                }
                diff = true;
            }
            else{
                s1_ind++;
                s2_ind++;
            }
        }
        System.out.println("Yes.");
        return true;
    }

    // Problem 1.6
    public static String stringCompression(String str){
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length() ; i++){
            count++;

            if (i+1 < str.length() && str.charAt(i) != str.charAt(i+1)){
                result.append(str.charAt(i));
                result.append(count);
                count = 0;
            }
            if (i == str.length()-1){
                result.append(str.charAt(i));
                result.append(count);
            }
        }
        if(result.toString().length() > str.length())
            return str;
        return result.toString();
    }
}