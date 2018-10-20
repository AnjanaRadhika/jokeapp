package com.learn.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.joke.services.JokeService;

@Controller
public class JokeController {

	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping("/")
	public String showJoke(Model model) {
		model.addAttribute("Joke", jokeService.getJoke());
		return "chucknorris";
	}
}
