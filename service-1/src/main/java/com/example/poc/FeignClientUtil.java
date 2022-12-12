package com.example.poc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "sleuthpoc", url = "http://localhost:8083/")
public interface FeignClientUtil {
	
	@GetMapping(value = "/secondservice")
	public String secondService();

}
