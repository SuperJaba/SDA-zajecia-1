package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class User {
    public String firstName;
    public String lastName;
    public String birthDate;
    public Address address;

    public User(String firstName, String lastName, String birthDate, Address address) {
        this(firstName, lastName, birthDate);
        this.address = address;
    }

    public User(String firstName1, String lastName1, String birthDate1) {
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.birthDate = birthDate1;
    }

    public void print() {
        System.out.println(firstName + " " + lastName + " " + birthDate);
        if (address != null) {
            address.print();
        }
    }
}
