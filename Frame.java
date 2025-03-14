import javax.script.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Frame extends JFrame implements ActionListener{
  ScriptEngineManager manager= new ScriptEngineManager();
  ScriptEngine engine=manager.getEngineByName("JavaScript");
  JPanel keys;
  JTextField show;
  double num1;
  double num2;
  double ans;
  int sign=0;
  int signps=0;
  //String answer;
  JButton b1;
  JButton b2;
  JButton b3;
  JButton b4;
  JButton b5;
  JButton b6;
  JButton b7;
  JButton b8;
  JButton b9;
  JButton b10;
  JButton b11;
  JButton b12;
  JButton b13;
  JButton b14;
  JButton b15;
  JButton b16;
  JButton b17;
  JButton b18;
  JButton b19;
    Frame(){
        show=new JTextField();
        show.setPreferredSize(new Dimension(500,70));
        show.setFont(new Font("consolas",Font.PLAIN,20));
        show.setForeground(Color.green);
        show.setEditable(false);
        b1=new JButton("C");
        b2=new JButton("/");
        b3=new JButton("*");
        b4=new JButton("X");
        b5=new JButton("7");
        b6=new JButton("8");
        b7=new JButton("9");
        b8=new JButton("-");
        b9=new JButton("4");
        b10=new JButton("5");
        b11=new JButton("6");
        b12=new JButton("+");
        b13=new JButton("1");
        b14=new JButton("2");
        b15=new JButton("3");
        b16=new JButton("=");
        b17=new JButton("%");
        b18=new JButton("0");
        b19=new JButton(".");
        b1.setBackground(Color.darkGray);
        b2.setBackground(Color.darkGray);
        b3.setBackground(Color.darkGray);
        b4.setBackground(Color.darkGray);
        b5.setBackground(Color.darkGray);
        b6.setBackground(Color.darkGray);
        b7.setBackground(Color.darkGray);
        b8.setBackground(Color.darkGray);
        b9.setBackground(Color.darkGray);
        b10.setBackground(Color.darkGray);
        b11.setBackground(Color.darkGray);
        b12.setBackground(Color.darkGray);
        b13.setBackground(Color.darkGray);
        b14.setBackground(Color.darkGray);
        b15.setBackground(Color.darkGray);
        b16.setBackground(Color.darkGray);
        b17.setBackground(Color.darkGray);
        b18.setBackground(Color.darkGray);
        b19.setBackground(Color.darkGray);

        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        b10.setForeground(Color.white);
        b11.setForeground(Color.white);
        b12.setForeground(Color.white);
        b13.setForeground(Color.white);
        b14.setForeground(Color.white);
        b15.setForeground(Color.white);
        b16.setForeground(Color.white);
        b17.setForeground(Color.white);
        b18.setForeground(Color.white);
        b19.setForeground(Color.white);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b16.setBackground(Color.green);
        keys = new JPanel();
        keys.setBackground(Color.darkGray);
        keys.setPreferredSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        keys.setLayout(new GridLayout(5,4));
        keys.add(b1);
        keys.add(b2);
        keys.add(b3);
        keys.add(b4);
        keys.add(b5);
        keys.add(b6);
        keys.add(b7);
        keys.add(b8);
        keys.add(b9);
        keys.add(b10);
        keys.add(b11);
        keys.add(b12);
        keys.add(b13);
        keys.add(b14);
        keys.add(b15);
        keys.add(b16);
        keys.add(b17);
        keys.add(b18);
        keys.add(b19);
        this.add(show,BorderLayout.NORTH);
        this.add(keys,BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
      if (e.getSource()==b1) {
        show.setText("");
      }
      if (e.getSource()==b2&& !show.getText().isEmpty()) {
        show.setText(show.getText()+"/");
        sign=4;
      }
      if (e.getSource()==b3&& !show.getText().isEmpty()) {
        show.setText(show.getText()+"*");
        sign=3;
      }
      if (e.getSource()==b4) {
        if (!show.getText().isEmpty()) {
          show.setText(show.getText().substring(0,show.getText().length()-1));
        }
      }
      if (e.getSource()==b5) {
        show.setText(show.getText()+"7");
      }
      if (e.getSource()==b6) {
        show.setText(show.getText()+"8");
      }
      if (e.getSource()==b7) {
        show.setText(show.getText()+"9");
      }
      if (e.getSource()==b8&& !show.getText().isEmpty()) {
        show.setText(show.getText()+"-");
        sign=2;
      }
      if (e.getSource()==b9) {
        show.setText(show.getText()+"4");
      }
      if (e.getSource()==b10) {
        show.setText(show.getText()+"5");
      }
      if (e.getSource()==b11) {
        show.setText(show.getText()+"6");
      }
      if (e.getSource()==b12 && !show.getText().isEmpty()) {
        show.setText(show.getText()+"+");
        sign=1;
      }
      if (e.getSource()==b13) {
        show.setText(show.getText()+"1");
      }
      if (e.getSource()==b14) {
        show.setText(show.getText()+"2");
      }
      if (e.getSource()==b15) {
        show.setText(show.getText()+"3");
      }
      if (e.getSource()==b16 &&!show.getText().isEmpty()) {
        //show.setText(show.getText()+"=");
        String stuff=show.getText();
        try {
          Object result= engine.eval(stuff);
          show.setText(String.valueOf(result));
        } catch (ScriptException e3) {
          // TODO: handle exception
          e3.printStackTrace();
        }
        /* if (sign==1) {
          signps=stuff.indexOf('+');
          num1=Double.parseDouble(stuff.substring(0, signps));
          num2=Double.parseDouble(stuff.substring(signps+1));
          ans=num1+num2;
          show.setText(String.valueOf(ans));
        }
        if (sign==2) {
          signps=stuff.indexOf('-');
          num1=Double.parseDouble(stuff.substring(0, signps));
          num2=Double.parseDouble(stuff.substring(signps+1));
          ans=num1-num2;
          show.setText(String.valueOf(ans)); 
        }
        if (sign==3) {
          signps=stuff.indexOf('*');
          num1=Double.parseDouble(stuff.substring(0, signps));
          num2=Double.parseDouble(stuff.substring(signps+1));
          ans=num1*num2;
          show.setText(String.valueOf(ans)); 
        }
        if (sign==4) {
          signps=stuff.indexOf('/');
          num1=Double.parseDouble(stuff.substring(0, signps));
          num2=Double.parseDouble(stuff.substring(signps+1));
          ans=num1/num2;
          show.setText(String.valueOf(ans)); 
        }
        sign=0; */
      }
      if (e.getSource()==b17) {
        show.setText(show.getText()+"%");
      }
      if (e.getSource()==b18) {
        show.setText(show.getText()+"0");
      }
      if (e.getSource()==b19 && !show.getText().isEmpty()) {
        show.setText(show.getText()+".");
      }
    }
}
