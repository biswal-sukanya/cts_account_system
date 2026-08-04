package com.iispl.service;

import com.iispl.repository.ChequeRepository;
import com.iispl.repository.ChequeRepositoryImpl;

public class ChequeServiceImpl implements ChequeService {

	ChequeRepository repository = new ChequeRepositoryImpl();
}
