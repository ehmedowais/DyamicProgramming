package com.ows;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        System.out.println(Stream.of("Australia","India","India").reduce("", (s,a) -> s+a));
    }

}