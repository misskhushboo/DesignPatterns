package com.design.composite;


public class Composite {
    public static void main(String[] args) {
      Composite compositeObj=new Composite();
      compositeObj.printAll();
    }

    private void printAll() {
        //current working directory
        Folder root=new Folder("Folder1", "Folder1", null);
       // IFileSystem childFile=new File("File1", "Content of File1","");
       // root.addFileSystemNode(childFile);
        root.touch("child1", "child1");
        root.mkdir("folder2");


        Folder root2=new Folder("Folder2", "Folder2", null);
        IFileSystem childFile2=new File("File2", "Content of File2","");
        root2.addFileSystemNode(childFile2);

        Folder root3=new Folder("Folder3", "Folder3", null);
        IFileSystem childFile3=new File("File3", "Content of File3","");
        root3.addFileSystemNode(childFile3);

        root.addFileSystemNode(root2);
        root2.addFileSystemNode(root3);

        System.out.println("Size of the root:"+root.getSize());
        root.ls();

    }
}
