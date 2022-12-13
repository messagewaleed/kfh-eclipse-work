package org.kfh;

import java.util.List;

public class Engineer {

    private Integer id;

    private String name;

    private String skills;

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    private Laptop laptop;

    private List<Laptop> laptops;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }



    @Override
    public String toString() {
        return "Engineer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills='" + skills + '\'' +
                //this.laptop +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        //System.out.println("Setter for id called....");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //System.out.println("Setter for name called....");
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        //System.out.println("Setter for skills called....");
        this.skills = skills;
    }

    public Engineer() {
    }

    public Engineer(Integer id, String name, String skills) {
        System.out.println("Engineer(Integer, String, String)");
        this.id = id;
        this.name = name;
        this.skills = skills;
       // this.laptop = laptop;
    }

    public void workForWages(){
        System.out.println("Engineers work for wages...");
        System.out.println("Hello there I am an engineer and my details are : ");
        System.out.println(this);
        System.out.println("Below are the laptops I currently possess : ");
        laptops.forEach(System.out::println);
        System.out.println("And yes below are my address details : ");
        System.out.println(this.getAddress().getCity() + ", pin : " + this.getAddress().getPin());
    }
}
