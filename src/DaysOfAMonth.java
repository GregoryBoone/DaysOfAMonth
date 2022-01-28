public class DaysOfAMonth {



    static int displayDays(int year, String month){
         int days = 0;

         if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
             days = 31;
         }
         else if (month.equals("Feb") && year % 4 == 0){
             days = 28;
         }
         else if (month.equals("Feb") && year % 4 != 0){
             days = 29;
         }
         else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")){
             days = 30;
         }
         return days;
    }
}
