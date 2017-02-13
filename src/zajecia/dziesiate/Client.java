package zajecia.dziesiate;

import zajecia.dziewiate.Address;

/**
 * Created by RENT on 2017-02-13.
 */
public class Client {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    public Client(String firstName, String lastName, String phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Client(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "[ " + firstName + ", " + lastName + ", " + phoneNumber + ", " + address + " ]";
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}
