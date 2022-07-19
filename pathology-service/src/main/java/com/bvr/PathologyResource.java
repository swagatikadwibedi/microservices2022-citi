package com.bvr;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {

	public PathologyResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Disease> diseases = Arrays.asList(  
			
			new Disease("d1", "Astama", "Warm water bath"),
			new Disease("d2", "Headache", "Hot water Vapour"),
			new Disease("d3", "Corona", "wash hands and stay safe")
			
			
	);
	
	@RequestMapping("/diseases")
	public DiseaseList getDiseases() {
		DiseaseList diseasesList = new DiseaseList();
		
		diseasesList.setDiseases(diseases);
		return diseasesList;
	}
	
	
	@RequestMapping("/employees/{id}")
	public Disease getDiseaseById(@PathVariable("id") String id) {
		Disease e = diseases.stream()
					 .filter(disease -> id.equals(disease.getId()))
					 .findAny()
					 .orElse(null);
		return e;
		
	}
	
	

}
