package com.stackroute.pe2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public String reader(String file1) throws IOException {
        File file=new File(file1);
      if(!file.exists())
          return "File Doesnot exists";
       FileReader fr = new FileReader(file);
String result="";

        int i,count=0;
        while ((i=fr.read()) != -1) {
            System.out.print((char) i);
            count++;
        }
        System.out.println("length="+count);
        if(count==0)
            result="Empty File";
        else
            result="Read";
 return result;   }
}
