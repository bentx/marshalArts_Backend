package com.marshal.arts.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.marshal.arts.backend.bean.ActiveUser;
import com.marshal.arts.backend.bean.User;
import com.marshal.arts.backend.config.JwtTokenUtil;
import com.marshal.arts.backend.model.JwtRequest;
import com.marshal.arts.backend.model.JwtResponse;
import com.marshal.arts.backend.repo.ActiveUserRepo;
import com.marshal.arts.backend.repo.UserRepo;
import com.marshal.arts.backend.service.JwtUserDetailsService;

@RestController
@CrossOrigin
public class marshalcontroller {
	
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private ActiveUserRepo ActiveUserRepo;
	
	@Autowired
	private UserRepo UserRepo;
	
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new JwtResponse(token));
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
	
	@GetMapping("test")
	@CrossOrigin
	public List<ActiveUser> test() {
		ActiveUser user = new ActiveUser();
		user.setActiveuser(200);
		user.setMonth("Sep");
		ActiveUser user1 = new ActiveUser();
		user1.setActiveuser(300);
		user1.setMonth("Oct");
		ActiveUser user2 = new ActiveUser();
		user2.setActiveuser(400);
		user2.setMonth("Nov");
		ActiveUser user3 = new ActiveUser();
		user3.setActiveuser(200);
		user3.setMonth("Dec");
		
		ActiveUserRepo.save(user);
		ActiveUserRepo.save(user1);
		ActiveUserRepo.save(user2);
		ActiveUserRepo.save(user3);
		

		
		return ActiveUserRepo.findAll();
		
	}
	@GetMapping("/result/{mob}")
	@CrossOrigin
	public List<User> testno(@PathVariable String mob) {
		
		return UserRepo.findByMobile(mob);
		
	}
	
	@GetMapping("activeuser")
	@CrossOrigin
	public List<ActiveUser> ActiveUser() {
		
		return ActiveUserRepo.findAll();
		
	}
	
	
	@PostMapping("/addUser")
	@CrossOrigin

	public User  addUser( @RequestBody User user) {
		user.setId(user.getName()+user.getMobile());
		UserRepo.save(user);
		System.out.println(user.getName());
		System.out.println(user.getName());
		System.out.println(user.getName());
		return user;
		
	}
	
	@GetMapping("/users")
	public List<User>  users( ) {
		List<User>users=UserRepo.findAll();
		return users;
		
	}

	@GetMapping("/users/{name}")
	public List<User>  contains( @PathVariable String name) {
		System.out.println(name);
		List<User>users=UserRepo.findByNameContains(name);
		return users;
		
	}
	@DeleteMapping("/user")
	public String users(  @RequestBody  User user) {
		UserRepo.delete(user);
		return "Success";
		
	}
}
