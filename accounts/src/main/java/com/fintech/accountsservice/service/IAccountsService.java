package com.fintech.accountsservice.service;


import com.fintech.accountsservice.dto.CustomerDto;

public interface IAccountsService {

    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccountDetails(String mobileNumber);

    /**
     * @param customerDto
     * @return
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber
     * @return
     */
    boolean deleteAccount(String mobileNumber);

}