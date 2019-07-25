import kotlin.random.Random

fun main (){
var playagain = true
    while (playagain) {
        displayWelcomePage()
        val user_Input: Int = readLine()?.toInt() ?: 0
        val al_Input = Random.nextInt(1, 3)
        playgame(user_Input, al_Input)
       playagain = exitGame()
    }
}

    private fun playgame(user_Input: Int, al_Input: Int) {
    println("you chose ${user_Input} and the AI chose ${al_Input}")
    val result = when(user_Input){
        al_Input -> "you tied"
        1 -> if (al_Input == 2) "you lose!!" else "you won"
        2 -> if (al_Input == 3)"YOU LOSE" else "you won"
        3 -> if (al_Input == 1) "you lose" else "you won"
        else -> "error"}


    println(result)


    }

fun exitGame():Boolean{
    println("Do you want to play again ?")
    var b = readLine()
    if ( b == "no"){return false }
    else{ return true}
}





private fun   displayWelcomePage() {
    println("Welcome to RPS")
    println("pleses enter one of the follwing")
    println("1- Rock")
    println("2- Papaer")
    println("3- Sicssors")
    println("Enter your selsction")
}