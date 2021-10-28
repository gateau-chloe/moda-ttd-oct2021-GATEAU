package fr.parisnanterre.miage.dictonary;

import java.util.*;

public class Dictionary {
    private String l1;
    private Map<String, List<String>> translation;

    public Dictionary(String name){
        this.l1 =name;
        this.translation=new HashMap<>();
    }
    public Dictionary(){
        this.l1 =null;
        this.translation=new HashMap<>();
    }
    public String getL1(){
        return l1;
    }

    public Boolean isEmpty(){
        return translation.isEmpty();
    }

    public void addTranslation(String l1, String l2){
        if (getTranslation(l1)==null){
            List list= new ArrayList();
            list.add(l2);
            translation.put(l1,list);
        }
        else{
           // List list = translation.get(l1); verifier que le mot n'est pas déjà dans la liste
           List<String> list =  translation.get(l1);
            list.add(l2);
            //translation.put(l1,list);

        }
    }

    public String translationInverse(String l2){
        int i =0;
        for(final String key : translation.keySet()) {
            List list=translation.get(key);
            System.out.println(list);
            i++;
            if (list.contains(l2)) {
               return key;

            }
        }
        return "contre";
    }

    public List<String> getTranslation (String l1){
        return translation.get(l1);
    }
}
