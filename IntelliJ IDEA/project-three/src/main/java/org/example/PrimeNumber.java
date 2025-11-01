package org.example;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 12;
        boolean isPrime = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println(number + " Number is prime.");
        }
        else {
            System.out.println(number + " Number is not prime.");
        }
    }
}
