import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LoginS extends JFrame
{
   JLabel l1,l2,l3,l4,l0;
   JTextField t1,p1;
   JButton b1,b2,b3;
   LoginS(String s1)
   {
      super(s1);
   }
   LoginS()
   {
   }
   void setComponents()
   {
     Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
     Font f1 = new Font("Times New Roman",Font.BOLD,18);
     Font f2 = new Font("Callibri",Font.ITALIC,18);
     l1 = new JLabel("SURYANSH  LOGIN  SCREEN");
     l1.setFont(f1);
     l1.setForeground(Color.RED);
     l2 = new JLabel("USERNAME");
     l2.setFont(f2);
     l2.setForeground(Color.BLUE);
     l3 = new JLabel("PASSWORD");
     l3.setFont(f2);
     l3.setForeground(Color.BLUE);
     l4 = new JLabel();
     l4.setForeground(Color.RED);
     l4.setFont(f2);
     t1 = new JTextField();
     p1 = new JTextField();
     b1 = new JButton("Login");
     b1.setCursor(c1);
     b1.setFont(f2);
     b1.setBackground(Color.YELLOW);
     b1.setForeground(Color.RED);
     b2 = new JButton("Autofill");
     b2.setCursor(c1);
     b2.setFont(f2);
     b2.setBackground(Color.YELLOW);
     b2.setForeground(Color.RED);
     b3 = new JButton("Add");
     b3.setCursor(c1);
     b3.setFont(f2);
     b3.setBackground(Color.YELLOW);
     b3.setForeground(Color.RED);
     l0 = new JLabel();
     ImageIcon i1 = new ImageIcon("D:/aparnajava/images.png");
     l0.setIcon(i1);
     setLayout(null);
     add(l1);
     add(l2);
     add(l3);
     add(l4);
     add(t1);
     add(p1);
     add(b1);
     add(b2);
     add(b3);
     add(l0);
     l1.setBounds(50,70,400,50);
     l2.setBounds(70,140,220,30);
     l3.setBounds(70,210,220,30);
     l4.setBounds(50,400,200,30);
     t1.setBounds(200,140,220,30);
     p1.setBounds(200,210,220,30);
     b1.setBounds(100,300,100,30);
     b2.setBounds(300,300,100,30);
     b3.setBounds(350,380,100,30);
     l0.setBounds(170,30,300,30);
     b1.addActionListener(new Log());
     b2.addActionListener(new Clear());
     b3.addActionListener(new Add());
     b1.addMouseListener(new ME1());
     b2.addMouseListener(new ME2()); 
     b3.addMouseListener(new ME3());
   }
   public static void main(String args[])
   {
      LoginS s1=new LoginS("Welcome to Login Screen");
      s1.setSize(500,500);
      s1.setVisible(true);
      s1.setComponents();
      s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   class Log implements ActionListener
   {
     public void actionPerformed(ActionEvent e1)
     {
       String s1=t1.getText();
       String s2=p1.getText();
       if(s1.equals("Coding") && s2.equals("Seekho"))
       {
          JOptionPane.showMessageDialog(null,"Login Successful");
       }
       else
       {
          JOptionPane.showMessageDialog(null,"Login unsuccessful");
       }
     }
   }
   class Clear implements ActionListener
   {
      public void actionPerformed(ActionEvent e1)
      {
        t1.setText("Coding");
        p1.setText("Seekho");
      }
   }
   class Add implements ActionListener
   {
      public void actionPerformed(ActionEvent e2)
      {
          try{
               int a=Integer.parseInt(t1.getText());
               int b=Integer.parseInt(p1.getText());
               int c=a+b;
               l4.setText("Addition is: "+c);
             }
          catch(Exception e1)
          {
             l4.setText("please enter a number only");
          }
      }
   }
   class ME1 implements MouseListener
   {
     public void mouseEntered(MouseEvent e)
     {
       b1.setBackground(Color.BLUE);
       b2.setBackground(Color.BLUE);
       b3.setBackground(Color.BLUE);
     }
     public void mouseExited(MouseEvent e)
     {
       b1.setBackground(Color.BLUE);
       b2.setBackground(Color.BLUE);
       b3.setBackground(Color.BLUE);
     }
     public void mouseClicked(MouseEvent e){}
     public void mousePressed(MouseEvent e){}
     public void mouseReleased(MouseEvent e){}
   }
   class ME2 implements MouseListener
   {
     public void mouseEntered(MouseEvent e)
     {
       b1.setBackground(Color.GREEN);
       b2.setBackground(Color.GREEN);
       b3.setBackground(Color.GREEN);
     }
     public void mouseExited(MouseEvent e)
     {
       b1.setBackground(Color.WHITE);
       b2.setBackground(Color.WHITE);
       b3.setBackground(Color.WHITE);
     }
     public void mouseClicked(MouseEvent e){}
     public void mousePressed(MouseEvent e){}
     public void mouseReleased(MouseEvent e){}
   }
   class ME3 implements MouseListener
   {
     public void mouseEntered(MouseEvent e)
     {
       b1.setBackground(Color.GREEN);
       b2.setBackground(Color.GREEN);
       b3.setBackground(Color.GREEN);
     }
     public void mouseExited(MouseEvent e)
     {
       b1.setBackground(Color.RED);
       b2.setBackground(Color.RED);
       b3.setBackground(Color.RED);
     }
     public void mouseClicked(MouseEvent e){}
     public void mousePressed(MouseEvent e){}
     public void mouseReleased(MouseEvent e){}
   }
}