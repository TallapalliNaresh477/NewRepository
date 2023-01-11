package com.online.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.store.model.Movies;
import com.online.store.service.OnlineServiceImpl;

@Controller
public class OnlineController {

	@Autowired
	private OnlineServiceImpl onlineServiceImpl;

	@GetMapping("/home/addMovies")
	public String addNewMovies(Model model) {
		Movies movies = new Movies();
		model.addAttribute("movies", movies);
		return "addMovies";

	}

	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/home/save")
	public String saveMovie(@ModelAttribute("movies") Movies movies) {
		onlineServiceImpl.save(movies);
		return "redirect:/home";
	}

	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/home/showFormForUpdate/{id}")
	public String updateForm(@PathVariable(value = "id") Integer id, Model model) {
		Movies movies = onlineServiceImpl.getById(id);
		model.addAttribute("movies", movies);

		return "update";

	}

	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/home/deleteMovie/{id}")
	public String deleteThroughId(@PathVariable(value = "id") Integer id) {
		onlineServiceImpl.deleteViaId(id);
		return "redirect:/home";
	}

	@RequestMapping(path = { "/home", "/home/search" })
	public String home(Model model, Movies movies, String keyword) {
		if (keyword != null) {
			List<Movies> list = onlineServiceImpl.getByKeyword(keyword);
			model.addAttribute("movielist", list);
		} else {
			model.addAttribute("movielist", onlineServiceImpl.getAllMovies());

		}
		return "home";

	}

}
