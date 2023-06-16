//package com.example.kafka.kafkaservice.service;
//
//import javax.crypto.Cipher;
//import javax.crypto.SecretKey;
//import javax.crypto.spec.GCMParameterSpec;
//import javax.crypto.spec.SecretKeySpec;
//
//import java.security.SecureRandom;
//import java.util.Base64;
//import java.util.Collections;
//import java.util.List;
//
//public class AesGcmEncryptionService {
//
//    private static final int GCM_TAG_LENGTH = 128;
//    private static final int GCM_IV_LENGTH = 12;
//
////    public static void main(String[] args) throws Exception {
////        String key = "1679315914305#1679315914";
////        System.out.println(key.length());
////        String internal = encrypt("INTERNAL", key);
////        System.out.println(internal);
////        System.out.println(decrypt(internal, key));
////    }
//
//    public static String encrypt(String plainText, String key) throws Exception {
//        byte[] plainTextBytes = plainText.getBytes("UTF-8");
//        byte[] keyBytes = key.getBytes();
//
//        SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
//        byte[] iv = generateIv();
//        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);
//        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
//        cipher.init(Cipher.ENCRYPT_MODE, secretKey, gcmParameterSpec);
//        byte[] cipherText = cipher.doFinal(plainTextBytes);
//        byte[] cipherTextWithIv = appendIv(iv, cipherText);
//        return Base64.getEncoder().encodeToString(cipherTextWithIv);
//    }
//
//    public static String decrypt(String cipherText, String key) throws Exception {
//        byte[] cipherTextBytes = Base64.getDecoder().decode(cipherText);
//        byte[] keyBytes = key.getBytes();
//        SecretKey secretKey = new SecretKeySpec(keyBytes, "AES");
//        byte[] iv = extractIv(cipherTextBytes);
//        byte[] cipherTextWithoutIv = extractCipherTextWithoutIv(cipherTextBytes);
//        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH, iv);
//        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
//        cipher.init(Cipher.DECRYPT_MODE, secretKey, gcmParameterSpec);
//        byte[] plainTextBytes = cipher.doFinal(cipherTextWithoutIv);
//        return new String(plainTextBytes, "UTF-8");
//    }
//
//    private static byte[] generateIv() {
//        byte[] iv = new byte[GCM_IV_LENGTH];
//        SecureRandom secureRandom = new SecureRandom();
//        secureRandom.nextBytes(iv);
//        return iv;
//    }
//
//    private static byte[] appendIv(byte[] iv, byte[] cipherText) {
//        byte[] cipherTextWithIv = new byte[iv.length + cipherText.length];
//        System.arraycopy(iv, 0, cipherTextWithIv, 0, iv.length);
//        System.arraycopy(cipherText, 0, cipherTextWithIv, iv.length, cipherText.length);
//        return cipherTextWithIv;
//    }
//
//    private static byte[] extractIv(byte[] cipherTextBytes) {
//        byte[] iv = new byte[GCM_IV_LENGTH];
//        System.arraycopy(cipherTextBytes, 0, iv, 0, iv.length);
//        return iv;
//    }
//
//    private static byte[] extractCipherTextWithoutIv(byte[] cipherTextBytes) {
//        byte[] cipherTextWithoutIv = new byte[cipherTextBytes.length - GCM_IV_LENGTH];
//        System.arraycopy(cipherTextBytes, GCM_IV_LENGTH, cipherTextWithoutIv, 0, cipherTextWithoutIv.length);
//        return cipherTextWithoutIv;
//    }
//
//    public static void main(String[] args) {
////        int i = minimumSwap(List.of(1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1));
//        makeSeparate(List.of(1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1));
////        System.out.println(i);
//    }
//    private static int minimumSwap(List<Integer> list) {
//        int count = (int) list.stream().filter(data -> data.equals(1)).count();
//        int once = (int) list.stream().limit(5).filter(d -> d.equals(1)).count();
//        if(count == 0)
//            return 0;
//        int s = 0, e = count-1, max = once;
//        System.out.println(s + " " + e);
//        System.out.println(count);
//        System.out.println(once);
//        int j = 0;
//        for (int i = count; i < list.size(); i++) {
//            if(list.get(i).equals(1))
//                once++;
//            if(list.get(j++).equals(1))
//                once--;
//            if(max <= once) {
//                max = once;
//                s = j;
//                e = i;
//            }
//        }
//        System.out.println(s + " " + e);
//        return count - max;
////        return 0;
//    }
//
//    private static void makeSeparate(List<Integer> list) {
//
//        int i = 0;
//        int j = list.size()-1;
//        while (i < j) {
//            if(list.get(i) == 1) {
//                while (j > i && list.get(j) != 0)
//                    j--;
//                if(list.get(j) == 0) {
//                    Collections.swap(list, i, j);
//                    j--;
//                    i++;
//                }
//            }
//            while(i < j && list.get(i) == 0)
//                i++;
//        }
//        System.out.println(list);
//    }
//
//}
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
