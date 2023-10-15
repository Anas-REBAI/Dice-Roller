package tn.esprit.dice_roller

class Dice (val numSides : Int){
    fun roll(): Int {
        return (1..numSides).random()
    }
}