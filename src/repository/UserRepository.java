/**
 * 
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.User;
import util.ConnectionFactory;

/**
 * @author fercosmig
 *
 */
public class UserRepository implements GenericRepository<User>{
	private static final Logger LOGGER = LogManager.getLogger(UserRepository.class.getName());

	Connection conn = null;

	/**
	 * @throws Exception
	 * 
	 */
	public UserRepository() {
		// TODO Auto-generated constructor stub
		LOGGER.info("object instance.");
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	@Override
	public void create(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User retrieveById(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> retrieveList() throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("method listAll.");
		PreparedStatement ps = null;
		Connection conn = null;
		ResultSet rs = null;
		User u = null;
		List<User> allUsers = new ArrayList<User>();

		try {
			String sql = "SELECT id, login, registrationDate FROM tbuser WHERE status = true";

			conn = this.conn;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setLogin(rs.getString("login"));
				u.setRegistrationDate(rs.getTimestamp("registrationDate"));

				allUsers.add(u);
			}

		} catch (SQLException e) {
			throw new Exception(e.getMessage());
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
		return allUsers;
	}

	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
