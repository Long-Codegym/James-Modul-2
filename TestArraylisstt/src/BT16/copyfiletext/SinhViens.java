package BT16.copyfiletext;

public class SinhViens {
    private String name;
    private String phone;
    private String addres;

    public SinhViens() {
    }

    public SinhViens(String name, String phone, String addres) {
        this.name = name;
        this.phone = phone;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "SinhViens:" +
                " name= " + name +
                ", phone= " + phone +
                ", addres= " + addres  ;
    }
}
