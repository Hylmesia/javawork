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
public class wenjuan4 {
	static JFrame frmwenjuan4 = new JFrame();
	static JFrame frmtongji1 = new JFrame();
	static int []answer= {1,0,0,0,0,0,0};
	static int i=1;
	static int numberofzero=0;
	static int numberofzeroreal=0;
	static JLabel numbercount=new JLabel("��ǰ����Ŀ����"+i+"�⣨"+i+"/6)");
	static String wenjuan1neirong="���java�����˽���?";
	static String question1="��";
	static String question2="��";
	static String question3="��֪��";
	static String question4="����ν";
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
		frmwenjuan4.setTitle("�ʾ�4�����ѧ��java��");
		frmwenjuan4.setLayout(null);
		frmwenjuan4.setBounds(700, 300, 500, 500);
		Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
		frmwenjuan4.setIconImage(icon);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel leftPanel=new JPanel();
		frmwenjuan4.getContentPane().add(leftPanel);
		leftPanel.setBounds(-5, 0, 100, 50);
		JPanel rightPanel=new JPanel();
		frmwenjuan4.getContentPane().add(rightPanel);
		rightPanel.setBounds(390, 0, 100, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnleft = new JButton("��һ��");
		ButtonHandlerleft4 btnHandlerleft = new ButtonHandlerleft4();
		btnleft.addActionListener(btnHandlerleft); 	
		leftPanel.add(btnleft);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnright = new JButton("��һ��");
		ButtonHandlerright4 btnHandlerright = new ButtonHandlerright4();
		btnright.addActionListener(btnHandlerright); 	
		rightPanel.add(btnright);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel buttomPanel=new JPanel();
		frmwenjuan4.getContentPane().add(buttomPanel);
		buttomPanel.setBounds(0, 423, 100, 50);
		JButton btnhandin = new JButton("�ύ��");
		ButtonHandlerhandin4 btnHandlerhandin = new ButtonHandlerhandin4();
		btnhandin.addActionListener(btnHandlerhandin); 	
		buttomPanel.add(btnhandin);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		text.setText(wenjuan1neirong);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(50,50,400,100);
		text.setEditable(false);
		frmwenjuan4.getContentPane().add(text);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel exitPanel=new JPanel();
		frmwenjuan4.getContentPane().add(exitPanel);
		exitPanel.setBounds(384, 423, 100, 50);
		JButton btnreturn = new JButton("���ر���");
		ButtonHandlerreturn4 btnHandlerreturn = new ButtonHandlerreturn4();
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
		frmwenjuan4.getContentPane().add(chosen1);
		frmwenjuan4.getContentPane().add(chosen2);
		frmwenjuan4.getContentPane().add(chosen3);
		frmwenjuan4.getContentPane().add(chosen4);
		frmwenjuan4.getContentPane().add(chosen5);
		chosen1.setBounds(50, 150, 300, 50);
		chosen2.setBounds(50, 200, 300, 50);
		chosen3.setBounds(50, 250, 300, 50);
		chosen4.setBounds(50, 300, 300, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		numbercount.setBounds(167,0,300,40);
		frmwenjuan4.add(numbercount);
		frmwenjuan4.setVisible(true);
	}
	static void changetext()
	{
		switch(i)
		{
		case 1:{q1();break;}
		case 2:{q2();break;}
		case 3:{q3();break;}
		case 4:{q4();break;}
		case 5:{q5();break;}
		case 6:{q6();break;}
		default:break;
		}

	}
	static void q1()
	{
		String wenjuan1neirong="���java�����˽���??";text.setText(wenjuan1neirong);
		question1="��";wenjuan4.chosen1.setText(question1);
		question2="��";wenjuan4.chosen2.setText(question2);
		question3="��֪��";wenjuan4.chosen3.setText(question3);
		question4="����ν";wenjuan4.chosen4.setText(question4);
	}
	static void q2()
	{
		String wenjuan1neirong="��ϲ��java��";text.setText(wenjuan1neirong);
		question1="��";wenjuan4.chosen1.setText(question1);
		question2="��";wenjuan4.chosen2.setText(question2);
		question3="��֪��";wenjuan4.chosen3.setText(question3);
		question4="����ν";wenjuan4.chosen4.setText(question4);
	}
	static void q3()
	{
		String wenjuan1neirong="����ΪΪ��ѧ��java������Ӧ����";text.setText(wenjuan1neirong);
		question1="�����Ϻ�����ѧ�Ļ�����ʦѧϰ";wenjuan4.chosen1.setText(question1);
		question2="�������Ϻ�����ѧ�Ļ�����ʦѧϰ";wenjuan4.chosen2.setText(question2);
		question3="��֪��";wenjuan4.chosen3.setText(question3);
		question4="����ν";wenjuan4.chosen4.setText(question4);
	}
	static void q4()
	{
		String wenjuan1neirong="����˵����java����������ıر����ߡ�������ͬ��";text.setText(wenjuan1neirong);
		question1="��";wenjuan4.chosen1.setText(question1);
		question2="��";wenjuan4.chosen2.setText(question2);
		question3="��֪��";wenjuan4.chosen3.setText(question3);
		question4="����ν";wenjuan4.chosen4.setText(question4);
	}
	static void q5()
	{
		String wenjuan1neirong="�ڻ�����ʦ�����ν̵��£����javaѧϰ����";text.setText(wenjuan1neirong);
		question1="�кܴ����";wenjuan4.chosen1.setText(question1);
		question2="�кܴ�ɹ�";wenjuan4.chosen2.setText(question2);
		question3="�кܴ��ջ�";wenjuan4.chosen3.setText(question3);
		question4="�кܴ����";wenjuan4.chosen4.setText(question4);
	}
	static void q6()
	{
		String wenjuan1neirong="����ڽ�������java��ѧϰ��";text.setText(wenjuan1neirong);
		question1="��";wenjuan4.chosen1.setText(question1);
		question2="��";wenjuan4.chosen2.setText(question2);
		question3="��֪��";wenjuan4.chosen3.setText(question3);
		question4="����ν";wenjuan4.chosen4.setText(question4);
	}
	static void save()
	{
		if (chosen1.isSelected()==true) {
			answer[wenjuan4.i]=1;
		}
		if (chosen2.isSelected()==true) {
			answer[wenjuan4.i]=2;
		}
		if (chosen3.isSelected()==true) {
			answer[wenjuan4.i]=3;
		}
		if (chosen4.isSelected()==true) {
			answer[wenjuan4.i]=4;
		}
		if (chosen5.isSelected()==true) {
			answer[wenjuan4.i]=0;
		}
		
	}
	static void load()
	{
		if (answer[wenjuan4.i]==1) {
			chosen1.setSelected(true);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan4.i]==2) {
			chosen1.setSelected(false);
			chosen2.setSelected(true);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan4.i]==3) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(true);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan4.i]==4) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(true);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan4.i]==0) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(true);
		}
	}
}
class ButtonHandlerleft4 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		wenjuan4.save();
		if ((wenjuan4.i)==1) wenjuan4.i=1;
		else wenjuan4.i--;
		wenjuan4.numbercount.setText("��ǰ����Ŀ����"+wenjuan4.i+"�⣨"+wenjuan4.i+"/6)");
		wenjuan4.changetext();
		wenjuan4.load();
	}
}
class ButtonHandlerreturn4 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
	    wenjuan4.frmwenjuan4.setVisible(false);
	    jiemian.frm.setVisible(true);
	}
}
class ButtonHandlerright4 implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		wenjuan4.save();
		if ((wenjuan4.i)==6) wenjuan4.i=6;
		else wenjuan4.i++;
		wenjuan4.numbercount.setText("��ǰ����Ŀ����"+wenjuan4.i+"�⣨"+wenjuan4.i+"/6)");
		wenjuan4.changetext();
		wenjuan4.load();
	}
}
class ButtonHandlerhandin4 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan4.save();
		int c=1;
		for (c=1;c<7;c++)
		{
			if (wenjuan4.answer[c]==0) wenjuan4.numberofzero++;
		}
		wenjuan4.numberofzeroreal=wenjuan4.numberofzero;
		wenjuan4.numberofzero=0;
		tishi();
	}
static void tishi()
{
	
	wenjuan4.frm.setTitle("ע��!");
	FlowLayout flowlayout = new FlowLayout();
	wenjuan4.frm.setLayout(flowlayout);
	Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
	wenjuan4.frm.setIconImage(icon);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JLabel label=new JLabel();
	if (wenjuan4.numberofzeroreal!=0)
	{label.setText("����"+wenjuan4.numberofzeroreal+"��������δ�ش�ȷ��Ҫ�ύ��");}
	else {label.setText("���ѻش���ȫ�����⣬ȷ��Ҫ�ύ��");}
	wenjuan4.frm.getContentPane().add(label);
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JPanel Panel=new JPanel();
	wenjuan4.frm.getContentPane().add(Panel);
	Panel.setBounds(0, 0, 120, 50);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnyes = new JButton("ȷ��");
	ButtonHandlerhandinyes4 btnHandlerthandinyes = new ButtonHandlerhandinyes4();
	btnyes.addActionListener(btnHandlerthandinyes); 	
	Panel.add(btnyes);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnno = new JButton("ȡ��");
	ButtonHandlerhandinno4 btnHandlerhandinno = new ButtonHandlerhandinno4();
	btnno.addActionListener(btnHandlerhandinno); 	
	Panel.add(btnno);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	wenjuan4.frm.setBounds(600, 400, 280,110);
	wenjuan4.frm.setVisible(true);
}
}
class ButtonHandlerhandinyes4 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan4.frm.setVisible(false);
		wenjuan4.frmwenjuan4.setVisible(false);
		jiemian.frm.setVisible(true);
		System.out.println("�ύ�𰸣���");
	}
}
class ButtonHandlerhandinno4 implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		wenjuan4.frm.setVisible(false);
		System.out.println("û���ύ�𰸣���");
	}
}

