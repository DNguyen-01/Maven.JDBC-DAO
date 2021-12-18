package daos;

import java.util.List;

public class Whiskey implements WhiskeyDAO {

    private Integer id;
    private String brand;
    private String type;
    private String style;
    private String place;


    public  Whiskey(){
    }

    public Whiskey(String brand, String type, String style, String place){
      this.brand = brand;
      this.type = type;
      this.style = style;
      this.place = place;
    }

    public Whiskey(Integer id, String brand, String type, String style, String place) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.style = style;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Whiskey findById(int id) {
        return null;
    }

    public List<Whiskey> findAll() {
        return null;
    }

    public Whiskey update(Whiskey dto) {
        return null;
    }

    public Whiskey create(Whiskey dto) {
        return null;
    }

    public void delete(int id) {

    }
}
