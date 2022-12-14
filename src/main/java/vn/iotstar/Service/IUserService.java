package vn.iotstar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import vn.iotstar.Entity.User;

@Component
public interface IUserService {

	void deleteAll();

	void deleteAll(Iterable<? extends User> entities);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(User entity);

	void deleteById(String id);

	long count();

	Iterable<User> findAllById(Iterable<String> ids);

	Iterable<User> findAll();

	boolean existsById(String id);

	Optional<User> findById(String id);

	<S extends User> Iterable<S> saveAll(Iterable<S> entities);

	<S extends User> S save(S entity);

	Iterable<User> findByUsernameContaining(String username);

	List<User> findByUsername(String username);

	User login(String email, String password);

}
