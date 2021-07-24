package com.georgioskachrimanis.javacourse;

public class VipCustomer {

    public String name;
    public double creditLimit;
    public String vipCustomerEmail;

    public VipCustomer(String name,
                       double creditLimit,
                       String vipCustomerEmail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.vipCustomerEmail = vipCustomerEmail;
        System.out.println("The all in one...");
    }

    public VipCustomer() {
        this("Default Name", 100_000.00, "DefaultEmail");
        System.out.println("The empty one...");
    }

    public VipCustomer(String name, double creditLimit ) {
        this(name, creditLimit, "uknown@email.com");
        System.out.println("The half empty one...");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getVipCustomerEmail() {
        return vipCustomerEmail;
    }
}
