package etc.music.dao;

import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.Province;

public class ProvinceDao {

	public Province getProvinceById(int id)
	{
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Province province=(Province) session.get(Province.class, id);
			
			session.getTransaction().commit();
			return province;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{HibernateSessionFactory.closeSession(session);}
		return null;
	}
}
