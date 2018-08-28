package com.poolsawat.mediumkotlin.controller

import com.poolsawat.mediumkotlin.model.Blog
import com.poolsawat.mediumkotlin.repository.BlogRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@RestController
class MediumController {

    //private val logger = LoggerFactory.getLogger(this.javaClass)

    @Autowired
    lateinit var repository : BlogRepository

    @GetMapping("/")
    fun helloMedium() = "Hello Medium"


    @RequestMapping("/save")
    fun process(): String{
        repository.save(Blog(1, "MomentJs", "What is MomentJs?", LocalDateTime.now(),true))
        repository.save(Blog(2, "AspectJ", "What is Aspectj ?", LocalDateTime.now(),false))
        repository.save(Blog(3, "Jpa", "What is Jpa?", LocalDateTime.now(),true))
        repository.save(Blog(4, "Oil", "What is Oil?", LocalDateTime.now(),true))
        repository.save(Blog(5, "IDM", "What is IDM?", LocalDateTime.now(),true))
        return "Done"
    }

    @RequestMapping("/findall")
    fun findAll(): MutableList<Blog> {
        return repository.findAll()
    }

    @RequestMapping("/find/id/{id}")
    fun findById(@PathVariable("id") id: Int): Optional<Blog> {
        return repository.findById(id);
    }

    @RequestMapping("/find/title/{title}")
    fun fetchDataByLastName(@PathVariable("title") title: String): List<Blog> {
        return repository.findByTitle(title)
    }

}