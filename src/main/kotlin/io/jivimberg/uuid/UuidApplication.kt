package io.jivimberg.uuid

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@SpringBootApplication
class UuidApplication

fun main(args: Array<String>) {
    runApplication<UuidApplication>(*args)
}

@Component
class Main(val artistRepository: ArtistRepository) {

    @PostConstruct
    fun init() {
        artistRepository.save(Artist(name = "David Bowie"))
    }
}
