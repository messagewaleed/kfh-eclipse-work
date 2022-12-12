package org.kfh;

public class Engineer {

    private Integer id;

    private String name;

    private String skills;

    @Override
    public String toString() {
        return "Engineer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills='" + skills + '\'' +
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
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public void workForWages(){
        System.out.println("Engineers work for wages...");
        System.out.println("Hello there I am an engineer and my details are : ");
        System.out.println(this);
    }
}
