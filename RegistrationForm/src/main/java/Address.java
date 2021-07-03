
public class Address{

    private String index;
    private String city;
    private String street;
    private String buildingNumber;
    private String flatNumber;


    private Address(String index, String city, String street, String buildingNumber, String flatNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.flatNumber = flatNumber;
    }

    private Address(String index, String city, String street, String buildingNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;

    }


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}