package com.simplestringbuffer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStringBufferTest {

    @Test
    public void shouldReturnEmptyStringWhenToStringIsCalledForEmptyStringBuffer() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer();

        assertEquals("", simpleStringBuffer.toString());
    }

    @Test
    public void shouldReturnAWhenToStringIsCalledForStringBufferWithInitialValueAsA() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("a");

        assertEquals("a", simpleStringBuffer.toString());
    }

    @Test
    public void shouldReturnTheSameStringWhenToStringIsCalledForParameterizedStringBuffer() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("");

        assertEquals("", simpleStringBuffer.toString());
    }

    @Test
    public void shouldContainEmptyStringWhenEmptyStringIsPassedToAppendWhenInitialValueIsEmpty() {
        SimpleStringBuffer simpleStringBuffer = new SimpleStringBuffer("");

        simpleStringBuffer.append("");

        assertEquals("", simpleStringBuffer.toString());
    }

}