package main;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class wenjuan5 {
	static JFrame frmwenjuan5 = new JFrame();
	static JFrame frmtongji1 = new JFrame();
	static int []answer= {1,0};
	static int i=1;
	static int numberofzero=0;
	static int numberofzeroreal=0;
	static JLabel numbercount=new JLabel("��ǰ����Ŀ����"+i+"�⣨"+i+"/1)");
	static String wenjuan1neirong="�Ϻ�����ѧ��������ʦ����Ϊ�ǣ�";
	static String question1="����";
	static String question2="����";
	static String question3="����";
	static String question4="����";
	static JFrame frm = new JFrame();
	static JRadioButton chosen1 = new JRadioButton(question1);
	static JRadioButton chosen2 = new JRadioButton(question2);
	static JRadioButton chosen3 = new JRadioButton(question3);
	static JRadioButton chosen4 = new JRadioButton(question4);
	static JRadioButton chosen5 = new JRadioButton("");
	static JTextField text=new JTextField();
	public static void shujutongji()
	{
		frmtongji1.setTitle("����ͳ��");
		FlowLayout flowlayout = new FlowLayout();
		wenjuan1.frmtongji1.setLayout(flowlayout);
		String data="������              ѡ��1    ѡ��2    ѡ��3    ѡ��4 ";
		String data1="1                           "+jiemian.data[0][0][0]+"            "+jiemian.data[0][0][1]+"             "+jiemian.data[0][0][2]+"             "+jiemian.data[0][0][3]+"     ";
		String data2="2                           "+jiemian.data[0][1][0]+"            "+jiemian.data[0][1][1]+"             "+jiemian.data[0][1][2]+"             "+jiemian.data[0][1][3]+"     ";
		String data3="3                           "+jiemian.data[0][2][0]+"            "+jiemian.data[0][2][1]+"             "+jiemian.data[0][2][2]+"             "+jiemian.data[0][2][3]+"     ";
		String data4="4                           "+jiemian.data[0][3][0]+"            "+jiemian.data[0][3][1]+"             "+jiemian.data[0][3][2]+"             "+jiemian.data[0][3][3]+"     ";
		String data5="5                           "+jiemian.data[0][4][0]+"            "+jiemian.data[0][4][1]+"             "+jiemian.data[0][4][2]+"             "+jiemian.data[0][4][3]+"     ";
		String data6="6                           "+jiemian.data[0][5][0]+"            "+jiemian.data[0][5][1]+"             "+jiemian.data[0][5][2]+"             "+jiemian.data[0][5][3]+"     ";
		frmtongji1.setBounds(600,200,300,300);
		JLabel labeltj=new JLabel();
		JLabel labeltj1=new JLabel();
		JLabel labeltj2=new JLabel();
		JLabel labeltj3=new JLabel();
		JLabel labeltj4=new JLabel();
		JLabel labeltj5=new JLabel();
		JLabel labeltj6=new JLabel();
		labeltj.setText(data);
		labeltj1.setText(data1);
		labeltj2.setText(data2);
		labeltj3.setText(data3);
		labeltj4.setText(data4);
		labeltj5.setText(data5);
		labeltj6.setText(data6);
		wenjuan1.frmtongji1.getContentPane().add(labeltj);
		wenjuan1.frmtongji1.getContentPane().add(labeltj1);
		wenjuan1.frmtongji1.getContentPane().add(labeltj2);
		wenjuan1.frmtongji1.getContentPane().add(labeltj3);
		wenjuan1.frmtongji1.getContentPane().add(labeltj4);
		wenjuan1.frmtongji1.getContentPane().add(labeltj5);
		wenjuan1.frmtongji1.getContentPane().add(labeltj6);
		wenjuan1.frmtongji1.setVisible(true);
		
		
		
		
	}
	public static void wenjuanneirong()
	{
		jiemian.frm.setVisible(false);
		frmwenjuan5.setTitle("�ʾ�5���Ϻ�����ѧ������ʦ��ѡ");
		frmwenjuan5.setLayout(null);
		frmwenjuan5.setBounds(700, 300, 500, 500);
		Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
		frmwenjuan5.setIconImage(icon);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel leftPanel=new JPanel();
		frmwenjuan5.getContentPane().add(leftPanel);
		leftPanel.setBounds(-5, 0, 100, 50);
		JPanel rightPanel=new JPanel();
		frmwenjuan5.getContentPane().add(rightPanel);
		rightPanel.setBounds(390, 0, 100, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnleft = new JButton("��һ��");
		ButtonHandlerleft5 btnHandlerleft = new ButtonHandlerleft5();
		btnleft.addActionListener(btnHandlerleft); 	
		leftPanel.add(btnleft);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnright = new JButton("��һ��");
		ButtonHandlerright5 btnHandlerright = new ButtonHandlerright5();
		btnright.addActionListener(btnHandlerright); 	
		rightPanel.add(btnright);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel buttomPanel=new JPanel();
		frmwenjuan5.getContentPane().add(buttomPanel);
		buttomPanel.setBounds(0, 423, 100, 50);
		JButton btnhandin = new JButton("�ύ��");
		ButtonHandlerhandin5 btnHandlerhandin = new ButtonHandlerhandin5();
		btnhandin.addActionListener(btnHandlerhandin); 	
		buttomPanel.add(btnhandin);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		text.setText(wenjuan1neirong);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(50,50,400,100);
		text.setEditable(false);
		frmwenjuan5.getContentPane().add(text);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel exitPanel=new JPanel();
		frmwenjuan5.getContentPane().add(exitPanel);
		exitPanel.setBounds(384, 423, 100, 50);
		JButton btnreturn = new JButton("���ر���");
		ButtonHandlerreturn5 btnHandlerreturn = new ButtonHandlerreturn5();
		btnreturn.addActionListener(btnHandlerreturn); 	
		exitPanel.add(btnreturn);
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		ButtonGroup btnGroup = new ButtonGroup();
		//chosen1.setSelected(true);
		btnGroup.add(chosen1);
		btnGroup.add(chosen2);
		btnGroup.add(chosen3);
		btnGroup.add(chosen4);
		btnGroup.add(chosen5);
		frmwenjuan5.getContentPane().add(chosen1);
		frmwenjuan5.getContentPane().add(chosen2);
		frmwenjuan5.getContentPane().add(chosen3);
		frmwenjuan5.getContentPane().add(chosen4);
		frmwenjuan5.getContentPane().add(chosen5);
		chosen1.setBounds(50, 150, 300, 50);
		chosen2.setBounds(50, 200, 300, 50);
		chosen3.setBounds(50, 250, 300, 50);
		chosen4.setBounds(50, 300, 300, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		numbercount.setBounds(167,0,300,40);
		frmwenjuan5.add(numbercount);
		frmwenjuan5.setVisible(true);
	}
	static void changetext()
	{
		switch(i)
		{
		case 1:{q1();break;}
		default:break;
		}

	}
	static void q1()
	{
		String wenjuan1neirong="�Ϻ�����ѧ��������ʦ����Ϊ�ǣ�";text.setText(wenjuan1neirong);
		question1="����";wenjuan5.chosen1.setText(question1);
		question2="����";wenjuan5.chosen2.setText(question2);
		question3="����";wenjuan5.chosen3.setText(question3);
		question4="����";wenjuan5.chosen4.setText(question4);
	}
	
	static void save()
	{
		if (chosen1.isSelected()==true) {
			answer[wenjuan5.i]=1;
		}
		if (chosen2.isSelected()==true) {
			answer[wenjuan5.i]=2;
		}
		if (chosen3.isSelected()==true) {
			answer[wenjuan5.i]=3;
		}
		if (chosen4.isSelected()==true) {
			answer[wenjuan5.i]=4;
		}
		if (chosen5.isSelected()==true) {
			answer[wenjuan5.i]=0;
		}
		
	}
	static void load()
	{
		if (answer[wenjuan5.i]==1) {
			chosen1.setSelected(true);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan5.i]==2) {
			chosen1.setSelected(false);
			chosen2.setSelected(true);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan5.i]==3) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(true);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan5.i]==4) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(true);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan5.i]==0) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(true);
		}
	}
}
class ButtonHandlerleft5 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		wenjuan5.save();
		if ((wenjuan5.i)==1) wenjuan5.i=1;
		else wenjuan5.i--;
		wenjuan5.numbercount.setText("��ǰ����Ŀ����"+wenjuan5.i+"�⣨"+wenjuan5.i+"/1)");
		wenjuan5.changetext();
		wenjuan5.load();
	}
}
class ButtonHandlerreturn5 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
	    wenjuan5.frmwenjuan5.setVisible(false);
	    jiemian.frm.setVisible(true);
	}
}
class ButtonHandlerright5 implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		wenjuan5.save();
		if ((wenjuan5.i)==1) wenjuan5.i=1;
		else wenjuan5.i++;
		wenjuan5.numbercount.setText("��ǰ����Ŀ����"+wenjuan5.i+"�⣨"+wenjuan5.i+"/1)");
		wenjuan5.changetext();
		wenjuan5.load();
	}
}
class ButtonHandlerhandin5 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan5.save();
		int c=1;
		for (c=1;c<2;c++)
		{
			if (wenjuan5.answer[c]==0) wenjuan5.numberofzero++;
		}
		wenjuan5.numberofzeroreal=wenjuan5.numberofzero;
		wenjuan5.numberofzero=0;
		tishi();
	}
static void tishi()
{
	
	wenjuan5.frm.setTitle("ע��!");
	FlowLayout flowlayout = new FlowLayout();
	wenjuan5.frm.setLayout(flowlayout);
	Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
	wenjuan5.frm.setIconImage(icon);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JLabel label=new JLabel();
	if (wenjuan5.numberofzeroreal!=0)
	{label.setText("����"+wenjuan5.numberofzeroreal+"��������δ�ش�ȷ��Ҫ�ύ��");}
	else {label.setText("���ѻش���ȫ�����⣬ȷ��Ҫ�ύ��");}
	wenjuan5.frm.getContentPane().add(label);
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JPanel Panel=new JPanel();
	wenjuan5.frm.getContentPane().add(Panel);
	Panel.setBounds(0, 0, 120, 50);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnyes = new JButton("ȷ��");
	ButtonHandlerhandinyes5 btnHandlerthandinyes = new ButtonHandlerhandinyes5();
	btnyes.addActionListener(btnHandlerthandinyes); 	
	Panel.add(btnyes);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnno = new JButton("ȡ��");
	ButtonHandlerhandinno5 btnHandlerhandinno = new ButtonHandlerhandinno5();
	btnno.addActionListener(btnHandlerhandinno); 	
	Panel.add(btnno);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	wenjuan5.frm.setBounds(600, 400, 280,110);
	wenjuan5.frm.setVisible(true);
}
}
class ButtonHandlerhandinyes5 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan5.frm.setVisible(false);
		wenjuan5.frmwenjuan5.setVisible(false);
		jiemian.frm.setVisible(true);
		System.out.println("�ύ�𰸣���");
	}
}
class ButtonHandlerhandinno5 implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		wenjuan5.frm.setVisible(false);
		System.out.println("û���ύ�𰸣���");
	}
}

