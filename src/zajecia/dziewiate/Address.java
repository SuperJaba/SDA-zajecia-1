package zajecia.dziewiate;

public class Address {
    String country;
    String city;
    String street;
    int houseNumber;
    String zipCode;

    //konstruktor
    public Address(String country, String city, String street, int houseNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
    }


    public Address() {

    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(country)
                .append(" ")
                .append(city)
                .append(" ")
                .append(street)
                .append(" ")
                .append(houseNumber)
                .append(" ")
                .append(zipCode);
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
