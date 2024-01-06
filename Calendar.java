public class Calendar {
    static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31;
    public static void main(String args[]) {
        int YearSub = Integer.parseInt(args[0]);
        while (year != YearSub) {
            advance();
        }
        while (dayOfMonth != 31 || month != 12 || year != YearSub) {
            if (dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
				if (dayOfMonth == 1) {
				}
			} else {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}
			advance();
        }
    }
    private static void advance() {
		if (dayOfWeek == 7) {
			dayOfWeek = 1;
		} else {
			dayOfWeek++;
		}
		if (dayOfMonth < nDaysInMonth(month, year)) {
			dayOfMonth++;
		} else {
			dayOfMonth = 1;
			if (month < 12) {
				month++;
			} else {
				month = 1;
				year++;
			}
		}
		
	}
    private static boolean isLeapYear(int year) {
	    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
    private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1:
				return 31;
			case 2: 
				if (isLeapYear(year)) {
					return 29;
				} else {
					return 28;
				}
			case 3:
				return 31;
			case 4:
				return 30;
			case 5: 
				return 31;
			case 6:
				return 30; 
			case 7:
				return 31; 
			case 8:
				return 31; 
			case 9:
				return 30; 
			case 10:
				return 31; 
			case 11:
				return 30; 
			case 12:
				return 31;
			default:
				return 0; 
		}
	}
}
