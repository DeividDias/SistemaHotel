package hotel.util;

import java.util.Date;

public class DataUtil {
	
	public static int diasEntreDatas(Date dt1, Date dt2) {  
        long tempo1 = dt1.getTime();  
        long tempo2 = dt2.getTime();  
        long difTempo = tempo2 - tempo1;  
        return (int) ((difTempo + 60L * 60 * 1000) / (24L * 60 * 60 * 1000));  
    }

}
