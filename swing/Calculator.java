package date220102;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * @author Tom Lin
 * @apiNote 小算盤課堂練習
 */
public class Calculator {
	public static void main(String[] args) {
		ct.setLayout(null);
		lb.setBorder(blackline);
		lb.setHorizontalTextPosition(JLabel.CENTER);
		lb.setVerticalTextPosition(JLabel.TOP);
		lb.setBounds(50,40,250,20);
		lb.setText("0");
		
		lbRes.setBorder(blackline);
		lbRes.setBounds(50,70,250,20);
		lbRes.setText("0");
		
		panel0.add(btnC);
		panel0.setBounds(10,100,300,35);
//		panel1.setLayout(theBoxLayout1);
		panel1.add(btn7);
		panel1.add(btn8);
		panel1.add(btn9);
		panel1.add(btnDiv);
		panel1.setBounds(10,135,300,35);
		
//		panel1.setLayout(theBoxLayout2);
		panel2.add(btn4);
		panel2.add(btn5);
		panel2.add(btn6);
		panel2.add(btnMulti);
		panel2.setBounds(10,170,300,35);
//		ct.add(btn1);
//		ct.add(btn2);
//		ct.add(btn3);
		
		panel3.add(btn1);
		panel3.add(btn2);
		panel3.add(btn3);
		panel3.add(btnMinus);
		panel3.setBounds(10,205,300,35);
		
		
		panel4.add(btnRes);
		panel4.add(btn0);
		panel4.add(btnDot);
		panel4.add(btnPlus);
		
		panel4.setBounds(10,240,300,35);
		
		// btn listener
		btn0.addActionListener(new ButtonListener());
		btn1.addActionListener(new ButtonListener());
		btn2.addActionListener(new ButtonListener());
		btn3.addActionListener(new ButtonListener());
		btn4.addActionListener(new ButtonListener());
		btn5.addActionListener(new ButtonListener());
		btn6.addActionListener(new ButtonListener());
		btn7.addActionListener(new ButtonListener());
		btn8.addActionListener(new ButtonListener());
		btn9.addActionListener(new ButtonListener());
		btnDot.addActionListener(new ButtonListener());
		btnPlus.addActionListener(new ButtonListener());
		btnMinus.addActionListener(new ButtonListener());
		btnMulti.addActionListener(new ButtonListener());
		btnDiv.addActionListener(new ButtonListener());
		btnRes.addActionListener(new ButtonListener());
		btnC.addActionListener(new ButtonListener());
		
		ct.add(lb);
		ct.add(lbRes);
		ct.add(panel0);
		ct.add(panel1);
		ct.add(panel2);
		ct.add(panel3);
		ct.add(panel4);
		
		frm.setSize(400,400);
		frm.setDefaultCloseOperation(3);
		frm.setVisible(true);
	}
	
	static JFrame frm = new JFrame("小算盤");
	static String result = "";
	static String calRes = "";
	static Border blackline = BorderFactory.createLineBorder(Color.black);
	static Container ct = frm.getContentPane();
	static BoxLayout theBoxLayout = new BoxLayout(ct, BoxLayout.X_AXIS);
	
	static JPanel panel0 = new JPanel();
	static JPanel panel1 = new JPanel();
//	static BoxLayout theBoxLayout1 = new BoxLayout(panel1, BoxLayout.X_AXIS);
	static JPanel panel2 = new JPanel();
//	static BoxLayout theBoxLayout2 = new BoxLayout(panel2, BoxLayout.X_AXIS);
	static JPanel panel3 = new JPanel();
	static JPanel panel4 = new JPanel();
	
	static JLabel lb = new JLabel();
	static JLabel lbRes = new JLabel();
	static JButton btn1 = new JButton(" 1 ");
	static JButton btn2 = new JButton(" 2 ");
	static JButton btn3 = new JButton(" 3 ");
	
	static JButton btn4 = new JButton(" 4 ");
	static JButton btn5 = new JButton(" 5 ");
	static JButton btn6 = new JButton(" 6 ");
	
	static JButton btn7 = new JButton(" 7 ");
	static JButton btn8 = new JButton(" 8 ");
	static JButton btn9 = new JButton(" 9 ");
	
	static JButton btn0 = new JButton(" 0 ");
	static JButton btnDot = new JButton(" . ");
	
	static JButton btnPlus = new JButton(" + ");
	static JButton btnMinus = new JButton(" - ");
	static JButton btnMulti = new JButton("\u00D7");
	static JButton btnDiv = new JButton("\u00F7");
	static JButton btnRes = new JButton(" = ");
	
	static JButton btnC = new JButton(" C ");
	
	
	
	static class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if (btn == btn0 && result.length() > 0) {
				result += 0;
			}
			else if (btn == btn1) {
				result +=1;
			}
			else if (btn == btn2) {
				result +=2;
			}
			else if (btn == btn3) {
				result +=3;
			}
			else if (btn == btn4) {
				result +=4;
			}
			else if (btn == btn5) {
				result +=5;
			}
			else if (btn == btn6) {
				result +=6;
			}
			else if (btn == btn7) {
				result +=7;
			}
			else if (btn == btn8) {
				result +=8;
			}
			else if (btn == btn9) {
				result +=9;
			}
			else if (btn == btnDot) {
				boolean b = false;
				if (result.length() == 0) {
					result += "0";
				}
				String[] split = result.split(" ");
				
				String string = split[split.length-1];
				
				if (string.contains(".")) {
					System.out.println("have dot");
					b = true;
				}else {
					System.out.println("no dot");
				}
				if (b == false) {
					
					if (result.length() == 0)
						result += "0.";
					else
						result += ".";
				}
			}
			else if (btn == btnC) {
				result = "";
				calRes = "";
				lbRes.setText("0");
			}
			else if (btn == btnPlus) {
				if (result.length() == 0)
					result += "0 + ";
				else 
					result += " + ";
			}
			else if (btn == btnMinus) {
				if (result.length() == 0)
					result += "0 - ";
				else 
					result += " - ";
			}
			else if (btn == btnMulti) {
				if (result.length() == 0)
					result += "0 \u00D7 ";
				else 
					result += " \u00D7 ";
			}
			else if (btn == btnDiv) {
				if (result.length() == 0)
					result += "0 \u00F7 ";
				else 
					result += " \u00F7 ";
			}
			else if (btn == btnRes) {
				if (result.length() != 0) {
					String[] split = result.split(" ");
				
				calRes = "";
				for (int i = 0 ; i < split.length; i++) {
					if (split[i].equals("+")) {
						calRes += Float.parseFloat(split[i-1]) + Float.parseFloat(split[i+1]);
						i++;
					}else if (split[i].equals("-")) {
						calRes += Float.parseFloat(split[i-1]) - Float.parseFloat(split[i+1]);
						i++;
					}else if (split[i].equals("\u00D7")) {
						// 乘法
						System.out.println(Float.parseFloat(split[i-1]) * Float.parseFloat(split[i+1]));
						calRes += Float.parseFloat(split[i-1]) * Float.parseFloat(split[i+1]);
						i++;
					}else if (split[i].equals("\u00F7")) {
						// 除法
						if (split[i+1].equals("0")) {
							calRes = "不能除以0";
						}
						else {
							calRes += Float.parseFloat(split[i-1]) / Float.parseFloat(split[i+1]);
							i++;
						}
					}
				}
				result = "";
				lbRes.setText(calRes);
				lb.setText("0");
				}
			}
			lb.setText(result);
		}
	}
	
}
