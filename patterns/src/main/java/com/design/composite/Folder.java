package com.design.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Folder will have more methods specific to folder.
 * This is the composite class which has leaf classess.
 */
public class Folder implements IFileSystem{

    List<IFileSystem> children; //this is composition. If a folder is deleted, all included files and folders will be deleted.
    String name;
    String metadata;

    {
        children=new ArrayList<>();
    }

    public Folder(String name, String metadata, List<IFileSystem> child){
        this.name=name;
        this.metadata=metadata;
    }

    public void addFileSystemNode(IFileSystem child){
        children.add(child);
    }

    public void touch(String name, String content){
        children.add(new File(name, content,"File added via touch"));  //this is composition
    }

    public void mkdir(String name){
        children.add(new Folder(name,"Folder created via mkdir", null));  //this is composition
    }
    @Override
    public int getSize() {
        int size=0;
        for(IFileSystem child: children){
            size+=child.getSize();
        }
        return size;
    }

    @Override
    public String getFileName() {
        return name;
    }

    @Override
    public String getPath() {
        return "";
    }

    @Override
    public void ls() {
        System.out.println("Folder:->"+ this.name);
        int size=0;
        for(IFileSystem child: children){
            child.ls();
        }
    }

}
