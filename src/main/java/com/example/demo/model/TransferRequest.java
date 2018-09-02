package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class TransferRequest {
	
	@NotNull
	@ApiModelProperty(required = true)
	private Long accountFromId;

	@NotNull
	@ApiModelProperty(required = true)
	private Long accountToId;

	@NotNull
	@ApiModelProperty(required = true)
	@Min(value = 0, message = "Transfer amount can not be less than zero")
	private BigDecimal amount;

	@JsonCreator
	public TransferRequest(@NotNull @JsonProperty("accountFromId") Long accountFromId,
			@NotNull @JsonProperty("accountToId") Long accountToId,
			@NotNull @Min(value = 0, message = "Transfer amount can not be less than zero") @JsonProperty("amount") BigDecimal amount) {
		super();
		this.accountFromId = accountFromId;
		this.accountToId = accountToId;
		this.amount = amount;
	}
	
	@JsonCreator
	public TransferRequest() {
		super();
	}

	public Long getAccountFromId() {
		return accountFromId;
	}

	public void setAccountFromId(Long accountFromId) {
		this.accountFromId = accountFromId;
	}

	public Long getAccountToId() {
		return accountToId;
	}

	public void setAccountToId(Long accountToId) {
		this.accountToId = accountToId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountFromId == null) ? 0 : accountFromId.hashCode());
		result = prime * result + ((accountToId == null) ? 0 : accountToId.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
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
		TransferRequest other = (TransferRequest) obj;
		if (accountFromId == null) {
			if (other.accountFromId != null)
				return false;
		} else if (!accountFromId.equals(other.accountFromId))
			return false;
		if (accountToId == null) {
			if (other.accountToId != null)
				return false;
		} else if (!accountToId.equals(other.accountToId))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		return true;
	}

}
