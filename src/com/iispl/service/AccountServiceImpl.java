package com.iispl.service;

import com.iispl.repository.AccountRepository;
import com.iispl.repository.AccountRepositoryImpl;

public class AccountServiceImpl implements AccountService {
	
	AccountRepository repository = new AccountRepositoryImpl();

}
