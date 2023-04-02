package model.material;

import java.time.LocalDate;

public abstract class Material implements Discount {
    protected String id;
    protected String name;
    LocalDate manufacturingDate;
    int cost;

    public Material() {
    }

    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }
    public abstract double getAmount();
    public abstract LocalDate getExpiryDate();
}
