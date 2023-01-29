
public class AccountingArrayApp2 {

	public static void main(String[] args) {
		
		double VSP=5000.0;//Value of Supply
		double VatRate = 0.1;
		double expenseRate = 0.3;
		
		
		double VAT=VSP*VatRate;
		double Total = VSP+VAT;
		double Expense=VSP*expenseRate;
		double Income=VSP-Expense;
		
		
		double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;
         
        double Dividend1 = Income * dividendRates[0];
        double Dividend2 = Income * dividendRates[1];
        double Dividend3 = Income * dividendRates[2];
	
		
		
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
