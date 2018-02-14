package util;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import model.CardDetails;

public class ExcelRead {

	public CardDetails readCardDetails()
	{
		CardDetails cd = new CardDetails();
		
		Sheet sh = null;
		try {
			Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\varunk\\eclipse-workspace\\BookMyShow\\src\\util\\CardDetails.xls"));
			sh = wb.getSheet(0);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		cd.setCardNumber(sh.getCell(1,1).getContents());
		cd.setNameOnCard(sh.getCell(1,2).getContents());
		cd.setValidityMonth(sh.getCell(1,3).getContents());
		cd.setValidityYear(sh.getCell(1,4).getContents());
		cd.setCvvNo(sh.getCell(1,5).getContents());
		
		return cd;
	}
}
