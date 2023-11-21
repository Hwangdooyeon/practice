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

public class 회원정보UI {

	public static void main(String[] args) {
		// 필요한 부품들을 ram에 가져다 놓아야 한다.
		
		// 1.JFrame
		JFrame f = new JFrame();
		f.setSize(400, 600);
		f.setTitle("나의 회원정보UI");
		f.getContentPane().setBackground(Color.LIGHT_GRAY);;
		// 2.FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); //조립
		// 3.JLabel 5개
		JLabel l1 = new JLabel("이미지 들어갈곳");
		JLabel l2 = new JLabel("회원ID :");
		JLabel l3 = new JLabel("회원PW :");
		JLabel l4 = new JLabel("회원이름 :");
		JLabel l5 = new JLabel("회원TEL:");
		// 4.JTextfield 4개
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		// 5.JButton 2개
		JButton b1 = new JButton("회원가입 요청");
		b1.setBackground(Color.blue);
		JButton b2 = new JButton("회원탈퇴 요청");
		b2.setBackground(Color.blue);
		JButton b3 = new JButton("회원수정 요청");
		b3.setBackground(Color.blue);
		
		t1.setBackground(Color.orange);
		t2.setBackground(Color.orange);
		t3.setBackground(Color.orange);
		t4.setBackground(Color.orange);
		
		Font font = new Font("맑은 고딕",Font.BOLD,30);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		
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
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b1을 클릭했을 때 처리 내용을 넣어줌.
				//1. 입력한 값을 가지고 온다.
				String no = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();
				
				//2. db처리하는 부품을 사용

				MemberDAO dao = new MemberDAO();
				
							
				//3. db처리하는 부품에 입력한 값을 주면서 db해달라고 요청

				dao.insert(no, title, content, writer);
			}
		});
		// 6.font
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//탈퇴할 id를 입력받으세요.
				
				String id = JOptionPane.showInputDialog("탈퇴할 id를 입력하세요.");
				
				//DAO를 이용합니다.
				MemberDAO dao = new MemberDAO();
				
				dao.delete(id);
				//id를 전달하면서 delete() 요청

				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//b3을 눌렀을때 처리내용을 코딩

				String tel = JOptionPane.showInputDialog("수정할 전화번호를 입력하세요.");
				String id = JOptionPane.showInputDialog("수정할 id를 입력하세요.");
				
				MemberDAO dao = new MemberDAO();
				dao.update(tel, id);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
