package com.korea.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.korea.user.model.UserEntity;
import com.korea.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository repository ;
	
	//추가
	public List<UserEntity> create(UserEntity entity){
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		if(entity.getId() == 0) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}
			
		repository.save(entity);
		
		log.info("Entity id : {} is saved", entity.getId());
		
		return repository.findByEmail(entity.getEmail());		
	}
	//조회
	public List<UserEntity> getAllUsers(String email){
		return repository.findByEmail(email);		
	}
	//수정
	public List<UserEntity> getUserByEmail(UserEntity entity){
		validate(entity);
		
		Optional<UserEntity> original = repository.findById(entity.getId());
				
		if(original.isPresent()) {
			UserEntity useren = original.get();
			useren.setName(entity.getName());
			useren.setEmail(entity.getEmail());
			
			repository.save(useren);
		}
		return getAllUsers(entity.getEmail());
	}
	//유효한지 검사
	private void validate(UserEntity entity) {
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		if(entity.getId() == 0) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}
	}
	
	
}
