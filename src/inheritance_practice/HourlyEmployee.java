package inheritance_practice;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }
    public double getDoublePay(){
        return  2*collectPay();
    }
}
