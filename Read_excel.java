package may_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_excel {

	public static void main(String[] args) {
		File f = new File("./src/may_02/eclispse work.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			
//			System.out.println(sh.getRow(2).getCell(0).getStringCellValue());
			for(int r=0; r<=sh.getLastRowNum(); r++) 
			{
				for(int c=0; c < sh.getRow(0).getLastCellNum(); c++) 
				{
					System.out.print(sh.getRow(r).getCell(c).getStringCellValue() + "  ");	
				}
				System.out.println();
			}
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
