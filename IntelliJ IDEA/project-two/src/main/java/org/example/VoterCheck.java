package org.example;

public class VoterCheck {
    public static void main(String[] args) {
        int a = 20;
        String checkStatus = (a > 18) ? "Voter" : "Not Voter";
        System.out.println(checkStatus);
    }
}
