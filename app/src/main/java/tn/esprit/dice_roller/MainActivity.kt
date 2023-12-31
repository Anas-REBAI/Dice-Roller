package tn.esprit.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener{rollDice()}

        // Do a dice roll when the app starts
        rollDice()
    }

    private fun rollDice() {

        // Create new Dice object with 6 sides and roll the dice
        val dice = Dice(6)
        val diceRoll = dice.roll()


        // Find the IMG in the layout
        val diceImage: ImageView = findViewById(R.id.diceImg)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }

}