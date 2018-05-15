package xupt.se.ttms.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import xupt.se.ttms.dao.StudioDAO;
import xupt.se.ttms.idao.iStudioDAO;
import xupt.se.ttms.model.Studio;

public class iStudioDAOTest {
	Studio s=new Studio();
	
	iStudioDAO dao=new StudioDAO();

	@Test
	public void testInsert() {
		dao.insert(new Studio());
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelect() {
		dao.select("1");
	}

}
