/**
 * 
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.MegaSena;
import util.ConnectionFactory;

/**
 * @author fercosmig
 *
 */
public class MegaSenaRepository implements GenericRepository<MegaSena>{

	private static final Logger LOGGER = LogManager.getLogger(MegaSenaRepository.class.getName());

	Connection conn = null;

	/**
	 * 
	 */
	public MegaSenaRepository() {
		LOGGER.info("object instance.");
		// TODO Auto-generated constructor stub
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void create(MegaSena megasena) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("method adicionaConcurso.");

		String sql = "INSERT INTO tbmegasena (concurso, data_sorteio, d1, d2, d3, d4, d5, d6) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = null;
		try {

			String pattern = "yyyy-MM-dd";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);

			ps = conn.prepareStatement(sql);
			ps.setInt(1, megasena.getConcurso());
			ps.setString(2, sdf.format(megasena.getDataSorteio()));
			ps.setInt(3, megasena.getDezena1());
			ps.setInt(4, megasena.getDezena2());
			ps.setInt(5, megasena.getDezena3());
			ps.setInt(6, megasena.getDezena4());
			ps.setInt(7, megasena.getDezena5());
			ps.setInt(8, megasena.getDezena6());
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error(e);
			
		} finally {
			ConnectionFactory.closeConnection(conn, ps);
		}
		
	}

	@Override
	public MegaSena retrieveById(MegaSena object) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MegaSena> retrieveList() throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("method listaSorteios.");
		List<MegaSena> todos = new ArrayList<MegaSena>();
		String sql = "SELECT concurso, data_sorteio, d1, d2, d3, d4, d5, d6 FROM tbmegasena ORDER BY concurso DESC";
		PreparedStatement ps = null;
		ResultSet rs = null;
		MegaSena ms = null;

		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				ms = new MegaSena();
				ms.setConcurso(rs.getInt("concurso"));
				ms.setDataSorteio(rs.getDate("data_sorteio"));
				ms.setDezena1(rs.getInt("d1"));
				ms.setDezena2(rs.getInt("d2"));
				ms.setDezena3(rs.getInt("d3"));
				ms.setDezena4(rs.getInt("d4"));
				ms.setDezena5(rs.getInt("d5"));
				ms.setDezena6(rs.getInt("d6"));
				todos.add(ms);
			}
			return todos;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(conn, ps, rs);
		}
		return null;
	}

	@Override
	public void update(MegaSena object) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MegaSena object) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
