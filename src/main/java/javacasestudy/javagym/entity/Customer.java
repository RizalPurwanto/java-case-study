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
@Table(name="customer")
public class Customer {
    
    
    private int id;

    @Id
    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    private String creditCardNumber;

    private String cvv;

    private Date creditCardExpiredDate;
    
    private String creditCardOwner;

    private String status;
    
    private String otp;

    private String token;

    @Column(name="token_expired_at")
    private Long tokenExpiredAt;

    // @ManyToMany(mappedBy = "service")
    // Set<Service> services;

    @OneToMany(mappedBy = "service")
    Set<ServiceCustomer> subscription;
}
