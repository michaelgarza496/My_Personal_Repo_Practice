package com.mikesimagination;

import com.mikesimagination.characters.Hero;
import com.mikesimagination.service.HeroService;

public class Driver {

	public static void main(String[] args) {

		Hero hero = new Hero();
		
		hero.setName("bob");
		new HeroService().createHero(hero);
	}

}
