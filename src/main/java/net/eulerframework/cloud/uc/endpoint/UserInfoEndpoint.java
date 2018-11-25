/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.eulerframework.cloud.uc.endpoint;

import net.eulerframework.cloud.uc.entity.User;
import net.eulerframework.cloud.uc.service.UserInfoService;
import org.eulerframework.web.core.base.controller.ApiSupportWebController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserInfoEndpoint extends ApiSupportWebController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("{userId}")
    public User getUserById(@PathVariable("userId") String userId) {
        return this.userInfoService.findUserById(userId);
    }
}
