package day26_statics.cydeoStudentTask;

public class CydeoStudent {

    public String name;
    public int age, id, batchNumber, groupNumber;
    public char gender, grade;

    public static String schoolName = "Cydeo School";
    public static String magicWord = "Wooden Spoon";

    public CydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming Language: " + magicWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:
				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage
				Add a constructor that can set All the fields (instances)
				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */