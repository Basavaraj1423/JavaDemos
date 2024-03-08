package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        Icompressor icompressor = new ZipCompressor();
        String[] ZipFile = icompressor.compressFiles("Abc.zip","Xyz.zip");
        for (String file1 : ZipFile){
            System.out.println(file1);
        }
        System.out.println("***********************************************");

        icompressor = new JarCompressor();
        String[] JarFile = icompressor.compressFiles("Java.jar","Xyz.jar");
        for (String file2 : JarFile){
            System.out.println(file2);
        }


    }
}
