package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ask.models.Ask;
import repositories.AskRepository;

@Service
public class AskService {
	@Autowired
	 private AskRepository askRep;
	 private static final List<Ask> INITIAL_POSTS = Arrays.asList(
	            new Ask("Запитуй та відповідай!", "images/logo.png")
	            ); 

	        /*private List<Ask> posts = new ArrayList<Ask>(INITIAL_POSTS);

	        public List<Ask> getRecentPosts() {
	            return posts;
	        }
	        */
	        @Transactional
	        public void saveAsk()
	        {	         
	         askRep.save(INITIAL_POSTS);
	        }
	        
	        List<Ask> posts = new ArrayList<Ask>();
	             
	        public List<Ask> getRecentAsk() {
	               saveAsk();
	               return (List<Ask>) askRep.findAll(); 
	            
	              }
	        
}