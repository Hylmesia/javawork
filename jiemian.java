package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class jiemian {

	static int x=1;
	static JFrame frm = new JFrame();
	
	static int[][][]data= {{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}},{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}},{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}},{{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}},{{0,0,0,0}}};

	public static void main(String[] args) {
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		frm.setTitle("��ѡ��Ҫ���е��ʾ�:");
		BorderLayout borderlayout=new BorderLayout();
		frm.setLayout(borderlayout);
		Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
		frm.setIconImage(icon);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JLabel label = new JLabel("��ѡ��Ҫ���е��ʾ�:");
		label.setBounds(-30,5,230,30);
		label.setFont(new Font("",Font.BOLD,15));
		label.setIcon(new ImageIcon("label.jpg"));
		label.setHorizontalTextPosition(JLabel.CENTER); 
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM); 
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel topPanel=new JPanel();
		frm.getContentPane().add(topPanel,BorderLayout.SOUTH);
		JPanel bottomPanel=new JPanel();
		frm.getContentPane().add(bottomPanel,BorderLayout.EAST);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		String[] likes={"�ʾ�1��ʮ�Ŵ�Ļ�ʾ����","�ʾ�2���Ϻ�����ѧ��ʮ����֪����","�ʾ�3���Ϻ�����ѧ�յ������ʾ����","�ʾ�4�����ѧ��java��","�ʾ�5���Ϻ�����ѧ������ʦ��ѡ"};
		JList list=new JList(likes);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JComboBox comboBox=new JComboBox(likes);
		comboBox.setEditable(false);
		comboBox.setMaximumRowCount(6);
		comboBox.setBounds(1000, 5, 230, 30);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		ComboBoxListener comboboxlistener=new ComboBoxListener();
		comboBox.addActionListener(comboboxlistener); 
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		comboBox.addItemListener
		(new ItemListener()
		  {
		   @Override
		   public void itemStateChanged(ItemEvent e)
		   {
		//���ѡ����һ�� 
		    if (e.getStateChange() == ItemEvent.SELECTED)
		 {
		 //����д������� ������ȡ�����ڵ�ֵ  
		    	int kx=comboBox.getSelectedIndex();
		    	kx++;
		    	jiemian.x=kx;
				//System.out.println(x);
				}}});
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		comboBox.setBounds(230,130,120,25);
		frm.getContentPane().add(topPanel);
		topPanel.add(comboBox);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btn1 = new JButton("��ʼ����");
		ButtonHandler1 btnHandler1 = new ButtonHandler1();
		btn1.addActionListener(btnHandler1); 	
		topPanel.add(btn1);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btn2 = new JButton("�鿴���ʾ�����ͳ��");
		ButtonHandler2 btnHandler2 = new ButtonHandler2();
		btn2.addActionListener(btnHandler2); 	
		topPanel.add(btn2);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btn3 = new JButton("������Ϣ");
		ButtonHandler3 btnHandler3 = new ButtonHandler3();
		btn3.addActionListener(btnHandler3); 	
		topPanel.add(btn3);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btn4 = new JButton("�˳��ʾ�ϵͳ");
		ButtonHandler4 btnHandler4 = new ButtonHandler4();
		btn4.addActionListener(btnHandler4); 	
		topPanel.add(btn4);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		frm.setBounds(650, 430, 742, 75);
		frm.setVisible(true);
	}
}
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
class ButtonHandler1 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		System.out.println("�����˵���ʱ��1");
		System.out.println(jiemian.x);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		switch (jiemian.x)
		{
		case 1:{wenjuan1.wenjuanneirong();break;}
		case 2:{wenjuan2.wenjuanneirong();break;}
		case 3:{wenjuan3.wenjuanneirong();break;}
		case 4:{wenjuan4.wenjuanneirong();break;}
		case 5:{wenjuan5.wenjuanneirong();break;}
		default:System.out.println("Choosen Error!");
		}
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	}
}
class ButtonHandler2 implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		switch (jiemian.x)
		{
		case 1:{wenjuan1.shujutongji();break;}
		case 2:{wenjuan2.shujutongji();break;}
		case 3:{wenjuan3.shujutongji();break;}
		case 4:{wenjuan4.shujutongji();break;}
		case 5:{wenjuan5.shujutongji();break;}
		
	}
}
}
class ButtonHandler3 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		int i,j,k;
		for(i=0;i<5;i++)
		{
			for(j=0;j<6;j++)
			{
				for(k=0;k<4;k++)
				{
					jiemian.data[i][j][k]=0;
				}
			}
		}
	}
}
class ButtonHandler4 implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		jiemian.frm.dispose();
	}
}
class ComboBoxListener implements ActionListener {
	public void actionPerformed(ActionEvent btn5) {
		System.out.println("�����˵���ʱ��+");
	}
}