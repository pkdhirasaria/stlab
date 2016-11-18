import java.io.*;
import java.util.Scanner;


public class lab5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String s;
        System.out.println("enter the path");
        Scanner inp=new Scanner(System.in);
        s=inp.next();
         File[] fileList = getFileList(s);
           int i=0;
       for(File file : fileList) {
           System.out.println(file.getName());
         i++;
       }
  System.out.println("Count will be "+i);
      
   }
   private static File[] getFileList(String dirPath) {
       File dir = new File(dirPath);   
       File[] fileList = dir.listFiles(new FilenameFilter() {
           public boolean accept(File dir, String name) {
               return name.endsWith("");
           }
       });
       return fileList;
   }
}
