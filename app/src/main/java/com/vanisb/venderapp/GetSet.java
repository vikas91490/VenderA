package com.vanisb.venderapp;

public class GetSet {

    String name;
    String address;
    int image;

    public GetSet(String name, String address, int image) {
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public GetSet(String user_name, String address) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
