package ilog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class extras {
    public String getDate()
    {
            String timeStamp = new SimpleDateFormat("dd/MM/YYYY").format(Calendar.getInstance().getTime());
            return timeStamp;
    }
    public String getMonth()
    {
            String timeStamp = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
            return timeStamp;
    }
}