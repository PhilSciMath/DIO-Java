package br.com.dio.OOPchallenge;

public class Course extends Content{

    private int workload;

    // example with no constructor, defaults to an empty one

    @Override
    public double computeXP() {
        return XP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

}
