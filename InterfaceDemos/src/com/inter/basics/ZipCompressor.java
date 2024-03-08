package com.inter.basics;

public class ZipCompressor implements Icompressor {
    @Override
    public String[] compressFiles(String file1, String file2) {
        String[] ZippedFiles = new String[2];
        ZippedFiles[0]=file1;
        ZippedFiles[1]=file2;
        return ZippedFiles;
    }
}
