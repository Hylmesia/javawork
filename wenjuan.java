package main;

import java.util.Scanner;

class wenjuan
{
	private String itswt;
	private int itswn;
	private question q[];
	wenjuan(int wn,String wt)
	{
		itswn=wn;
		itswt=wt;
		question[] q = new question[itswn];
		
	}
    public void wenjuanplay()
    {
    	System.out.println(itswt);
    	
    	
    }

    public void wenjuanwentishuru()
    {
    	int i;
    	for(i=0;i<itswn;i++)
    	{
    		System.out.println("�������"+(i+1)+"������:\n");
    		Scanner input = new Scanner(System.in);
    	    String impor = input.next();
    		q[i]=new question(impor);
    	}
    	
    	
    }   
    //private question question(String impor) {
	//return question(impor);
	
	class question
    {
    	question(String q)
    	{
    		itsq=q;

    	}
        private String itsq,q1,q2,q3,q4;
        
        public void questionshow()
        {
        	System.out.println(itsq);
        	System.out.println(q1);
        	System.out.println(q2);
        	System.out.println(q3);
        	System.out.println(q4);
        }


        public void xuanxiangshuru() {
        	
        	System.out.println("�����������ĵ�1��ѡ��:\n");
        	Scanner input1 = new Scanner(System.in);
        	String q1 = input1.next();
        	System.out.println("�����������ĵ�2��ѡ��:\n");
        	Scanner input2 = new Scanner(System.in);
        	String q2 = input2.next();
        	System.out.println("�����������ĵ�3��ѡ��:\n");
        	Scanner input3 = new Scanner(System.in);
        	String q3 = input3.next();
        	System.out.println("�����������ĵ�4��ѡ��:\n");
        	Scanner input4 = new Scanner(System.in);
        	String q4 = input4.next();
        	
       


    }
    }
}
