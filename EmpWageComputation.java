import java.util.*;

public class EmpWageComputation implements EmpWageInterface
{
   public static int empHours = 0;
    
   //Using ArrayList
   private ArrayList<CompanyEmpWage> companyArray;
   private int numofCompany=0;
   
   public EmpWageComputation()
   {
    companyArray = new ArrayList<CompanyEmpWage>();
   }
   
   public void addCompanyEmployee(String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours)
    {
        CompanyEmpWage comp = new CompanyEmpWage( company, empRatePerHour, workingDaysInMonth, maximunWorkHours);
        companyArray.add(comp);
        numofCompany++;
    }
//method for checking emp attendance
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
//method for calculation of Daily Wage
   public void getCalculationDailyWage()
   {    
      for (int i=0; i< numofCompany; i++)
      { 
        System.out.println(companyArray.get(i) + "" + getMonthlyWage( companyArray.get(i)) );
      } 
   }
//method for MonthlyWage    
   public int getMonthlyWage(CompanyEmpWage company )
   {
      int totalEmpHours = 0, dailyWage = 0, totalSalary = 0, totalWorkingDays = 0;
      while (totalEmpHours < company.maximunWorkHours && totalWorkingDays < company.workingDaysInMonth )
      {
         int empCheck = (int) Math.floor(Math.random() * 10) % 3;
         empHours = getWorkingHours(empCheck);
         dailyWage = company.empRatePerHour * empHours;
         totalSalary = totalSalary + dailyWage;
         totalEmpHours += empHours;
         totalWorkingDays++;
         if( totalEmpHours > company.maximunWorkHours )
           {
               return company.empRatePerHour * company.maximunWorkHours;
           }
         
        }
         return totalSalary;
    }

//main method
   public static void main(String args[])
   {
      System.out.println("\nWelcome to Employee Wage Computation/Problem\n");
      EmpWageComputation employeeWage = new EmpWageComputation();
      employeeWage.addCompanyEmployee("D Mart", 20, 4, 30 );
      employeeWage.addCompanyEmployee("Reliance", 15, 5, 25 );
      employeeWage.getCalculationDailyWage();
   }
}