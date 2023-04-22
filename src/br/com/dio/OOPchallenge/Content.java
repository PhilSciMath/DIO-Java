package br.com.dio.OOPchallenge;
/*
 *  An abstract class cannot be instantiated
 */
public abstract class Content {

    protected static final double XP = 10d;
    private String name;
    private String description;

    public abstract double computeXP ();

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
}
