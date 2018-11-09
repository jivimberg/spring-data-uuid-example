package io.jivimberg.uuid

import org.springframework.data.repository.CrudRepository
import java.util.*
import javax.persistence.Entity

@Entity
class Artist(
        id: UUID? = null,
        val name: String
) : AssignedIdBaseEntity(id)

interface ArtistRepository : CrudRepository<Artist, UUID>