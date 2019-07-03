package com.stackroute.pe2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {        //Gives word count in file
    public String reader(String file1) throws IOException {
        File file = new File(file1);
        if (!file.exists())
            return "File Doesnot exists";
        FileReader fr = new FileReader(file);
        String result = "";
        String string = "";
        int i, count = 1;
        while ((i = fr.read()) != -1) {
            string = string + ((char) i);
        }
        String[] array = string.split(" ");

        for (i = 0; i < array.length; i++) {
            for (int j = i + 1; j <array.length; j++) {
                if (array[i]==(array[j])){
                    count++;
                    array[j] = "";
                }
            }
            result = result + array[i] + "-" + count + " ";

            count = 1;
        }
        return (result);

    }
}
