package javacasestudy.javagym.service;

import java.util.Set;

import javax.xml.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintViolation;
import javacasestudy.javagym.model.RegisterCustomerRequest;
import javacasestudy.javagym.repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private Validator validator;

    public void register(RegisterCustomerRequest request) {
    Set<ConstraintViolation<RegisterCustomerRequest>> constraintViolations = validator.validate(request);

    // if(customerRepository.existsById(request.getName())) {

    // }
    }
}
