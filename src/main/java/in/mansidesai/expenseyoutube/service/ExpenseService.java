package in.mansidesai.expenseyoutube.service;

import java.util.List;

import in.mansidesai.expenseyoutube.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
	void save(Expense expense);
	Expense findById(Long id);
	void delete(Long id);
}
