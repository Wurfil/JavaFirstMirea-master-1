package ru.mirea.task5.opt2;

class Shepherd extends Dog{
    int speed;
    public Shepherd(String name, int age, int speed) {
        super(name, age);
        this.speed = getSpeed();
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void info(){
        System.out.println("Shepherd name is " + name + " age is " + age + " speed is " + speed);
    }
}
