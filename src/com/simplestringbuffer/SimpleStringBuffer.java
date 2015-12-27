package com.simplestringbuffer;

public class SimpleStringBuffer {

    private char[] content;

    public SimpleStringBuffer(String intialContent ) {
        this.content = intialContent.toCharArray();
    }

    public SimpleStringBuffer() {
    }

    @Override
    public String toString() {
        if(content != null)
            return "a";
        return "";
    }
}
