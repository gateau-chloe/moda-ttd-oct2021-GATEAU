package fr.parisnanterre.miage.dictonary;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.Enumeration;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class DictionaryTest {
        private Dictionary dictionaire = new Dictionary("example")  ;

    @BeforeTest
    public void testCreatDictionary(){
        this.dictionaire = new Dictionary("example");

    }
    @Test
    public void testDictionaryName(){
        assertThat(dictionaire.getName(), equalTo("example"));
    }
}
