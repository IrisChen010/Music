package etc.music.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import etc.music.hibernate.HibernateSessionFactory;
import etc.music.util.PageBean;

public class PageBeanDao {
	//分页代码
	public PageBean findByPage( int currentPage, int pageSize) {
						// 创建PageBean对象
						PageBean pageBean = new PageBean();
						Session session=HibernateSessionFactory.getSession();

						// 获取当页待显示的数据				
						pageBean.setData(new AlbumDao().getChoosedPageAlbums(currentPage, pageSize));
						// 获取查询结果的总行数
						pageBean.setTotalRows(new AlbumDao().getAlbumNum());
						// 获取当前页数
						pageBean.setCurrentPage(currentPage);
						// 获取每页个数
						pageBean.setPageSize(pageSize);
						return pageBean;
							
					}
			


}
