package com.raindrop.pro.entity

import com.raindrop.pro.dao.UserRepository
import org.slf4j.LoggerFactory.getLogger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner

/**
 * Created by wangliang on 2017/6/7.
 */

open class StartupRunner : CommandLineRunner {
    protected val logger = getLogger(StartupRunner::class.java)

    @Autowired
    private var userRepository: UserRepository? = null

    override fun run(vararg p0: String?) {
        logger.info("Number of users: ${userRepository?.findAll()}")
    }

}