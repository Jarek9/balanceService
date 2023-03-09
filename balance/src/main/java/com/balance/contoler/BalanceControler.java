package com.balance.contoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.balance.repository.BalanceRepository;

import java.math.BigDecimal;
import java.util.UUID;

@RestController
public class BalanceControler {

	private final BalanceRepository repository = new BalanceRepository();

	@GetMapping("/{id}")
	public BigDecimal getBalance(@PathVariable UUID id){
		return repository.findBalance(id);
	}
}
