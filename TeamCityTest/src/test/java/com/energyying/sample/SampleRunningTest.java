package com.energyying.sample;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by DEV001 on 2014/7/31.
 */
public class SampleRunningTest {

    @Test
    public void doTest(){

        SampleRunning sampleRunning = new SampleRunning();

        int i = sampleRunning.getInt(1L);

        assertEquals(10,i);

    }

    @Test
    public void doTest_Non(){

        SampleRunning sampleRunning = new SampleRunning();

        int i = sampleRunning.getInt(null);

        assertEquals(0,i);

    }

    @Test
    public void doTest_1(){

        SampleRunning sampleRunning = new SampleRunning();

        int i = sampleRunning.getInt(2L);

        assertEquals(2,i);

    }
}
