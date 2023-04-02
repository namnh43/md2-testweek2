import controller.material.MaterialManager;
import model.material.CrispyFlour;
import model.material.Material;
import model.material.Meat;

import java.time.LocalDate;

public class MaterialMain {
    public static void main(String[] args) {
        MaterialManager materialManager = new MaterialManager();
        Material thit1 = new Meat("thit1","thit bo", LocalDate.parse("2023-03-28"), 200, 1);
        Material thit2 = new Meat("thit2","thit heo", LocalDate.parse("2023-03-27"), 100, 1);
        Material thit3 = new Meat("thit3","thit ga", LocalDate.parse("2023-03-26"), 150, 1);
        Material thit4 = new Meat("thit4","thit ca", LocalDate.parse("2023-04-01"), 100, 2);
        Material thit5 = new Meat("thit5","thit thiu", LocalDate.parse("2023-03-01"), 50, 1);
        Material bot1 = new CrispyFlour("bot1","bot my", LocalDate.parse("2022-07-28"), 10, 2);
        Material bot2 = new CrispyFlour("bot2","bot san day", LocalDate.parse("2022-12-28"), 50, 4);
        Material bot3 = new CrispyFlour("bot3","bot san day", LocalDate.parse("2022-12-28"), 50, 4);
        Material bot4 = new CrispyFlour("bot4","bot ngo", LocalDate.parse("2023-01-28"), 30, 5);
        Material bot5 = new CrispyFlour("bot5","bot chien gion", LocalDate.parse("2023-02-28"), 40, 6);
        materialManager.addMaterial(thit1);
        materialManager.addMaterial(thit2);
        materialManager.addMaterial(thit3);
        materialManager.addMaterial(thit4);
        materialManager.addMaterial(thit5);
        materialManager.addMaterial(bot1);
        materialManager.addMaterial(bot2);
        materialManager.addMaterial(bot3);
        materialManager.addMaterial(bot4);
        materialManager.addMaterial(bot5);
        materialManager.printMaterial();
    }
}
