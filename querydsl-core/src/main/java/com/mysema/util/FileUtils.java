package com.mysema.util;

import java.io.File;
import java.io.IOException;

public abstract class FileUtils {

    public static void delete(File file) throws IOException {
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                delete(f);
            }
        }
        if (file.isDirectory() || file.isFile()) {
            if (!file.delete()) {
                throw new IllegalStateException("Deletion of " + file.getPath() + " failed");
            }
        }
        
        
    }
    
    private FileUtils() {}

}
