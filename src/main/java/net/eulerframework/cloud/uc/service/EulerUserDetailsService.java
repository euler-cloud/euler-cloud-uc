///*
// * Copyright 2013-2019 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package net.eulerframework.cloud.uc.service;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//
//@Service("userDetailsService")
//public class EulerUserDetailsService implements UserDetailsService {
//    private final UserDetails USER = new UserDetails() {
//        @Override
//        public Collection<? extends GrantedAuthority> getAuthorities() {
//            return null;
//        }
//
//        @Override
//        public String getPassword() {
//            return "{plain-text}123";
//        }
//
//        @Override
//        public String getUsername() {
//            return "demo";
//        }
//
//        @Override
//        public boolean isAccountNonExpired() {
//            return true;
//        }
//
//        @Override
//        public boolean isAccountNonLocked() {
//            return true;
//        }
//
//        @Override
//        public boolean isCredentialsNonExpired() {
//            return true;
//        }
//
//        @Override
//        public boolean isEnabled() {
//            return true;
//        }
//    };
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if (USER.getUsername().equals(username)) {
//            return USER;
//        } else {
//            throw new UsernameNotFoundException("User '" + username + "' was not found.");
//        }
//    }
//}
