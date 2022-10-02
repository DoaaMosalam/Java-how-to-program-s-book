package example;

public class CommissionEmployee extends Object {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(String var1, String var2, String var3, double var4, double var6) {
        this.firstName = var1;
        this.lastName = var2;
        this.socialSecurityNumber = var3;
        this.setGrossSales(var4);
        this.setCommissionRate(var6);
    }

    public void setFirstName(String var1) {
        this.firstName = var1;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String var1) {
        this.lastName = var1;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setSocialSecurityNumber(String var1) {
        this.socialSecurityNumber = var1;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setGrossSales(double var1) {
        if (var1 >= 0.0D) {
            this.grossSales = var1;
        } else {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
    }

    public double getGrossSales() {
        return this.grossSales;
    }

    public void setCommissionRate(double var1) {
        if (var1 > 0.0D && var1 < 1.0D) {
            this.commissionRate = var1;
        } else {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double earnings() {
        return this.commissionRate * this.grossSales;
    }

    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "commission employee", this.firstName, this.lastName, "social security number", this.socialSecurityNumber, "gross sales", this.grossSales, "commission rate", this.commissionRate);
    }
}
