package org.kfh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("anEngineer") //Instructing Spring to treat this a bean
@PropertySource("classpath:data.properties")
public class AnnotationsEngineer implements Engineer {

    @Value("${db.name}")
    private String name;

    @Value("${db.location}")
    private String country;

    @Autowired
    private List<String> names;

    @Autowired
    private Laptop laptop;


    public AnnotationsEngineer() {
    }

    @Override
    public String toString() {
        return "AnnotationsEngineer{" +
                "laptop=" + laptop +
                '}';
    }

    public Laptop getLaptop() {
        return laptop;
    }

    @Override
    public void workForWages() {
        System.out.println("Hello there, my laptop details are:");
        System.out.println(getLaptop().getName() + " from " + getLaptop().getCompany());

        System.out.println("User details : ");
        System.out.println(name + " from "  +country);

        System.out.println("Names registered :");
        names.forEach(System.out::println);
    }
}
