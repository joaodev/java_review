package fundamentals.others;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
		// Employee information
		
		// Integer numeric types
		byte yearsOfCompany = 23;
		short flightsTotal = 542;
		int id = 56789;
		long accumulatedPoints = 3_134_845_223L;
		
		// Real numeric types
		float salary = 11_445.44F;
		double accumulatedSales = 2_991_797_103.01;
		
		// Boolean type
		boolean isOnVacation = false;
		
		// Character type
		char status = 'A';
		
		// Company days
		System.out.println(yearsOfCompany * 365);
		
		// Flights total
		System.out.println(flightsTotal / 2);
		
		// Points per sale
		System.out.println(accumulatedPoints / accumulatedSales);
		
		System.out.println(id + ": earns -> " + salary);
		System.out.println("Is on Vacation: " + isOnVacation);
		System.out.println("Is active: " + status);
	}
}
