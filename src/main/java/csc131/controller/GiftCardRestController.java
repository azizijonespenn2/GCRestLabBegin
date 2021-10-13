package csc131.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import csc131.model.GiftCard;
import csc131.model.GiftCardCollection;


@CrossOrigin(origins = "*")
@RequestMapping("/cardvendor")
@RestController
public class GiftCardRestController {
	
	private GiftCardCollection cardCollection;
	
	@PostConstruct
	public void init() {
		cardCollection = new GiftCardCollection();
		cardCollection.addNewCard(new GiftCard(11, 100.00));
		cardCollection.addNewCard(new GiftCard(22, 200.00));
	}
	
	@GetMapping(path ="/{name}")
	public String hello(@PathVariable String name) {
		String returnString = "Hello ";
		if (name != null)
			returnString = returnString + name;
		return returnString;
	}
	
	@GetMapping(path="/giftcards", produces = "application/json")
	public HashMap<String, GiftCard> getCollection() {
		return cardCollection.getGiftCards();
	}
	
}
