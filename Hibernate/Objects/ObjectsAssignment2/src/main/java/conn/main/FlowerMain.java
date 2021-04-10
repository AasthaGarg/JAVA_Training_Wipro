package conn.main;

import conn.DAO.FlowerDAO;


public class FlowerMain {
	public static void main(String[] args) {
		FlowerDAO dao=new FlowerDAO();
		String result=dao.deleteFlower("2");
		System.out.println(result);
	}

}
