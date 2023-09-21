package day19_array;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int j = 0; j < arr1.length; j++) {

            for (int i = 0; i < arr2.length; i++) {
                if (arr1[j] == arr2[i]) {
                    System.out.print(arr1[j] + " ");
                }
            }
        }

    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */