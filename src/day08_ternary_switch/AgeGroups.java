package day08_ternary_switch;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 85;

        String ageGroup = (age >= 0 && age < 3) ? "Infant" : (age > 2 && age < 6) ? "Toddler"
                : (age > 5 && age < 10) ? "Kid" : (age > 9 && age < 13) ? "Pre-Teen" : (age > 12 && age < 18) ? "Teenager" : (age > 17 && age < 21) ? "Young Adult" : (age > 20 && age < 40) ? "Adult"
                : (age > 39 && age < 50) ? "Young Middle-Aged Adult" : (age > 49 && age < 55) ? "Middle-Aged Adult" : (age > 54 && age < 65) ? "Very Young Senior Citizen" : (age > 64 && age < 75) ?
                "Young Senior Citizen" : (age > 74 && age < 85) ? "Senior Citizen" : "Old Senior Citizen";

        System.out.println(ageGroup);

    }
}
/*
write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary
 */