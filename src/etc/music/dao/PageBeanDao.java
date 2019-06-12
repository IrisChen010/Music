package etc.music.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.util.PageBean;

public class PageBeanDao {
	//��ҳ����
	public PageBean findByPage( int currentPage, int pageSize) {
						// ����PageBean����
						PageBean pageBean = new PageBean();
						Session session=HibernateSessionFactory.getSession();

						// ��ȡ��ҳ����ʾ������				
						pageBean.setData(new AlbumDao().getChoosedPageAlbums(currentPage, pageSize));
						// ��ȡ��ѯ�����������
						pageBean.setTotalRows(new AlbumDao().getAlbumNum());
						// ��ȡ��ǰҳ��
						pageBean.setCurrentPage(currentPage);
						// ��ȡÿҳ����
						pageBean.setPageSize(pageSize);
						return pageBean;
							
					}
			


}
