public class EmpWageComputation
{
   public static int totalEmpHours = 0;
   public static int totalSalary = 0;
   public static int empHours = 0;
   public static int dailyWage = 0;

   public static final int IS_EMP_FULL_TIME = 1;
   public static final int IS_EMP_PART_TIME = 2;
   private final String companyname;
   private final int empRatePerHour;
   private final int workingDaysInMonth;
   private final int maximunWorkHours;
   
   public EmpWageComputation( String companyname, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours )
   {
    this.companyname = companyname;
    this.empRatePerHour = empRatePerHour;
    this.workingDaysInMonth = workingDaysInMonth;
    this.maximunWorkHours = maximunWorkHours;
   }

   public int getWorkingHours(int empCheck)
   {
      switch (empCheck)
      {
         case IS_EMP_FULL_TIME:  empHours = 8 ;
                                 break ;
         case IS_EMP_PART_TIME:  empHours = 4 ;
                                 break ;
         default: empHours=0  ;
      }
      return empHours;
   }

   public int getCalculationDailyWage(int empHours,int empRatePerHour )
   {
      dailyWage = empHours * empRatePerHour;
      return dailyWage;
   }

   public void getMonthlyWage()
   {
      int empDailyWage[] = new int[25];
      int totalWorkingDays = 0;
      System.out.println("\nDay No.		DailyWage	TotalWage");
      while (totalEmpHours < maximunWorkHours && totalWorkingDays < workingDaysInMonth )
      {
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         empHours = getWorkingHours(empCheck);
         totalEmpHours += empHours;
         totalWorkingDays++;
         empDailyWage[totalWorkingDays]=getCalculationDailyWage(empHours,empRatePerHour);
         totalSalary = totalSalary + empDailyWage[totalWorkingDays];
         System.out.println("Day"+totalWorkingDays+"		"+empDailyWage[totalWorkingDays]+"		"+totalSalary);
         if( totalEmpHours > 100 )
           {
               System.out.println("100 cross");
               totalEmpHours=totalEmpHours-4;
               totalSalary=totalEmpHours-80;
					System.out.println("Day"+totalWorkingDays+"     "+empDailyWage[totalWorkingDays]+"     "+totalSalary);
               break;
           }
      }
	  System.out.println("Total salary of an employee of " + companyname + " Company is " + totalSalary + " \n " );
   }

   public static void main(String args[])
   {
      System.out.println("\nWelcome to Employee Wage Computation/Problem\n");
      EmpWageComputation dMart = new EmpWageComputation("DMart", 20, 4, 30 );
      EmpWageComputation bigBazaar = new EmpWageComputation("BigBazaar", 15, 15, 20 );
      dMart.getMonthlyWage();
      bigBazaar.getMonthlyWage();
   }
}
