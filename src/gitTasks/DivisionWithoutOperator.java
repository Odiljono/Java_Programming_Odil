package gitTasks;

public class DivisionWithoutOperator {

    public static double divisionWithoutOperator(int nominator, int denominator) {
        if (nominator == 0) {
            return 0;
        }
        if (denominator == 0) {
            throw new ArithmeticException("Denominator can not be 0");
        }
        int sign = 1;
        if (nominator < 0 && denominator > 0 || nominator > 0 && denominator < 0) {
            sign = -1;
        }

        nominator = Math.abs(nominator);
        denominator = Math.abs(denominator);
        int intCount = 0;
        while (nominator >= denominator) {
            nominator -= denominator;
            intCount++;

        }

        double decimalCount = 0;
        if (nominator < denominator&&nominator!=0) {
            nominator = nominator * 10;
            while (nominator>=denominator){
                nominator-=denominator;
                decimalCount+=0.1;
            }
        }

        return (intCount+decimalCount)*sign;

    }

    public static void main(String[] args) {
        System.out.println(divisionWithoutOperator(5, -2));
        System.out.println(divisionWithoutOperator(6, -2));
        System.out.println(divisionWithoutOperator(1, -2));
        System.out.println(divisionWithoutOperator(8, 3));
    }

}
