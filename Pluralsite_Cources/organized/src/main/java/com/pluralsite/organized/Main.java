package com.pluralsite.organized;

public class Main {
    public static void main(String[] args) {
       float[] theVal = {10.0f, 20.0f, 15.0f};
        float sum = 0.0f;

        for (float currentVal : theVal) {
         sum += currentVal;
        }
        System.out.println(sum);
        }
    }//45.0