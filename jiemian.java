package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jiemian {

	public static void main(String[] args) {
		// ��������
		JFrame frm = new JFrame();
		// ���ô������
		frm.setTitle("��ѡ��Ҫ���е��ʾ�:");
		BorderLayout borderlayout=new BorderLayout();
		frm.setLayout(borderlayout);
		
		JLabel label = new JLabel("��ѡ��Ҫ���е��ʾ�:");
		label.setBounds(-30,5,230,30);
		label.setFont(new Font("",Font.BOLD,15));
		label.setIcon(new ImageIcon("label.jpg"));
		label.setHorizontalTextPosition(JLabel.CENTER); 
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM); 
		//frm.getContentPane().add(label);
		
		JPanel topPanel=new JPanel();
		frm.getContentPane().add(topPanel,BorderLayout.SOUTH);
		JPanel bottomPanel=new JPanel();
		frm.getContentPane().add(bottomPanel,BorderLayout.EAST);
		
		String[] likes={"�ʾ�1��ʮ�Ŵ�Ļ�ʾ����","�ʾ�2���Ϻ�����ѧ��ʮ����֪����","�ʾ�3�����������ļ�ֵ�ۿ���","�ʾ�4�����ѧ��java��","�ʾ�5���Ϻ�����ѧ������ʦ��ѡ","�ʾ�6���Ϻ�����ѧ�յ������ʾ����"};
		JList list=new JList(likes);
		
		
		JComboBox comboBox=new JComboBox(likes);
		comboBox.setEditable(false);
		comboBox.setMaximumRowCount(6);
		comboBox.setBounds(1000, 5, 230, 30);
		
		ComboBoxListener comboboxlistener=new ComboBoxListener();
		comboBox.addActionListener(comboboxlistener); 	
			
		comboBox.setBounds(230,130,120,25);
		frm.getContentPane().add(topPanel);
		topPanel.add(comboBox);

		JButton btn1 = new JButton("��ʼ����");
		ButtonHandler1 btnHandler1 = new ButtonHandler1();
		btn1.addActionListener(btnHandler1); 	
		topPanel.add(btn1);
		
		JButton btn2 = new JButton("�鿴���ʾ�����ͳ��");
		ButtonHandler2 btnHandler2 = new ButtonHandler2();
		btn2.addActionListener(btnHandler2); 	
		topPanel.add(btn2);
		
		JButton btn3 = new JButton("������ʾ�");
		ButtonHandler3 btnHandler3 = new ButtonHandler3();
		btn3.addActionListener(btnHandler3); 	
		topPanel.add(btn3);
		
		JButton btn4 = new JButton("ˢ���ʾ���Ϣ");
		ButtonHandler4 btnHandler4 = new ButtonHandler4();
		btn4.addActionListener(btnHandler4); 	
		topPanel.add(btn4);
		
		/*JPanel topPanel=new JPanel();
		frm.getContentPane().add(topPanel,BorderLayout.CENTER);
		
		JButton btn1 = new JButton("�ʾ�1");
		ButtonHandler1 btnHandler1 = new ButtonHandler1();
		btn1.addActionListener(btnHandler1); 	
		topPanel.add(btn1);
		JButton btn2 = new JButton("�ʾ�2");
		ButtonHandler2 btnHandler2 = new ButtonHandler2();
		btn2.addActionListener(btnHandler2); 	
		topPanel.add(btn2);
		JButton btn3 = new JButton("�ʾ�3");
		ButtonHandler3 btnHandler3 = new ButtonHandler3();
		btn3.addActionListener(btnHandler3); 	
		topPanel.add(btn3);
		JButton btn4 = new JButton("�ʾ�4");
		ButtonHandler4 btnHandler4 = new ButtonHandler4();
		btn4.addActionListener(btnHandler4); 	
		topPanel.add(btn4);
		JButton btn5 = new JButton("+");
		ButtonHandler5 btnHandler5 = new ButtonHandler5();
		btn5.addActionListener(btnHandler5); 	
		topPanel.add(btn5);*/
		
		
		frm.setBounds(650, 430, 758, 75);
		frm.setVisible(true);
	}
}


//�·�Ϊ�����ʾ���¼�
class ButtonHandler1 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		System.out.println("�����˵���ʱ��1");
	}
}
class ButtonHandler2 implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		System.out.println("�����˵���ʱ��2");
	}
}

class ButtonHandler3 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		System.out.println("�����˵���ʱ��3");
	}
}

class ButtonHandler4 implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		System.out.println("�����˵���ʱ��4");
	}
}
/*class ButtonHandler5 implements ActionListener {
	public void actionPerformed(ActionEvent btn5) {
		System.out.println("�����˵���ʱ��+");
	}
}*/
class ComboBoxListener implements ActionListener {
	public void actionPerformed(ActionEvent btn5) {
		
		System.out.println("�����˵���ʱ��+");
	}
}
//










