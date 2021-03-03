
public class LeapYear {

	public static boolean isLeapYear(int year) {

		boolean leapYear;

		if (year <= 0 || year > 9999) {
			return false;
		}

		if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {

			leapYear = true;
			System.out.println(year + " is leap Year!");

		} else {
			leapYear = false;
			System.out.println(year + " is not leap Year");
		}
		return false;

	}
}
