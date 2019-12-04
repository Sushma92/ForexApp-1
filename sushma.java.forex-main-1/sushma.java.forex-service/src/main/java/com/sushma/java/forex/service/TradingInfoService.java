package com.sushma.java.forex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.java.forex.common.entity.TradingInfo;
import com.sushma.java.forex.dao.TradingInfoDAO;

@Service
public class TradingInfoService extends BaseService<TradingInfo, TradingInfo>{

	@Autowired
	TradingInfoDAO tradingInfoDao;

	@Override
	public TradingInfo create(TradingInfo tradingInfo) {
		tradingInfo = tradingInfoDao.save(tradingInfo);
		return tradingInfo;
	}

	@Override
	public TradingInfo update(TradingInfo tradingInfo) {
		tradingInfo = tradingInfoDao.save(tradingInfo);
		return tradingInfo;
	}

	@Override
	public TradingInfo read(Long id) {
		TradingInfo tradingInfo = tradingInfoDao.findById(id).orElse(null);
		return null;
	}

	@Override
	public void delete(Long id) {
		tradingInfoDao.deleteById(id);
	}

	@Override
	public void generateMultiple(Integer noOfEntities) {
		
	}
	
	
}
