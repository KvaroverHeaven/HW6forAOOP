package HW6forAOOP;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.SwingUtilities;

public class TimeTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TimeTest::createAndShowGUI);
        // IntStream.range(2, (int) Math.round(Math.sqrt(n))).filter(i -> n % i ==
        // 0).forEach(System.out::println);
    }

    private static void createAndShowGUI() {
        var timeFrame = new TimeFrame();
        timeFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        timeFrame.setSize(1280, 720);
        timeFrame.setVisible(true);
    }

}
