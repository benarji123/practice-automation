package Tc1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Datap {

	@DataProvider(name="alekh")
	public String[][]  getData()  throws Throwable{
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\practice\\excell\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
	    Workbook b= WorkbookFactory.create(fi);
		Sheet s = b.getSheet("sheet1");
		int r=s.getLastRowNum();
		System.out.println(r);
		int c=s.getRow(1).getLastCellNum();
		System.out.println(c);
		String obj[][]=new String[r][c];
		for(int i=1;i<=r;i++) {
			for(int j=0;j<c;j++)
			{
				obj[i-1][j]=s.getRow(i).getCell(j).getStringCellValue();
				}
			}
		 
		return obj;
	}
}
