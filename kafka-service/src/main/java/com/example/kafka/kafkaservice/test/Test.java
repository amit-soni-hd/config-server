//package com.example.kafka.kafkaservice.service;
//
//import org.springframework.data.util.Pair;
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.Cipher;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//import javax.crypto.spec.IvParameterSpec;
//import javax.crypto.spec.SecretKeySpec;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.stream.Collectors;
//import org.apache.commons.codec.binary.Base64;
//
//public class Test {
//
//
////    public static void main(String[] args) {
////
//////        test();
//////        find("2[2[abc]2[xyz]]");
//////        testing();
////            strStr("ab", "aa ab shffjabhfs");
////    }
//
//    private static void test() {
//        String text = "The cat is on the mat. The cat is on the mat. The cat is on the mat. all cat are cat";
//        Pattern pattern = Pattern.compile("cat");
//        Matcher matcher = pattern.matcher(text);
//        int count = 0;
//        StringBuilder sb = new StringBuilder();
//        while (matcher.find()) {
//            if (count >= 2) {
//                matcher.appendReplacement(sb, "dog");
//                System.out.println(sb);
//            }
//            count++;
//        }
//        matcher.appendTail(sb);
//
//        String newText = sb.toString();
//        System.out.println(newText);
//    }
//
//    private static void find(String str) {
//        Stack<Character> s = new Stack<>();
//        String output = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            if (str.charAt(i) == '[') {
//                i--;
//                output = concatString(Integer.parseInt(str.charAt(i) + ""), output, s);
//            } else
//                s.push(str.charAt(i));
//        }
//        output = concatString(1, output, s);
//        System.out.println(output);
//    }
//
//    private static String concatString(int times, String output, Stack<Character> s) {
//        String part = "";
//        if (s.empty())
//            return output;
//        while (!s.empty() && s.peek() != ']') {
//            Character c = s.pop();
//            part = part.concat(c.toString());
//        }
//        if (!s.empty() && s.peek() == ']')
//            s.pop();
//        String s1 = "";
//        if (part.isEmpty()) {
//            part = output;
//            output = "";
//        }
//        while (times-- > 0) {
//            s1 = s1.concat(part);
//        }
//        return s1.concat(output);
//    }
//
//    private static void testing() {
//        List<String> list = Arrays.asList("apple", "apple", "banana", "cherry", "anan", "date", "elderberry");
//        Map<Character, Map<Integer, List<String>>> collect = list.stream().collect(Collectors.groupingBy(s -> s.charAt(0),
//                Collectors.groupingBy(String::length, Collectors.toList())));
//        Map<Character, Map<Integer, List<String>>> collect1 = list.stream().collect(Collectors.groupingBy(s -> s.charAt(0),
//                Collectors.toMap(String::length, Arrays::asList, (oldList, newList) -> {
//                    List<String> mergedList = new ArrayList<>(oldList);
//                    mergedList.addAll(newList);
//                    return mergedList;
//                })));
//        System.out.println(collect);
//        System.out.println(collect1);
//
//    }
//    private static void strStr(String a, String b) {
//        int i = b.indexOf(a);
//        System.out.println(i);
//        String text = "fox1 The quick brown fox jumps over the lazy dog";
//        String word = "fox";
//        Pattern p = Pattern.compile("\\b" + word + "\\b");
//        Matcher m = p.matcher(text);
//
//        if (m.find()) {
//            System.out.println(m.groupCount());
//            System.out.println("Found the word \"" + word + "\" at index " + m.start() + " to " + m.end());
//        } else {
//            System.out.println("Word not found");
//        }
//    }
//
//
//
//    private static void markZero(List<List<Integer>> list, int m, int n) {
//
//        Map<Pair<Integer,Integer>,Integer> visit = new HashMap<>();
//        int[] v = new int[m];
//
//
////        for(int i=0; i<m;i++) {
////            for(int j=0;j<n;j++) {
////                if(list.get(i).get(j).equals(0) && (visit.containsKey(Pair.of(i,j)))) {
////                    markToZero(list, i, j, visit);
////                }
////            }
////        }
//
//
////        list.forEach(row -> {
////            row.forEach(data -> {
////                if(data == 0) {
////
////                }
////            });
////        });
//    }
//
//    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
//        String internal = decodeClientId("12345", "1234567891234", encrypt("1234567891234", "12345", "INTERNAL1"));
//        System.out.println(internal);
//    }
//
//    private static String encrypt(String time, String code, String value) {
//        try {
//            time = time.substring(0,10);
//            IvParameterSpec ivParameterSpec = new IvParameterSpec(time.concat("@").concat(code).getBytes());
//            String key = time.concat("#").concat(code);
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
//            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
//            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
//            byte[] encryptedBytes = cipher.doFinal(value.getBytes());
//            System.out.println(Base64.encodeBase64String(encryptedBytes));
//            return Base64.encodeBase64String(encryptedBytes);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return "";
//    }
//
//    private static String decodeClientId(String code, String dateTime, String encryptedClientId) {
//        try {
//            dateTime = dateTime.substring(0,10);
//            IvParameterSpec ivParameterSpec = new IvParameterSpec(dateTime.concat("@").concat(code).getBytes());
//            String key = dateTime.concat("#").concat(code);
//            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
//            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
//            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
//            byte[] decryptedBytes = cipher.doFinal(Base64.decodeBase64(encryptedClientId));
//            return new String(decryptedBytes);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        return "sdfgh";
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}