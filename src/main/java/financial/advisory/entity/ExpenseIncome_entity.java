package financial.advisory.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Expense_Income")
public class ExpenseIncome_entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Expense_Income_id")
    private int EIid;

    @Column(name = "User_id")
    private int userId;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Amount")
    private BigDecimal amount = BigDecimal.ZERO;

    @Column(name = "Category")
    private String category;

    @Column(name = "Notes")
    private String notes;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
