package nvm.microservices.dockerr.service.impl;

import lombok.RequiredArgsConstructor;
import nvm.microservices.dockerr.entity.Customer;
import nvm.microservices.dockerr.repository.CustomerRepository;
import nvm.microservices.dockerr.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

}
