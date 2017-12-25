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
public class wenjuan3 {
	static JFrame frmwenjuan3 = new JFrame();
	static JFrame frmtongji1 = new JFrame();
	static int []answer= {1,0,0,0,0,0,0};
	static int i=1;
	static int numberofzero=0;
	static int numberofzeroreal=0;
	static JLabel numbercount=new JLabel("当前的题目：第"+i+"题（"+i+"/6)");
	static String wenjuan1neirong="你们寝室有空调吗？";
	static String question1="是";
	static String question2="否";
	static String question3="不知道";
	static String question4="无所谓";
	static JFrame frm = new JFrame();
	static JRadioButton chosen1 = new JRadioButton(question1);
	static JRadioButton chosen2 = new JRadioButton(question2);
	static JRadioButton chosen3 = new JRadioButton(question3);
	static JRadioButton chosen4 = new JRadioButton(question4);
	static JRadioButton chosen5 = new JRadioButton("");
	static JTextField text=new JTextField();
	public static void shujutongji()
	{
		frmtongji1.setTitle("数据统计");
		FlowLayout flowlayout = new FlowLayout();
		wenjuan1.frmtongji1.setLayout(flowlayout);
		String data="问题数              选项1    选项2    选项3    选项4 ";
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
		frmwenjuan3.setTitle("问卷3：上海理工大学空调问题问卷调查");
		frmwenjuan3.setLayout(null);
		frmwenjuan3.setBounds(700, 300, 500, 500);
		Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
		frmwenjuan3.setIconImage(icon);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel leftPanel=new JPanel();
		frmwenjuan3.getContentPane().add(leftPanel);
		leftPanel.setBounds(-5, 0, 100, 50);
		JPanel rightPanel=new JPanel();
		frmwenjuan3.getContentPane().add(rightPanel);
		rightPanel.setBounds(390, 0, 100, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnleft = new JButton("上一题");
		ButtonHandlerleft3 btnHandlerleft = new ButtonHandlerleft3();
		btnleft.addActionListener(btnHandlerleft); 	
		leftPanel.add(btnleft);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnright = new JButton("下一题");
		ButtonHandlerright3 btnHandlerright = new ButtonHandlerright3();
		btnright.addActionListener(btnHandlerright); 	
		rightPanel.add(btnright);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel buttomPanel=new JPanel();
		frmwenjuan3.getContentPane().add(buttomPanel);
		buttomPanel.setBounds(0, 423, 100, 50);
		JButton btnhandin = new JButton("提交答案");
		ButtonHandlerhandin3 btnHandlerhandin = new ButtonHandlerhandin3();
		btnhandin.addActionListener(btnHandlerhandin); 	
		buttomPanel.add(btnhandin);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		text.setText(wenjuan1neirong);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(50,50,400,100);
		text.setEditable(false);
		frmwenjuan3.getContentPane().add(text);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel exitPanel=new JPanel();
		frmwenjuan3.getContentPane().add(exitPanel);
		exitPanel.setBounds(384, 423, 100, 50);
		JButton btnreturn = new JButton("返回标题");
		ButtonHandlerreturn3 btnHandlerreturn = new ButtonHandlerreturn3();
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
		frmwenjuan3.getContentPane().add(chosen1);
		frmwenjuan3.getContentPane().add(chosen2);
		frmwenjuan3.getContentPane().add(chosen3);
		frmwenjuan3.getContentPane().add(chosen4);
		frmwenjuan3.getContentPane().add(chosen5);
		chosen1.setBounds(50, 150, 300, 50);
		chosen2.setBounds(50, 200, 300, 50);
		chosen3.setBounds(50, 250, 300, 50);
		chosen4.setBounds(50, 300, 300, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		numbercount.setBounds(167,0,300,40);
		frmwenjuan3.add(numbercount);
		frmwenjuan3.setVisible(true);
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
		String wenjuan1neirong="你们寝室有空调吗?";text.setText(wenjuan1neirong);
		question1="是";wenjuan3.chosen1.setText(question1);
		question2="否";wenjuan3.chosen2.setText(question2);
		question3="不知道";wenjuan3.chosen3.setText(question3);
		question4="无所谓";wenjuan3.chosen4.setText(question4);
	}
	static void q2()
	{
		String wenjuan1neirong="你认为寝室里装空调是正确的决定吗？";text.setText(wenjuan1neirong);
		question1="是";wenjuan3.chosen1.setText(question1);
		question2="否";wenjuan3.chosen2.setText(question2);
		question3="不知道";wenjuan3.chosen3.setText(question3);
		question4="无所谓";wenjuan3.chosen4.setText(question4);
	}
	static void q3()
	{
		String wenjuan1neirong="你认为在寝室生活中空调是不可或缺的吗？";text.setText(wenjuan1neirong);
		question1="是";wenjuan3.chosen1.setText(question1);
		question2="否";wenjuan3.chosen2.setText(question2);
		question3="不知道";wenjuan3.chosen3.setText(question3);
		question4="无所谓";wenjuan3.chosen4.setText(question4);
	}
	static void q4()
	{
		String wenjuan1neirong="你认为什么价位的空调比较好？";text.setText(wenjuan1neirong);
		question1="1-1000";wenjuan3.chosen1.setText(question1);
		question2="1001-2000";wenjuan3.chosen2.setText(question2);
		question3="2001-3000";wenjuan3.chosen3.setText(question3);
		question4="3000+";wenjuan3.chosen4.setText(question4);
	}
	static void q5()
	{
		String wenjuan1neirong="你认为统一安装中央空调能接受吗？";text.setText(wenjuan1neirong);
		question1="是";wenjuan3.chosen1.setText(question1);
		question2="否";wenjuan3.chosen2.setText(question2);
		question3="不知道";wenjuan3.chosen3.setText(question3);
		question4="无所谓";wenjuan3.chosen4.setText(question4);
	}
	static void q6()
	{
		String wenjuan1neirong="我们需要爱惜空调吗？";text.setText(wenjuan1neirong);
		question1="是";wenjuan3.chosen1.setText(question1);
		question2="否";wenjuan3.chosen2.setText(question2);
		question3="不知道";wenjuan3.chosen3.setText(question3);
		question4="无所谓";wenjuan3.chosen4.setText(question4);
	}
	static void save()
	{
		if (chosen1.isSelected()==true) {
			answer[wenjuan3.i]=1;
		}
		if (chosen2.isSelected()==true) {
			answer[wenjuan3.i]=2;
		}
		if (chosen3.isSelected()==true) {
			answer[wenjuan3.i]=3;
		}
		if (chosen4.isSelected()==true) {
			answer[wenjuan3.i]=4;
		}
		if (chosen5.isSelected()==true) {
			answer[wenjuan3.i]=0;
		}
		
	}
	static void load()
	{
		if (answer[wenjuan3.i]==1) {
			chosen1.setSelected(true);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan3.i]==2) {
			chosen1.setSelected(false);
			chosen2.setSelected(true);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan3.i]==3) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(true);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan3.i]==4) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(true);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan3.i]==0) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(true);
		}
	}
}
class ButtonHandlerleft3 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		wenjuan3.save();
		if ((wenjuan3.i)==1) wenjuan3.i=1;
		else wenjuan3.i--;
		wenjuan3.numbercount.setText("当前的题目：第"+wenjuan3.i+"题（"+wenjuan3.i+"/6)");
		wenjuan3.changetext();
		wenjuan3.load();
	}
}
class ButtonHandlerreturn3 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
	    wenjuan3.frmwenjuan3.setVisible(false);
	    jiemian.frm.setVisible(true);
	}
}
class ButtonHandlerright3 implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		wenjuan3.save();
		if ((wenjuan3.i)==6) wenjuan3.i=6;
		else wenjuan3.i++;
		wenjuan3.numbercount.setText("当前的题目：第"+wenjuan3.i+"题（"+wenjuan3.i+"/6)");
		wenjuan3.changetext();
		wenjuan3.load();
	}
}
class ButtonHandlerhandin3 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan3.save();
		int c=1;
		for (c=1;c<7;c++)
		{
			if (wenjuan3.answer[c]==0) wenjuan3.numberofzero++;
		}
		wenjuan3.numberofzeroreal=wenjuan3.numberofzero;
		wenjuan3.numberofzero=0;
		tishi();
	}
static void tishi()
{
	
	wenjuan3.frm.setTitle("注意!");
	FlowLayout flowlayout = new FlowLayout();
	wenjuan3.frm.setLayout(flowlayout);
	Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
	wenjuan3.frm.setIconImage(icon);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JLabel label=new JLabel();
	if (wenjuan3.numberofzeroreal!=0)
	{label.setText("您有"+wenjuan3.numberofzeroreal+"个问题尚未回答，确定要提交吗？");}
	else {label.setText("您已回答完全部问题，确定要提交吗？");}
	wenjuan3.frm.getContentPane().add(label);
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JPanel Panel=new JPanel();
	wenjuan3.frm.getContentPane().add(Panel);
	Panel.setBounds(0, 0, 120, 50);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnyes = new JButton("确定");
	ButtonHandlerhandinyes3 btnHandlerthandinyes = new ButtonHandlerhandinyes3();
	btnyes.addActionListener(btnHandlerthandinyes); 	
	Panel.add(btnyes);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnno = new JButton("取消");
	ButtonHandlerhandinno3 btnHandlerhandinno = new ButtonHandlerhandinno3();
	btnno.addActionListener(btnHandlerhandinno); 	
	Panel.add(btnno);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	wenjuan3.frm.setBounds(600, 400, 280,110);
	wenjuan3.frm.setVisible(true);
}
}
class ButtonHandlerhandinyes3 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan3.frm.setVisible(false);
		wenjuan3.frmwenjuan3.setVisible(false);
		jiemian.frm.setVisible(true);
		System.out.println("提交答案！！");
	}
}
class ButtonHandlerhandinno3 implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		wenjuan3.frm.setVisible(false);
		System.out.println("没有提交答案！！");
	}
}


