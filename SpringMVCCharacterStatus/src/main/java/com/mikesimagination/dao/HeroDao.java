package com.mikesimagination.dao;

import com.mikesimagination.characters.Hero;

public interface HeroDao {

	//CREATE
	public void createHero(Hero hero);
	
	//READ
	public Hero getHero(Hero hero);
	
	//UPDATE
	public void updateHero(Hero hero);
	
	//DELETE
	public void deleteHero(Hero hero);
}
