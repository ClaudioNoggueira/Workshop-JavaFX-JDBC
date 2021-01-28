package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public class SellerService {

	// private SellerDAO dao = DaoFactory.createSellerDAO();

	public List<Seller> findAll() {
		// return dao.findAll();
		Date date = Calendar.getInstance().getTime();
		List<Seller> list = new ArrayList<>();

		list.add(new Seller(1, "Maria", "maria@gmail.com", date, 2500.0, new Department()));
		list.add(new Seller(2, "Alex", "alex@gmail.com", date, 2000.0, new Department()));
		list.add(new Seller(3, "Bob", "bob@gmail.com", date, 2000.0, new Department()));
		list.add(new Seller(4, "Jebediah", "jebediah@gmail.com", date, 3000.0, new Department()));
		list.add(new Seller(5, "Jesus", "jesus@gmail.com", date, 4500.0, new Department()));
		
		
		return list;
	}

	public void SaveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			// dao.insert(obj);
		} else {
			// dao.update(obj);
		}
	}

	public void remove(Seller obj) {
		// dao.deleteById(obj.getId());
	}
}
