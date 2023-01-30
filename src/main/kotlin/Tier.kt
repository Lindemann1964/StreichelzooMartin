open class Tier(var name: String, var gewicht: Double, var alter: Double, var geschlecht: String) {
    fun bewegen() {
        println("Tier hat sich bewegt")

    }

    open fun geraeusche() {
        println("Tier hat geraeusche gemacht")

    }

    fun gestreichelt(besucher: Besucher) {
        println("Der Besucher ${besucher.name} streichelt das Tier $name")

    }

    fun gefüttert(besucher: Besucher) {
        println("der Besucher ${besucher.name} füttert das Tier $name")
        gewicht*= 1.02
    }




}