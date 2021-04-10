package conn.main;

import conn.DAO.FlowerDAO;
import conn.bean.Flower;

public class FlowerMain {
	public static void main(String[] args) {
		FlowerDAO dao=new FlowerDAO();
		Flower result=dao.getFlower("2");
		System.out.println(result);
	}

}
