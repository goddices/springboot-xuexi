package demoApp.controller;

 
import java.util.ArrayList;
import java.util.List; 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demoApp.model.Person;

@RestController
public class SampleController {
	@RequestMapping("/") 
    public String home() {
        return "Hello World!";
    }
	
	@RequestMapping("/person/{id}")
	public String get(@PathVariable int id) {
		return String.valueOf(id);
	}
	
	//annotation about GET/POST  this is a GET
	@RequestMapping(path="/persons", method=RequestMethod.GET)
	public List<Person> getAll () {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1,"zhufeng",3));
		list.add(new Person(2,"wanglongsheng",4));
		list.add(new Person(3,"dingjin",5));
		list.add(new Person(4,"huanglin",6));
		return list;
	}
	
	//another annotation about GET/POST  ,this is a POST
	@PostMapping(path="/person")
	@ResponseBody
	public boolean add(@RequestHeader HttpHeaders headers,@RequestBody Person person) {
		List<String> header1 = headers.get("user-token");
		if(header1 !=null && header1.size()>0 && header1.get(0)!=null){
			System.out.println(header1.get(0));
		}
		System.out.println(person);
		return true; 
	}
 
}
