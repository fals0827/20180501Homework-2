import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jbtLeft = new JButton("<--");
    private JButton jbtRight = new JButton("-->");
    private JButton jbtExit = new JButton("Exit");
    private JLabel jlbFace = new JLabel("> ___ <");
    private JTextField jtf = new JTextField("0");
    private  int  x = 40 , count = 0 ;
    public MainFrame () {
        init();
    }
    private void init () {
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(40,40,1280,960);

        jbtLeft.setBounds(30,30,200,120);
        jbtRight.setBounds(240,30,200,120);
        jbtExit.setBounds(450,30,200,120);
        jlbFace.setBounds(x,180,100,120);
        jtf.setBounds(30,300,200,60);

        jbtLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= Integer.parseInt(jtf.getText()) ;
                count ++ ;
                jlbFace.setLocation(x,180);
                switch (count % 5){
                    case 0 :
                        jlbFace.setText("> ___ <");
                        break;
                    case 1 :
                        jlbFace.setText("@ ___ @");
                        break;
                    case 2 :
                        jlbFace.setText("# ___ #");
                        break;
                    case 3 :
                        jlbFace.setText("= ___ =");
                        break;
                    case 4 :
                        jlbFace.setText("$ ___ $");
                        break;
                }
            }
        });

        jbtRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += Integer.parseInt(jtf.getText());
                count ++ ;
                jlbFace.setLocation(x,180);
                switch (count % 5){
                    case 0 :
                        jlbFace.setText("> ___ <");
                        break;
                    case 1 :
                        jlbFace.setText("@ ___ @");
                        break;
                    case 2 :
                        jlbFace.setText("# ___ #");
                        break;
                    case 3 :
                        jlbFace.setText("= ___ =");
                        break;
                    case 4 :
                        jlbFace.setText("$ ___ $");
                        break;
                }
            }
        });

        jbtExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.add(jbtLeft);
        this.add(jbtRight);
        this.add(jbtExit);
        this.add(jlbFace);
        this.add(jtf);
    }
}
