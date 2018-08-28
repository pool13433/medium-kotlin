package com.poolsawat.mediumkotlin.repository

import com.poolsawat.mediumkotlin.model.Blog
import org.springframework.data.repository.CrudRepository

import org.springframework.stereotype.Repository

@Repository
interface BlogRepository : CrudRepository<Blog, Long> {
    abstract fun findByTitle(title: String): Blog
}