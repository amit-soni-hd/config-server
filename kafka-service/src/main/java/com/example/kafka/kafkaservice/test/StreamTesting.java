//package com.example.kafka.kafkaservice.service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class StreamTesting {
//
//    public static void main(String[] args) {
//        StreamTesting streamTesting = new StreamTesting();
////        streamTesting.getAllSubString("Radha");
//        streamTesting.evenOdd();
//    }
//
//    private void getAllSubString(String str) {
//        IntStream.range(0, str.length())
//                .mapToObj(i -> IntStream.rangeClosed(i+1, str.length())
//                        .mapToObj(j -> str.substring(i, j))).forEach(data -> data.forEach(System.out::println));
//    }
//
//    private void reverse1(String str) {
//        System.out.println(str);
//        String[] s = str.split(" ");
//        String collect = IntStream.range(0, s.length).mapToObj(i -> s[s.length - 1 - i])
//                .collect(Collectors.joining(" "));
//        System.out.println(collect);
//    }
//
//    private void evenOdd() {
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<List<Integer>> collect = list.stream().collect(Collectors.teeing(
//                Collectors.filtering(data -> data % 2 == 0, Collectors.toList()),
//                Collectors.filtering(data -> data % 2 != 0, Collectors.toList()),
//                List::of
//        ));
//        System.out.println(collect.get(0));
//        System.out.println(collect.get(1));
//
//    }
//
//
//}
