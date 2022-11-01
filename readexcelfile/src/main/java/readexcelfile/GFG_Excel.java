package readexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GFG_Excel {

	private final static String name ="C:/xworkz/jdbc/Student.xlsx";

	public static void main(String[] args) {
		try {
			  
            // Reading file from local directory
            FileInputStream file = new FileInputStream(new File(name));
  
            // Create Workbook instance holding reference to
            // .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            
            DataFormatter data = new DataFormatter();
  
            // Get first/desired sheet from the workbook
           // XSSFSheet sheet = workbook.getSheetAt(0);
  
            // Iterate through each rows one by one
            		
            Iterator<Sheet> sheets = workbook.sheetI;
            // Till there is an element condition holds true
            while (rowIterator.hasNext()) {
  
                Row row = rowIterator.next();
  
                // For each row, iterate through all the
                // columns
                Iterator<Cell> cellIterator
                    = row.cellIterator();
  
                while (cellIterator.hasNext()) {
  
                    Cell cell = cellIterator.next();
  
                    // Checking the cell type and format
                    // accordingly
                    switch (cell.getCellType()) {
  
                    // Case 1
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(
                            cell.getNumericCellValue()
                            + "t");
                        break;
  
                    // Case 2
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(
                            cell.getStringCellValue()
                            + "t");
                        break;
                    }
                }
  
                System.out.println("");
            }
  
            // Closing file output streams
            file.close();
        }
  
        // Catch block to handle exceptions
        catch (Exception e) {
  
            // Display the exception along with line number
            // using printStackTrace() method
            e.printStackTrace();
        }
    }
} 



