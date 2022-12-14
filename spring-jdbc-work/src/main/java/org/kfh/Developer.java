package org.kfh;

public class Developer {
    private Integer id;

    private String name;

    private String skills;

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills='" + skills + '\'' +
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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Developer() {
    }

    public Developer(Integer id, String name, String skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public Developer(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }
}
