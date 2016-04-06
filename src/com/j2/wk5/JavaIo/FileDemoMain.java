/*
 * @author jyk
 * @since 160404
 * demo how to use file decorator 
 * 
 * */

package com.j2.wk5.JavaIo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;


public class FileDemoMain{
  public static void main(String[] args) throws Exception{
    
    InputStream isReadme = null;
    InputStream istxt = null;
    BufferedReader brtxt = null;
    
    try{
      char c;
      int i;
      File myhome = new File(System.getProperty("user.home"));//홈디렉토리
      System.out.println("myhome is "+myhome);

      String cwd=new File( "." ).getCanonicalPath();
      System.out.println("current working dir is "+cwd);

      File readme=new File(cwd,"abc.txt");
      System.out.println("readme file is "+readme);

      isReadme=new FileInputStream(readme);
            System.out.println("Characters printed:");
      while((i=isReadme.read()) != -1){
        c = (char)i;
        System.out.print(c);
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
    finally{
      if(isReadme !=null)
        isReadme.close();
    }
    try{
      String string;
      char c;
      int i;
      File myhome2 = new File(System.getProperty("user.home"));//홈디렉토리
      System.out.println("myhome is "+myhome2);

      String cwd2=new File( "." ).getCanonicalPath();
      System.out.println("current working dir is "+cwd2);

      File readme2=new File(cwd2,"abc.txt");
      System.out.println("readme file is "+readme2);

      istxt=new FileInputStream(readme2);
      InputStreamReader isrtxt=new InputStreamReader(istxt, "utf-8");
      brtxt=new BufferedReader(isrtxt);
      
      while((string=brtxt.readLine())!=null) {
        System.out.println(":"+string);
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
    finally{
      if(brtxt !=null)
        brtxt.close();
    }
    
  }
}
      
                      