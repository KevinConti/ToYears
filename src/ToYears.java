import java.util.Scanner;

/**
 * @author Kevin
 * Little script in Java that converts items to their value in time
 */
public class ToYears {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double dollarsNeeded = 1250000;
		double yearsUntilFire = 12;
		double dollarsSavedPerYear = dollarsNeeded / yearsUntilFire;
		System.out.println("How much does the item cost?");
		double value = scan.nextInt();
		for (int i = 0; i < yearsUntilFire; i++)
		{
			value *= 1.08;
		}
		double percentOfYearSaved = value / dollarsSavedPerYear * 100;
		//percent / 100 = days / 365
		//percent*365 = 100 * days
		//(percent*365)/100 = daysSaved
		int daysSaved = (int) (percentOfYearSaved *365)/100;
		System.out.println("Not buying this item would save " + daysSaved + " days");
		scan.close();
	}

}
