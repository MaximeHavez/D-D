package com.mhavez.D_D.classes

class Sorts {


    companion object {

        private val sortsNiveau0Ensorceleur = listOf(
            "Aspersion acide",
            "Bouffée de poison",
            "Contact glacial",
            "Coup au but",
            "Faux amis",
            "Illusion mineure",
            "Lumière",
            "Lumières dansantes",
            "Main de mage",
            "Message",
            "Poigne électrique",
            "Prestidigitation",
            "Protection contre les armes",
            "Rayon de givre",
            "Réparation",
            "Trait de feu")
        private val sortsNiveau1Ensorceleur = listOf(
            "Armure de mage",
            "Bouclier",
            "Charme-personne",
            "Compréhension des langues",
            "Couleurs dansantes",
            "Déguisement",
            "Détection de la magie",
            "Image silencieuse",
            "Main brûlante",
            "Nappe de brouillard",
            "Orbe chromathique",
            "Projectile magique",
            "Rayon empoisonné",
            "Repli expéditif",
            "Saut",
            "Simulacre de vie",
            "Sommeil",
            "Trait ensorcelé",
            "Vague tonnante")

        fun randomSortsNiveau1(): MutableList<String> {
            val nbSort = 4
            val sortAleatoire = sortsNiveau1Ensorceleur.shuffled().take(sortsNiveau1Ensorceleur.size)
            val listSort = List(nbSort) { "" }.toMutableList()
            for (i in 0 until nbSort) {
                val random = (0..sortsNiveau0Ensorceleur.size).random()
                listSort[i] = sortAleatoire[random]
            }
            return listSort
        }
    }

}





