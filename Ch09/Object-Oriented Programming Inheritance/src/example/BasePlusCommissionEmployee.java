package example;

public class BasePlusCommissionEmployee extends CommissionEmployee {


    private double baseSalary;

    public BasePlusCommissionEmployee(String var1, String var2, String var3, double var4, double var6, double var8) {
        super(var1, var2, var3, var4, var6);
        this.setBaseSalary(var8);
    }

    public void setBaseSalary(double var1) {
        if (var1 >= 0.0D) {
            this.baseSalary = var1;
        } else {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public double earnings() {
        return this.baseSalary + this.commissionRate * this.grossSales;
    }

    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "base-salaried commission employee", this.firstName, this.lastName, "social security number", this.socialSecurityNumber, "gross sales", this.grossSales, "commission rate", this.commissionRate, "base salary", this.baseSalary);
    }

    public static void BasePlusCommissionEmployeeTest(){

        BasePlusCommissionEmployee var1 = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000.0D, 0.04D, 300.0D);
        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is", var1.getFirstName());
        System.out.printf("%s %s\n", "Last name is", var1.getLastName());
        System.out.printf("%s %s\n", "Social security number is", var1.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", var1.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", var1.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is", var1.getBaseSalary());
        var1.setBaseSalary(1000.0D);
        System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString", var1.toString());
    }
}
