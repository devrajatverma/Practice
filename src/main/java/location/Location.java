import java.io.Serializable;

public class Location implements Serializable {
    public Boolean valid = false;
    public String city;
    public String country;

    @Override
    public String toString() {
        return "Location{" +
                "valid=" + valid +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
