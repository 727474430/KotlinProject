package com.raindrop.pro.dao

import com.raindrop.pro.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by wangliang on 2017/6/7.
 */

@Repository
interface UserRepository : CrudRepository<User, Long> {
    fun findUserById(userId: String): User
}