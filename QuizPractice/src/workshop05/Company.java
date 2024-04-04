package workshop05;

public class Company {
    private double salary;
    private double annualIncome;
    private double afterTaxAnnualIncome;
    private double bonus;
    private double afterTaxBonus;

    public Company() {
    }

    public Company(double salary) {
        this.salary = salary;
    }

    public double getIncome() {
        return this.salary * 12;
    }

    public double getAfterTaxIncome(){
        return this.salary * 12 * 0.9;
    }


    public double getBonus() {
        return this.salary*0.2*4;
    }

    public double getAfterTaxBonus() {
        return this.salary*0.2*4*0.945;
    }
}

