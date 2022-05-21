package com.company;

//first we create a class for borrowers
public class Borrowers {

// private data-types, as we don't want to get them accessed outside this class due to security reasons

    final private int ID; //we want the IDs to be unchanged after initialisation so adding final
    static int numberOfBorrowers; //Static: as numberOfBorrowers will not depend on any instance //will be used to allocate unique IDs
    private String name;
    private int age;
    private double yearlyIncome;
    private int PhoneNumber;
    private double duration;
    private double amountReq;

//    Constructors :

    public Borrowers(String name, int age, double yearlyIncome, int phoneNumber, double duration, double amountReq) {

        numberOfBorrowers++;
        this.ID = numberOfBorrowers; //every person will get unique and permanent ID because numberOfBorrowers is static
        this.name = name;
        this.age = age;
        this.yearlyIncome = yearlyIncome;
        PhoneNumber = phoneNumber;
        this.duration = duration;
        this.amountReq = amountReq;
        Lenders.pool-=amountReq; // I have put restriction on amount req in the main class, so amount req will not be greater than pool in any case
    }

    @Override
    public String toString() {
        return "Info{" +
                "ID=" + ID +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Yearly Income=" + yearlyIncome + " rupees"+
                ", Phone Number=" + PhoneNumber +
                ", Duration=" + duration + " years"+
                ", Amount Required=" + amountReq + " rupees"+
                '}';
    }

    //    Getters:

    public int getID() {
        return ID;
    }

    public static int getNumberOfBorrowers() {
        return numberOfBorrowers;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public double getDuration() {
        return duration;
    }

    public double getAmountReq() {
        return amountReq;
    }


//    Setters:


    public static void setNumberOfBorrowers(int numberOfBorrowers) {
        Borrowers.numberOfBorrowers = numberOfBorrowers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setAmountReq(double amountReq) {
        this.amountReq = amountReq;
    }



}
