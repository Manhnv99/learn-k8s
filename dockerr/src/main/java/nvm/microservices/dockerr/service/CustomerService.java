package nvm.microservices.dockerr.service;


import nvm.microservices.dockerr.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

}
