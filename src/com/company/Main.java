package com.company;
import homework5.*;

public class Main {

    public static void main(String[] args) {

        //6. Створіть два масиви: з учасниками та перешкодами.
        Barrier[] barriers = new Barrier[6];
        Member[] members = new Member[6];

        barriers[0] = new Wall(5);
        barriers[1] = new Wall(10);
        barriers[2] = new Wall(15);
        barriers[3] = new Racetrack(5);
        barriers[4] = new Racetrack(10);
        barriers[5] = new Racetrack(15);

        members[0] = new Human("Winston", 30, 30);
        members[1] = new Human("Boris", 20, 5);
        members[2] = new Robot("R2D2", 3, 30);
        members[3] = new Robot("R3D3", 30, 10);
        members[4] = new Cat("Richard", 30, 3);
        members[5] = new Cat("Felix", 20, 5);

        //Змагання
        System.out.println("Старт змагань!");
        for (var i = 0; i<members.length; i++) {
            System.out.println("Учасник №"+(i+1)+" "+members[i].type+" "+members[i].name+" розпочав забіг");
            for (var j = 0; j<barriers.length; j++) {
                if (barriers[j].overcome(members[i]) == false) {
                    System.out.println("Учасник №"+(i+1)+" "+members[i].type+" "+members[i].name+" вибуває на "+(j+1)+" перешкоді");
                    break;
                } else if (j == barriers.length-1) {
                    System.out.println("Учасник №"+(i+1)+" "+members[i].type+" "+members[i].name+" пройшов всі "+(j+1)+" перешкод!");
                }
            }
        }


        //Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві
        Shapes[] shapes = new Shapes[3];
        shapes[0] = new Square(1);
        shapes[1] = new Circle(2);
        shapes[2] = new Triangle(3);

        double totalSquare = 0;
        for (var i = 0; i<shapes.length; i++) {
            totalSquare += shapes[i].getSquare();
        }
        System.out.println("Сумарна площа фігур - "+totalSquare);
    }
}

