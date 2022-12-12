package org.kfh;

public class Laptop {
    private Integer id;

    private String name;

    private String company;

    @Override
    public String toString() {
        return "Laptop{" +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Laptop() {
    }

    public Laptop(Integer id, String name, String company) {
        this.id = id;
        this.name = name;
        this.company = company;
    }
}
