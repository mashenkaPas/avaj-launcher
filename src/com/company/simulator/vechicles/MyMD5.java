package com.company.simulator.vechicles;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public  class MyMD5 {

    public static String getMd5(String input) {
        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        // For specifying wrong message digest algorithms


        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNameBaloon( String hash) {
        String b = "B";

        int i = 0;
        String res = null;
        while (i<100) {
            String newString = b + String.valueOf(i);
            res = getMd5(res);
            if (res.equals(hash)) {
                return res;
            }
            i++;
        }
        return null;
    }

    public static  String getNameHelicopter(String a , String hash) {
        String h = "H";

        int i = 0;
        String res = null;
        while (i< 100) {
            String newString = h + String.valueOf(i);
            res = getMd5(res);
            if (res.equals(hash)) {
                return res;
            }
            i++;
        }
        return null;
    }

    public static  String getNameJetplane (String a, String hash) {
        String h = "J";

        int i = 0;
        String res = null;
        while (i<100) {
            String newString = h + String.valueOf(i);
            res = getMd5(res);
            if (res.equals(hash)) {
                return res;
            }
            i++;
        }
        return null;
    }

    public static  int getNumber(String hash){
        int i = 0;
        while (i < 1000){

            String num = getMd5(new String(i +""));
            if(num.equals(hash)){
                return  i;
            }
            i++;
        }
        return 0;

    }





}
