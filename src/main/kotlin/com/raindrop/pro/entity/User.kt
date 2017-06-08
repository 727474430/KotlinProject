package com.raindrop.pro.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * Created by wangliang on 2017/6/7.
 */

@Entity
data class User(
        @Id
        @GeneratedValue
        val id: Long,
        val username: String,
        val password: String,
        val email: String,
        val phone: String
)