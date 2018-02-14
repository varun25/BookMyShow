package util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import model.CardDetails;
import model.MovieBooking;

public class ExcelRead {

	public CardDetails readCardDetails()
	{
		CardDetails cd = new CardDetails();
		
		Sheet sh = getSheet("CardDetails.xls", 0);		
		
		cd.setCardNumber(sh.getCell(1,1).getContents());
		cd.setNameOnCard(sh.getCell(1,2).getContents());
		cd.setValidityMonth(sh.getCell(1,3).getContents());
		cd.setValidityYear(sh.getCell(1,4).getContents());
		cd.setCvvNo(sh.getCell(1,5).getContents());
		
		return cd;
	}
	
	public ArrayList<MovieBooking> readMovieBooking()
	{
		ArrayList<MovieBooking> testData = new ArrayList<MovieBooking>();
		MovieBooking mb = new MovieBooking();
		
		Sheet sh1 = getSheet("Movie.xls", 0);		
		
		for(int i=1; i<sh1.getColumns(); i++)
		{
			for(int j=0; j<sh1.getRows(); j++)
			{
				if(sh1.getCell(5, 1).getContents().equalsIgnoreCase("Run"))
				{
					mb = getMovieTestData(sh1.getCell(i,0).getContents(), i);
					testData.add(mb);
				}
			}
		}
		return testData;
	}
	
	public MovieBooking getMovieTestData(String testCaseId, int iterationNo)
	{
		MovieBooking mb = new MovieBooking();
		
		Sheet sh = getSheet("Movie.xls", 1);	
		
		mb.setMovieName(sh.getCell(2, 1).getContents());
		mb.setTheatreName(sh.getCell(2, 2).getContents());
		mb.setScreenTime(sh.getCell(2, 3).getContents());
		mb.setNoOfTickets(Integer.parseInt(sh.getCell(2, 4).getContents()));
		mb.setSeatsRow(sh.getCell(2, 5).getContents());
		mb.setScreenTime(sh.getCell(2, 6).getContents());
	
		return mb;
	}
	
	public Sheet getSheet(String sheetName, int sheetNo)
	{
		try {
			Workbook wb = Workbook.getWorkbook(new File("C:\\Users\\varunk\\eclipse-workspace\\BookMyShow\\src\\util\\" + sheetName));
			return wb.getSheet(sheetNo);
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
