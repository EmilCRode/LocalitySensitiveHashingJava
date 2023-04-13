package org.LocalitySensitiveHashingForShortStrings;

import java.util.List;

public class ArraryAndListUtil {
    public static void printIntegerArray(int[] array){
        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "] ");
            if(array[i] == 0){
                System.out.println("index: " + i);
                break;
            }
        }
        System.out.println();
    }
    public static void printIntegerList(List<Integer> list){
        System.out.print("Array: ");
        for(int i = 0; i < list.size(); i++){
            System.out.print("[" + list.get(i) + "] ");
            if(list.get(i) == 0){
                System.out.println("index: " + i);
                break;
            }
        }
        System.out.println();
    }
    public static void printOverlapBetweenIntegerArrays(int[] array1, int[] array2){
        int counter = 0;
        String found;
        for (int j : array1) {
            for (int i : array2) {
                if (j == i) {
                    found = "Matches found in: ";
                    System.out.println(found + j);
                    counter++;
                }
            }
        }
        System.out.println(" numbers of matches: " + counter + " Thats a Overlay of: " + (double) counter / array1.length);
    }
}
