package com.sirius.tech.learn.service.impl;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sirius.tech.learn.dto.IDTO;
import com.sirius.tech.learn.entity.IEntity;
import com.sirius.tech.learn.service.IAbstractLearnService;

public abstract class AbstractLearnServiceImpl<Entity extends IEntity, BasicDTO extends IDTO, FullDTO extends BasicDTO, IEntityDAO extends JpaRepository<Entity, Long>>
		implements IAbstractLearnService<Entity, BasicDTO, FullDTO, IEntityDAO> {

	@Autowired
	private ModelMapper modelMapper;

	private Class<Entity> entityClass;
	private Class<BasicDTO> basicClass;
	private Class<FullDTO> fullClass;

	AbstractLearnServiceImpl(Class<Entity> entityClass, Class<BasicDTO> basicClass, Class<FullDTO> fullClass) {

		this.entityClass = entityClass;
		this.basicClass = basicClass;
		this.fullClass = fullClass;
	}

	@Override
	public FullDTO create(FullDTO entity) throws Exception {
		Entity entitySaved = getDAO().save(modelMapper.map(entity, entityClass));

		return modelMapper.map(entitySaved, fullClass);
	}

	@Override
	public FullDTO update(FullDTO entity) throws Exception, AccessDeniedException {
		if (ifEntityExistById(entity.getId())) {
			Entity entityUpdated = getDAO().save(modelMapper.map(entity, entityClass));

			return modelMapper.map(entityUpdated, fullClass);
		}

		throw new Exception("Not Object With This Id : " + entity.getId());

	}

	@Override
	public FullDTO findById(Long id) throws Exception {
		Entity foundEntity = this.getDAO().findById(id).orElse(null);

		return modelMapper.map(foundEntity, fullClass);
	}

	@Override
	public void deleteById(Long id) throws AccessDeniedException, Exception {
		if (ifEntityExistById(id)) {
			this.getDAO().deleteById(id);
		}

		throw new Exception("Not Object With This Id : " + id);
	}

	@Override
	public boolean ifEntityExistById(Long id) throws Exception {

		return (this.getDAO().findById(id).isPresent());
	}

	@Override
	public List<BasicDTO> findAll() {
		return this.getDAO().findAll().stream().map(e -> {
			return modelMapper.map(e, basicClass);
		}).toList();
	}
}
