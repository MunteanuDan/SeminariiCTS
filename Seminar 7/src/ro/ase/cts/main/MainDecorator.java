package ro.ase.cts.main;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.CardAbstract;
import ro.ase.cts.decorator.DecoratorAbstract;
import ro.ase.cts.decorator.DecoratorContactless;

public class MainDecorator {

	public static void main(String[] args) {
		CardAbstract cardAbstract = new Card("Mihai");
		cardAbstract.realizeazaPlataNormala();
		cardAbstract.realizeazaPlataOnline();
		
		System.out.println();
		
		DecoratorAbstract decoratorAbstract = new DecoratorContactless(cardAbstract);
		decoratorAbstract.realizeazaPlataNormala();
		decoratorAbstract.realizeazaPlataOnline();
		decoratorAbstract.realizeazaPlataContactless();
	}

}
