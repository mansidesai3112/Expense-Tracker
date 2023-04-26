package in.mansidesai.expenseyoutube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.mansidesai.expenseyoutube.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
