//package com.sri.springbasicauth.config;
//
//import lombok.NoArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("admin").password("password1").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("user").password("password2").roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//               // The below one enables security for all APIs
//               //http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
//
//                // The below one enables security for specific URI /rest
//               //http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();
//
//
//                // The below request allows only requests with ADMIN role
//                //  localhost:8084/rest/auth/getMsg with uid "user" and password "password2" should fail with access forbidden
//                //  localhost:8084/rest/auth/getMsg with uid "admin" and password "password1" should be good
//                //  not sure why localhost:8084/noauth/rest/sayhi prompting for uid/pwd
//                http.authorizeRequests().antMatchers("/rest/**").hasRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
//
//
//    }
//
//    @Bean
//    public static NoOpPasswordEncoder passwordEncoder(){
//        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//    }
//}
