public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] array1, int[] array2) {
        int[] combinedArray = new int[array1.length + array2.length];
        for (int x = 0; x < array1.length; x++) { // assigning values for the first part of combinedArray
            combinedArray[x] = array1[x];
        }
        for (int y = array1.length; y < combinedArray.length; y++) { // assigning values for the second part of combinedArray
            combinedArray[y] = array2[y - array1.length];
        }
        return combinedArray;
    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] array1, int[] array2) {
        int[] zipArray = new int[array1.length * 2];
        int extra = 0;
        for (int x = 0; x < array1.length; x++) {
            zipArray[extra] = array1[x];
            extra++;
            zipArray[extra] = array2[x];
            extra++;
        }
        return zipArray;
    }

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {
        for (int x = 0; x < array1.length; x++) {
            array1[x] = array1[x] * array2[x]; // directly multiplying the element by the corresponding element from the other array
        }
        return array1;
    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static int[] capitalCount(String[] words) {
        int[] numOfCapitals = new int[words.length];
        for (int x = 0; x < words.length; x++) {
            numOfCapitals[x] = countCapitalLetters(words[x]); // calling the helper method to return the number of capitals in the first/second/third/... word
        }
        return numOfCapitals;
    }

    public static int countCapitalLetters(String word) {
        int count = 0;
        for (int x = 0; x < word.length(); x++) {
            if (word.charAt(x) >= 65 && word.charAt(x) <= 90) {
                count++;
            }
        }
        return count;
    }

}
