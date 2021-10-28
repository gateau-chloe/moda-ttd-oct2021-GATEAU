package fr.parisnanterre.miage.dictonary;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.containsInAnyOrder;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DictionaryTest {
        private Dictionary dictionaire ;

    @BeforeEach
    public void testCreatDictionary(){
        this.dictionaire = new Dictionary("example");

    }
    @Test
    public void testDictionaryName(){
        assertThat(dictionaire.getL1(), equalTo("example"));
    }

    @Test
    public void testDictionaryIsEmptyVide(){
        assertThat(dictionaire.isEmpty(), equalTo(true));
    }
    @Test
    public void testDictionaryIsEmptyPlein(){
        dictionaire.addTranslation("chien", "dog");
        assertThat(dictionaire.isEmpty(), equalTo(false));
    }

    @Test public void testOneTranslation() {
        //dictionaire.addTranslation("contre", "against");
        //dictionaire.addTranslation("chien", "dog");
        //assertThat(dictionaire.getTranslation("contre"), equalTo("against"));
        //assertThat(dictionaire.getTranslation("chien"), equalTo("dog"));
    }
    @Test public void testTraductionMultiples(){
        dictionaire.addTranslation("contre", "against");
        assertThat(dictionaire.getTranslation("contre"), containsInAnyOrder("against"));
        dictionaire.addTranslation("contre", "for");
        assertThat(dictionaire.getTranslation("contre"), containsInAnyOrder("against","for"));
    }


    @Test
    public void testTraductionInverse(){
        dictionaire.addTranslation("contre", "against");
        dictionaire.addTranslation("contre", "for");
        assertThat(dictionaire.translationInverse("against"), equalTo("contre"));
    }


    @AfterEach
    public void remiseAZero(){
        dictionaire=null;
    }


}
