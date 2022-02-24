package run.day03;

/**
 * @ClassName Address
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-21 10:29
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private int zipcode;

    public Address(String country, String province, String city, String street, int zipcode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
class Test01{
    public static void main(String[] args) {
        System.out.println(new Address().toString());
    }
}