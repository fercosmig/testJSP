/**
 * 
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Note;
import util.ConnectionFactory;

/**
 * @author fercosmig
 *
 */
public class NoteRepository implements GenericRepository<Note> {
	private static final Logger LOGGER = LogManager.getLogger(NoteRepository.class.getName());

	/** Attributes */
	Connection conn = null;

	/** Constructors */
	public NoteRepository() {
		// TODO Auto-generated constructor stub
		LOGGER.info("object instance.");
		try {
			this.conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}

	@Override
	public void create(Note note) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("create");

		String sql = "INSERT INTO tbNote (description) VALUES (?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = this.conn;
			ps = conn.prepareStatement(sql);
			ps.setString(1, note.getDescription());
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error(e);
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
		
	}

	@Override
	public Note retrieveById(Note note) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("retrieveById");
		String sql = "SELECT id, description, status, registrationDate FROM tbNote WHERE status = true AND id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = this.conn;
			ps = conn.prepareStatement(sql);
			ps.setInt(1, note.getId());
			rs = ps.executeQuery();
			Note n = new Note();
			while (rs.next()) {
				n.setId(rs.getInt("id"));
				n.setDescription(rs.getString("description"));
				n.setStatus(rs.getBoolean("status"));
				n.setRegistrationdate(rs.getTimestamp("registrationDate"));
			}
			return n;
		} catch (Exception e) {
			LOGGER.error(e);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
		return null;
	}

	@Override
	public List<Note> retrieveList() throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("retrieveAll");
		String sql = "SELECT id, description, status, registrationDate FROM tbNote WHERE status = true ORDER BY registrationDate DESC";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Note n = null;
		try {
			conn = this.conn;
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			List<Note> ln = new ArrayList<Note>();
			while (rs.next()) {
				n = new Note();
				n.setId(rs.getInt("id"));
				n.setDescription(rs.getString("description"));
				n.setStatus(rs.getBoolean("status"));
				n.setRegistrationdate(rs.getTimestamp("registrationDate"));
				ln.add(n);
			}
			return ln;
		} catch (Exception e) {
			LOGGER.error(e);
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
		return null;
	}

	@Override
	public void update(Note note) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("update");
		String sql = "UPDATE tbNote SET description = ? WHERE id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = this.conn;
			ps = conn.prepareStatement(sql);
			ps.setString(1, note.getDescription());
			ps.setInt(2, note.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error(e);
		}finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
		
	}

	@Override
	public void delete(Note note) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("delete");
		String sql = "UPDATE tbNote SET status = false WHERE id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = this.conn;
			ps = conn.prepareStatement(sql);
			ps.setInt(1, note.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error(e);
		}finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
		
	}

}
