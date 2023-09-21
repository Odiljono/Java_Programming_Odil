package gitTasks;

public class OddOrEvenTask {

    public static void main(String[] args) {

        oddOrEven(5);
    }

    public static void oddOrEven(int number){

        if(number % 2 ==0){
            System.out.println("identify(" + number + "); -> \"Even\"");
        }else{
            System.out.println("identify(" + number + "); -> \"Odd\"");
        }

    }


}
