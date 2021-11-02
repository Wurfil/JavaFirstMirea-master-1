package ru.mirea.task5.opt2;

public class Labrador extends Dog{
    boolean canSwim;

    public Labrador(String name, int age, boolean canSwim) {
        super(name, age);
        this.canSwim = canSwim;
    }

    public Labrador(String name, boolean canSwim) {
        super(name);
        this.canSwim = canSwim;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public void info(){
        System.out.println("Labrador name is " + name + " age is " + age + " can swim: " + canSwim);
    }
}