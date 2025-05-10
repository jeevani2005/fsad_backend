package klu.model;
import jakarta.persistence.*;

@Entity
@Table(name = "investments")
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    private String name;

    @Column(name = "invested_amount")
    private double investedAmount;

    @Column(name = "return_amount")
    private double returnAmount;

    @Column(name = "can_sell")
    private boolean canSell;

    // Getters and Setters
    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getInvestedAmount() { return investedAmount; }

    public void setInvestedAmount(double investedAmount) { this.investedAmount = investedAmount; }

    public double getReturnAmount() { return returnAmount; }

    public void setReturnAmount(double returnAmount) { this.returnAmount = returnAmount; }

    public boolean isCanSell() { return canSell; }

    public void setCanSell(boolean canSell) { this.canSell = canSell; }
}