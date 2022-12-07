package com.miu.fpp.lessonSix.p2.q3;

public class Cat {
    private String name;
    private String coatColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", coatColor='" + coatColor + '\'' +
                '}';
    }
}
