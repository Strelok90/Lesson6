package ru.geekbrains.Lesson6;

public class Works {
    public static void main(String[] args) {

        Cat Cat1 = new Cat("Стив", 200, 0, 2); //Ограничения
        Cat Cat2 = new Cat("Барсик", 50, 0, 1); //Ограничения
        Dog Dog1 = new Dog("Тюзик", 400, 10, 0.5); //Ограничения
        Dog Dog2 = new Dog("Борбос", 600, 10, 0.5); //Ограничения

        Cat1.run(200);
        Cat1.swim(0);
        Cat1.jump(2);

        System.out.println();

        Cat2.run(50);
        Cat2.swim(0);
        Cat2.jump(2);

        System.out.println();

        Dog1.run(500);
        Dog1.swim(10);
        Dog1.jump(0.5);

        System.out.println();

        Dog2.run(400);
        Dog2.swim(10);
        Dog2.jump(0.5);


    }
}
