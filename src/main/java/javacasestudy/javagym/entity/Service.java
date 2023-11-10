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
@Table(name="service")
public class Service {
    
    @Id
    private int id;

    private String name;

    private String schedule;

    private int duration;

    @OneToMany(mappedBy = "customer")
    Set<ServiceCustomer> subscription;

    @OneToMany(mappedBy = "exercise")
    Set<Customer> exercises;

}
