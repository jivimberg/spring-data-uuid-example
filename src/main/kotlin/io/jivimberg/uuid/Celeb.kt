package io.jivimberg.uuid

import org.springframework.data.repository.CrudRepository
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Version

@Entity
class Celeb(
        @Id @Column(name = "id", length = 16, unique = true, nullable = false)
        val id: UUID? = UUID.randomUUID(),
        @Version
        val version: Long? = null,
        val name: String
)

interface CelebRepository : CrudRepository<Celeb, UUID>