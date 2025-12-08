package com.korea.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.layer.dto.ResponseDTO;
import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	private final UserService service;
	
	public UserController(UserService service) {
		this.service = service;
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<?> createUser(@RequestBody UserDTO dto){
		try {
			int tempraryUserId = 0;
			UserEntity entity = UserDTO.toEntity(dto);
			
			entity.setId(0);
			
			entity.setId(tempraryUserId);
			
			List<UserEntity> entites = service.create(entity);
			
			List<UserDTO> dtos = new ArrayList<>();
			
			for(UserEntity u : entites) {
				dtos.add(new UserDTO(u));
			}
			ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
			return ResponseEntity.ok().body(response);
			
		} catch (Exception e) {
			String error = e.getMessage();
			
			ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().error(error).build();
			return ResponseEntity.ok().body(response);
		}
		
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllUsers(){
		String temporaryUserEmail = "temporary-user";
		
		List<UserEntity> entities = service.getAllUsers(temporaryUserEmail);
		List<UserDTO> dtos = new ArrayList<UserDTO>();
		
		for(UserEntity u : entities) {
			dtos.add(new UserDTO(u));
		}
		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PutMapping
	public ResponseEntity<?> updateUser(@RequestBody UserDTO dto){
		int temporaryUserId = 0;
		UserEntity entity = UserDTO.toEntity(dto);
		entity.setId(temporaryUserId);
		
		List<UserEntity> entities = service.getUserByEmail(entity);
		
		List<UserDTO> dtos = entities.stream().map(UserDTO::new).collect(Collectors.toList());
		
		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);		
	}
	
//	삭제하기
//	ID를 가지고 유저를 삭제하는 기능 만들기
//	UserService
//	메서드명 deleteUser
//	사용자가 존재하는지 확인
//	삭제 되면 true, 삭제 안되면 false를 반환
//	UserController
//	HTTP메서드 : DELETE
//	메서드명 : deleteUser
//	리소스 : /{id}
//	삭제에 성공하면 "User deleted successfully"
//	실패하면 .status(404).body("user not found with id " + id)
	
	
	
}
