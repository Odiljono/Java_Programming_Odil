package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java"); //all 'Python' will be replaced with 'Java'

        System.out.println(sentence);

        //----------------------------------------------------------

        String word = "java";

        // word = word.replace('a' , 'e');  //"jeve"

        word.replace("a", "e");

        System.out.println(word);

        //----------------------------------------------------------

        String sentence2 = "I love Java, Java is cool";

        //sentence2 = sentence2.replace("Java", "Python");

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2); //I love Python, Java is cool

        //----------------------------------------------------------

        String sentence3 = "Java is fun, Java  is cool, Java is amazing";

        //sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");

        System.out.println(sentence3); //Java is fun, Python  is cool, Java is amazing


        //----------------------------------------------------------

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1); //Java

        System.out.println(languageName);

        //----------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                  0123456789

        String today = sentence5.substring(9, 14+1); //Sunday

        System.out.println(today);

        //----------------------------------------

        String email = "CydeoSchoolJavaProgramming@yahoo.com";

        int beginning = email.indexOf("@") + 1;
        int ending = email.lastIndexOf('.');

        String domain =  email.substring(beginning, ending); //yahoo

        System.out.println(domain);

        //----------------------------------------

        String sentence6 = "I love Java programming";

        // String r1 = sentence6.substring(7, sentence6.length());

        String r1 = sentence6.substring(7); //Java programming

        System.out.println(r1);


        System.out.println("------------------------------------");

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow =  sentence7.substring( sentence7.lastIndexOf(" ") + 1 );
        // create the substring "Monday" from sentence7. DO NOT count any index numbers

        System.out.println(tomorrow);

        System.out.println("------------------------------------");

        String str = "Python";

        String result = (str +"\n").repeat(10); //repeats 'Python' 10 times in new lines

        System.out.println(result);

    }
}
