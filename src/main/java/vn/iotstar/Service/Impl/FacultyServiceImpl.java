
package vn.iotstar.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import vn.iotstar.Entity.Faculty;
import vn.iotstar.Reponsitories.IFacultyRepository;
import vn.iotstar.Service.IFacultyService;

@Service
public class FacultyServiceImpl implements IFacultyService {

	@Autowired
	IFacultyRepository facultyRepo;

	@Override
	@CachePut(value = "faculty", key = "#id", condition = "#id!=null")
	public <S extends Faculty> S save(S entity) {
		return facultyRepo.save(entity);
	}

	@Override
	@Cacheable(value = "faculty", key = "#id")
	public Iterable<Faculty> findByNameContaining(String name) {
		return facultyRepo.findByNameContaining(name);

	}

	@Override
	public <S extends Faculty> Iterable<S> saveAll(Iterable<S> entities) {
		return facultyRepo.saveAll(entities);
	}

	@Override
	@Cacheable(value = "faculty", key = "#id")
	public Optional<Faculty> findById(String id) {
		return facultyRepo.findById(id);
	}

	@Override
	@Cacheable(value = "faculty", key = "#id")
	public boolean existsById(String id) {
		return facultyRepo.existsById(id);
	}

	@Override
	@Cacheable(value = "faculty")
	public Iterable<Faculty> findAll() {
		return facultyRepo.findAll();
	}

	@Override
	public Iterable<Faculty> findAllById(Iterable<String> ids) {
		return facultyRepo.findAllById(ids);
	}

	@Override
	public long count() {
		return facultyRepo.count();
	}

	@Override

	@CacheEvict(value = "faculty", key = "#id", allEntries = true)
	public void deleteById(String id) {
		facultyRepo.deleteById(id);
	}

	@Override

	@CacheEvict(value = "faculty", allEntries = true)
	public void delete(Faculty entity) {
		facultyRepo.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		facultyRepo.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Faculty> entities) {
		facultyRepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		facultyRepo.deleteAll();
	}

}
