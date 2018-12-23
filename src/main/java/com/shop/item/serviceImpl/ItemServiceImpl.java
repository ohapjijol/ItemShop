package com.shop.item.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.item.dao.ItemDao;
import com.shop.item.model.Item;
import com.shop.item.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemDao itemDao;

	@Override
	public List<Item> retrieveAllitems() {
		// TODO Auto-generated method stub
		return itemDao.retrieveAllitems();
	}

}
