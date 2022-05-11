package javaConfirm;

public class DaoEx1 {

	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
