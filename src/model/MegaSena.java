/**
 * 
 */
package model;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author fercosmig
 *
 */
public class MegaSena {
	private static final Logger LOGGER = LogManager.getLogger(MegaSena.class.getName());
	private Integer concurso;
	private Date dataSorteio;
	private Integer dezena1;
	private Integer dezena2;
	private Integer dezena3;
	private Integer dezena4;
	private Integer dezena5;
	private Integer dezena6;

	/**
	 * Constructors
	 */
	public MegaSena() {
		// TODO Auto-generated constructor stub
		LOGGER.info("object instance.");
	}

	/**
	 * @param concurso
	 * @param dataSorteio
	 * @param dezena1
	 * @param dezena2
	 * @param dezena3
	 * @param dezena4
	 * @param dezena5
	 * @param dezena6
	 */
	public MegaSena(Integer concurso, Date dataSorteio, Integer dezena1, Integer dezena2, Integer dezena3,
			Integer dezena4, Integer dezena5, Integer dezena6) {
		this.concurso = concurso;
		this.dataSorteio = dataSorteio;
		this.dezena1 = dezena1;
		this.dezena2 = dezena2;
		this.dezena3 = dezena3;
		this.dezena4 = dezena4;
		this.dezena5 = dezena5;
		this.dezena6 = dezena6;
	}

	/**
	 * @return the concurso
	 */
	public Integer getConcurso() {
		return concurso;
	}

	/**
	 * @param concurso the concurso to set
	 */
	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
	}

	/**
	 * @return the dataSorteio
	 */
	public Date getDataSorteio() {
		return dataSorteio;
	}

	/**
	 * @param dataSorteio the dataSorteio to set
	 */
	public void setDataSorteio(Date dataSorteio) {
		this.dataSorteio = dataSorteio;
	}

	/**
	 * @return the dezena1
	 */
	public Integer getDezena1() {
		return dezena1;
	}

	/**
	 * @param dezena1 the dezena1 to set
	 */
	public void setDezena1(Integer dezena1) {
		this.dezena1 = dezena1;
	}

	/**
	 * @return the dezena2
	 */
	public Integer getDezena2() {
		return dezena2;
	}

	/**
	 * @param dezena2 the dezena2 to set
	 */
	public void setDezena2(Integer dezena2) {
		this.dezena2 = dezena2;
	}

	/**
	 * @return the dezena3
	 */
	public Integer getDezena3() {
		return dezena3;
	}

	/**
	 * @param dezena3 the dezena3 to set
	 */
	public void setDezena3(Integer dezena3) {
		this.dezena3 = dezena3;
	}

	/**
	 * @return the dezena4
	 */
	public Integer getDezena4() {
		return dezena4;
	}

	/**
	 * @param dezena4 the dezena4 to set
	 */
	public void setDezena4(Integer dezena4) {
		this.dezena4 = dezena4;
	}

	/**
	 * @return the dezena5
	 */
	public Integer getDezena5() {
		return dezena5;
	}

	/**
	 * @param dezena5 the dezena5 to set
	 */
	public void setDezena5(Integer dezena5) {
		this.dezena5 = dezena5;
	}

	/**
	 * @return the dezena6
	 */
	public Integer getDezena6() {
		return dezena6;
	}

	/**
	 * @param dezena6 the dezena6 to set
	 */
	public void setDezena6(Integer dezena6) {
		this.dezena6 = dezena6;
	}

}
