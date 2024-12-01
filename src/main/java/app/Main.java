package app;

import javax.swing.*;

/**
 * The Main class of our application.
 */
public class Main {
    /**
     * Builds and runs the CA architecture of the application.
     * @param args unused arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        final Builder builder = new Builder();

        final JFrame application = builder
                .addChartView()
                .addExploreView()
                .build();

        application.pack();
        application.setVisible(true);
    }
}