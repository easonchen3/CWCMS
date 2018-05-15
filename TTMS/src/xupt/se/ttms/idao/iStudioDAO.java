/**
 * 
 */
package xupt.se.ttms.idao;
import xupt.se.ttms.model.Studio;

import java.util.List;

/**
 * @author Administrator
 *
 */
public interface iStudioDAO {
	/**
	 * 
	 * @param stu
	 * @return
	 */
	public int insert(Studio stu);
	/**
	 * 
	 * @param stu
	 * @return
	 */
	public int update(Studio stu);
	/**
	 * 
	 * @param ID
	 * @return
	 */
	public int delete(int ID);
	/**
	 * 
	 * @param condt
	 * @return
	 */
	public List<Studio> select(String condt); 
}
