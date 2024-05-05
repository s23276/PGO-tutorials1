public class Address
{
    public String createAddress (String country)
    {
        return String.format ("Country: %s", country);
    }
    public String createAddress (String country, String city)
    {
        return String.format ("Country: %s, city: %s", country, city);
    }
    public String createAddress (String country, String city, String postalCode)
    {
        return String.format ("Country: %s, city: %s, PostalCode: %s", country, city, postalCode);
    }
    public String createAddress (String country, String city, String postalCode, String streetName)
    {
        return String.format ("Country: %s, city: %s, PostalCode: %s, StreetName: %s", country, city, postalCode, streetName);
    }
    public String createAddress (String country, String city, String postalCode, String streetName, int apartmentNumber)
    {
        return String.format ("Country: %s, city: %s, PostalCode: %s, StreetName: %s, Apartmentnumber: %s", country, city, postalCode, streetName, apartmentNumber);
    }


}
