package BT.TinhNgayTiepTheo;

public class TinhNgayKeTiep {
    public static int[] ngayKeTiep(int day, int month, int year){
        int[] nextDay = new int[3];
        if (day == 31 && month == 12) {
            nextDay[0] = 1;
            nextDay[1] = 1;
            nextDay[2] = year + 1;
        } else if ((day == 31) || (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11))) {
            nextDay[0] = 1;
            nextDay[1] = month + 1;
            nextDay[2] = year;
        } else if (day == 28 && month == 2 && !isLeapYear(year)) {
            nextDay[0] = 1;
            nextDay[1] = month + 1;
            nextDay[2] = year;
        } else if (day == 29 && month == 2 && isLeapYear(year)) {
            nextDay[0] = 1;
            nextDay[1] = month + 1;
            nextDay[2] = year;
        } else {
            nextDay[0] = day + 1;
            nextDay[1] = month;
            nextDay[2] = year;
        }
        return nextDay;
    }

    private static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
    }
}
