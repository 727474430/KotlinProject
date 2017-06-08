package com.raindrop.pro.controller

import com.raindrop.pro.dao.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wangliang on 2017/6/7.
 */

@RestController(value = "/user")
open class UserController(@Autowired userRepository: UserRepository) {

    @RequestMapping(value = "/")
    fun index(): String = "hello word"
}