package sadrac.tijerina.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.marcus_smart,
            "Patrick Beverly",
            "Jaylen Brown",
            "Marcus Smart",
            "Robert Williams",
            3
        )

        questionList.add(que1)

        val que2 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.larry_bird,
            "Larry Bird",
            "Kevin McHale",
            "Larry Legend",
            "Payton Pritchard",
            1
        )

        questionList.add(que2)

        val que3 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.bill_russell,
            "Robert Williams",
            "Wilt Chamberlain",
            "Kareem Abdul-Jabbar",
            "Bill Russel",
            4
        )

        questionList.add(que3)

        val que4 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.grant_williams,
            "Grant Williams",
            "Payton Pritchard",
            "Andre Drummond",
            "Draymond Green",
            1
        )

        questionList.add(que4)

        val que5 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.jaylen_brown,
            "Jayson Tatum",
            "Jaylen Brown",
            "Luka Doncic",
            "Klay Thompson",
            2
        )

        questionList.add(que5)

        val que6 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.jayson_tatum,
            "Jaylen Brown",
            "Kevin Durant",
            "Jayson Tatum",
            "Trae Young",
            3
        )

        questionList.add(que6)

        val que7 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.kevin_garnett,
            "Kevin Garnett",
            "Tim Duncan",
            "Dirk Nowitzki",
            "Charles Barkley",
            1
        )

        questionList.add(que7)

        val que8 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.papi_chulo,
            "Giannis Antetokounmpo",
            "Grant Williams",
            "Al Horford",
            "Joel Embiid",
            3
        )

        questionList.add(que8)

        val que9 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.paul_pierce,
            "Lebron James",
            "Paul Pierce",
            "Rajon Rondo",
            "Luka Doncic",
            2
        )

        questionList.add(que9)

        val que10 = Question(
            1,
            "Who is this basketball player?",
            R.drawable.robert_williams,
            "Robert Williams",
            "Marcus Smart",
            "Nikola Jokić",
            "Joel Embiid",
            1
        )

        questionList.add(que10)


        return questionList
    }

}