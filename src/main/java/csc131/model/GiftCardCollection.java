package csc131.model;

import java.util.HashMap;


public class GiftCardCollection {
	private GiftCardCollection gc = null;
	private HashMap<String,GiftCard> gcMap = null;
	
	
	public GiftCardCollection() {
		gcMap = new HashMap<String,GiftCard>();		
	}
	
	
	public  void addNewCard(GiftCard gc) {
		gcMap.put(gc.getId(), gc);
	}
	
	public  HashMap<String, GiftCard> getGiftCards() {
		return gcMap;
	}


	public GiftCard getCardById(String id) {
		return gcMap.get(id);
	}

}
