package etc.music.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;



import etc.music.hibernate.HibernateSessionFactory;
import etc.music.pojo.City;
import etc.music.pojo.Province;


public class SelectDao {
	//获取一级下拉选框
public Map<Integer,String> getFirst() {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		Session session=HibernateSessionFactory.getSession();
		 try {
			session.beginTransaction();
			Query query=session.createQuery("from Province");
			List list=query.list();
			for(int i=0;i<list.size();i++)
			{
				map.put((Integer)list.get(1), (String)list.get(2));
			}
			session.getTransaction().commit();
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally{HibernateSessionFactory.closeSession(session);}
		return null;
		
		
	}
	
//根据一级下拉选框获取二级下拉选框的内容！	
public Map<Integer,List<City>> getSecond(int id) {
		
		Map<Integer,List<City>> map = new HashMap<Integer,List<City>>();
		
		Session session=HibernateSessionFactory.getSession();
		try {
			session.beginTransaction();
			Province province=new ProvinceDao().getProvinceById(id);
			Query query=session.createQuery("from City where Province=?");
			query.setParameter(0, province);
			List list=query.list();
		
				map.put(id, list);
			
			session.getTransaction().commit();
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		finally
		{
			HibernateSessionFactory.closeSession(session);
		}
		
		
		
		return null;
	}


}
