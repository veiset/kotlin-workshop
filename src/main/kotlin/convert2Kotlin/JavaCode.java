package convert2Kotlin;

public class JavaCode {

    public String getWeekday(int dayOfWeek){
        switch (dayOfWeek){
            case 0: return "monday";
            case 1: return "thursday";
            case 2: return "wednesday";
            case 3: return "tuesday";
            case 4: return "friday";
            case 5: return "saturday";
            case 6: return "sunday";
            default: return "not a valid day number";
        }
    }
}
