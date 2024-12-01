package BookDetails;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import DTO.BookDTO;
import Mapper.BookRowMapper;

public class BookDAOImpl implements IBookDAO {
	private JdbcTemplate jTemp;

	public BookDAOImpl(JdbcTemplate jTemp) {
		this.jTemp = jTemp;
	}

	@Override
	public void insertBook(int id, String name, double price) {
		// TODO Auto-generated method stub
		String insertQuery = "INSERT INTO `introduction`.`book` VALUES(?,?,?)";
		jTemp.update(insertQuery, ps->{
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setDouble(3, price);
		});
		
		System.out.println("Values inserted successfully");

	}

	@Override
	public List<BookDTO> getbooks() {
		String selectQuery="SELECT * FROM `introduction`.`book`";
		List<BookDTO> books = jTemp.query(selectQuery, new BookRowMapper());
		
		return books;
	}

}
