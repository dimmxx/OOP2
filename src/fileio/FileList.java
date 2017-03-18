package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by ddimmxxgmail.com on 3/18/17.
 */
public class FileList {

    public static void main(String[] args) {

        File dir2 = new File("/users/ddimmxxgmail.com/Downloads");
        //System.out.println(dir.getName());

       // listFiles(dir);
        //directoryInfo(dir);

        //delFiles(dir2); //! ОПАСНО!!!!!!

        final Class<ArrayList> arrayListClass = ArrayList.class;

    }

    public static void delFile (File dir, String filename){



    }


    public static void delFiles(File dir){ //опасно!!!! удаляет файлы
        File[] fileArr = dir.listFiles();
        int i = 0;
        for (File file : fileArr){
            i++;

            file.delete();
            System.out.println(file.getName() + " deleted");
        }
        System.out.println();
        System.out.println(i + " files deleted");


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
