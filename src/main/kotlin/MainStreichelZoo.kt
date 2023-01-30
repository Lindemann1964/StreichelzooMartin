import javax.naming.Name

fun main() {
    var besucher: Besucher = Besucher("Franz", 35)
    var besucher1: Besucher = Besucher("lili", 23)

    besucher.vorStellen()
    besucher1.vorStellen()

    var tier1: Tier = Tier("Helga", 35.3, 12.0, "weiblich")
    println(tier1.name + " "+tier1.gewicht + " "+tier1.alter +" "+ tier1.geschlecht)
    tier1.bewegen()
    tier1.geraeusche()
    tier1.gefüttert(besucher)
    tier1.gestreichelt(besucher1)
    println(tier1.gewicht)

    var tier2:Schaf=Schaf("Shawn",23.4,5.0,"weiblich")
    tier2.geraeusche()

    var tier3:Huhn=Huhn("Kiekeri",2.5,2.0,"weiblich", 2)
    tier3.geraeusche()
    tier3.eierProTag
    println(tier3.eierProTag)

    var tier4:Kuh=Kuh ("Berta", 525.0,7, geschlecht = "weiblich",var gibtMilch:Boolean )
    tier4.geraeusche()
    tier4.gibtMilch()



}
