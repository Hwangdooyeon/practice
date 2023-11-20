import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BbsDAO {
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
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setInt(1, no); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			ps.execute();
			System.out.println("4.sql문 생성 겅공");
			// URL site = new URL(site);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!");
		} // 패키지.대표클래스
			// 외부자원연결(db, network, cpu, file..)
			// 너무 위험한 상황이다 위험한 상황이 발생했을때 대처하는 방법 = try - catch

		// 2. 1번 설정된 커넥터로 db연결하고 승인
		// 1) url - ip + port +db명
		// 2) id,pw

		// 3. 2번에서 연결된 것을 가지고 sql문 생성
		// 4. 3번에서 생성된 sql문을 Mysql로 전송

	}

	public void insert(String title, String content, String writer) {
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

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			// 해당부품으로 만들어주어야 한다.
			// sql ==> preparedStatement
			// site ==> URL
			String sql = "insert into bbs values(null,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, title); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			ps.setString(2, content); // 물음표 번호 2번에 pw에 저장한 변수값을 넣어줘!
			ps.setString(3, writer); // 물음표 번호 3번에 name에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			ps.execute();
			System.out.println("4.sql문 생성 겅공");
			// URL site = new URL(site);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!");
		} // 패키지.대표클래스
			// 외부자원연결(db, network, cpu, file..)
			// 너무 위험한 상황이다 위험한 상황이 발생했을때 대처하는 방법 = try - catch

		// 2. 1번 설정된 커넥터로 db연결하고 승인
		// 1) url - ip + port +db명
		// 2) id,pw

		// 3. 2번에서 연결된 것을 가지고 sql문 생성
		// 4. 3번에서 생성된 sql문을 Mysql로 전송

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

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			// 해당부품으로 만들어주어야 한다.
			// sql ==> preparedStatement
			// site ==> URL
			String sql = "update bbs set title = ?, content = ? where no = ?";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, title); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			ps.setString(2, content);
			ps.setInt(3, no);// 물음표 번호 2번에 pw에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			ps.execute();
			System.out.println("4.sql문 생성 겅공");
			// URL site = new URL(site);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!");
		} // 패키지.대표클래스
			// 외부자원연결(db, network, cpu, file..)
			// 너무 위험한 상황이다 위험한 상황이 발생했을때 대처하는 방법 = try - catch

		// 2. 1번 설정된 커넥터로 db연결하고 승인
		// 1) url - ip + port +db명
		// 2) id,pw

		// 3. 2번에서 연결된 것을 가지고 sql문 생성
		// 4. 3번에서 생성된 sql문을 Mysql로 전송

	}
}
