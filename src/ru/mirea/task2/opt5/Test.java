package ru.mirea.task2.opt5;

class Test {
    Dog [] arr = new Dog[5];
    int iter = 0;

    public int getIter() {
        return iter;
    }

    public Dog[] getArr() {
        return arr;
    }

    public void addDog(){
        arr[iter] = new Dog("Rex " + iter, iter);
        iter++;
        arr[iter] = new Dog("Puppy " + iter, iter+4);
        iter++;
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.addDog();
        test.addDog();
        for (int i = 0; i < test.getIter(); i++){
            System.out.println(test.getArr()[i].toString());
        }

    }
}
