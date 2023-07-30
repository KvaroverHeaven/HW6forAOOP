package HW6forAOOP;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
import java.io.Serial;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFrame extends JFrame {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = -6021974665172630565L;

    public TimeFrame() {
        super("Timer");
        var timeLabel = new JLabel();
        var formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        timeLabel.setFont(new Font("Roboto", Font.PLAIN, 64));
        timeLabel.setForeground(Color.WHITE);
        add(timeLabel);
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        new Timer(100, e -> {
            var timeString = LocalTime.now().format(formatter);
            timeLabel.setText(timeString);
        }).start();

    }

}
