package com.sarita.flightreservation.services;

import org.springframework.stereotype.Service;
@Service
public class UserDetailsServicesImpl {//implements UserDetailsService {
//	@Autowired
//	UserRepository userRepository;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	
//	User user=userRepository.findByEmail(username);
//	if(user==null) {
//		
//		throw new UsernameNotFoundException("User not found for email"+username);
//		
//	}
//	
//	return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),user.getRoles());
//}
}
