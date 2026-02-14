package fla_2510.lb80.week02;

import fla_2510.lb80.week02.access_modifier.Child;

public class Main {
    public static void main(String[] args) {
//        Product product = new Product();
//        product.info(); // other package

        Child child = new Child();
        child.info();

        Circle circleOne = new Circle();
        circleOne.setRadius(5);

        Circle circleTwo = new Circle();
        circleTwo.setRadius(10);

        Circle circleThree = new Circle();
        circleThree.setRadius(20);

        System.out.println("Area CircleOne   : " + circleOne.getArea());
        System.out.println("Area CircleTwo   : " + circleTwo.getArea());
        System.out.println("Area CircleThree : " + circleThree.getArea());


        Mahasiswa anna = new Mahasiswa();
        anna.setNim(12345678);
        anna.setIpk(3.98);
        anna.setJurusan("Computer Science Software Engineering");
        anna.setNama("Anna Chloe");

        Mahasiswa ben = new Mahasiswa();
    }
}
