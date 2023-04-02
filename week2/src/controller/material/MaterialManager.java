package controller.material;

import model.material.Material;

import java.time.LocalDate;
import java.util.ArrayList;

public class MaterialManager {
    ArrayList<Material> listMaterial;

    public MaterialManager() {
        listMaterial = new ArrayList<Material>();
    }
    public void addMaterial(Material element) {
        listMaterial.add(element);
    }
    public void removeMaterial() {
        //remove material expired
        for (int index = listMaterial.size() - 1; index >=0; index --) {
            if (listMaterial.get(index).getExpiryDate().isBefore(LocalDate.now())) {
                listMaterial.remove(index);
            }
        }
    }
    public void editMaterial() {

    }
    public void printMaterial() {
        int index = 1;
        for( Material material: listMaterial) {
            System.out.println(Integer.toString(index) + ". " + material);
            System.out.printf("Origin price: %f - Sale price: %f\n", material.getAmount(), material.getRealMoney());
            index ++;
        }
    }
}
