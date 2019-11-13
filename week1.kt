open class Human(var name : String){

     open fun attack(){
         print(name + " use Fist Attack!")
     }
     var humanMana = 100

     fun hasManaOrNot(){
         if ( humanMana > 0){
             print( name + " has mana")
         }else{
             print( name + " doesn't have mana")
             }
     }


}

class Mage:Human(name = "Tom"){

    override fun attack(){
        print(name + " use Fireball!")
    }

}


fun main() {

     val human = Human("Tom")
     val mage = Mage()
     human.attack()
     mage.attack()
     var tom = Human("Tom")
     tom.hasManaOrNot()
}

