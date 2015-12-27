package com.simplestringbuffer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStringBufferTest {

    @Test
    public void shouldReturnEmptyStringWhenToStringIsCalledForEMptyStringBuffer() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer();

        assertEquals("", simpleStringBuffer.toString());
    }

}