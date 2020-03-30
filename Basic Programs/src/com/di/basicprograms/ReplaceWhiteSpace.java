package com.di.basicprograms;

import java.util.Scanner;

/*
 * Java Program to remove all white spaces from a string without using replace().
 *
 * @author  :  Sudeep Kumar Katiar
 *  @version :  1.0
 *  @since   :  27-03-2020
 */
public class ReplaceWhiteSpace {

    public static void main(String[] args) {
        Scanner sentence = new Scanner(System.in);
        System.out.println("enter a sentence");
        String str = sentence.nextLine();
        //1st way
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method
        System.out.println(noSpaceStr);
        //2nd way
        char[] strArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        System.out.println(noSpaceStr2);
    }
}
