package com.sarita.flightreservation.services;

//@Service
public class SecurityServiceImpl {//implements SecurityService {
//	
//	@Autowired
//	UserDetailsService userDetailsService;
//	@Autowired
//	AuthenticationManager authenticationManger;
//	@Autowired
//	SecurityContextRepository securityContextRepo;
//	@Autowired
//	SecurityContext context;
//
//	@Override
//	public boolean login(String username, String password,HttpServletRequest request,HttpServletResponse response ) {
//		 
//		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//		
//		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDetails,password,
//				userDetails.getAuthorities());  
//		
//		 authenticationManger.authenticate(token);
//		boolean result = token.isAuthenticated();
//		if(result) {
//			SecurityContextHolder.getContext().setAuthentication(token);
//			securityContextRepo.saveContext(context, request, response);
//		}
//		
//		return result;
//	}
//
}
