package com.example.demo.dto;

import java.math.BigDecimal;

public class TransferResult {
	
	private Long accountFromId;
	
	private BigDecimal balanceAfterTransfer;

	public Long getAccountFromId() {
		return accountFromId;
	}

	public void setAccountFromId(Long accountFromId) {
		this.accountFromId = accountFromId;
	}

	public BigDecimal getBalanceAfterTransfer() {
		return balanceAfterTransfer;
	}

	public void setBalanceAfterTransfer(BigDecimal balanceAfterTransfer) {
		this.balanceAfterTransfer = balanceAfterTransfer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountFromId == null) ? 0 : accountFromId.hashCode());
		result = prime * result + ((balanceAfterTransfer == null) ? 0 : balanceAfterTransfer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransferResult other = (TransferResult) obj;
		if (accountFromId == null) {
			if (other.accountFromId != null)
				return false;
		} else if (!accountFromId.equals(other.accountFromId))
			return false;
		if (balanceAfterTransfer == null) {
			if (other.balanceAfterTransfer != null)
				return false;
		} else if (!balanceAfterTransfer.equals(other.balanceAfterTransfer))
			return false;
		return true;
	}
	
}
