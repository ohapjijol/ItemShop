package com.shop.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.item.model.Item;
import com.shop.item.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;

	@RequestMapping(value = "/items", method = RequestMethod.GET)
	@ResponseBody
	public List<Item> retrieveAllItem() {
		return itemService.retrieveAllitems();
	}
}
