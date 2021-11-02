package ru.mirea.task3.opt2;

public class Human {
    private int head;
    private int leg;
    private int hand;

    public Human(int head, int leg, int hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public int getHead() {
        return head;
    }

    public int getLeg() {
        return leg;
    }

    public int getHand() {
        return hand;
    }
    public void print(){
        System.out.println("head is:" + head + "leg is:" + leg + "hand is:" + hand);
    }
}
