package com.singtel.codeassignment;

import org.junit.Test;

import com.singtel.codeassignment.models.Caterpillar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CaterpillarTest {

    private Caterpillar caterpillar;

    public CaterpillarTest() {
        this.caterpillar = new Caterpillar();
    }

    @Test
    public void testWalk() {
        assertEquals("I am crawling", caterpillar.walk());
    }

    @Test
    public void testMetamorphosis() {
        assertNotNull(caterpillar.metamorphize());
    }

}
