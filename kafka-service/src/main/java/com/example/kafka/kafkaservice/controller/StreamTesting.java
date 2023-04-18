package com.example.kafka.kafkaservice.controller;

import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTesting {

    public static void main(String[] args) {
        StreamTesting streamTesting = new StreamTesting();
        List<String> allSubString = streamTesting.getAllSubString("Radha");
        System.out.println(allSubString);
    }

    private List<String> getAllSubString(String str) {
        IntStream.range(0, str.length())
                .mapToObj(i -> IntStream.rangeClosed(i + 1, str.length())
                        .mapToObj(j -> str.substring(i, j)));
        return null;
    }
}
