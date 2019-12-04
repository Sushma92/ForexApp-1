package com.sushma.java.forex.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.java.forex.common.entity.TradingBook;
import com.sushma.java.forex.dao.TradingBookDAO;
import com.sushma.java.forex.service.BaseService;

@RestController
public class TradingBookController extends BaseController<TradingBook, TradingBook>{

	@Autowired
	TradingBookDAO tradingBookDao;
	
	@Override
	public BaseService<TradingBook, TradingBook> getBaseService() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
