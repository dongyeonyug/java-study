
public class AccountingAppIF {

	public static void main(String[] args) {
		
		double VSP=15000.0;//Value of Supply
		double VatRate = 0.1;
		double expenseRate = 0.3;
		
		
		double VAT=VSP*VatRate;
		double Total = VSP+VAT;
		double Expense=VSP*expenseRate;
		double Income=VSP-Expense;
		
		double Dividend1=0.0;
        double Dividend2=0.0;
        double Dividend3=0.0;
        
		if(Income > 10000.0) {
            Dividend1 = Income * 0.5;
            Dividend2 = Income * 0.3;
            Dividend3 = Income * 0.2;
        } else {
            Dividend1 = Income * 1.0;
            Dividend2 = Income * 0;
            Dividend3 = Income * 0;
        }
		
		
		
        System.out.println("value of supply: " +VSP);
		System.out.println("VAT: " +VAT);
		System.out.println("Total: " +Total);
		System.out.println("Expense: " +Expense);
		System.out.println("Income: " +Income);
		System.out.println("Dividend1: " +Dividend1);
		System.out.println("Dividend2: " +Dividend2);
		System.out.println("Dividend3: " +Dividend3);
	 
	}

}
