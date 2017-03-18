package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Created by ddimmxxgmail.com on 3/18/17.
 */
public class FileList {

    public static void main(String[] args) {

        File dir = new File("/users/ddimmxxgmail.com/fileTest");
        //System.out.println(dir.getName());

        listFiles(dir);
        //directoryInfo(dir);

    }

    public static void listFiles(File dir) {

        File[] fileArr = dir.listFiles();

        for (int i = 0; i < fileArr.length; i++) {
            // if(fileArr[i].)
            System.out.println(fileArr[i].isDirectory() ?
                    "[ " + fileArr[i].getPath() + " ]"
                    : fileArr[i].getPath());
            if (fileArr[i].isDirectory()) listFiles(fileArr[i]);
            //System.out.println(fileArr[i].isDirectory() ? ".." + fileArr[i].getPath() : fileArr[i].getPath());

        }

    }

    public static void directoryInfo(File directory) {
        //if (!directory.exists()) return;
        File[] filesArr = directory.listFiles();
        for (File file : filesArr) {
            System.out.println(file.getPath());
            if (file.isDirectory()) directoryInfo(file);
        }


    }

}
