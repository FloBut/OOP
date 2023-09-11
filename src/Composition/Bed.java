package Composition;

public class Bed {
    private String name;
    private int pillow;
    private int height;
    private int width;

    public Bed(String name, int pillow, int height, int width) {
        this.name = name;
        this.pillow = pillow;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPillow() {
        return pillow;
    }

    public void setPillow(int pillow) {
        this.pillow = pillow;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }

}
