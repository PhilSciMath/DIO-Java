package br.com.dio.OOPchallenge;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> registeredContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp){
        this.registeredContent.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }
    public void progress(){
        Optional<Content> content = this.registeredContent.stream().findFirst();
        if (content.isPresent()){
            this.finishedContent.add(content.get());
            this.registeredContent.remove(content.get());
        }else {
            System.out.println("You are not registered to any content.");
        }
    }
    public double computeXp(){
        return this.finishedContent.stream().mapToDouble(Content::computeXP).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getRegisteredContent() {
        return registeredContent;
    }

    public void setRegisteredContent(Set<Content> registeredContent) {
        this.registeredContent = registeredContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(registeredContent, dev.registeredContent) && Objects.equals(finishedContent, dev.finishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registeredContent, finishedContent);
    }
}
