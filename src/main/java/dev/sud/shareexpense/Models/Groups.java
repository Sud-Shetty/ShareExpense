package dev.sud.shareexpense.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Groups extends BaseModel{
    private String name;

    @ManyToOne
    private Users admin;

    @ManyToMany
    private List<Users> members;

    @OneToMany
    private List<Expense> expenses;


}
