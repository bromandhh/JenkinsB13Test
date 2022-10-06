package com.company;

public class Main {

        public static void main(String [] args) throws InterruptedException {

            for(int i=1; i<=10; i++){

                System.out.println(i+ ". Kabul is a beautiful city.");
                Thread.sleep(2000);
            }
        }
}
