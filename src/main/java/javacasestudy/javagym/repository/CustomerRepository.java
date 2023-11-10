package javacasestudy.javagym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacasestudy.javagym.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
