package br.com.dio.OOPchallenge;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate startingDate = LocalDate.now();
    private final LocalDate finalDate = startingDate.plusDays(45);
    private Set<Dev> registeredDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getRegisteredDevs() {
        return registeredDevs;
    }

    public void setRegisteredDevs(Set<Dev> registeredDevs) {
        this.registeredDevs = registeredDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startingDate, bootcamp.startingDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(registeredDevs, bootcamp.registeredDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startingDate, finalDate, registeredDevs, contents);
    }
}
