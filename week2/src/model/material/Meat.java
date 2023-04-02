package model.material;

import java.time.LocalDate;

public class Meat  extends Material implements Discount{
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return cost*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate after5Days = this.manufacturingDate.plusDays(5);
        LocalDate expiredDate = getExpiryDate();
        if (expiredDate.isBefore(LocalDate.now())) { // over date, destroyed
            return 0;
        } else if (after5Days.isBefore(LocalDate.now())) { //discount 30%
            return getAmount()*0.7;
        } else { //discount 10%
            return getAmount()*0.9;
        }
    }

    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
