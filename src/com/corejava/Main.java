package com.corejava;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String question1 = "What color are bananas?\n" +
                "(a) Red or Green\n"
               + "(b) Orange\n"
                + "(c) Yellow";
        String question2 = "What color are apples?\n" +
                "(a) Blue\n"
                + "(b) Red or Green\n"
                + "(c) Yellow";
    // Array Questions
        Question[] questions = {
                new Question(question1,"c"),
                new Question(question2,"b")
        };

    takeTest(questions);

    }
    public static void takeTest(Question[] questions){
        int score = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = input.nextLine();

            if(answer.equals(questions[i].answer)){
                score++;
            }

        }
        System.out.println("You got " + score + "/" + questions.length);

    }

}
