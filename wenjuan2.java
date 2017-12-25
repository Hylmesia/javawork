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
public class wenjuan2 {
	static JFrame frmwenjuan2 = new JFrame();
	static JFrame frmtongji1 = new JFrame();
	static int []answer= {1,0,0,0,0,0,0};
	static int i=1;
	static int numberofzero=0;
	static int numberofzeroreal=0;
	static JLabel numbercount=new JLabel("当前的题目：第"+i+"题（"+i+"/6)");
	static String wenjuan1neirong="今年是上海理工大学建校第几周年?";
	static String question1="11";
	static String question2="110";
	static String question3="10";
	static String question4="111";
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
		frmwenjuan2.setTitle("问卷2：上海理工大学百十华诞知多少");
		frmwenjuan2.setLayout(null);
		frmwenjuan2.setBounds(700, 300, 500, 500);
		Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
		frmwenjuan2.setIconImage(icon);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel leftPanel=new JPanel();
		frmwenjuan2.getContentPane().add(leftPanel);
		leftPanel.setBounds(-5, 0, 100, 50);
		JPanel rightPanel=new JPanel();
		frmwenjuan2.getContentPane().add(rightPanel);
		rightPanel.setBounds(390, 0, 100, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnleft = new JButton("上一题");
		ButtonHandlerleft2 btnHandlerleft = new ButtonHandlerleft2();
		btnleft.addActionListener(btnHandlerleft); 	
		leftPanel.add(btnleft);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnright = new JButton("下一题");
		ButtonHandlerright2 btnHandlerright = new ButtonHandlerright2();
		btnright.addActionListener(btnHandlerright); 	
		rightPanel.add(btnright);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel buttomPanel=new JPanel();
		frmwenjuan2.getContentPane().add(buttomPanel);
		buttomPanel.setBounds(0, 423, 100, 50);
		JButton btnhandin = new JButton("提交答案");
		ButtonHandlerhandin2 btnHandlerhandin = new ButtonHandlerhandin2();
		btnhandin.addActionListener(btnHandlerhandin); 	
		buttomPanel.add(btnhandin);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		text.setText(wenjuan1neirong);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(50,50,400,100);
		text.setEditable(false);
		frmwenjuan2.getContentPane().add(text);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel exitPanel=new JPanel();
		frmwenjuan2.getContentPane().add(exitPanel);
		exitPanel.setBounds(384, 423, 100, 50);
		JButton btnreturn = new JButton("返回标题");
		ButtonHandlerreturn2 btnHandlerreturn = new ButtonHandlerreturn2();
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
		frmwenjuan2.getContentPane().add(chosen1);
		frmwenjuan2.getContentPane().add(chosen2);
		frmwenjuan2.getContentPane().add(chosen3);
		frmwenjuan2.getContentPane().add(chosen4);
		frmwenjuan2.getContentPane().add(chosen5);
		chosen1.setBounds(50, 150, 300, 50);
		chosen2.setBounds(50, 200, 300, 50);
		chosen3.setBounds(50, 250, 300, 50);
		chosen4.setBounds(50, 300, 300, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		numbercount.setBounds(167,0,300,40);
		frmwenjuan2.add(numbercount);
		frmwenjuan2.setVisible(true);
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
		String wenjuan1neirong="今年是上海理工大学建校第几周年?";text.setText(wenjuan1neirong);
		question1="11";wenjuan2.chosen1.setText(question1);
		question2="110";wenjuan2.chosen2.setText(question2);
		question3="10";wenjuan2.chosen3.setText(question3);
		question4="111";wenjuan2.chosen4.setText(question4);
	}
	static void q2()
	{
		String wenjuan1neirong="上海理工大学是不是一所历史悠久的学校？";text.setText(wenjuan1neirong);
		question1="是";wenjuan2.chosen1.setText(question1);
		question2="否";wenjuan2.chosen2.setText(question2);
		question3="不知道";wenjuan2.chosen3.setText(question3);
		question4="无所谓";wenjuan2.chosen4.setText(question4);
	}
	static void q3()
	{
		String wenjuan1neirong="你热爱上海理工大学吗？";text.setText(wenjuan1neirong);
		question1="是";wenjuan2.chosen1.setText(question1);
		question2="否";wenjuan2.chosen2.setText(question2);
		question3="不知道";wenjuan2.chosen3.setText(question3);
		question4="无所谓";wenjuan2.chosen4.setText(question4);
	}
	static void q4()
	{
		String wenjuan1neirong="上海理工大学的现任校长存在吗？";text.setText(wenjuan1neirong);
		question1="是";wenjuan2.chosen1.setText(question1);
		question2="否";wenjuan2.chosen2.setText(question2);
		question3="不知道";wenjuan2.chosen3.setText(question3);
		question4="无所谓";wenjuan2.chosen4.setText(question4);
	}
	static void q5()
	{
		String wenjuan1neirong="上海理工大学第一任华人校长是？";text.setText(wenjuan1neirong);
		question1="刘湛恩";wenjuan2.chosen1.setText(question1);
		question2="刘伯承";wenjuan2.chosen2.setText(question2);
		question3="燕爽";wenjuan2.chosen3.setText(question3);
		question4="刘恩湛";wenjuan2.chosen4.setText(question4);
	}
	static void q6()
	{
		String wenjuan1neirong="我们为了更好的建设上海理工大学，我们不能？";text.setText(wenjuan1neirong);
		question1="努力学习";wenjuan2.chosen1.setText(question1);
		question2="勤思苦学";wenjuan2.chosen2.setText(question2);
		question3="为校效力";wenjuan2.chosen3.setText(question3);
		question4="无所事事";wenjuan2.chosen4.setText(question4);
	}
	static void save()
	{
		if (chosen1.isSelected()==true) {
			answer[wenjuan2.i]=1;
		}
		if (chosen2.isSelected()==true) {
			answer[wenjuan2.i]=2;
		}
		if (chosen3.isSelected()==true) {
			answer[wenjuan2.i]=3;
		}
		if (chosen4.isSelected()==true) {
			answer[wenjuan2.i]=4;
		}
		if (chosen5.isSelected()==true) {
			answer[wenjuan2.i]=0;
		}
		
	}
	static void load()
	{
		if (answer[wenjuan2.i]==1) {
			chosen1.setSelected(true);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan2.i]==2) {
			chosen1.setSelected(false);
			chosen2.setSelected(true);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan2.i]==3) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(true);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan2.i]==4) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(true);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan2.i]==0) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(true);
		}
	}
}
class ButtonHandlerleft2 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		wenjuan2.save();
		if ((wenjuan2.i)==1) wenjuan2.i=1;
		else wenjuan2.i--;
		wenjuan2.numbercount.setText("当前的题目：第"+wenjuan2.i+"题（"+wenjuan2.i+"/6)");
		wenjuan2.changetext();
		wenjuan2.load();
	}
}
class ButtonHandlerreturn2 implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
	    wenjuan2.frmwenjuan2.setVisible(false);
	    jiemian.frm.setVisible(true);
	}
}
class ButtonHandlerright2 implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		wenjuan2.save();
		if ((wenjuan2.i)==6) wenjuan2.i=6;
		else wenjuan2.i++;
		wenjuan2.numbercount.setText("当前的题目：第"+wenjuan2.i+"题（"+wenjuan2.i+"/6)");
		wenjuan2.changetext();
		wenjuan2.load();
	}
}
class ButtonHandlerhandin2 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan2.save();
		int c=1;
		for (c=1;c<7;c++)
		{
			if (wenjuan2.answer[c]==0) wenjuan2.numberofzero++;
		}
		wenjuan2.numberofzeroreal=wenjuan2.numberofzero;
		wenjuan2.numberofzero=0;
		tishi();
	}
static void tishi()
{
	
	wenjuan2.frm.setTitle("注意!");
	FlowLayout flowlayout = new FlowLayout();
	wenjuan2.frm.setLayout(flowlayout);
	Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
	wenjuan2.frm.setIconImage(icon);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JLabel label=new JLabel();
	if (wenjuan2.numberofzeroreal!=0)
	{label.setText("您有"+wenjuan2.numberofzeroreal+"个问题尚未回答，确定要提交吗？");}
	else {label.setText("您已回答完全部问题，确定要提交吗？");}
	wenjuan2.frm.getContentPane().add(label);
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JPanel Panel=new JPanel();
	wenjuan2.frm.getContentPane().add(Panel);
	Panel.setBounds(0, 0, 120, 50);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnyes = new JButton("确定");
	ButtonHandlerhandinyes2 btnHandlerthandinyes = new ButtonHandlerhandinyes2();
	btnyes.addActionListener(btnHandlerthandinyes); 	
	Panel.add(btnyes);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnno = new JButton("取消");
	ButtonHandlerhandinno2 btnHandlerhandinno = new ButtonHandlerhandinno2();
	btnno.addActionListener(btnHandlerhandinno); 	
	Panel.add(btnno);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	wenjuan2.frm.setBounds(600, 400, 280,110);
	wenjuan2.frm.setVisible(true);
}
}
class ButtonHandlerhandinyes2 implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan2.frm.setVisible(false);
		wenjuan2.frmwenjuan2.setVisible(false);
		jiemian.frm.setVisible(true);
		System.out.println("提交答案！！");
	}
}
class ButtonHandlerhandinno2 implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		wenjuan2.frm.setVisible(false);
		System.out.println("没有提交答案！！");
	}
}


