import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import db연결.MemberDAO;
import 나의게시판.BbsDAO;

public class 나의게시판UI {

	public static void main(String[] args) {
		// 필요한 부품들을 ram에 가져다 놓아야 한다.
		
		// 1.JFrame
		JFrame f = new JFrame();
		f.setSize(400, 700);
		f.setTitle("게시판");
		f.getContentPane().setBackground(Color.green);;
		// 2.FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //조립
		// 3.JLabel 5개
		JLabel l1 = new JLabel("------나의 게시판------");
		JLabel l2 = new JLabel("게시판 제목 :");
		JLabel l3 = new JLabel("게시판 내용:");
		JLabel l4 = new JLabel("게시판 작성자:");
	
		// 4.JTextfield 4개
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		// 5.JButton 2개
		JButton b1 = new JButton("게시물 쓰기 요청");
		b1.setBackground(Color.yellow);
		JButton b2 = new JButton("게시물 삭제 요청");
		b2.setBackground(Color.red);
		JButton b3 = new JButton("게시물 수정 요청");
		b3.setBackground(Color.blue);
	
		
	
		Font font = new Font("맑은 고딕",Font.BOLD,30);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
	
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		Font font2 = new Font("맑은 고딕",Font.BOLD,30);
		
		f.add(l1); //이미지
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);//회원 ID: 
		f.add(l4);
		f.add(t3);//
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b1을 클릭했을 때 처리 내용을 넣어줌.
				//1. 입력한 값을 가지고 온다.
				//bbsDAO를 이용하자.
				//입력한 정보를 주면서 bbsDAO의 isert()요청
				
				String title = t1.getText();
				String content = t2.getText();
				String writer = t3.getText();
				
				BbsDAO dao = new BbsDAO();
				dao.insert(title, content, writer);
			}
		});
		// 6.font
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//탈퇴할 id를 입력받으세요.
				String no = JOptionPane.showInputDialog("삭제할 게시판 No입력");
				BbsDAO dao = new BbsDAO();
				dao.delete(Integer.parseInt(no));
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b3을 눌렀을때 처리내용을 코딩
				String no = JOptionPane.showInputDialog("수정할 no");
				String title = t1.getText();
				String content = t2.getText();
				
				BbsDAO dao = new BbsDAO();
				dao.update(title, content, Integer.parseInt(no));
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
