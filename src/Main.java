import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("mayor_Edad_num_Perfecto");
        frame.setContentPane(new mayoredad().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        JFrame frame2 = new JFrame("numperfect");
        frame2.setContentPane(new numperfect().panelPrincipal);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
    }
}