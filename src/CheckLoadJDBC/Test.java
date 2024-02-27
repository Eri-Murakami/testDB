package CheckLoadJDBC;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestUserDAO dao = new TestUserDAO();
		dao.select("taro","123");
		//⑥
		//dao.selectAll();
		//⑧
		//	dao.selectByName("taro");
		//⑩
		//	dao.selectByPassword("123");
		//⑫
		//	dao.updateUserNameByUserName("taro", "saburo");
		//⑭
		//dao.insert(4,"shiro", "012");
		//⑯
		//	dao.delete("jiro");

	}

}
