package zajecia.dziewiate;

public class Address {
    //zdefiniowac pola
    public String city;
    public String street;
    public int houseNumber;
    public String zipCode;
    public String land;

    public Address(String city, String street, int houseNumber, String zipCode, String land) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.land = land;
    }



    public Address() {
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(zipCode)
                .append(" ")
                .append(city)
                .append(", ")
                .append(street)
                .append(" ")
                .append(houseNumber)
                .append(" ")
                .append(land);
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);
    }
}
