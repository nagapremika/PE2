package com.stackroute.pe2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public String reader(String file1) throws IOException {
        File file=new File(file1);
        if(!file.exists())
            return "File Doesnot exists";
        FileReader fr = new FileReader(file);
        StringBuilder result= new StringBuilder();
String string=fr.toString();
String[] array=string.split(" ");
        int i,count=1;
       for(i=0;i<array.length;i++)
       {
         for(int j=0;j<array.length;j++)
         {
             if(array[i]==array[j])
             {
                 count++;
                 array[j] = "";
                              }

         }
           result.append(array[i]);
           result.append("-");
           result.append(count);
           result.append(" ");

           count=1;
       }
       return String.valueOf(result);
           }
}
