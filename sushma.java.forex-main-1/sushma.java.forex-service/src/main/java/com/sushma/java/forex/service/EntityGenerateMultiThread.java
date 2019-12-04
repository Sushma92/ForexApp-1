package com.sushma.java.forex.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EntityGenerateMultiThread extends Thread{

	private Integer noOfEntitiesForThisThread;
	
	private BaseService baseService;
	
	public EntityGenerateMultiThread() {
		
	}
	
	public Integer noOfEntitiesForThisThread() {
		return noOfEntitiesForThisThread;
	}
	
	public void setNoOfEntitiesForThisThread(Integer noOfEntitiesForThisThread) {
		this.noOfEntitiesForThisThread = noOfEntitiesForThisThread;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}

	public Integer getNoOfEntitiesForThisThread() {
		return noOfEntitiesForThisThread;
	}

	public BaseService getBaseService() {
		return baseService;
	}
	
	@Override
	public void run() {
		for(int entityCtr = 1; entityCtr <= noOfEntitiesForThisThread; entityCtr++) {
			
		}
	}
}
