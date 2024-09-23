package ifgoiano.urt.choisebeer

class ExpertCerveja {
    fun getMarcas(color: String): List<String>{
        return when(color){
            "Amber" -> listOf("Cervejaria Colorado", "Wäls", "Bohemia")
            "Lager" -> listOf("Skol", "Brahma", "Heineken")
            "Pilsen" -> listOf("Budweiser", "Corona", "Quilmes")
            "Stout" -> listOf("Guinness", "Murphy's", "Schornstein")
            else -> listOf("Marca desconhecida")
        }
    }
}