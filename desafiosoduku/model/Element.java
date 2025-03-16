package desafiosoduku.model;

public class Element {

    private int x;
    private int y;
    private int value;
    private boolean isFixed;

    public Element(int x, int y, int value, boolean fixed) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.isFixed = fixed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int valor) {
        this.value = valor;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean estado) {
        this.isFixed = estado;
    }

}
