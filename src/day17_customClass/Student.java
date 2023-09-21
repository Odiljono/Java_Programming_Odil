package day17_customClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentID;
    public char grade;
    public boolean isFullTime;


    public void setInfo(String name, char gender, int age, String studentID, char grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name +" is sleeping");
    }

}
/*
Create a custom class named Student
		Attributes: name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */