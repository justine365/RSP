package D210418;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;



public class RSP extends JFrame{
	
	int x = (int)(Math.random()*3)+1;
	Container contentPane;
	JPanel nPanel = new JPanel();
	JPanel cPanel = new JPanel();
	JPanel sPanel = new JPanel();
	
	JLabel sla = new JLabel("1");
	JLabel me;
	JLabel AI;
	ImageIcon imageIconR = new ImageIcon("images/R.jpg");
	ImageIcon imageIconS = new ImageIcon("images/S.jpg");
	ImageIcon imageIconP = new ImageIcon("images/P.jpg");
	ImageIcon imageIconVS = new ImageIcon("images/vs.png");
	
	JButton[] btn = new JButton[3];
	
	RSP() {
		setTitle("RSP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		
		
		
		nPanel.setLayout(new GridLayout(1,1,20,20));
		cPanel.setLayout(new FlowLayout(1,170,45));
		sPanel.setLayout(new BorderLayout());
		
		
		sla.setBackground(Color.GREEN);
		btn[0] = new JButton("����");
		btn[0].addActionListener(new MyActionListener());
		btn[1] = new JButton("����");
		btn[1].addActionListener(new MyActionListener());
	
		btn[2] = new JButton("��");
		btn[2].addActionListener(new MyActionListener());
		
		JLabel la1 = new JLabel("����� ����");
		JLabel la2 = new JLabel("COMPUTER");
		JLabel label = new JLabel(imageIconVS);
		
		
		me = new JLabel("������");
		AI = new JLabel("������");
		
		
//		la.setBackground(Color.BLUE);		
//		la.setFont(font);
//		la.add(cPanel,BorderLayout.NORTH);
		
		
		
		
		
		
		
		/*
		contentPane.setBackground(Color.yellow);
		nPanel.setBackground(Color.yellow);
		cPanel.setBackground(Color.yellow);
		sPanel.setBackground(Color.yellow);
		*/
		sPanel.setBackground(Color.green);
		for(int i=0 ; i<=2 ; i++)
		{
			nPanel.add(btn[i]);
		}
		sPanel.add(sla);
		
		contentPane.add(nPanel,BorderLayout.NORTH);
		contentPane.add(cPanel,BorderLayout.CENTER);
		contentPane.add(sPanel,BorderLayout.SOUTH);
		
		cPanel.add(la1);
		cPanel.add(la2);
		cPanel.add(label);
		cPanel.add(me);
		cPanel.add(AI);
		
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RSP();
	}
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			System.out.print(b.getText());
			int a = 0;
			if(b.getText()=="����")
			{
				me.setIcon(imageIconS);
				a=Imagechange();
				Result("����",a);
			}
			else if(b.getText()=="����")
			{
				me.setIcon(imageIconR);
				a=Imagechange();
				Result("����",a);
			}
			else if(b.getText()=="��")
			{
				me.setIcon(imageIconP);
				a=Imagechange();
				Result("��",a);
			}
		}
	}
	int Imagechange(){
		    me.setText("");
		    AI.setText("");
			if(x==1)
			{
				AI.setIcon(imageIconR);
			}
			else if(x==2)
			{
				AI.setIcon(imageIconS);
			}
			else if(x==3)
			{
				AI.setIcon(imageIconP);
			}
			return x;
	}
	void Result(String b,int a)
	{
		if(b=="����"&&a==2 || b=="����"&&a==1 || b=="��"&&a==3)
		{
			sla.setText("���: �����ϴ�");
		}
		else if(b=="����"&&a==1 || b=="����"&&a==3 || b=="��"&&a==2)
		{
			sla.setText("���: ��! �����ϴ�");
		}
		if(b=="����"&&a==3 || b=="����"&&a==2 || b=="��"&&a==1)
		{
			sla.setText("���: WoW!�̰���ϴ�");
		}
	}
	
}
