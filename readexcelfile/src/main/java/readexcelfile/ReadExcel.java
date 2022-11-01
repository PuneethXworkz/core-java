package readexcelfile;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.FormulaEvaluator;
//import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {
	
	public static void main(String[] args) //throws IOException 
	{
		

			
//			//Reading  file from local directory
//			FileInputStream file = new FileInputStream(new File("‪C:\\xworkz\\jdbc\\Student.xlsx"));
//			
//			//Creating a work book instance  that refers .xlsx file
//			HSSFWorkbook workBook = new HSSFWorkbook(file);
//			
//			//creating a sheet Object to retrieve the object
//			HSSFSheet sheet = workBook.getSheetAt(0);
//			
//			
//			//evaluating cell type
//			FormulaEvaluator evaluator = workBook.getCreationHelper().createFormulaEvaluator();
//			
//			for(Row row : sheet){		//iteration  over row using for each loop
//				
//				for(Cell cell : row) {	//iteration  over cell using for each loop
//					
//					switch(evaluator.evaluate(cell).getCellType()) {
//					
//					case Cell.CELL_TYPE_NUMERIC:	//field representing numeric cell type
//						
//						System.out.println(cell.getNumericCellValue()+"\t\t");
//						
//						break;
//						
//					case Cell.CELL_TYPE_STRING:	//field that represnts string cell type
//				
//					System.out.println(cell.getStringCellValue()+"\t\t");
//					
//					break;
//					}
//					
//				}
//				System.out.println();
//				
//			}		
	}

}
