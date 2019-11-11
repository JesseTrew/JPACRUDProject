package com.skilldistillery.jurassicpark.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jurassicpark.data.DinoDao;
import com.skilldistillery.jurassicpark.entities.Dinosaur;

@Controller
public class DinoController {

	@Autowired
	private DinoDao dao;

	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "getDino.do", method = RequestMethod.GET)
	public ModelAndView getDino(@RequestParam("did") int did) {
		ModelAndView mv = new ModelAndView();

		Dinosaur dino = dao.findById(did);

		mv.addObject("dino", dino);
		mv.setViewName("dino/show");
		return mv;
	}
	
	@RequestMapping(path = "updateDinoForm.do", method = RequestMethod.GET)
	public ModelAndView getUpdateDinoForm(@RequestParam("did") int did) {
		ModelAndView mv = new ModelAndView();
		
		Dinosaur dino = dao.findById(did);
		
		mv.addObject("dino", dino);
		mv.setViewName("updateDinoForm");
		return mv;
	}
	
	@RequestMapping(path = "deleteDinoResult.do", method = RequestMethod.GET)
	public ModelAndView getDeleteDinoResult(@RequestParam("did") int did) {
		ModelAndView mv = new ModelAndView();
		dao.removeDino(did);
		mv.setViewName("dino/deleteDinoResult");
		return mv;
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<Dinosaur> dinos = dao.findAllDinos();
		model.addAttribute("dinos", dinos);

		return "index";
	}
	
	@RequestMapping(path = "addDinoForm.do", method = RequestMethod.GET)
	public String getAddDino(Model model) {
		return "addDinoForm";
	}
	

	@RequestMapping(path = "addDino.do", method = RequestMethod.POST)
	public ModelAndView addNewDino(@RequestParam("name") String name, @RequestParam("height") int height,
			@RequestParam("weight") int weight, @RequestParam("flying") boolean flying,
			@RequestParam("diet") String diet, @RequestParam("specialChars") String specialChars,
			@RequestParam("species") String species) {
		ModelAndView mv = new ModelAndView();
		Dinosaur dino = new Dinosaur(name, height, weight, flying, diet, specialChars, species);
		dino = dao.addNewDino(dino);

		mv.addObject("dino", dino);
		mv.setViewName("dino/addDinoResult");
		return mv;
	}
	
	@RequestMapping(path = "updateDino.do", method = RequestMethod.POST)
	public ModelAndView updateDino(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("height") int height,
			@RequestParam("weight") int weight, @RequestParam("flying") boolean flying,
			@RequestParam("diet") String diet, @RequestParam("specialChars") String specialChars,
			@RequestParam("species") String species) {
		ModelAndView mv = new ModelAndView();
		
		Dinosaur dino = dao.updateDino(id, name, height, weight, flying, diet, specialChars, species);
		
		mv.addObject("dino", dino);
		mv.setViewName("dino/updateDinoResult");
		
		return mv;
	}
}