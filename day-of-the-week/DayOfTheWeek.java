class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // Create an array of the number of days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check if the given year is a leap year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[2] = 29;
        }
        
        // Compute the total number of days since January 1, 1 AD
        int totalDays = day;
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }
        for (int i = 1; i < year; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        
        // Compute the day of the week using the total number of days
        int dayOfWeek = totalDays % 7;
        
        return daysOfWeek[dayOfWeek];
    }
}

