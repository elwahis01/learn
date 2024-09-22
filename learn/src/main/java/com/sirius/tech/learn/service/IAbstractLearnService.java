package com.sirius.tech.learn.service;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.tech.learn.dto.IDTO;
import com.sirius.tech.learn.entity.IEntity;

public interface IAbstractLearnService<Entity extends IEntity, BasicDTO extends IDTO, FullDTO extends BasicDTO, IEntityDAO extends JpaRepository<Entity, Long>>{
	public FullDTO create(FullDTO entity) throws Exception;
	
	public FullDTO update(FullDTO entity) throws Exception, AccessDeniedException;
	
	public FullDTO findById(Long id) throws Exception;
	
	public void deleteById(Long id) throws AccessDeniedException, Exception;
	
	public boolean ifEntityExistById(Long id) throws Exception;
	
	public List<BasicDTO> findAll();
	
	public IEntityDAO getDAO();
	
}
