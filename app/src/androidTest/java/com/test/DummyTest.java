package com.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Jeannius on 6/21/2014.
 */


@RunWith(RobolectricTestRunner.class)
public class DummyTest {

    @Before
    public void setup(){

    }

    @Test
    public void testShouldFail(){
        assertTrue(true);
    }

}
