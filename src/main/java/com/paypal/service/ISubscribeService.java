package com.paypal.service;

import java.util.List;

import com.paypal.entity.Subscribe;

public interface ISubscribeService {

	List<Subscribe> findSubscribes(String  processDate);
	
}
