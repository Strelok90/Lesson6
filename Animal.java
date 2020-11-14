package ru.geekbrains.Lesson6;

abstract class Animal {
    private String name;
    private int MaxRunLength;
    private int MaxSwimLength;
    private double MaxJumpHeight;



    public Animal(String name, int MaxRunLength, int MaxSwimLength, double MaxJumpHeight){
        this.name = name;
        this.MaxRunLength = MaxRunLength;
        this.MaxJumpHeight = MaxJumpHeight;
        this.MaxSwimLength = MaxSwimLength;

    }

    public void run (int run){
        if ((run >= 0) && (run <= MaxRunLength)) System.out.println(this.name + " run: true");
        else System.out.println(this.name + " run: false");
    }

    public void swim(int swim){
        if ((swim > 0) && (swim <= MaxSwimLength)) System.out.println(this.name + " swim: true");
        else System.out.println(this.name + " swim: false");
    }

    public void jump(double jump){
        if ((jump >= 0) && (jump <= MaxJumpHeight)) System.out.println(this.name + " jump: true");
        else System.out.println(this.name + " jump: false");
    }
}
