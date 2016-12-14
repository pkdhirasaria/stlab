import java.awt.Desktop;
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
class lab6
{
        public static void main(String args[]) throws Exception
        {
                /*WritableWorkbook wb=Workbook.createWorkbook(new File("Lic.xls"));
                WritableSheet ws=wb.createSheet("First Sheet",0);
                
                 
                
                Label l1=new Label(0,0,"Lisence Number:");
                ws.addCell(l1);
                
                System.out.println("Enter No of License Plates:");
                n=ip.nextInt();
                
                String lic;
                
                for(int i=0;i<n;i++)
                {
                        System.out.println("Enter the Lisence Plate Number:");
                        lic=ip.next();
                        
                        Label l2=new Label(0,(i+1),lic);
                        ws.addCell(l2);
                }
                
                wb.write();
                wb.close();
                */
                int n;
                n=20;
                Workbook wb1=Workbook.getWorkbook(new File("Lic.xls"));
                Sheet sh=wb1.getSheet(0);
                Scanner ip=new Scanner(System.in);
                String l,l2;
                int count=0;
                System.out.println("Enter the Required License Plate:");
                l2=ip.next();
                int f=0;
                for(int j=0;j<n;j++)
                {
                        Cell c1=sh.getCell(0,(j+1));
                        l=c1.getContents().toString();
                        if(l.equals(l2))
                        {
                                System.out.println("License Plate Found: at (0,"+(j+1)+")");
                                count++;
                        }
                        
                }
                if(count>1)
                {
                        System.out.println("Duplicate Entry Found ");
                }
                else if(count==0)
                {
                        System.out.println("License Plate Not Found:");
                }
               /* 
                Desktop d=Desktop.getDesktop();
                d.open(new File("Lic.xls"));*/
         }
}

