package com.design.composite;

public interface IFileSystem {
    int getSize();
    String getFileName();
    String getPath();
    void ls();
}
