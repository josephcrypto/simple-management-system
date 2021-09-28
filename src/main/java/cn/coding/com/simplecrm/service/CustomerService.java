package cn.coding.com.simplecrm.service;

import cn.coding.com.simplecrm.entity.Customer;
import cn.coding.com.simplecrm.filter.CustomerDatatableFilter;
import cn.coding.com.simplecrm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Page<Customer> getCustomerForDatatable(String queryString, Pageable pageable) {
        CustomerDatatableFilter customerDatatableFilter = new CustomerDatatableFilter(queryString);

        return customerRepository.findAll(customerDatatableFilter, pageable);
    }
}
