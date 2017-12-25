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
public class wenjuan1 {
	static JFrame frmwenjuan1 = new JFrame();
	static JFrame frmtongji1 = new JFrame();
	static int []answer= {1,0,0,0,0,0,0};
	static int i=1;
	static int numberofzero=0;
    static int numberofzeroreal=0;
	static JLabel numbercount=new JLabel("当前的题目：第"+i+"题（"+i+"/6)");
	static String wenjuan1neirong="十九大开幕是在几月几号?";
	static String question1="2017年10月18日";
	static String question2="2017年11月18日";
	static String question3="2017年10月8日";
	static String question4="2017年10月1日";
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
		frmwenjuan1.setTitle("问卷1：十九大开幕问卷调查");
		frmwenjuan1.setLayout(null);
		frmwenjuan1.setBounds(700, 300, 500, 500);
		Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
		frmwenjuan1.setIconImage(icon);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel leftPanel=new JPanel();
		frmwenjuan1.getContentPane().add(leftPanel);
		leftPanel.setBounds(-5, 0, 100, 50);
		JPanel rightPanel=new JPanel();
		frmwenjuan1.getContentPane().add(rightPanel);
		rightPanel.setBounds(390, 0, 100, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnleft = new JButton("上一题");
		ButtonHandlerleft btnHandlerleft = new ButtonHandlerleft();
		btnleft.addActionListener(btnHandlerleft); 	
		leftPanel.add(btnleft);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JButton btnright = new JButton("下一题");
		ButtonHandlerright btnHandlerright = new ButtonHandlerright();
		btnright.addActionListener(btnHandlerright); 	
		rightPanel.add(btnright);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel buttomPanel=new JPanel();
		frmwenjuan1.getContentPane().add(buttomPanel);
		buttomPanel.setBounds(0, 423, 100, 50);
		JButton btnhandin = new JButton("提交答案");
		ButtonHandlerhandin btnHandlerhandin = new ButtonHandlerhandin();
		btnhandin.addActionListener(btnHandlerhandin); 	
		buttomPanel.add(btnhandin);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		text.setText(wenjuan1neirong);
		text.setHorizontalAlignment(JTextField.CENTER);
		text.setBounds(50,50,400,100);
		text.setEditable(false);
		frmwenjuan1.getContentPane().add(text);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel exitPanel=new JPanel();
		frmwenjuan1.getContentPane().add(exitPanel);
		exitPanel.setBounds(384, 423, 100, 50);
		JButton btnreturn = new JButton("返回标题");
		ButtonHandlerreturn btnHandlerreturn = new ButtonHandlerreturn();
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
		frmwenjuan1.getContentPane().add(chosen1);
		frmwenjuan1.getContentPane().add(chosen2);
		frmwenjuan1.getContentPane().add(chosen3);
		frmwenjuan1.getContentPane().add(chosen4);
		frmwenjuan1.getContentPane().add(chosen5);
		chosen1.setBounds(50, 150, 300, 50);
		chosen2.setBounds(50, 200, 300, 50);
		chosen3.setBounds(50, 250, 300, 50);
		chosen4.setBounds(50, 300, 300, 50);
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		numbercount.setBounds(167,0,300,40);
		frmwenjuan1.add(numbercount);
		frmwenjuan1.setVisible(true);
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
		String wenjuan1neirong="十九大开幕是在几月几号?";text.setText(wenjuan1neirong);
		question1="2017年10月18日";wenjuan1.chosen1.setText(question1);
		question2="2017年11月18日";wenjuan1.chosen2.setText(question2);
		question3="2017年10月8日";wenjuan1.chosen3.setText(question3);
		question4="2017年10月1日";wenjuan1.chosen4.setText(question4);
	}
	static void q2()
	{
		String wenjuan1neirong="十九大是在哪里开幕的?";text.setText(wenjuan1neirong);
		question1="人民大会堂";wenjuan1.chosen1.setText(question1);
		question2="鸟巢";wenjuan1.chosen2.setText(question2);
		question3="人民广场";wenjuan1.chosen3.setText(question3);
		question4="上海理工大学";wenjuan1.chosen4.setText(question4);
	}
	static void q3()
	{
		String wenjuan1neirong="十九大将要在哪座城市开幕?";text.setText(wenjuan1neirong);
		question1="北京";wenjuan1.chosen1.setText(question1);
		question2="上海";wenjuan1.chosen2.setText(question2);
		question3="延安";wenjuan1.chosen3.setText(question3);
		question4="香港";wenjuan1.chosen4.setText(question4);
	}
	static void q4()
	{
		String wenjuan1neirong="你支持十九大开幕吗？?";text.setText(wenjuan1neirong);
		question1="支持";wenjuan1.chosen1.setText(question1);
		question2="不支持";wenjuan1.chosen2.setText(question2);
		question3="不知道";wenjuan1.chosen3.setText(question3);
		question4="无所谓";wenjuan1.chosen4.setText(question4);
	}
	static void q5()
	{
		String wenjuan1neirong="十九大在几月几号闭幕?";text.setText(wenjuan1neirong);
		question1="2017年10月24日";wenjuan1.chosen1.setText(question1);
		question2="2017年11月24日";wenjuan1.chosen2.setText(question2);
		question3="2017年10月2日";wenjuan1.chosen3.setText(question3);
		question4="2017年10月4日";wenjuan1.chosen4.setText(question4);
	}
	static void q6()
	{
		String wenjuan1neirong="你曾收看过十九大开幕式吗?";text.setText(wenjuan1neirong);
		question1="是";wenjuan1.chosen1.setText(question1);
		question2="否";wenjuan1.chosen2.setText(question2);
		question3="不知道";wenjuan1.chosen3.setText(question3);
		question4="无所谓";wenjuan1.chosen4.setText(question4);
	}
	static void save()
	{
		if (chosen1.isSelected()==true) {
			answer[wenjuan1.i]=1;
		}
		if (chosen2.isSelected()==true) {
			answer[wenjuan1.i]=2;
		}
		if (chosen3.isSelected()==true) {
			answer[wenjuan1.i]=3;
		}
		if (chosen4.isSelected()==true) {
			answer[wenjuan1.i]=4;
		}
		if (chosen5.isSelected()==true) {
			answer[wenjuan1.i]=0;
		}
		
	}
	static void load()
	{
		if (answer[wenjuan1.i]==1) {
			chosen1.setSelected(true);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan1.i]==2) {
			chosen1.setSelected(false);
			chosen2.setSelected(true);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan1.i]==3) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(true);
			chosen4.setSelected(false);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan1.i]==4) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(true);
			chosen5.setSelected(false);
		}
		if (answer[wenjuan1.i]==0) {
			chosen1.setSelected(false);
			chosen2.setSelected(false);
			chosen3.setSelected(false);
			chosen4.setSelected(false);
			chosen5.setSelected(true);
		}
	}
}
class ButtonHandlerleft implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
		wenjuan1.save();
		if ((wenjuan1.i)==1) wenjuan1.i=1;
		else wenjuan1.i--;
		wenjuan1.numbercount.setText("当前的题目：第"+wenjuan1.i+"题（"+wenjuan1.i+"/6)");
		wenjuan1.changetext();
		wenjuan1.load();
	}
}
class ButtonHandlerreturn implements ActionListener {
	public void actionPerformed(ActionEvent btn1) {
	    wenjuan1.frmwenjuan1.setVisible(false);
	    jiemian.frm.setVisible(true);
	}
}
class ButtonHandlerright implements ActionListener {
	public void actionPerformed(ActionEvent btn2) {
		wenjuan1.save();
		if ((wenjuan1.i)==6) wenjuan1.i=6;
		else wenjuan1.i++;
		wenjuan1.numbercount.setText("当前的题目：第"+wenjuan1.i+"题（"+wenjuan1.i+"/6)");
		wenjuan1.changetext();
		wenjuan1.load();
	}
}
class ButtonHandlerhandin implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan1.save();
		int c=1;
		for (c=1;c<7;c++)
		{
			if (wenjuan1.answer[c]==0) wenjuan1.numberofzero++;
		}
		wenjuan1.numberofzeroreal=wenjuan1.numberofzero;
		wenjuan1.numberofzero=0;
		tishi();
	}
static void tishi()
{
	
	wenjuan1.frm.setTitle("注意!");
	FlowLayout flowlayout = new FlowLayout();
	wenjuan1.frm.setLayout(flowlayout);
	Image icon = Toolkit.getDefaultToolkit().getImage("picture.png");
	wenjuan1.frm.setIconImage(icon);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JLabel label=new JLabel();
	if (wenjuan1.numberofzeroreal!=0)
	{label.setText("您有"+wenjuan1.numberofzeroreal+"个问题尚未回答，确定要提交吗？");}
	else {label.setText("您已回答完全部问题，确定要提交吗？");}
	wenjuan1.frm.getContentPane().add(label);
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JPanel Panel=new JPanel();
	wenjuan1.frm.getContentPane().add(Panel);
	Panel.setBounds(0, 0, 120, 50);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnyes = new JButton("确定");
	ButtonHandlerhandinyes btnHandlerthandinyes = new ButtonHandlerhandinyes();
	btnyes.addActionListener(btnHandlerthandinyes); 	
	Panel.add(btnyes);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	JButton btnno = new JButton("取消");
	ButtonHandlerhandinno btnHandlerhandinno = new ButtonHandlerhandinno();
	btnno.addActionListener(btnHandlerhandinno); 	
	Panel.add(btnno);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	wenjuan1.frm.setBounds(600, 400, 280,110);
	wenjuan1.frm.setVisible(true);
}
}
class ButtonHandlerhandinyes implements ActionListener {
	public void actionPerformed(ActionEvent btn3) {
		wenjuan1.frm.setVisible(false);
		wenjuan1.frmwenjuan1.setVisible(false);
		jiemian.frm.setVisible(true);
		int a;
		for(a=0;a<6;a++)
		{int b=a+1;jiemian.data[0][a][wenjuan1.answer[a]]=jiemian.data[0][a][wenjuan1.answer[a]]+1;}
		System.out.println("提交答案！！");
	}
}
class ButtonHandlerhandinno implements ActionListener {
	public void actionPerformed(ActionEvent btn4) {
		wenjuan1.frm.setVisible(false);
		System.out.println("没有提交答案！！");
	}
}



