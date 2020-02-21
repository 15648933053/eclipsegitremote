import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoP {
	private static final String URL = "jdbc:mysql://localhost:3306/test1";
	private static final String USERNAME = "root";
	private static final String PWD = "yyfyzrgx7518";
	public static void update() {
		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");//加载驱动类		
		//与数据库建立连接
		conn = DriverManager.getConnection(URL,USERNAME,PWD);
		
		
		/*   Statement
		//发送命令，执行sql
		st = conn.createStatement();
		//String sql = "insert into t_user values(3,'zs','123')";//插入
		String sql = "update t_user set uname = 'zs' where uid = 2";//修改
		//String sql = "delete from t_user where uid =1;";//删除
		int count = st.executeUpdate(sql);//返回值表示增删改了几条数据
		
		*/
		
		//PreStatment
		String sql = "insert into t_user values(?,?,?)";
		ps = conn.prepareStatement(sql);//预编译
		
		ps.setInt(1, 7);
		ps.setString(2, "qht");
		ps.setString(3, "12456");
		int count = ps.executeUpdate();
		//处理结果
		if(count>0) {
			System.out.println("操作成功");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null)ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void query() {
		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
		Class.forName("com.mysql.jdbc.Driver");//加载驱动类		
		//与数据库建立连接
		conn = DriverManager.getConnection(URL,USERNAME,PWD);
		//发送命令，执行sql
		String sname = "z";
		//String sql = "select * from t_user where uname like '%"+sname+"%'";//查询
		String sql = "select * from t_user where uname like ?";//查询
		ps = conn.prepareStatement(sql);
		
		ps.setString(1, "%z%");
		
		rs = ps.executeQuery();//返回值表示增删改了几条数据
		//处理结果
		while(rs.next()) {
			int id = rs.getInt("uid");
			String name = rs.getString("uname");
			String pwd = rs.getString("pwd");
			System.out.println(id+"---"+name+"---"+pwd);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(ps != null)ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(conn != null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		//update();
		query();
	}
}
//com.mysql.jdbc.Driver
//jdbc:mysql://localhost:3306/数据库实例名