package fr.parisnanterre.miage.dictonary;

public class Dictionary {
    private String name;

    public Dictionary(String name){
        this.name=name;
    }
    public Dictionary(){
        this.name=null;
    }
    public String getName(){
        return name;
    }

    public Boolean isEmpty(){
        return name.isEmpty();
    }

}
