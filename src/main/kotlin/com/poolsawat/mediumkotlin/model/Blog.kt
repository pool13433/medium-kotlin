package com.poolsawat.mediumkotlin.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "BLOG")
open class Blog {

    @Id
    @Column(name = "id")
    var id: Long? = null;

    @Column(name = "title")
    lateinit var title: String

    @Column(name = "content")
    lateinit var content: String

    @Column(name = "post_date",updatable = false,insertable = false)
    @JsonFormat(pattern = "dd::MM::yyyy")
    var postDate : LocalDateTime? = null

    @Column(name = "post_status")
    var postStatus : Boolean? = null

    protected constructor()

    constructor(id : Long ,title: String, content: String, postDate: LocalDateTime, postStatus: Boolean) {
        this.id = id
        this.title = title
        this.content = content
        this.postDate = postDate
        this.postStatus = postStatus
    }


    override fun toString(): String {
        return super.toString()
    }
}