package com.newha.controller;

import java.io.IOException;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("UserController V1")
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class ArticleController {

	@ApiOperation(value = "기사 파싱", notes = "url을 받아 기사를 파싱", response = Map.class)
	@PostMapping(value = "/article")
	public void getArticle(@RequestBody String url) throws IOException {
		Connection.Response response = Jsoup.connect(url)
                .method(Connection.Method.GET)
                .execute();
		Document document = response.parse();
		
//		String html = document.text();
		Elements temp1 = document.select("#articleBody");
		Elements temp2 = document.select("#articleTitle");
		String text = temp1.text();
		String title = temp2.text();
//		System.out.println(text);
		System.out.println(title);
	}
	
}
