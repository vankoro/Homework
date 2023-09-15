package org.example;

public class Main {
    public static void main(String[] args) {

        /*
        Car lastochka = new Car();
        Car moskvich = new Car("blue", "moskvich", true, 140);
        Car porsche = new Car("911", true, 400);

        lastochka.setColor("white");
        lastochka.setHorsePower(90);

        //если нет модели, нет "новая", то пишем "0"

        System.out.println("Машина модели " + lastochka.getModel() + ", цвета " + lastochka.getColor() +", новая " + lastochka.getNew() + ", лошадиные силы " + lastochka.getHorsePower());

         */

        Human matthew = new Human("Matthew", 182, "man", 18, true);

        System.out.println("Мой друг " + matthew.getName() + ", ему " + matthew.getAge() + " лет.");


    }




}