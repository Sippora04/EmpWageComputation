class CompanyEmpWage
{
        public final String company;
        public final int empRatePerHour;
        final int workingDaysInMonth;
        final int maximunWorkHours;
        public int totalEmpWage;
        public CompanyEmpWage( String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours )
        {
            this.company = company;
            this.empRatePerHour = empRatePerHour;
            this.workingDaysInMonth = workingDaysInMonth;
            this.maximunWorkHours = maximunWorkHours;
        }

public void setTotalEmpWage(int totalEmpWage) 
{
        this.totalEmpWage = totalEmpWage;
}
@Override
public String toString() 
{
        return ("Total Emp Wage for Company: " +company+ " is: " + totalEmpWage);
}
}
