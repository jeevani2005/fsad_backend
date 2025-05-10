package klu.model;

import jakarta.persistence.*;

@Entity
@Table(name = "income_bills")
public class IncomeBills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double income;
    private double rent;
    private double groceries;
    private double entertainment;
    private double travel;
    private double education;
    private double food;
    private double shopping;

    public IncomeBills() {}

    public IncomeBills(Long id, double income, double rent, double groceries,
                       double entertainment, double travel, double education,
                       double food, double shopping) {
        this.id = id;
        this.income = income;
        this.rent = rent;
        this.groceries = groceries;
        this.entertainment = entertainment;
        this.travel = travel;
        this.education = education;
        this.food = food;
        this.shopping = shopping;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getGroceries() {
        return groceries;
    }

    public void setGroceries(double groceries) {
        this.groceries = groceries;
    }

    public double getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(double entertainment) {
        this.entertainment = entertainment;
    }

    public double getTravel() {
        return travel;
    }

    public void setTravel(double travel) {
        this.travel = travel;
    }

    public double getEducation() {
        return education;
    }

    public void setEducation(double education) {
        this.education = education;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getShopping() {
        return shopping;
    }

    public void setShopping(double shopping) {
        this.shopping = shopping;
    }
}
