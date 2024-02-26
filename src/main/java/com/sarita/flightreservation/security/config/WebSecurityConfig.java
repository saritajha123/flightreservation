package com.sarita.flightreservation.security.config;

//@Configuration
public class WebSecurityConfig {
//	@Autowired
//	UserDetailsService userDetailsService;
//	
////	@Bean
////	SecurityContextRepository securityContextRepo() {
////		return new DelegatingSecurityContextRepository(new RequestAttributeSecurityContextRepository(),
////	           new HttpSessionSecurityContextRepository());
////	}
//	
//	@Bean
//	AuthenticationManager authManager() {
//		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider() ;
//		authProvider.setUserDetailsService(userDetailsService);
//		authProvider.setPasswordEncoder(bcryptPasswordEncoder());
//		return new ProviderManager(authProvider);
//	}
//	
//	@Bean
//	BCryptPasswordEncoder bcryptPasswordEncoder() {
//		
//		return new BCryptPasswordEncoder();
//	}
//	
////	@Bean
////	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
////		return http.authorizeRequests().antMatchers("/admin/showAddFlight")
////		.hasRole("ADMIN")
////		.antMatchers("/findFlights","/showCompleteReservation*",
////				"/completeReservation","reservationConfirmation")
////		.authenticated()
////		.antMatchers("/showReg","/login/registerUser","/registerUser","login/login",
////				"/login","/","index.html","/reservations/*")
////		.permitAll().and().csrf().disable()
////		.securityContext((securityContext)->securityContext.requireExplicitsave(true)).build();
////		
////		 http
////            .authorizeHttpRequests((authz) -> authz
////                .requestMatchers(new AntPathRequestMatcher("/admin/showAddFlight")).hasRole("ADMIN")
////                .requestMatchers(new AntPathRequestMatcher("/findFlights"), 
////                		new AntPathRequestMatcher("/showCompleteReservation*"), new AntPathRequestMatcher("/completeReservation")
////                		, new AntPathRequestMatcher("reservationConfirmation")).authenticated()
////                .requestMatchers(new AntPathRequestMatcher("/showReg"), new AntPathRequestMatcher("/login/registerUser"), 
////                		new AntPathRequestMatcher("/registerUser"), new AntPathRequestMatcher("login/login"), new AntPathRequestMatcher("/login")
////                		,new AntPathRequestMatcher("index.html"), new AntPathRequestMatcher("/reservations/*")).permitAll().and().csrf().disable()
////                .securityContext((securityContext)->securityContext.requireExplicitsave(true))
////            );
////        return http.build();
////		
////	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
}
