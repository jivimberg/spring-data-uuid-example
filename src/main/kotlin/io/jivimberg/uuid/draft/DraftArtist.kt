package io.jivimberg.uuid.draft

import org.springframework.data.repository.CrudRepository
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class DraftArtist(
        @Id val id: UUID = UUID.randomUUID(),
        val name: String
)

interface DraftArtistRepository : CrudRepository<DraftArtist, UUID>