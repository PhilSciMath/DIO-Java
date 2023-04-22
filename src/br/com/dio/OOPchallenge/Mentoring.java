package br.com.dio.OOPchallenge;

import java.time.LocalDate;

public class Mentoring extends Content{

    private LocalDate date;

    public Mentoring() {
    }

    @Override
    public double computeXP() {
        return XP + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }


}
