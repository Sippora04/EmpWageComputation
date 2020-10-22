import java.util.Random;
public class EmpWageComputation
{
    //CONSTANTS
    public static final int IS_EMP_FULL_TIME=1;
    public static final int IS_EMP_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int WORKING_DAYS_IN_MONTH=20;
    public static final int MAXIMUM_WORK_HOURS=100;

    //method for employee working hours
    public static int getWorkingHours(int empCheck)
    {
        //variables
        int empHours = 0;
        switch (empCheck)
        {
            case IS_EMP_FULL_TIME:
                empHours = 8;
                break;
            case IS_EMP_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }
        return empHours;
    }
    //method for calculating employee monthly wage
    public static void calculateMonthlyWage()
    {
        //variables
        int totalEmpHours = 0;
        int totalSalary = 0;
        int totalWorkingDays = 0;
        int empHours=0;
        while (totalEmpHours < MAXIMUM_WORK_HOURS && totalWorkingDays < WORKING_DAYS_IN_MONTH)
        {
            Random randNo = new Random();
            int empCheck = randNo.nextInt() % 3;
            empHours = getWorkingHours(empCheck);
            totalEmpHours = totalEmpHours + empHours;
            totalWorkingDays++;
        }
        //calculating total salary of employee
        totalSalary = totalEmpHours * EMP_RATE_PER_HOUR;
        System.out.println("Total Salary of employee = " + totalSalary);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation");
        calculateMonthlyWage();
    }
}
