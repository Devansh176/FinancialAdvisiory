package financial.advisory.repo;

import financial.advisory.entity.ExpenseIncome_entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseIncome_repo extends JpaRepository <ExpenseIncome_entity, Integer> {
    List<ExpenseIncome_entity> findByUserId(int userId);
    List<ExpenseIncome_entity> findByEIid(int EI_Id);
    List<ExpenseIncome_entity> findByDate(Date date);
    List<ExpenseIncome_entity> findByAmount(BigDecimal amount);
    List<ExpenseIncome_entity> findByCategory(String category);
}
