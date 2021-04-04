package com.company;



public class Main {

    static class thread1 extends Thread {
        @Override
        public void run() {
            ListLock<Integer> listLock = new ListLock<>();
            //trying different methods
            listLock.add(5);
            listLock.add(2);
            listLock.add(1, 17);
            listLock.add(3);
            System.out.println("For ListLock {"+listLock+"}");
            System.out.println(listLock.size());
            System.out.println(listLock.contains(2));
            listLock.remove(3);
            System.out.println(listLock.indexOf(1));
        }
    }

    public static void main(String[] args) {

        thread1 listLock= new thread1();
        listLock.start();


    }
}
