package com.softserve.edu05.sort_algorithms;

import java.util.Arrays;

public class SortAlgorithms {

    //---------------------------------------------------------------------------------------
    /* Bubble sort algorithm
     * On the right side of array is the bigger element
     * How we can to improve bubble sort algorithm
     * 1. We can sort only left part of array, without sorted elements
     * 2. And on each step, we can make passing from left to right -> and right to left <-
     * On bubble sort algorithm was created another sorted algorithm
     * */
    public static void bubbleSort(int[] arr) {
        int count = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    /*int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;*/
                    arr[i] = arr[i] + arr[i + 1] - (arr[i + 1] = arr[i]);
                    count++;
                }
            }
//            System.out.println("arr = " + Arrays.toString(arr));
        }
        System.out.println("How many operations = " + count);
    }

    //---------------------------------------------------------------------------------------
    /*About selection sort
     * Consider that first element is the less element in array
     * After that equals that element with next element
     * if second element is less than first
     * write that element in temp variable
     * when we go through whole array
     * we change these elements in places*/
    public static void selectionSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int indexMin = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    indexMin = j;
                    min = array[j];
                }
            }
            array[indexMin] = array[i];
            array[i] = min;
            count++;
//            System.out.println("array = " + Arrays.toString(array) + "\tChanges element: " + array[indexMin] +
//                    " -> And " + array[i] + " <-");
        }
        System.out.println("How many operations = " + count);
    }

    //---------------------------------------------------------------------------------------
    /* That algorithm is in standard libraries Java Arrays.sort()
     * Complexity O(n^2)
     * Efficiency for large arrays do not enough
     * Divide array to two array,
     * when we start first element is in first array
     * all another element is in second array
     * than take first element from second array
     * and pun on correct place in first array
     * That algorithm use if array almost sorted
     * but have some value in not correct places
     * make less step than quick sort*/
    public static void insertionSort(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            StringBuilder element = new StringBuilder("");
            int currenElement = arr[i];//That temp variable with value first element from second array

            int j = i;
            while (j > 0 && arr[j - 1] > currenElement) {
                element.append(" " + currenElement + "[" + j + "] less" + " " + arr[j - 1] + "[" + (j - 1) +
                        "] Data ->" + arr[j - 1] + " put in cell [" + j + "] ");
                arr[j] = arr[j - 1];
                j--;
                count++;
            }
//            element.append("AFTER that " + currenElement + " put in cell[" + j + "]");
            arr[j] = currenElement;
//            System.out.println("arr = " + Arrays.toString(arr) + "\t" + element);
        }
        System.out.println("How many operations = " + count);
    }

    //---------------------------------------------------------------------------------------
    /* Based on the principle 'divide et impera'
     * An array is divided into subarrays until there is one element in the array
     * After that, these arrays are combined with each other, 1 of 2, 2 of 3 etc.
     * When arrays concatenating, we are sorting that's elements
     * And we have many arrays on 2 element
     * After that, these arrays are combined with each other, and we have many arrays on 4 element etc.*/
    //---------------------------------------------------------------------------------------
    /* When and why use merge sort?
     * Merge sort have stability of work compared to quick sort.
     * Work the same on any data
     * Quick sort in some situation can work worse, and work with whole array.
     * Merge sort work from smaller arrays and after that with bigger and bigger arrays.
     * Merge sort can use where we do not have all data.
     * For example, download over the network, we do not have all the data
     * we can download part and sort that part, after that download next part and sort that part
     * and after that merge that two data.
     * Another example is: we can divide, for example to 4 part and put sort into separate Threads
     * and after that concat that arrays*/
    public static void mergeSort(int[] array) {
        int[] tmp;
        int[] currentSrc = array;//Where do we come from
        int[] currentDest = new int[array.length];//Where we will merge

        int size = 1;//Size merge arrays
        //When the size of the array into which we will merge is smaller than 'array'
        while (size < array.length) {
            //In that loop we go through array and the index 'i' jumps over pairs of arrays
            for (int i = 0; i < array.length; i += 2 * size) {
                //And we merge these pairs of arrays in one bigger sorted array
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            /*After arrays merged in array Destination
             * Array Src and array Dest change
             * That means on next step we Dest array will be Src array, so
             * we will merge arrays witch we have taken on privies step witch each other*/
            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;//On each step length * 2

//            System.out.println("array = " + Arrays.toString(currentSrc));
        }
    }

    //---------------------------------------------------------------------------------------
    /* Implements merging two arrays into one array
     * Does not create an array, and do merging of subarrays in the same array
     * We have first array 'int[] src1' and 'int src1Start' from which element to start merging from this array
     * 'int[] src2' second array and 'int src2Start' from which element second array to start merging
     * And array destination 'int[] dest' and 'int destStart' from which element to start writing to this array
     * 'int size' show what size subarrays we want to merge*/
    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest, int destStart, int size) {

        int index1 = src1Start;
        int index2 = src2Start;

        /* The arrays that we combine are subarrays in a large array
         * you need to count the ends of the subarray,
         * taking into account the boundaries of the array in which these subarrays are*/
        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        /*How many iteration need for concat two subarrays*/
        int iterationCount = src1End - src1Start + src2End - src2Start;

        /*Run cycle*/
        for (int i = destStart; i < destStart + iterationCount; i++) {
            /*if element in first array less than in second array
             * write in destination array element from fist subarray and index1++
             * else write in destination array element from second subarray and index2++
             *
             * That expression 'index1 < src1End && (index2 >= src2End' use in situation
             * when in first or second subarray elements end
             * We can be in if expression, not else only if 'index1 < src1End'
             * On second subarray we in the end, than we can be onle in if expression, not else*/
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    //---------------------------------------------------------------------------------------
    /* Quick sort principe how work
     * Select the reference element (for example first element in array)
     * Those elements of the array that are smaller than it put in left part array.
     * And those elements, that are bigger in right part array
     * After that array divided to two subarrays.
     * Each of them can be sorted independently of the other part.
     * After that this algorithm repeat for these two subarrays.
     * Repited as long as these subarrays do not be individual elements.
     * Works well with the cache of modern processors
     * Subarrays are sorted independently of each other*/
    public static void quickSort(int[] arr, int from, int to) {
        //It is checked whether there is anything to sort
        if (from < to) {
            //Divide array, all element witch less move to left part, and witch bigger to right part
            int divideIndex = partition(arr, from, to);

//            printSortStep(arr, from, to, divideIndex);

            //The function recursively calls itself
            quickSort(arr, from, divideIndex - 1);
            //Function for second subarray
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];//Choice the reference element
        while (leftIndex <= rightIndex) {
            //We start the passage through the array
            // and search element bigger and lower than reference element, and change places
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(Arrays.toString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + Arrays.toString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + Arrays.toString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }

}
