package com.mhavez.D_D

import com.mhavez.D_D.joueurs.Joueur
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DDApplication

fun main(args: Array<String>) {
	runApplication<DDApplication>(*args)

	val joueur1 = Joueur(
		id = "1",
		playerName = "Galadriel",
		gender = "femme",
		jobName = "Ensorceleuse",
		strength = 18,
		dexterity = 14,
		constitution = 16,
		intelligence = 8,
		wisdom = 10,
		charisma = 12,
		age = 25,
		size = 1.8,
		speed = 30,
		languages = listOf("Commun", "Elfique"),
		variant = "Sylvestre",
		raceName = "Elfe"
	)

	println(joueur1.present())
	println(joueur1.caracteristiques())
	println(joueur1.sortilege())

}
