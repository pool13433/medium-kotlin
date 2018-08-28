package com.poolsawat.mediumkotlin.repository

import com.poolsawat.mediumkotlin.model.Blog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BlogRepository : JpaRepository<Blog, Int> {
    abstract fun findByTitle(title: String): List<Blog>

}