/**
 * 
 */
package repository;

import java.util.List;

/**
 * @author fercosmig
 *
 */
public interface GenericRepository<T> {

	public void create(T object) throws Exception;

	public T retrieveById(T object) throws Exception;

	public List<T> retrieveList() throws Exception;

	public void update(T object) throws Exception;

	public void delete(T object) throws Exception;
}
