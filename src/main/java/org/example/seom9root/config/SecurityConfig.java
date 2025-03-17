package org.example.seom9root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // 모든 요청을 인증 없이 허용
                )
                .formLogin(form -> form
                        .loginPage("/login") // 커스텀 로그인 페이지 설정 가능
                        .defaultSuccessUrl("/", true) // 로그인 성공 시 이동할 페이지
                        .permitAll()
                )
                .logout(logout -> logout.logoutUrl("/logout").permitAll())
                .csrf(csrf -> csrf.disable()) // CSRF 보안 비활성화
                .formLogin(login -> login.disable()) // 로그인 폼 비활성화
                .httpBasic(basic -> basic.disable()); // 기본 인증 비활성화

        return http.build();
    }
}
