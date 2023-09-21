package day21_multiDimentionalArray;

import java.util.Arrays;

public class CydeoStudents {

    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};


        /*
        declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group3 to each indexes
				 of the variable batch1Groups
         */

        String[][] batch1Groups = new String[3][];
        batch1Groups[0] = batch1Group1;
        batch1Groups[1] = batch1Group2;
        batch1Groups[2] = batch1Group3;


        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};


        /*
        declare an array variable named batch2Groups with the length of 3
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups
         */

        String[][] batch2Groups = new String[3][];
        batch2Groups[0] = batch2Group1;
        batch2Groups[1] = batch2Group2;
        batch2Groups[2] = batch2Group3;


        /*declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents
        */

        String[][][] CydeoStudents = new String[2][][];
        CydeoStudents[0] = batch1Groups;
        CydeoStudents[1] = batch2Groups;


        //Print the names of each student

        for (String[][] eachBatch : CydeoStudents) {
            for (String[] eachGroup : eachBatch) {
                for (String element : eachGroup) {
                    System.out.println(element);
                }
            }
        }


    }
}
