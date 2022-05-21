package com.company;

public class Lenders {
// private data-types, as we don't want to get them accessed outside this class due to security reasons

    final private int ID; //we want the IDs to be unchanged after initialisation so adding final
    static int numberOfLenders; //Static: as numberOfLenders will not depend on any instance //will be used to allocate unique IDs
    private String name;
    private int age;
    private int PhoneNumber;
    private double duration;
    private double amountDep;
    static int pool=0;

    public Lenders(String name, int age, int phoneNumber, double duration, double amountDep) {
        numberOfLenders++;
        this.ID = numberOfLenders;  //every person will get unique and permanent ID because numberOfBorrowers is static
        this.name = name;
        this.age = age;
        this.PhoneNumber = phoneNumber;
        this.duration = duration;
        this.amountDep = amountDep;
        pool+=amountDep;

    }

    @Override
    public String toString() {
        return "Info{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Phone Number=" + PhoneNumber +
                ", Duration=" + duration + " years"+
                ", Amount Deposited=" + amountDep + " rupees"+
                '}';
    }


    //    Getters & Setters:


    public int getID() {
        return ID;
    }

    public static int getNumberOfLenders() {
        return numberOfLenders;
    }

    public static void setNumberOfLenders(int numberOfLenders) {
        Lenders.numberOfLenders = numberOfLenders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getAmountDep() {
        return amountDep;
    }

    public void setAmountDep(int amountDep) {
        this.amountDep = amountDep;
    }
}
