public interface EmpWageInterface
{
    public static final int IS_EMP_FULL_TIME = 1;
    public static final int IS_EMP_PART_TIME = 2;
    public void addCompanyEmployee(String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours);
    public int getMonthlyWage(CompanyEmpWage company );
    public void getCalculationDailyWage();
}