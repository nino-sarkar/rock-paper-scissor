fun main() {
   val winner = winner()

   if (winner == "Tie") {
       println("The match was a tie")
   }
   else {
       println("$winner won the match")
   }
}

fun userChoice(): String {
    print("Rock, Paper or Scissor? Enter your choice: ")
    var userChoice = readln().lowercase()

    while (userChoice != "rock" && userChoice != "paper" && userChoice != "scissor") {
        println("Wrong choice. Please enter again")
        userChoice = readln().lowercase()
    }

    return userChoice
}

fun computerChoice(): String {
    return when((1..3).random()) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissor"
    }
}

fun winner(): String {

    val userChoice = userChoice()

    val computerChoice = computerChoice()
    println("Computer chose $computerChoice")

    return when (userChoice) {
        "rock" -> when (computerChoice) {
            "rock" -> "Tie"
            "paper" -> "Computer"
            else -> "User"
        }

            "paper" -> when (computerChoice) {
            "rock" -> "User"
            "paper" -> "Tie"
            else -> "Computer"
        }

            else -> when (computerChoice) {
            "rock" -> "Computer"
            "paper" -> "User"
            else -> "Tie"
        }
    }
}