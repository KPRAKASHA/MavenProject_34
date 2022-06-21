package maven_Projects_Pratices;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WorkinWithDataDrivenTest {
	@Test
	public static Object[][] test(String Register) throws EncryptedDocumentException, IOException {
	File file=new File("./Testdata/Register.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Register");
	int RowCount=sheet.getPhysicalNumberOfRows();
	int ColCount=sheet.getRow(2).getPhysicalNumberOfCells();

	Object[][] data=new Object[RowCount-1][ColCount];
	for (int i = 1; i <RowCount ; i++) {
		for (int j = 0; j < ColCount; j++) {
			data[i-1][j]=sheet.getRow(i).getCell(j).toString();	
		}

	}
	return data;
	}
}
