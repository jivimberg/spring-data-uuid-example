package io.jivimberg.uuid

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm
import org.springframework.data.repository.CrudRepository
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Version

@Entity
class Celeb(
        @Id @Column(name = "id", length = 16, unique = true, nullable = false)
        val id: UUID = UUID.randomUUID(),
        @Version
        val version: Long? = null,
        val name: String
) {
    override fun equals(other: Any?) = when {
        this === other -> true
        javaClass != other?.javaClass -> false
        id != (other as Celeb).id -> false
        else -> true
    }

    override fun hashCode(): Int = id.hashCode()
}

interface CelebRepository : CrudRepository<Celeb, UUID>