class Solution {
    public int daysBetweenDates(String date1, String date2) {
        String[] d1 = date1.split("-");
        String[] d2 = date2.split("-");
        int days1 = countDays(Integer.parseInt(d1[0]), Integer.parseInt(d1[1]), Integer.parseInt(d1[2]));
        int days2 = countDays(Integer.parseInt(d2[0]), Integer.parseInt(d2[1]), Integer.parseInt(d2[2]));
        return (Math.abs(days2 - days1));
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int countDays(int year, int month, int day) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int days = 0;
        for (int y = 0; y < year; y++) {
            days += isLeapYear(y) ? 366 : 365;
        }
        for (int m = 0; m < month - 1; m++) {
            days += isLeapYear(year) && m == 1 ? daysInMonth[m] + 1 : daysInMonth[m];
        }
        return days + day;
    }
}