import java.text.SimpleDateFormat;
import java.util.Date;

public class FunWithDates {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy - mm - dd");
        System.out.println(new Date());
        String dateString = sf.format(new Date());
        System.out.println(dateString);
    }
}
