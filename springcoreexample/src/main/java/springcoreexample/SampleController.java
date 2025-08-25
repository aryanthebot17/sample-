package springcoreexample;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping 
	public String welcome() {
		return " Welcome to the spring boot";
	}
	
	@GetMapping("/getreq")
	public String anotherGEt() {
		return " another get requeust";
	}
	
	@PostMapping
	public String postMethod() {
		
		return " this is post request";
	}
	
	@PutMapping
	public String putMethod() {
		return " this is put method";
		
	}
	
	
	@DeleteMapping
	public String deleteMethod() {
			
			return " this is the delete method";
		}
	
	
	
	}


