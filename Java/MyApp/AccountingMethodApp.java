
public class AccountingMethodApp {
	
	//전역변수 선언
	public static double VSP=0.0;//Value of Supply
	public static double VatRate = 0.0;
	public static double expenseRate=0.0;
	

	public static void main(String[] args) {
		
		
		VSP=1000.0;
		VatRate=0.1;
		expenseRate = 0.3;
		
		//만들어진 method를 호출(실행)하는 코드	
        print();
	 
	}

	 public static void print() {
	        System.out.println("Value of supply : " + VSP);
	        System.out.println("VAT : " + getVat());
	        System.out.println("Total : " + getTotal());
	        System.out.println("Expense : " + getExpense());
	        System.out.println("Income : " + getIncome());
	        System.out.println("Dividend 1 : " + getDividend1());
	        System.out.println("Dividend 2 : " + getDividend2());
	        System.out.println("Dividend 3 : " + getDividend3());
	    }

	private static double getDividend3() {
		double Dividend3 = getIncome() * 0.2;
		return Dividend3;
	}

	private static double getDividend2() {
		double Dividend2 = getIncome() * 0.3;
		return Dividend2;
	}

	private static double getDividend1() {
		double Dividend1 = getIncome() * 0.5;
		return Dividend1;
	}

	private static double getIncome() {
		double Income=VSP-getExpense();
		return Income;
	}

	private static double getExpense() {
		double Expense=VSP*expenseRate;
		return Expense;
	}

	private static double getTotal() {
		double Total = VSP+getVat();
		return Total;
	}

	//method를 만드는 코드
	private static double getVat() {
		double VAT=VSP*VatRate;
		return VAT;
	}

}
