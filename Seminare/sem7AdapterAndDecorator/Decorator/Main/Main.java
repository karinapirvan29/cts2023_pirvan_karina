package Decorator.Main;

import Decorator.AbstractDecorator;
import Decorator.Card;
import Decorator.CardContactless;
import Decorator.CardContactlessVirtual;
import Decorator.ICard;

public class Main {

//	public static void main(String[] args) {
//		ICard card = new Card();
//		card.payOnline(1000);
//		card.payPOS(2000);
//		
//		AbstractDecorator decorator = new CardContactless(card);
//		decorator.payContactless(500);
//
//	}
	
	
	
	public static void aplicatie(ICard card) {
		card.payOnline(1000);
		card.payPOS(2000);
	}
	
	public static void main(String[] args) {
		ICard card = new Card();
		

		AbstractDecorator decorator = new CardContactless(card);
		AbstractDecorator decoratorVirtual = new CardContactlessVirtual(card);
		decorator.payContactless(500);
		decoratorVirtual.payContactless(480);
		aplicatie(decorator);
	}

}
