package javacasestudy.javagym.entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

@Entity
@Table(name="exercise")
public class Exercise {
    
    @Id
    private int id;

    private String name;

    private String description;

    private int duration;

    @ManyToMany(mappedBy = "customer")
    Set<Customer> customers;

    @OneToMany(mappedBy = "exercise")
    Set<Customer> exercises;

}
