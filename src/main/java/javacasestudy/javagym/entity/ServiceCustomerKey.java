package javacasestudy.javagym.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

@Embeddable
public class ServiceCustomerKey implements Serializable  {
    
    @Column(name = "customer_id")
    Long customerId;

    @Column(name = "service_id")
    Long serviceId;
}
