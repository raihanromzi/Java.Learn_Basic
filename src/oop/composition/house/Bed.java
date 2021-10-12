package oop.composition.house;

public class Bed {
    private String style;
    private int pillow;
    private int height;
    private int sheets;
    private int quit;

    public Bed(String style, int pillow, int height, int sheets, int quit) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.quit = quit;
    }

    public void make(){
        System.out.println("Bedroom -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillow;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuit() {
        return quit;
    }
}
