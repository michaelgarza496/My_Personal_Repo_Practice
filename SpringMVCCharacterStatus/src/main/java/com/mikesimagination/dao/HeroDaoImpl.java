package com.mikesimagination.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mikesimagination.characters.Hero;

@Repository
@Component
public class HeroDaoImpl implements HeroDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void createHero(Hero hero) {
		Session session = sessionFactory.getCurrentSession();
		session.save(hero);
	}

	@Override
	public Hero getHero(Hero hero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateHero(Hero hero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteHero(Hero hero) {
		// TODO Auto-generated method stub

	}

}
