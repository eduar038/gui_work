import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("mayor_Edad_num_Perfecto");
        frame.setContentPane(new mayoredad().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}