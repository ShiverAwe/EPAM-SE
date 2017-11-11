package com.epam.javaschool.shefer.chapter2.task1;

public class Pen {
    public final static int COLOR_BLACK = 0;
    public final static int COLOR_BLUE = 1;
    public final static int COLOR_RED = 2;
    public final static int COLOR_GREEN = 3;

    private final int color;

    public final static int TYPE_BALLPOINT = 0;
    public final static int TYPE_ROLLERBALL = 1;
    public final static int TYPE_FOURTAIN = 2;

    private final int type;

    private final String brand;


    private boolean checkType(int type){
        if (type < 0 || type > 2)
            return false;
        return true;
    }

    private boolean checkColor(int color){
        if (color < 0 || color > 3)
            return false;
        return true;
    }

    public Pen(int color, int type, String brand) {
        if (!checkType(type)) throw new IllegalArgumentException("Wrong type number");
        if (!checkColor(color)) throw new IllegalArgumentException("Wrong color number");

        this.color = color;
        this.type = type;
        this.brand = brand;

    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color +
                ", type=" + type +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (color != pen.color) return false;
        if (type != pen.type) return false;
        return brand.equals(pen.brand);
    }

    @Override
    public int hashCode() {
        int result = color;
        result = 31 * result + type;
        result = 31 * result + brand.hashCode();
        return result;
    }
}
