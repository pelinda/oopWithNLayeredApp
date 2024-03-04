package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {//data access object =>dao
	public void add(Product product) {
		//sadece ve sadece DB erişim kodları buraya yazılır...SQL bilmek gerekir..
		System.out.println("JDBC ile veritabanına eklendi");
	}
	
}
