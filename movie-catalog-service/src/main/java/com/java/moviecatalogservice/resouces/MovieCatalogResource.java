package com.java.moviecatalogservice.resouces;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.moviecatalogservice.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

		return Collections.singletonList(
				new CatalogItem("Avengers: Infinity War","This is a Marvel movie",10)
				);
	}

}
