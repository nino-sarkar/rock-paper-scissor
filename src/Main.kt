fun main() {
    val winner = winner()

    if (winner == "tie") {
        println("The match was a tie")
    }
    else {
        println("$winner won the match")
    }
}

fun userInput(): String {

    println("Rock, Paper or Scissor? Enter your choice.")
    var userChoice = readln().lowercase()

    while (userChoice != "rock" && userChoice != "paper" && userChoice != "scissor") {

        println("Wrong choice, please enter again")
        userChoice = readln().lowercase()
    }

    return userChoice
}

fun computerChoice(): String {

    return when ((1..3).random()) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissor"
    }
}

fun winner(): String {

    val userChoice = userInput()

    val computerChoice = computerChoice()
    println("Computer's choice $computerChoice")

    return when (userChoice) {
        "rock" -> when (computerChoice) {
            "rock" -> "tie"
            "paper" -> "Computer"
            else -> "User"
        }
        "paper" -> when (computerChoice) {
            "rock" -> "User"
            "paper" -> "tie"
            else -> "Computer"
        }
        else -> when (computerChoice) {
            "rock" -> "Computer"
            "paper" -> "User"
            else -> "tie"
        }
    }
}