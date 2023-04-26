package in.mansidesai.expenseyoutube.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mansidesai.expenseyoutube.model.Expense;
import in.mansidesai.expenseyoutube.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
			return expenseRepository.findAll();
	}

	@Override
	public void save(Expense expense) {
		expense.setCreated_at(System.currentTimeMillis());
		expenseRepository.save(expense);
		
	}

	@Override
	public Expense findById(Long id) {
		if(expenseRepository.findById(id).isPresent())
		{
			return expenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		Expense expense=findById(id);
		expenseRepository.delete(expense);
		
	}

}
