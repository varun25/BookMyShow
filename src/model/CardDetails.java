package model;

public class CardDetails {
	
	String cardNumber;
	String nameOnCard;
	String validityMonth;
	String validityYear;
	String cvvNo;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getValidityMonth() {
		return validityMonth;
	}
	public void setValidityMonth(String validityMonth) {
		this.validityMonth = validityMonth;
	}
	public String getValidityYear() {
		return validityYear;
	}
	public void setValidityYear(String validityYear) {
		this.validityYear = validityYear;
	}
	public String getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(String cvvNo) {
		this.cvvNo = cvvNo;
	}
}
