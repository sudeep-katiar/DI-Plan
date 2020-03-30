package com.di.basicprograms;

import java.io.File;

/*
 * Java program to find files and skip directories of a given directory
 *
 * @author  :  Sudeep Kumar Katiar
 *  @version :  1.0
 *  @since   :  27-03-2020
 */
public class AllFilesInFolder {
    static void RecursivePrint(File[] arr,int index,int level)
    {
        // terminate condition
        if(index == arr.length)
            return;

        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        // for files
        if(arr[index].isFile())
            System.out.println(arr[index].getName());

            // for sub-directories
        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");

            // recursion for sub-directories
            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }

        // recursion for main directory
        RecursivePrint(arr,++index, level);
    }

    // Driver Method
    public static void main(String[] args) throws Exception
    {
        // Provide full path for directory(change accordingly)
        String maindirpath = "/home/akash/Downloads/SudeepFrontend";

        // File object
        File maindir = new File(maindirpath);

        if(maindir.exists() && maindir.isDirectory())
        {
            // array for files and sub-directories
            // of directory pointed by maindir
            File arr[] = maindir.listFiles();

            System.out.println("**********************************************");
            System.out.println("Files from main directory : " + maindir);
            System.out.println("**********************************************");

            // Calling recursive method
            RecursivePrint(arr,0,0);
        }
    }
}
