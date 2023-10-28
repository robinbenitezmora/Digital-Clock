import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock extends JFrame {

 Calendar calendar;
 SimpleDateFormat timeFormat;
 SimpleDateFormat dayFormat;
 SimpleDateFormat dateFormat;

 JLabel timeLabel;
 JLabel dayLabel;
 JLabel dateLabel;
 String time;
 String day;
 String date;
}