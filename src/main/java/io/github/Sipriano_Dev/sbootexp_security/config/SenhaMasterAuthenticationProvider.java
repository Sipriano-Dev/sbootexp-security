package io.github.Sipriano_Dev.sbootexp_security.config;

import org.jspecify.annotations.Nullable;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SenhaMasterAuthenticationProvider implements AuthenticationProvider {
    @Override
    public @Nullable Authentication authenticate(Authentication authentication) throws AuthenticationException {

        var login = authentication.getName();
        var password = (String) authentication.getCredentials();
        String loginMaster = "master";
        String senhaMaster = "@master";

        if (login.equals(loginMaster) && password.equals(senhaMaster)) {
            return new UsernamePasswordAuthenticationToken(
                    "Sou Master", null, List.of(new SimpleGrantedAuthority("ADMIN")));
        }


        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
