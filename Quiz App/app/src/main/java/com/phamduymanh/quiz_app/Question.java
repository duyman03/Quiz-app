package com.phamduymanh.quiz_app;

public class Question{
    private final String questionText, answer1,answer2;
    private final String questionAnswer;
    
    public Question(String questionText, String answer1, String answer2, String questionAnswer) {
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
        this.answer1 = answer1;
        this.answer2 = answer2;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

/*public String getQuestionText() {
        return questionText;
    }

    public Boolean getQuestionAnswer() {
        return questionAnswer;
    }

    public static final List<Question> math = new ArrayList<>(Arrays.asList(
            new Question("1. Toan hoc", true),
            new Question("2. Toan hoc cau 2", true)
    ));

    public static final List<Question> music = new ArrayList<>(Arrays.asList(
            new Question("1. Am nhac...", true),
            new Question("2. Am nhac cau 2", true)
    ));*/

}
