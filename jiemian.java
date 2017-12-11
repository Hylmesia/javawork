package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class jiemian {

	public static void main(String[] args) {
		// 创建窗体
		JFrame frm = new JFrame();
		// 设置窗体标题
		frm.setTitle("请选择要进行的问卷:");
		BorderLayout borderlayout=new BorderLayout();
		frm.setLayout(borderlayout);
		
		JLabel label = new JLabel("请选择要进行的问卷:");
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
		
		String[] likes={"问卷1：十九大开幕问卷调查","问卷2：上海理工大学百十华诞知多少","问卷3：社会主义核心价值观考察","问卷4：如何学好java？","问卷5：上海理工大学最美教师评选","问卷6：上海理工大学空调问题问卷调查"};
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

		JButton btn1 = new JButton("开始进行");
		ButtonHandler1 btnHandler1 = new ButtonHandler1();
		btn1.addActionListener(btnHandler1); 	
		topPanel.add(btn1);
		
		JButton btn2 = new JButton("查看该问卷数据统计");
		ButtonHandler2 btnHandler2 = new ButtonHandler2();
		btn2.addActionListener(btnHandler2); 	
		topPanel.add(btn2);
		
		JButton btn3 = new JButton("添加新问卷");
		ButtonHandler3 btnHandler3 = new ButtonHandler3();
		btn3.addActionListener(btnHandler3); 	
		topPanel.add(btn3);
		
		JButton btn4 = new JButton("刷新问卷信息");
		ButtonHandler4 btnHandler4 = new ButtonHandler4();
		btn4.addActionListener(btnHandler4); 	
		topPanel.add(btn4);
		
		/*JPanel topPanel=new JPanel();
		frm.getContentPane().add(topPanel,BorderLayout.CENTER);
		
		JButton btn1 = new JButton("问卷1");
		ButtonHandler1 btnHandler1 = new ButtonHandler1();
		btn1.addActionListener(btnHandler1); 	
		topPanel.add(btn1);
		JButton btn2 = new JButton("问卷2");
		ButtonHandler2 btnHandler2 = new ButtonHandler2();
		btn2.addActionListener(btnHandler2); 	
		topPanel.add(btn2);
		JButton btn3 = new JButton("问卷3");
		ButtonHandler3 btnHandler3 = new ButtonHandler3();
		btn3.addActionListener(btnHandler3); 	
		topPanel.add(btn3);
		JButton btn4 = new JButton("问卷4");
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


//下方为单击问卷的事件
class ButtonHandler1 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		System.out.println("发生了单击时间1");
	}
}
class ButtonHandler2 implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		System.out.println("发生了单击时间2");
	}
}

class ButtonHandler3 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		System.out.println("发生了单击时间3");
	}
}

class ButtonHandler4 implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		System.out.println("发生了单击时间4");
	}
}
/*class ButtonHandler5 implements ActionListener {
	public void actionPerformed(ActionEvent btn5) {
		System.out.println("发生了单击时间+");
	}
}*/
class ComboBoxListener implements ActionListener {
	public void actionPerformed(ActionEvent btn5) {
		
		System.out.println("发生了单击时间+");
	}
}
//










