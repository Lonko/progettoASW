package asw.springboot.s;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainServiceController {

	private String s1Uri = "http://localhost:8081/S1/";
	private String s2Uri = "http://localhost:8082/S2/";
	
    /* Restituisce il numero di film in cui 
     * l'{attore} ha recitato ed il film per il 
     * quale è più famoso
     * acceduta come GET /S/{attore} */
	@RequestMapping("/S/{attore}")
	public String getFilm(Map<String, Object> model, @PathVariable String attore) {
		String film    = getString(this.s1Uri+attore);
		int numeroFilm = getInt(this.s2Uri+attore);
		return attore+" ha recitato in "+numeroFilm+" film ed il film per il quale è più famoso è "+film+".";
	}

    /* Restituisce il numero di film in cui l'{attore}
     * ed il personaggio interpretato nel {film}
     * acceduta come GET /S/{attore}/{film} */
	@RequestMapping("/S/{attore}/{film}")
    public String getPersonaggio(Map<String, Object> model, @PathVariable String attore, @PathVariable String film) {
		String personaggio = getString(this.s1Uri+attore+"/"+film);
		int numeroFilm = getInt(this.s2Uri+attore);
		return attore+" ha recitato in "+numeroFilm+" film ed interpretato il ruolo di "
				+personaggio+" in "+film+".";
    }	
	
	private int getInt(String uri){
		return new RestTemplate().getForObject(uri, Integer.class);
	}
	
	private String getString(String uri){
		return new RestTemplate().getForObject(uri, String.class);
	}
}
