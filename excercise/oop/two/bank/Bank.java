package oop.two.bank;

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Apna";
        a1.email = "tamim@ahasan.com";
        // a1.setPassword("abcd");
        System.out.println(a1.getPassword());
    }
}
