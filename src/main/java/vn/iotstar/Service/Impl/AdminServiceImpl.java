package vn.iotstar.Service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import vn.iotstar.Entity.Admin;
import vn.iotstar.Model.AdminModel;
import vn.iotstar.Reponsitories.IAdminRepository;
import vn.iotstar.Service.IAdminService;

@Builder
@Service
@AllArgsConstructor
@Data
public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminRepository adminRepo;

	@Override
	@Caching(evict = { @CacheEvict(value = "admin", allEntries = true) })
	public <S extends Admin> S save(S entity) {
		return adminRepo.save(entity);
	}

	@Override
	public <S extends Admin> Iterable<S> saveAll(Iterable<S> entities) {
		return adminRepo.saveAll(entities);
	}

	@Override

	public Optional<Admin> findById(String id) {
		return adminRepo.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return adminRepo.existsById(id);
	}

	public List<AdminModel> retreiveAll() {
		Iterable<Admin> admin = adminRepo.findAll();

		List<Admin> list = new ArrayList<Admin>();
		for (Admin e : admin) {
			list.add(e);
		}
		return list
				.parallelStream().map(house -> AdminModel.builder().id(house.getId()).username(house.getUsername())
						.name(house.getName()).phone(house.getPhone()).image(house.getImage()).build())
				.collect(Collectors.toList());

	}

	@Override
	public Iterable<Admin> findAllById(Iterable<String> ids) {
		return adminRepo.findAllById(ids);
	}

	@Override
	public long count() {
		return adminRepo.count();
	}

	@Override
	public void deleteById(String id) {
		adminRepo.deleteById(id);
	}

	@Override
	public void delete(Admin entity) {
		adminRepo.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		adminRepo.deleteAllById(ids);
	}

	@Override
	public Iterable<Admin> findByNameContaining(String name) {
		return adminRepo.findByNameContaining(name);
	}

	@Override
	public void deleteAll(Iterable<? extends Admin> entities) {
		adminRepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		adminRepo.deleteAll();
	}

	@Override
	public List<Admin> findByUsername(String username) {

		return adminRepo.findByUsername(username);
	}

	@Override
	public Iterable<Admin> findAll() {
		return adminRepo.findAll();
	}

}
