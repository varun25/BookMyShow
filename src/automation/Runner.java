package automation;

import java.util.ArrayList;

import model.CardDetails;
import model.MovieBooking;
import util.ExcelRead;

public class Runner {

	public static void main(String[] args) {
		
		CardDetails cd = new ExcelRead().readCardDetails();
		System.out.println(cd.getCardNumber());
		
		ArrayList<MovieBooking> testCases = new ExcelRead().readMovieBooking();
		System.out.println(testCases.get(1).getMovieName());
	}

}
