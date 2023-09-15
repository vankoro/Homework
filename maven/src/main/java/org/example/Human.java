package org.example;

public class Human {

    private String name;

    private Integer hight;

    private String male;

    private Integer age;

    private Boolean skinIsWhite;

    public Human(String name, int hight, String male, Integer age, Boolean skinIsWhite) {
        this.name = name;
        this.hight = hight;
        this.male = male;
        this.age = age;
        this.skinIsWhite = skinIsWhite;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSkinIsWhite() {
        return skinIsWhite;
    }

    public void setSkinIsWhite(Boolean skinIsWhite) {
        this.skinIsWhite = skinIsWhite;
    }
}
