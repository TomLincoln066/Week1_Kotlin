open class Human(var name : String){

     open fun attack(){
         print(name + " use Fist Attack!")

    }
}

class Mage:Human(name = ""){

    override fun attack(){
        print(name + "use Fireball!")
    }

}

fun hasManaOrNot(){
    val humanMana = 0
    if ( humanMana > 0){
        print( "has mana")
    }else{
        print( "doesn't have mana")
    }
}

fun main() {

     val human = Human("Tom")
     val mage = Mage()
     human.attack()
     mage.attack()

}

