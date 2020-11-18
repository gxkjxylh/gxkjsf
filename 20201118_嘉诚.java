import javax.swing.*;

public class cjc {
    private JPanel jpan;
    void mo(){
        JFrame frame =new JFrame();
        frame.setContentPane(jpan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setBounds(600,300,600,300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new cjc().mo();
    }
}
