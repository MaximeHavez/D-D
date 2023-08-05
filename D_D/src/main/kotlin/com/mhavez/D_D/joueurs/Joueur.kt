package com.mhavez.D_D.joueurs

import com.mhavez.D_D.classes.Classe
import com.mhavez.D_D.classes.Sorts
import com.mhavez.D_D.races.Race

class Joueur(
    val id: String,
    val playerName: String,
    val gender: String,
    var level: Int = 1,
    override val jobName: String,
    override var strength: Int,
    override var dexterity: Int,
    override var constitution: Int,
    override var intelligence: Int,
    override var wisdom: Int,
    override var charisma: Int,
    override val age: Int,
    override val size: Double,
    override val speed: Int,
    override val languages: List<String>,
    override val variant: String,
    override val raceName: String,
    var experience: Int = 0,
    var hitPoints: Int = 0,
    var hitPointsMax: Int = 0,
    private var spells: List<String> = listOf(),
): Race, Classe {
    override fun toString(): String {
        return "joueur(id='$id', " +
                "playerName='$playerName', " +
                "gender='$gender', " +
                "jobName='$jobName', " +
                "strength=$strength, " +
                "dexterity=$dexterity, " +
                "constitution=$constitution, " +
                "intelligence=$intelligence, " +
                "wisdom=$wisdom, " +
                "charisma=$charisma, " +
                "age=$age, " +
                "size=$size, " +
                "speed=$speed, " +
                "languages=$languages, " +
                "variant='$variant', " +
                "raceName='$raceName')"
    }

    fun caracteristiques(): String {
        when (jobName) {
            "Barbare" -> {
                strength += 2
                constitution += 2
                intelligence -= 2
            }
            "Ensorceleur", "Ensorceleuse" -> {
                constitution += 2
                charisma += 2
                strength -= 2
            }
            "Guerrier", "Guerrière" -> {
                strength += 2
                constitution += 2
                intelligence -= 2
            }
            "Magicien", "Magicienne" -> {
                intelligence += 2
                charisma += 2
                strength -= 2
            }
            "Moine" -> {
                strength += 2
                wisdom += 2
                intelligence -= 2
            }
            "Paladin" -> {
                strength += 2
                charisma += 2
                intelligence -= 2
            }
            "Prêtre", "Prêtresse" -> {
                wisdom += 2
                charisma += 2
                strength -= 2
            }
            "Rôdeur", "Rodeuse" -> {
                dexterity += 2
                wisdom += 2
                strength -= 2
            }
            "Roublard", "Roublarde" -> {
                dexterity += 2
                intelligence += 2
                strength -= 2
            }
            else -> return "Classe inconnue"
        }
        return "Mes caractéristiques sont : " +
                "force $strength, " +
                "dextérité $dexterity, " +
                "constitution $constitution, " +
                "intelligence $intelligence, " +
                "sagesse $wisdom, " +
                "charisme $charisma"
    }

    fun present(): String {
        return if (gender == "homme") {
            "Salutation, mon nom est $playerName et je suis un $raceName $variant $jobName de niveau $level"
        } else {
            "Salutation, mon nom est $playerName et je suis une $raceName $variant $jobName de niveau $level"
        }
    }

    fun augmentationCaracteristique(caracteristique: String, valeur: Int): String {
        when (caracteristique) {
            "force" -> strength + valeur
            "dextérité" -> dexterity + valeur
            "constitution" -> constitution + valeur
            "intelligence" -> intelligence + valeur
            "sagesse" -> wisdom + valeur
            "charisme" -> charisma + valeur
            else -> return "Caractéristique inconnue"
        }
        return "La caractéristique $caracteristique a été augmentée de $valeur"
    }

    fun gainExperience(experience: Int): String {
        level += experience / 1000
        return "J'ai gagné $experience points d'expérience et je suis maintenant niveau $level"
    }

    fun sortilege(): String {
        when (level) {
            1 -> spells = Sorts.randomSortsNiveau1()
            else -> return "Niveau inconnu"
        }
        val spellsList = spells.joinToString(", ")

        return "Mes sorts sont : $spellsList"
    }


}