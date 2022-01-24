package spl.org.payMyBuddy.dot;

public class TransactionDTO {
	private String description;
	private Double amount;
	
	
	public TransactionDTO() {
		super();
		
	}
	
	
	public TransactionDTO(String description, Double amount) {
		super();
		this.description = description;
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
