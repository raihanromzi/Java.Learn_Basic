package oop.composition.roomHouse;

public class Furniture {
    private String tableBrand;
    private String chairBrand;
    private int chairsTotal;
    private int tableTotal;

    public Furniture(String tableBrand, String chairBrand, int chairsTotal, int tableTotal) {
        this.tableBrand = tableBrand;
        this.chairBrand = chairBrand;
        this.chairsTotal = chairsTotal;
        this.tableTotal = tableTotal;
    }

    public String getTableBrand() {
        return tableBrand;
    }

    public String getChairBrand() {
        return chairBrand;
    }

    public int getChairsTotal() {
        return chairsTotal;
    }

    public int getTableTotal() {
        return tableTotal;
    }

    public void sitDown(){
        System.out.println("You are sitting in " + getChairBrand() + " Brand. Is it comfort?");
    }

    public void howManyFurniture(){
        int totalsFurniture = getTableTotal() + getChairsTotal();
        System.out.println("Your total furniture are " + totalsFurniture + " Pcs");
    }
}
