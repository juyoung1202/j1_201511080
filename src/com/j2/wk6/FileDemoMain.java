/*
 * @author jyk
 * @since 160404
 * demo how to use file decorator 
 * 
 * */

package com.j2.wk6;

import java.io.File.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;

public class FileDemoMain {
  public static void main(String args[]) throws Exception{ //예외발생처리
   int i;
   char c;
   InputStream isReadme = null;
        InputStreamReader isrReadme = null;
        BufferedReader brReadme=null;
   try{
            File myhome=new File(System.getProperty("user.home"));
            System.out.println("myhome is "+myhome);

            String cwd=new File( "." ).getCanonicalPath();
            System.out.println("current working dir is "+cwd);

            File readme=new File(cwd,"README.md");
            System.out.println("readme file is "+readme);

            isReadme=new FileInputStream(readme);
            System.out.println("Characters printed:");
            while((i=isReadme.read())!=-1) {
                c=(char)i;
                System.out.print(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(isReadme != null)
                isReadme.close();
        }
  }
}
      
                                      
      