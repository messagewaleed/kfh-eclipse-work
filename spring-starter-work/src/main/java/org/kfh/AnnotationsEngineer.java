package org.kfh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("anEngineer") //Instructing Spring to treat this a bean
public class AnnotationsEngineer implements Engineer {

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
    }
}
