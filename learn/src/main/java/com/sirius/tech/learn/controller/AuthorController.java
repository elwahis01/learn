package com.sirius.tech.learn.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirius.tech.learn.dto.AutorBasicDTO;
import com.sirius.tech.learn.dto.AutorFullDTO;
import com.sirius.tech.learn.service.IAuthorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("author")
public class AuthorController {
	
	@Autowired
	private IAuthorService authorService;
	
	@PostMapping
	public ResponseEntity< AutorFullDTO> create(@RequestBody AutorFullDTO autor) throws Exception {
		return ResponseEntity.ok(this.authorService.create(autor));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AutorFullDTO> update(@RequestBody AutorFullDTO autor) throws Exception {
		return ResponseEntity.ok(this.authorService.update(autor));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AutorFullDTO> getOne(@PathVariable Long id) throws Exception {
		return ResponseEntity.ok(this.authorService.findById(id));
	}

	@GetMapping
	public ResponseEntity<List<AutorBasicDTO>> getAll() {
		return ResponseEntity.ok(authorService.findAll());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws AccessDeniedException, Exception {
		 authorService.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
