package com.story.gissoo.dirsys;

import java.io.File;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 */
public class Dir {

    /**
     * Path to the directory
     */
    private String path;

    /**
     *
     * @param path
     */
    public Dir(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     */
    public boolean hasTextFile() {
        return true;
    }

    /**
     *
     * @return
     */
    public boolean isDir() {
        File file = new File(this.path);
        return file.isDirectory();
    }
}
