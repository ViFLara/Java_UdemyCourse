package udemy.course.exercise13.entities;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax;
        if (numberOfEmployees < 10000) {
            tax = super.getAnualIncome() * 0.14;
        } else {
            tax = super.getAnualIncome() * 0.16;
        }
        return tax;
    }
}
