package com.sirius.tech.learn.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirius.tech.learn.dto.ArticleBasicDTO;
import com.sirius.tech.learn.dto.ArticleFullDTO;
import com.sirius.tech.learn.service.IArticleService;

@RestController
@RequestMapping("articles")
public class ArticleController {

	@Autowired
	private IArticleService articleService;

	@PostMapping
	public ResponseEntity<ArticleFullDTO> create(@RequestBody ArticleFullDTO article) throws Exception {
		return ResponseEntity.ok(this.articleService.create(article));
	}

	@PutMapping("/{id}")
	public ResponseEntity<ArticleFullDTO> update(@RequestBody ArticleFullDTO article) throws Exception {
		return ResponseEntity.ok(this.articleService.update(article));
	}

	@GetMapping("/{id}")
	public ResponseEntity<ArticleFullDTO> getOne(@PathVariable Long id) throws Exception {
		return ResponseEntity.ok(this.articleService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<List<ArticleBasicDTO>> getAll() {
		return ResponseEntity.ok(articleService.findAll());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) throws AccessDeniedException, Exception {
		articleService.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
