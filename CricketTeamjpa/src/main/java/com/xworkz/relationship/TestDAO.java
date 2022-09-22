package com.xworkz.relationship;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.relationship.dto.Country;
import com.xworkz.relationship.dto.Player;
import com.xworkz.relationship.dto.State;
import com.xworkz.relationship.dto.Team;

public class TestDAO {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teamUnit");
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		//State object has to be created
//		State wal = new State();
//		wal.setName("Wales");
//		State cam = new State();
//		cam.setName("Cambridge");
//		State bri = new State();
//		bri.setName("Bristol");
//		State ply = new State();
//		ply.setName("Plymouth");
		
		State kar = new State();
		kar.setName("Karnataka");
		State tam = new State();
		tam.setName("TamilNadu");
		State mah = new State();
		mah.setName("Maharashtra");
		State jha = new State();
		jha.setName("Jharkhand");
		//add all states to  one array list
		
		ArrayList<State> states = new ArrayList<State>();
//		states.add(wal);
//		states.add(cam);
//		states.add(bri);
//		states.add(ply);
		
		states.add(kar);
		states.add(tam);
		states.add(mah);
		states.add(jha);
		
		
		//Country
//		Country eng = new Country();
//		eng.setName("England");
//		eng.setCode("44");
//		eng.setListOfState(states); 		//adding states arraylist
		Country ind = new Country();
		ind.setName("India");
		ind.setCode("91");
		ind.setListOfState(states);
		
		
		//team
		Team teamInd = new Team();
		teamInd.setName("Team India");
		
		Player plyr = new Player();		
		plyr.setName("Suresh Raina");
		plyr.setSalary(77800);
		plyr.setTeam(teamInd);
		plyr.setCountry(ind);
		
		//manager.persist(plyr);
		Player player = manager.find(Player.class, 2);
		System.out.println(player);
		
		transcation.commit();
		manager.close();
		factory.close();
		
		
	}

}