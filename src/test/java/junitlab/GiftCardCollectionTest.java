package junitlab;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import csc131.model.GiftCard;
import csc131.model.GiftCardCollection;

class GiftCardCollectionTest {

	@Test
	void testAddNewCard() {
		GiftCardCollection cardCollection = new GiftCardCollection();
		cardCollection.addNewCard(new GiftCard(11, 100.00));
		int numCards = cardCollection.getGiftCards().size();
		assertEquals("Number in collection", 1, numCards);
	}

	

}
