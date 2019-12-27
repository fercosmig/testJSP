/**
 * 
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import util.TwoDataBases;

/**
 * @author fercosmig
 *
 */
public class TransferTableDB {
	private static final Logger LOGGER = LogManager.getLogger(TransferTableDB.class.getName());

	/**
	 * 
	 */
	public TransferTableDB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		LOGGER.info("main method.");
		// TODO Auto-generated method stub
		Connection connFrom = null;
		PreparedStatement psFrom = null;
		ResultSet rsFrom = null;

		Connection connTo = null;
		PreparedStatement psTo = null;

		String sqlFrom = "SELECT concurso, data_sorteio, d1, d2, d3, d4, d5, d6 from tb_megasena ORDER BY concurso ASC";
		String sqlTo = "INSERT INTO tbmegasena (concurso, data_sorteio, d1, d2, d3, d4, d5, d6) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			connFrom = TwoDataBases.getConnectionDBfercosmig();
			psFrom = connFrom.prepareStatement(sqlFrom);
			rsFrom = psFrom.executeQuery();
			Integer cont = 0;
			while (rsFrom.next()) {
				connTo = TwoDataBases.getConnectionDBtestes();
				psTo = connTo.prepareStatement(sqlTo);
				psTo.setInt(1, rsFrom.getInt("concurso"));
				psTo.setDate(2, rsFrom.getDate("data_sorteio"));
				psTo.setInt(3, rsFrom.getInt("d1"));
				psTo.setInt(4, rsFrom.getInt("d2"));
				psTo.setInt(5, rsFrom.getInt("d3"));
				psTo.setInt(6, rsFrom.getInt("d4"));
				psTo.setInt(7, rsFrom.getInt("d5"));
				psTo.setInt(8, rsFrom.getInt("d6"));
				psTo.executeUpdate();
				System.out.println(rsFrom.getInt("concurso"));
				TwoDataBases.closeConnection(connTo, psTo);
				cont++;
			}
			System.out.println(cont + " registros copiados");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			TwoDataBases.closeConnection(connFrom, psFrom, rsFrom);
			TwoDataBases.closeConnection(connTo, psTo);

		}

	}

}
