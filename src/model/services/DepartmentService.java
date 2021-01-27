package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class DepartmentService {

	// private DepartmentDAO dao = DaoFactory.createDepartmentDAO();

	public List<Department> findAll() {
		// return dao.findAll();

		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Livros"));
		list.add(new Department(2, "Computadores"));
		list.add(new Department(3, "Eletrônicos"));
		return list;
	}

	public void SaveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			// dao.insert(obj);
		} else {
			// dao.update(obj);
		}
	}
}
