package testdocnhieufiletheoluachon.model;

import java.util.Date;

public class Students {
    private String code;
    private String name;
    private String sex;
    private Date birthDay;
    private String address;
    private String email;

    public Students() {
    }

    public Students(String code, String name, String sex, Date birthDay, String address, String email) {
        this.code = code;
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Students{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDay=" + birthDay +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
