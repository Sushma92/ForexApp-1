package com.sushma.java.forex.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "TradingInfo")
@Table(name = "trading_info")
public class TradingInfo extends BaseEntity{
	
	@Column(name = "from_currency")
	private float fromCurrency;
	
	@Column(name = "to_currency")
	private float toCurrency;
	
	@Column(name = "from_currency_value")
	private float fromCurrencyValue;
	
	@Column(name = "to_currency_value")
	private float toCurrencyValue;
	

}
