package com.appleframework.security.core.auth;

import com.appleframework.security.core.utils.Assert;

/**
 * Basic concrete implementation of a {@link GrantedAuthority}.
 *
 * <p>
 * Stores a {@code String} representation of an authority granted to the
 * {@link org.springframework.security.core.Authentication Authentication} object.
 *
 * @author Luke Taylor
 */
public final class SimpleGrantedAuthority implements GrantedAuthority {

	private static final long serialVersionUID = 1491172943347407588L;
	
	private final String role;
 
    public SimpleGrantedAuthority(String role) {
    	Assert.hasText(role, "A granted authority textual representation is required");
        this.role = role;
    }
 
    public String getAuthority() {
        return role;
    }
 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
 
        if (obj instanceof SimpleGrantedAuthority) {
            return role.equals(((SimpleGrantedAuthority) obj).role);
        }
 
        return false;
    }
 
    public int hashCode() {
        return this.role.hashCode();
    }
 
    public String toString() {
        return this.role;
    }
}