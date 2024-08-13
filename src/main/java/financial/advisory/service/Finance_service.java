package financial.advisory.service;

import financial.advisory.entity.ExpenseIncome_entity;
import financial.advisory.entity.Users_entity;
import financial.advisory.repo.ExpenseIncome_repo;
import financial.advisory.repo.Users_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class Finance_service{
    @Autowired
    private Users_repo user_repo;

    public List<Users_entity> getUser(){
        return user_repo.findAll();
    }

    public List<Users_entity> getUserId(int userId){
        return user_repo.findByUserId(userId);
    }

    public List<Users_entity> getUserName(String userName){
        return user_repo.findByName(userName);
    }

    public Users_entity getUserEmail(String email){
        return user_repo.findByEmail(email);
    }

    public void postUser(Users_entity user){
        user_repo.save(user);
    }

//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void postUserV2(String userName,String email,String password){
        Users_entity u = new Users_entity();
        u.setName(userName);
        u.setEmail(email);

        user_repo.save(u);
    }

    public Users_entity getUserName_Pass(String username, String password) {
        return user_repo.findByNameAndPassword(username, password);
    }

    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////

    @Autowired
    private ExpenseIncome_repo EI_repo;

    public List<ExpenseIncome_entity> findAll(){
        return EI_repo.findAll();
    }

    public List<ExpenseIncome_entity> getExpenseIncomeByUserId(int userId){
        return EI_repo.findByUserId(userId);
    }

    public List<ExpenseIncome_entity> getEI_Id(int Expense_Income_id){
        return EI_repo.findByEIid(Expense_Income_id);
    }

    public List<ExpenseIncome_entity> getDate(Date date){
        return EI_repo.findByDate(date);
    }

    public List<ExpenseIncome_entity> getCategory(String category){
        return EI_repo.findByCategory(category);
    }

    public List<ExpenseIncome_entity> getAmount(BigDecimal amount){
        return EI_repo.findByAmount(amount);
    }

    public void postExpense_Income(Date date, String category, BigDecimal amount, String notes){
        ExpenseIncome_entity e = new ExpenseIncome_entity();
        e.setDate(date);
        e.setCategory(category);
        e.setAmount(amount);
        e.setNotes(notes);

        EI_repo.save(e);
    }
}
