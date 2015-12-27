package com.simplestringbuffer;

import java.util.Arrays;

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
        if(stringToAppend.length() > 0){
            int lastPosition = this.content.length;
            this.content = Arrays.copyOf(this.content, lastPosition+1);
            this.content[lastPosition] = stringToAppend.charAt(0);
        }
    }
}
