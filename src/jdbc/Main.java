package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) throws SQLException{
	Connection connection = null;
	dbHelper helper = new dbHelper();
	PreparedStatement statement = null;
	
	
	
	try {
		connection = helper.getConnection();
		String sql = "delete from city where id = ?";
		
		statement = connection.prepareStatement(sql);
		statement.setInt(1, 4081);
		
		int result = statement.executeUpdate(); // genelde result içine alınmaz
		System.out.println("Kayıt silindi: " + result);
		
	} catch (SQLException exception) {
		helper.showErrorMessage(exception);
	}finally {
		statement.close();
		connection.close();
	}

}

	public static void selectionDemo() throws SQLException {
		Connection connection = null;
		dbHelper helper = new dbHelper();
		
		Statement statement = null;
		ResultSet resultSet;
		
		
		
		try {
			connection = helper.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select code, name, continent, region from country where continent =\"Asia\" and region = \"Middle East\"");
			ArrayList<Country> countries = new ArrayList<Country>();
			while(resultSet.next()) {
				countries.add(new Country(resultSet.getString("Code"),
						resultSet.getString("Name"),
						resultSet.getString("Continent"),
						resultSet.getString("Region")
						));
			}
			System.out.println(countries.size());
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		}finally {
			connection.close();
		}
	}
	
	public static void insertData()throws SQLException{
		Connection connection = null;
		dbHelper helper = new dbHelper();
		PreparedStatement statement = null;
		
		try {
			connection = helper.getConnection();
			String sql = "insert into city (name, countrycode, district, population) values(?,?,?,?)";
			
			statement = connection.prepareStatement(sql);
			statement.setString(1, "Düzce2");
			statement.setString(2, "TUR");
			statement.setString(3, "Türkiye");
			statement.setInt(4, 70000);
			int result = statement.executeUpdate(); // genelde result içine alınmaz
			System.out.println("Kayıt eklendi: " + result);
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		}finally {
			statement.close();
			connection.close();
		}
	}

	public static void updateData()throws SQLException{
		Connection connection = null;
		dbHelper helper = new dbHelper();
		PreparedStatement statement = null;
		
		
		
		try {
			connection = helper.getConnection();
			String sql = "update city set population = 100000, district=\"TUR\" where id = ?";
			
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 4081);
			
			int result = statement.executeUpdate(); // genelde result içine alınmaz
			System.out.println("Kayıt güncellendi: " + result);
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		}finally {
			statement.close();
			connection.close();
		}

	}
}
