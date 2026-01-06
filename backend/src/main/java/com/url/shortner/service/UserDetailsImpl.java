package com.url.shortner.service;

import com.url.shortner.models.User;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

@Data
public class UserDetailsImpl implements UserDetails {

    private Long id;
    private String username;
    private String password;
    private String email;
    private Collection<? extends GrantedAuthority> authorities;

    public static UserDetailsImpl build(User user) {

        GrantedAuthority authority =
                new SimpleGrantedAuthority(user.getRole());

        UserDetailsImpl details = new UserDetailsImpl();
        details.id = user.getId();
        details.username = user.getUsername();
        details.password = user.getPassword();
        details.email = user.getEmail();
        details.authorities = Collections.singletonList(authority);

        return details;
    }

    @Override public boolean isAccountNonExpired() { return true; }
    @Override public boolean isAccountNonLocked() { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
    @Override public boolean isEnabled() { return true; }
}
