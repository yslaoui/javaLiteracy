package literacy;

public class Literacy {
    String country;
    int year;
    String sex;
    double literacyRate;

    public Literacy(String country, int year, String sex, double literacyRate) {
        this.country = country;
        this.year = year;
        this.sex = sex;
        this.literacyRate  = literacyRate;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getSex() {
        return sex;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + ") , " + this.sex + ", " + this.literacyRate;
    }
}
//Niger (2015), female, 11.01572