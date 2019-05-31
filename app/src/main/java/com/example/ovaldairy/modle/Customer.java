package com.example.ovaldairy.modle;

public class Customer {
    int _id;
    String name;
    String phone_number;

    public Customer() {
    }

    public Customer(int id, String name, String _phone_number) {
        this._id = id;
        this.name = name;
        this.phone_number = _phone_number;
    }
}
