package vn.iotstar.services.impl;

import java.util.List;

import vn.iotstar.dao.ICategoryDao;
import vn.iotstar.dao.impl.CategoryDaoImpl;
import vn.iotstar.models.CategoryModel;
import vn.iotstar.services.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {

	public ICategoryDao cateDao = new CategoryDaoImpl();

	@Override
	public List<CategoryModel> findAll() {
		return cateDao.findAll();
	}

	@Override
	public CategoryModel findById(int id) {
		return cateDao.findById(id);
	}

	@Override
	public void insert(CategoryModel category) {
		CategoryModel cate = this.findById(category.getCategoryid());
		if (cate == null) {
			// Chưa có danh mục với ID này, nên tiếp tục thêm mới
			cateDao.insert(category);
		} else if (cate.getCategoryname() == null) {
			// Nếu danh mục đã tồn tại nhưng chưa có tên, có thể xử lý logic theo nhu cầu
			cateDao.insert(category);
		}
	}

	@Override
	public void update(CategoryModel category) {
		CategoryModel cate = this.findById(category.getCategoryid());
		if (cate != null) {
			cateDao.update(category);
		}
	}

	@Override
	public void delete(int id) {
		CategoryModel cate = new CategoryModel();
		cate = cateDao.findById(id);
		if (cate != null) {
			cateDao.delete(id);
			;
		}

	}

	@Override
	public void updateStatus(int id, int status) {
		cateDao.updateStatus(id, status);
	}

	@Override
	public CategoryModel findByName(String name) {
		return cateDao.findByName(name);
	}

	@Override
	public List<CategoryModel> findName(String keyword) {
		return cateDao.findName(keyword);
	}

}
