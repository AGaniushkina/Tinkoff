package edu.hw1;

import java.util.Arrays;

public class Task6 {
    Integer count;
    Task6(Integer x){
        count = countK(x);
    }
    public static Integer countK(Integer x){
        int i = 0;
        if (x > 999 && x < 10000){

            while (x != 6174){
                char[] y = x.toString().toCharArray();
                Arrays.sort(y);
                x = Integer.parseInt((new StringBuilder(String.valueOf(y)).reverse()).toString()) - Integer.parseInt(String.valueOf(y));
                i++;
            }
        }
        else return -1;
        return i;
    }
}
