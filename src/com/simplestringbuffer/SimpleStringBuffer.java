package com.simplestringbuffer;

public class SimpleStringBuffer {

    private char[] content;

    public SimpleStringBuffer(String initialContent ) {
        this.content = initialContent.toCharArray();
    }

    public SimpleStringBuffer() {
    }

    @Override
    public String toString() {
        if(content != null) {
            return new String(content);
        }
        return "";
    }

    public void append(String stringToAppend) {

    }
}
