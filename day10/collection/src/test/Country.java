package test;

public class Country {
    public String country;
    private String capital;

    public Country(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
