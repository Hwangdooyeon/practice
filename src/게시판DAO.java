import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 게시판DAO {
//member 테이블에 crud를 하고 싶으면 MemberDAO를 사용하면 됨
	// DAO : db acess object
	// db에 접근해서 처리하는 객체

	public void delete(int no) {
		// java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터,driver,드라이버) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");
			String sql = "delete from bbs where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. sql문 생성 성공!!");

			ps.execute();
			System.out.println("4.sql문 생성 겅공");
			// URL site = new URL(site);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!");
		}

	}

	public void insert(String title, String content, String writer) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");


			String sql = "insert into bbs values(null,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			System.out.println("3. sql문 생성 성공!!");

			ps.execute();
			System.out.println("4.sql문 생성 겅공");
			// URL site = new URL(site);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!");
		}

	}
	public void update(String title, String content, int no) {
		// java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터,driver,드라이버) 설정
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.커넥터 연결 성공");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");


			String sql = "update bbs set title = ?, content = ? where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, no);
			System.out.println("3. sql문 생성 성공!!");

			ps.execute();
			System.out.println("4.sql문 생성 겅공");
			// URL site = new URL(site);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!");
		}
	}
}
