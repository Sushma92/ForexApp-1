package com.sushma.java.forex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.java.forex.common.entity.TradingBook;
import com.sushma.java.forex.dao.TradingBookDAO;

@Service
public class TradingBookService extends BaseService<TradingBook, TradingBook> {

	@Autowired
	TradingBookDAO tradingBookDao;

	@Override
	public TradingBook create(TradingBook tradingBook) {
		tradingBook = tradingBookDao.save(tradingBook);
		return tradingBook;
	}

	@Override
	public TradingBook update(TradingBook tradingBook) {
		tradingBook = tradingBookDao.save(tradingBook);
		return tradingBook;
	}

	@Override
	public TradingBook read(Long id) {
		TradingBook tradingBook = tradingBookDao.findById(id).orElse(null);
		return tradingBook;
	}

	@Override
	public void delete(Long id) {
		tradingBookDao.deleteById(id);
	}

	@Override
	public void generateMultiple(Integer noOfEntities) {
		
	}

}
