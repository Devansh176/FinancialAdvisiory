package financial.advisory.controller;

import financial.advisory.entity.ExpenseIncome_entity;
import financial.advisory.entity.Users_entity;
import financial.advisory.service.Finance_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping
public class Finance_controller {
    @Autowired
    private Finance_service financeService;

    @GetMapping("/getUser")
    public List<Users_entity> getUser(){
        return financeService.getUser();
    }

    @GetMapping("/getUser/id")
    public List<Users_entity> getUserId(int userId){
        return financeService.getUserId(userId);
    }

    @GetMapping("/getUser/name")
    public List<Users_entity> getUserName(String userName){
        return financeService.getUserName(userName);
    }

    @GetMapping("/getUser/email")
    public Users_entity getUserEmail(String email){
        return financeService.getUserEmail(email);
    }

    @GetMapping("/getUser/name_pass")
    public Users_entity getUserName_pass(@RequestParam("username") String username,@RequestParam("password") String password){
        return financeService.getUserName_Pass(username, password);
    }

    @PostMapping("/postUser")
    public void postUser(@RequestBody Users_entity user){
        financeService.postUser(user);
    }

    @PostMapping("/postUser2")
    public void postUser(
        @RequestParam("userName") String userName,
        @RequestParam("email")String email,
        @RequestParam("password") String password){
        financeService.postUserV2(userName,email,password);
    }

    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/getEI_Id")
    public List<ExpenseIncome_entity> getEI_ID(int Expense_Income_Id){
        return financeService.getEI_Id(Expense_Income_Id);
    }

    @GetMapping("/getEI_by_userId")
    public List<ExpenseIncome_entity> getExpenseIncomeByUserId(int EI_userid){
        return financeService.getExpenseIncomeByUserId(EI_userid);
    }

    @GetMapping("/getDate")
    public List<ExpenseIncome_entity> getDate(Date date){
        return financeService.getDate(date);
    }

    @GetMapping("/getCategory")
    public List<ExpenseIncome_entity> getCategory(String category){
        return financeService.getCategory(category);
    }

    @GetMapping("/getAmount")
    public List<ExpenseIncome_entity> getAmount(BigDecimal amount){
        return financeService.getAmount(amount);
    }

    @PostMapping("/post/ExpenseIncome")
    public void postExpense_Income(
        @RequestParam("date") Date date,
        @RequestParam("category") String category,
        @RequestParam("amount") BigDecimal amount,
        @RequestParam("notes") String note){
        financeService.postExpense_Income(date, category, amount, note);
    }
}
