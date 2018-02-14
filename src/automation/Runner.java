package automation;

import model.CardDetails;
import util.ExcelRead;

public class Runner {

	public static void main(String[] args) {
		
		CardDetails cd = new ExcelRead().readCardDetails();
		System.out.println(cd.getCardNumber());
	}

}
