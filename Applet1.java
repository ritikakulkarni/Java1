package pk;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class Applet1  extends Applet implements ActionListener
{

	Label l1,l2;
	 TextField t1,t2;
	 Button b1,b2;
	 public void init()
	 {
	     l1=new Label("Enter a character: ");
	     l2=new Label("ASCII value: ");

	     t1=new TextField(10);
	     t2=new TextField(10);
	     b1=new Button("Calculate");
	     b2=new Button("Clear");
	     add(l1);
	     add(t1);
	     add(l2);
	     add(t2);
	     add(b1);
	     add(b2);
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	 }
	 public void actionPerformed(ActionEvent ae)
	 {
	     String str=t1.getText();
	       int l=str.length();
	     if(ae.getSource()==b1)
	   {

	                   
	         int  a = str.charAt(0);
	             t2.setText(String.valueOf(a));

	     }
	     else if(ae.getSource()==b2)
	     {
	         t1.setText("");
	         t2.setText("");
	     }
	   
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
