package vn.iotstar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import vn.iotstar.Entity.Lecture;
@Component
public interface ILectureService {

	void deleteAll();

	void deleteAll(Iterable<? extends Lecture> entities);

	void deleteAllById(Iterable<? extends String> ids);

	void delete(Lecture entity);

	void deleteById(String id);

	long count();

	Iterable<Lecture> findAllById(Iterable<String> ids);

	Iterable<Lecture> findAll();

	boolean existsById(String id);

	Optional<Lecture> findById(String id);

	<S extends Lecture> Iterable<S> saveAll(Iterable<S> entities);

	<S extends Lecture> S save(S entity);

	Iterable<Lecture> findByNameContaining(String name);

	List<Lecture> findByUsername(String username);

}
