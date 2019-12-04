package com.sushma.java.forex.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.java.forex.common.entity.TradingInfo;
import com.sushma.java.forex.service.BaseService;
import com.sushma.java.forex.service.TradingInfoService;

@RestController
public class TradingInfoController extends BaseController<TradingInfo, TradingInfo>{

	@Autowired
	TradingInfoService tradingInfoService;

	@Override
	public BaseService<TradingInfo, TradingInfo> getBaseService() {
		return tradingInfoService;
	}
	
	
}
