package com.fintech.accountsservice.service;


import com.fintech.accountsservice.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);

}