package com.design.composite;

/**
 * Component Interface which the leaf and composite classes will implement.
 */
public interface IFileSystem {
    int getSize();
    String getFileName();
    String getPath();
    void ls();
}
