package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ddimmxxgmail.com on 3/18/17.
 */
public class FileEx {

    public static void main(String[] args) throws IOException {

        File directory = new File("/users/ddimmxxgmail.com/fileTest/");
        File file = new File ("/users/ddimmxxgmail.com/fileTest/", "fileText.txt");
        File file2 = new File(directory, "secondTest.txt");

        File file3 = new File("/users" + File.separator + "ddimmxxgmail.com/fileTest/");


        System.out.println("dir: " + directory.exists() + " Is dir: " + directory.isDirectory());
        System.out.println("file: " + file.exists());

        File [] arr = File.listRoots();
        for(File f : arr){
            System.out.println(f.getPath());
        }


        if (directory.exists() && directory.isDirectory()){
            FileWriter fw = new FileWriter(file2);
            fw.write("it is test file 2");
            fw.flush();
            fw.close();
        }


        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getFreeSpace());
        System.out.println(file2.getParentFile());
        System.out.println(file2.getCanonicalFile());



        File [] fileArr = directory.listFiles();

        if (fileArr.length > 0){
            for (File f : fileArr){
                System.out.println("*****" + f.getName() + "******");
                System.out.println("File path: " + f.getName());

            }
        }


        System.out.println(file2.isHidden());
        System.out.println(file2.canWrite());

        File dir = new File (directory, "NewDir");
        if (!dir.exists()) dir.mkdir();

        File dir1 = new File (directory, "Dir1/Dir2/Dir3");
        if (!dir1.exists()) dir1.mkdirs();

        dir1.delete();

        System.out.println(file2.length());
        System.out.println(directory.length());












    }

}
