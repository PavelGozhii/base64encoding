package com.pavelgo;


public class Main {

    public static void main(String[] args) {
        String string = "hello world";
        String encodeString = new String(Base64.getEncoder().encode(string.getBytes()));
        System.out.println(encodeString);
        System.out.println(new String(Base64.getDecoder().decode(encodeString.getBytes())));
    }
}
