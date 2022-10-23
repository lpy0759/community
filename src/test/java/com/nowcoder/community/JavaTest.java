package com.nowcoder.community;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaTest {
    public static void main(String[] args)  {



    }

    static void copyFile(String src, String dec){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] buffer = new byte[1024];
        int temp = 0;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dec);
            while ((temp = fis.read(buffer)) != -1){
                fos.write(bu)
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
