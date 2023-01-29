class Accounting{
	public double VSP=0.0;//Value of Supply
	public double VatRate = 0.0;
	public double expenseRate=0.0;
	
	public void print() {
	        System.out.println("Value of supply : " + VSP);
	        System.out.println("VAT : " + getVat());
	        System.out.println("Total : " + getTotal());
	        System.out.println("Expense : " + getExpense());
	        System.out.println("Income : " + getIncome());
	        System.out.println("Dividend 1 : " + getDividend1());
	        System.out.println("Dividend 2 : " + getDividend2());
	        System.out.println("Dividend 3 : " + getDividend3());
	    }

	private double getDividend3() {
		double Dividend3 = getIncome() * 0.2;
		return Dividend3;
	}

	private double getDividend2() {
		double Dividend2 = getIncome() * 0.3;
		return Dividend2;
	}

	private double getDividend1() {
		double Dividend1 = getIncome() * 0.5;
		return Dividend1;
	}

	private double getIncome() {
		double Income=VSP-getExpense();
		return Income;
	}

	private double getExpense() {
		double Expense=VSP*expenseRate;
		return Expense;
	}

	private double getTotal() {
		double Total = VSP+getVat();
		return Total;
	}

	private double getVat() {
		double VAT=VSP*VatRate;
		return VAT;
	}

}



public class AccountingClassApp {
	
		

	public static void main(String[] args) {
		
		//Instance
		Accounting a1=new Accounting();
		Accounting a2=new Accounting();
		
		a1.VSP=1000.0;
		a1.VatRate=0.1;
		a1.expenseRate = 0.3;	
		a1.print();
		
		a2.VSP=5500.0;
		a2.VatRate=0.1;
		a2.expenseRate = 0.3;	
		a2.print();
         
	}
	 
	}

	 