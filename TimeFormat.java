public class TimeFormat {
    public static void main(String[] args) {
        String time = args[0];
        String hours1 = String.valueOf(time.charAt(0)) + String.valueOf(time.charAt(1));
        String minutes2 = String.valueOf(time.charAt(3)) + String.valueOf(time.charAt(4));
        int hours = Integer.parseInt(hours1);
        int hourpm;
        if (hours > 12) { 
            hourpm = hours - 12;
                System.out.println(hourpm + ":" + minutes2 + " PM");
        }
        if (hours == 12)
            System.out.println(hours + ":" + minutes2 + " PM");
        if (hours <= 10) 
            System.out.println(hours + ":" + minutes2 + " AM");
    } 
}
