package dev.sud.shareexpense.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Map;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private String description;

    @ManyToOne
    private Users createdBy;
    private Long amount;
    private Currency currency;

    @ElementCollection
    private Map<Users,Long> owedBy;

    @ElementCollection
    private Map<Users,Long> paidBy;
}
