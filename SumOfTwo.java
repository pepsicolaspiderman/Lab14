import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SumOfTwo extends Frame{
    SumOfTwo(){
        setTitle("Sum of two numbers");
        setLayout(null);

        Label lforA = new Label("a");
        Label lforB = new Label("b");
        Label lforSum = new Label("sum");

        lforA.setBounds(25, 55, 30, 20);
        lforB.setBounds(25, 85, 30, 20);
        lforSum.setBounds(25, 115, 30, 20);

        TextField a = new TextField();
        TextField b = new TextField();
        TextField sum = new TextField();
        a.setBounds(65, 55, 50, 20);
        b.setBounds(65, 85, 50, 20);
        sum.setBounds(65, 115, 50, 20);

        Button calculate = new Button("Calculate");
        Button clear = new Button("Clear");
        calculate.setBounds(40, 140, 70, 30);
        clear.setBounds(40, 170, 70, 30);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anum = Integer.parseInt(a.getText());
                int bnum = Integer.parseInt(b.getText());
                sum.setText(Integer.toString(anum+bnum));
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText("");
                b.setText("");
                sum.setText("");
            }
        });

        add(calculate);
        add(clear);
        add(a);
        add(b);
        add(sum);
        add(lforA);
        add(lforB);
        add(lforSum);

        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new SumOfTwo();
    }
}
