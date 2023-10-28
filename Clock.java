import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.beans.value.WeakChangeListener;

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

 Clock() {
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("My Clock Program");
  this.setLayout(new FlowLayout());
  this.setSize(350, 200);
  this.setResizable(false);

  timeFormat = new SimpleDateFormat("hh:mm:ss a");
  dayFormat = new SimpleDateFormat("EEEE");
  dateFormat = new SimpleDateFormat("dd MMMMM yyyy");

  timeLabel = new JLabel();
  timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
  timeLabel.setForeground(Color.white);
  timeLabel.setBackground(Color.black);
  timeLabel.setOpaque(true);

  dayLabel = new JLabel();
  dayLabel.setFont(new Font("Ink Free", Font.BOLD, 35));

  dateLabel = new JLabel();
  dateLabel.setFont(new Font("Ink Free", Font.BOLD, 25));

  this.add(timeLabel);
  this.add(dayLabel);
  this.add(dateLabel);
  this.setVisible(true);

  setTimer();
 }

 public void setTimer() {
  while (true) {
   time = timeFormat.format(Calendar.getInstance().getTime());
   timeLabel.setText(time);

   day = dayFormat.format(Calendar.getInstance().getTime());
   dayLabel.setText(day);

   date = dateFormat.format(Calendar.getInstance().getTime());
   dateLabel.setText(date);
   try {
    Thread.sleep(1000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
  }
 }
}
