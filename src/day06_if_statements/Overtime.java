package day06_if_statements;

public class Overtime {

    public static void main(String[] args) {

        double hourlyRate = 20;
        double hoursWorked = 50;
                double netPay;

        if (hoursWorked <= 40) {
            netPay = hoursWorked * hourlyRate;
            System.out.println("You worked " + hoursWorked + " hours, so your total net pay is: $" + netPay);
        }else{
            double overtime = hoursWorked - 40;
            netPay = hourlyRate * (40 + overtime * 1.5);
            System.out.println("Wow you worked " + hoursWorked + " hours, so you will get " + overtime + " hours of overtime. Your net pay is $" + netPay);
        }


    }
}
/*
Declare and assign the following variables
		hourly rate & number of hours worked

	Calculate your total net pay for the week. Also consider if any overtime should be paid. Overtime will be 1.5 times the normal rate and should be paid for every hour over 40.
	(if you worked 43 hours total, you will get 40 hours normal pay and 3 hours overtime pay)

	Output different messages based on overtime
		if normal hours were worked (40 hours or less):
			You worked $hours hours, so your total net pay is: $netPay

		if you worked overtime (more than 40 hours):
			Wow you worked $hours hours so you will get $overtime_hours of overtime. Your net pay is $netPay
 */