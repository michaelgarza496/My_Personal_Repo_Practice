package com.mikesimagination.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikesimagination.characters.Hero;
import com.mikesimagination.dao.HeroDao;

@Service
@Transactional
public class HeroService {

	@Autowired
	private HeroDao heroDao;
	
	public void createHero(Hero hero){
		heroDao.createHero(hero);
		System.out.println("I'm in the hero serive class");
	}
}
