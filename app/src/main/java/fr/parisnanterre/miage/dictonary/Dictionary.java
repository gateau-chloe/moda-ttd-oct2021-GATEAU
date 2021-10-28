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

    public void addTranslation(String l1, String l2){

    }
    public String getTranslation (String l1){
        return "against";
    }
}
