import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ReadValue rv = new ReadValue();	
	Object OutputValue =rv.ReadValue(2, 2);
	System.out.println(OutputValue);

	}

	private Object ReadValue(int RowValue, int ColumnValue) {
		Object value=null; 
		Workbook wb=null;
		try {
			FileInputStream fis =new FileInputStream("C:\\Users\\AH160606\\Desktop\\Sudhakar.xlsx");
			wb=new XSSFWorkbook(fis); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet=wb.getSheetAt(0);     
		Row row=sheet.getRow(RowValue);  
		Cell cell=row.getCell(ColumnValue); 
		value=cell.getNumericCellValue();
		
		return value;  
		// TODO Auto-generated method stub
	}



}
