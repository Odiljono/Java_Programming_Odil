package day19_array;

public class Classmates {

    public static void main(String[] args) {

        String[] name = new String[10];

        name[0] = "Jon Doe";
        name[1] = "John Wall";
        name[2] = "Paul Johns";
        name[3] = "Sam Cook";
        name[4] = "Tim Lock";
        name[5] = "Burt Simpson";
        name[6] = "Kate Rid";
        name[7] = "Kim Benn";
        name[8] = "Tara Rid";
        name[9] = "Sue Jane";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i].charAt(0) + "." + name[i].charAt( name[i].indexOf(" ") +1) + ".");
                  //  substring(name[i].indexOf(" ") + 1, name[i].indexOf(" ") + 2) + ".");
        }

        System.out.println("_________________________________________");


        for (int j = 0; j < 10; j++) {
            String reverse = "";

            for (int i = 0; i < name[j].length(); i++) {
                reverse += name[j].charAt(name[j].length() - 1 - i);
            }

            System.out.println(reverse);
        }
    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines


2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */