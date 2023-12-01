package com.fintech.accountsservice.service;

import com.fintech.accountsservice.dto.CustomerDetailsDto;

public interface ICustomerService {

    /**
     *
     * @param mobileNumber
     * @return CustomerDetailsDto
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
