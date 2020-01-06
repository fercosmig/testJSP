/**
 * 
 */
package enumeration;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Jan 4, 2020
 * @file enumeration.Permission.java
 */
public enum Permission {
	CREATE("Inserir itens no banco de dados."),
	RETRIEVE("Realizar consultas no banco de dados."),
	UPDATE("Atualizar registros no banco de dados."),
	DELETE("Excluir registros do banco de dados.");
	
	private String description;

	/**
	 * Constructors
	 */
	
	/**
	 * @param description
	 */
	private Permission(String description) {
		this.description = description;
	}

	/**
	 * Getters and Setters
	 */
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	
}
