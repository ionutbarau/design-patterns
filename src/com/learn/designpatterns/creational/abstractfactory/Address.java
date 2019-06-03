package com.learn.designpatterns.creational.abstractfactory;

/**
 * The abstract generic Address class that will be extended by concrete implementations.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 17/09/2018.
 * Time: 12:31
 */
public abstract class Address {

    private String street;
    private Integer number;
    private String postCode;

    public Address(String street, Integer number, String postCode) {
        this.street = street;
        this.number = number;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String printAddress(){
        StringBuilder sb = new StringBuilder(getStreet());
        sb.append(" ").append(getNumber()).append(" ").append(getPostCode());
        return sb.toString();
    }
}
