package hu.aut.bme.springldapguide

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringLdapGuideApplication

fun main(args: Array<String>) {
	runApplication<SpringLdapGuideApplication>(*args)
}
