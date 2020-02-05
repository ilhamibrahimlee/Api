package az.com.orient.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {
    Integer id ;
     String marka;
     String model;
     int year;

    public Car(Integer id, String marka, String model, int year) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.year = year;
    }

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

