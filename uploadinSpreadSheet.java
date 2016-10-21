//download jxl-2.6.12.jar file from google and paste it in the same folder of program
//for compilation use javac -cp jxl-2.6.12.jar filename.java
//for execution use java -cp jxl-2.6.12.jar filename


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import java.awt.Desktop;
import java.io.File;
public class spreadsheet
{
   public static void main(String[] args) 
      throws BiffException, IOException, WriteException
   {
      WritableWorkbook wworkbook;
      int n,i,j,id,salary;
      String name;
      wworkbook = Workbook.createWorkbook(new File("output.xls"));
      WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);
      Scanner input=new Scanner(System.in);
       
      System.out.println("Enter number of records to be entered :");
      n=input.nextInt();
      Label label1 = new Label(0, 0, "USN");
      wsheet.addCell(label1);
      Label label2 = new Label(1, 0, "NAME");
      wsheet.addCell(label2);
      Label label3 = new Label(2, 0, "AGE");
      wsheet.addCell(label3);
      System.out.println("Enter USN,NAME,AGE");

      for(i=1;i<=n;i++)
      {
    	  id=input.nextInt();
    	  name=input.next();
    	  salary=input.nextInt();
    	  Number number1 = new Number(0, (i),id);
          wsheet.addCell(number1);
          Label label4 = new Label(1,(i),name);
          wsheet.addCell(label4);
          Number number3 = new Number(2, (i),salary);
          wsheet.addCell(number3);
      }
      
      wworkbook.write();
      wworkbook.close();
              
      File file=new File("/home/ise/111/output.xls");
       Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
      /*if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }*/
        
     /* Workbook workbook = Workbook.getWorkbook(new File("output.xls"));
      Sheet sheet = workbook.getSheet(0);
      Cell cell1 = sheet.getCell(0,0);
      System.out.println(cell1.getContents());
      Cell cell2 = sheet.getCell(0,1);
      System.out.println(cell2.getContents());
      Cell cell3 = sheet.getCell(0,2);
      System.out.println(cell3.getContents());

    
      workbook.close();*/
   }
}
