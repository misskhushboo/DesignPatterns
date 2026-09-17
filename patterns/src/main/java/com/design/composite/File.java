package com.design.composite;

/**
 * This is the leaf class. This will not have other compositions.
 * Only Composite class will have compositions.
 * There will be recursive call to getSize and ls methods.
 */
public class File implements IFileSystem{
    private String name;
    String content; //content.length is size
    String metadata;

    public File(String name, String content, String metadata){
        this.name=name;
        this.content=content;
        this.metadata=metadata;
    }
    @Override
    public int getSize() {
        return content.length();
    }

    @Override
    public String getFileName() {
        return this.name;
    }

    @Override
    public String getPath() {
        return "";
    }

    @Override
    public void ls() {
     System.out.println(name);
    }
}
