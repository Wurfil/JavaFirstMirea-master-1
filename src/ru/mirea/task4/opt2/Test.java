package ru.mirea.task4.opt2;

 class Test {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(10,0);
        b1.setXY(15,5);
        System.out.println(b1.toString());
        b2.move(5,1);
        System.out.println(b1.getX());
        System.out.println(b2.toString());
    }
}