package main;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
    System.out.println("请输入问卷的问题数：");
    Scanner inputnum = new Scanner(System.in);
    int number = inputnum.nextInt();
    System.out.println("请输入该问题的标题:\n");
	Scanner inputtop = new Scanner(System.in);
	String topic = inputtop.next();
	wenjuan a=new wenjuan(number,topic);
    a.wenjuanwentishuru();
}
	
	
}