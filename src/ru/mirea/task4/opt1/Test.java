package ru.mirea.task4.opt1;

 class Test {
    public static void main(String[] args) {
        Author a1 = new Author("Pushkin", "Sasha@mail.ru", 'm');
        System.out.println(a1.toString());
        System.out.println(a1.getEmail());
        a1.setEmail("Alex2_232@mail.ru");
        System.out.println(a1.getEmail());
    }
}