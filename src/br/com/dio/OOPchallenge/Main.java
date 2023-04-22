package br.com.dio.OOPchallenge;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setName("Java Basics");
        course1.setDescription("An introduction to the Java programming language.");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setName("C Basics");
        course2.setDescription("An introduction to the C programming language.");
        course2.setWorkload(15);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setName("OOP in Java");
        mentoring1.setDescription("A basic discussion on OOP.");
        mentoring1.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("A beautiful description to this Java Bootcamp");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring1);

        Dev dev1 = new Dev();
        dev1.setName("Batman");
        System.out.println(dev1.getName() + " - Registered Contents: " + dev1.getRegisteredContent());
        System.out.println(dev1.getName() + " - XP: " + dev1.computeXp());

        Dev dev2 = new Dev();
        dev2.setName("Joker");
        System.out.println(dev2.getName() + " - Registered Contents: " + dev2.getRegisteredContent());
        System.out.println(dev2.getName() + " - XP: " + dev2.computeXp());

        System.out.println("---------------\nRegistering Bootcamp ...");
        dev1.registerBootcamp(bootcamp);
        System.out.println(dev1.getName() + " - Registered Contents: " + dev1.getRegisteredContent());
        dev2.registerBootcamp(bootcamp);
        System.out.println(dev2.getName() + " - Registered Contents: " + dev2.getRegisteredContent());

        System.out.println("----------------\nFinished Contents:");
        System.out.println(dev1.getName() + " - Finished Contents: " + dev1.getFinishedContent());
        System.out.println(dev2.getName() + " - Finished Contents: " + dev2.getFinishedContent());

        System.out.println(" \n------ 10 years later ... ------");
        dev1.progress();
        System.out.println(dev1.getName() + " - Registered Contents: " + dev1.getRegisteredContent());
        System.out.println(dev1.getName() + " - Finished Contents: " + dev1.getFinishedContent());
        System.out.println(dev1.getName() + " - XP: " + dev1.computeXp());

        System.out.println(" \n------ 10 more years later ... ------");
        dev1.progress();
        dev2.progress();
        System.out.println(dev1.getName() + " - Registered Contents: " + dev1.getRegisteredContent());
        System.out.println(dev1.getName() + " - Finished Contents: " + dev1.getFinishedContent());
        System.out.println(dev1.getName() + " - XP: " + dev1.computeXp());
        System.out.println(dev2.getName() + " - Registered Contents: " + dev2.getRegisteredContent());
        System.out.println(dev2.getName() + " - Finished Contents: " + dev2.getFinishedContent());
        System.out.println(dev2.getName() + " - XP: " + dev2.computeXp());


    }

}
