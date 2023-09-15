package org.example;

public class Car {

    private String color;

    private String model;

    private Boolean isNew;

    private Integer horsePower;

    public Car(String color, String model, Boolean isNew, Integer horsePower) {
        this.color = color;
        this.model = model;
        this.isNew = isNew;
        this.horsePower = horsePower;
    }

    public Car() {
    }




    public Car(String carModel, Boolean isNew, Integer horsePower) {
        this.model = carModel;
        this.isNew = isNew;
        this.horsePower = horsePower;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}
