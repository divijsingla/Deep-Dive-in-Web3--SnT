package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Borrowers {

    public Main(String name, int age, double yearlyIncome, int phoneNumber, double duration, double amountReq) {
        super(name, age, yearlyIncome, phoneNumber, duration, amountReq);
    }

    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("Welcome");
        System.out.println("============");
        System.out.println("Press");
        System.out.println("1. If you want to invest (lend your money)");
        System.out.println("2. If you want to get a loan");
        Scanner in = new Scanner(System.in);
        int a = 0;
        // creating arraylist for lenders and borrowers for adding them
        ArrayList<Lenders> lenders = new ArrayList<>();
        ArrayList<Borrowers> borrowers = new ArrayList<>();

//        creating some founder lenders so that pool is not empty and new people can come to borrow
        lenders.add(new Lenders("Founder1", 25, 12342, 5, 100000));
        lenders.add(new Lenders("Founder2", 25, 12349, 6, 100000));

        while (a != 1 && a != 2) {
            a = in.nextInt();
            if (a == 1) {
                System.out.println("Welcome Investor \nYou will get the loan payed by borrowers based on ratio of your contribution against total pool ");
                System.out.println("==============================");
                System.out.println("Personal Information");
                System.out.println("==============================");
                System.out.println("Enter your Name: ");
                String name = in.next();
                System.out.println("Enter your Phone Number: ");
                int phone = in.nextInt();
                System.out.println("Enter your age: ");
                int age = in.nextInt();
                System.out.println("==============================");
                System.out.println("Amount that you want to pool in (Rupees): ");
                double amount = in.nextDouble();
                System.out.println("Time for which you want to pool in (Years) : ");
                double duration = in.nextInt();

                lenders.add(new Lenders(name, age, phone, duration, amount));  //adding the object to arraylist
                System.out.println(lenders.get(2).toString());


                System.out.println("Success! Your contribution factor in total pool is currently " + amount * 100 / Lenders.pool + "%");

            } else if (a == 2) {
                System.out.println("Welcome to the Loan Portal");
                System.out.println("==============================");
                System.out.println("Instructions:");
                System.out.println("1. Loan will be at 10% interest per anum \n2. Repayment Capacity: If your net repayment (principal+interest) per anum is greater than half your annual income then you will be asked to re-enter the amount you need ");

                System.out.println("==============================");
                System.out.println("Personal Information");
                System.out.println("==============================");
                System.out.println("Enter your Name: ");
                String name = in.next();
                System.out.println("Enter your Phone Number: ");
                int phone = in.nextInt();
                System.out.println("Enter your age: ");
                int age = in.nextInt();
                System.out.println("Enter your Annual Income: ");
                int yearlyIncome = in.nextInt();
                System.out.println("Duration of Loan (years): ");
                double duration = in.nextDouble();
                System.out.println("Amount of credit required(in rupees): ");
                double amountreq = in.nextDouble();
                System.out.println("==============================");
                if (amountreq * 1.1 / duration > 0.5 * yearlyIncome) {
                    while (amountreq * 1.1 / duration > 0.5 * yearlyIncome) {
                        System.out.println("Your Loan can not be approved due to insufficient repayment capacity. Maximum loan available is " + 0.5 * yearlyIncome * duration / 1.1);
                        System.out.println("Re-enter credit required: ");
                        amountreq = in.nextDouble();
                        System.out.println("Re-enter duration: ");
                        duration = in.nextDouble();
                    }
                }

                if (amountreq > Lenders.pool) {
                    while (amountreq > Lenders.pool) {
                        System.out.println("Funds in Pool Insufficient");
                        System.out.println("Re-enter credit required: ");
                        amountreq = in.nextInt();
                    }
                }
                System.out.println("Your loan of " + amountreq + " for " + duration + " years will be approved shortly after checking income proof");
                System.out.println("You will have to repay " + 1.1 * amountreq + " in " + duration + " years");

                borrowers.add(new Borrowers(name, age, yearlyIncome, phone, duration, amountreq));
                System.out.println(borrowers.get(0).toString());

            } else {
                System.out.println("Invalid Input!");
            }
        }


    }
    }

