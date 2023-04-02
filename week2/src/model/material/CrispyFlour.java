package model.material;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate after2Month = this.manufacturingDate.plusMonths(2);
        LocalDate after4Month = this.manufacturingDate.plusMonths(4);
        LocalDate expiredDate = getExpiryDate();
        if (expiredDate.isBefore(LocalDate.now())) { // over date, destroyed
            return 0;
        } else if (after2Month.isBefore(LocalDate.now())) { //discount 40%
            return getAmount()*0.6;
        } else if (after4Month.isBefore(LocalDate.now())) {//discount 20%
            return getAmount() * 0.8;
        } else { //discount 5%
            return getAmount() * 0.95;
        }
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
