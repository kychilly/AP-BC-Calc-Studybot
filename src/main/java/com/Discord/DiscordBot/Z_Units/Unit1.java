package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import java.util.ArrayList;

import static com.Discord.DiscordBot.Units.QuestionBank.unit1Questions;

public class Unit1 {

    public static int numUnit1Questions;

    // Replace unit4Questions with unit1Questions.add
    public static void initializeUnit1Questions() {
        unit1Questions.add(new Question(
                "Evaluate: lim(x->2) (x^2 - 4)/(x - 2)",
                "2", "4", "0", "Does not exist",
                "A", 1, 0, "easy"));


        unit1Questions.add(new Question(
                "Find: lim(x->0) (sin x)/x",
                "0", "1", "Does not exist", "Infinity",
                "B", 1, 1, "easy"));


        unit1Questions.add(new Question(
                "Determine if f(x) = 1/x is continuous at x=0.",
                "Yes, continuous everywhere", "No, discontinuous at x=0", "Yes, because limit exists", "Removable discontinuity",
                "B", 1, 2, "easy"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (3x^2 + 2)/(x^2 + 5)",
                "3", "1", "0", "Infinity",
                "A", 1, 3, "easy"));


        unit1Questions.add(new Question(
                "What type of discontinuity does f(x) = tan(x) have at x = pi/2?",
                "Jump", "Removable", "Infinite", "Continuous",
                "C", 1, 4, "easy"));


        unit1Questions.add(new Question(
                "Find: lim(x->0) (1 - cos x)/x^2",
                "0", "1/2", "1", "Does not exist",
                "B", 1, 5, "medium"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (5x + 1)/(2x + 7)",
                "0", "2.5", "Infinity", "Does not exist",
                "B", 1, 6, "easy"));


        unit1Questions.add(new Question(
                "Which theorem guarantees a root exists for f(x)=x^3 - x -1 on [1,2]?",
                "Mean Value Theorem", "Intermediate Value Theorem", "Fundamental Theorem of Calculus", "Squeeze Theorem",
                "B", 1, 7, "medium"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (e^x - 1)/x",
                "0", "1", "Infinity", "Does not exist",
                "B", 1, 8, "medium"));


        unit1Questions.add(new Question(
                "The function f(x) = |x|/x has what type of discontinuity at x=0?",
                "Jump", "Removable", "Infinite", "Continuous",
                "A", 1, 9, "medium"));


        unit1Questions.add(new Question(
                "If f(x) is continuous on [a,b], then f(c) exists for all c in [a,b].",
                "True", "False", "Sometimes true", "Only if differentiable",
                "A", 1, 10, "easy"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0^+) ln(x)",
                "0", "Infinity", "-Infinity", "Does not exist",
                "C", 1, 11, "medium"));


        unit1Questions.add(new Question(
                "Find: lim(x->infinity) (7x^3 - x)/(2x^3 + 5)",
                "7/2", "Infinity", "0", "Does not exist",
                "A", 1, 12, "medium"));


        unit1Questions.add(new Question(
                "If left-hand and right-hand limits are not equal at a point, the limit:",
                "Exists", "Does not exist", "Is infinite", "Is zero",
                "B", 1, 13, "easy"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (tan x)/x",
                "1", "0", "Infinity", "Does not exist",
                "A", 1, 14, "medium"));


        unit1Questions.add(new Question(
                "Which of the following is required for continuity at x=c?",
                "f(c) is defined", "lim f(x) as x->c exists", "lim f(x)=f(c)", "All of the above",
                "D", 1, 15, "easy"));


        unit1Questions.add(new Question(
                "The Squeeze Theorem is often used to evaluate limits of:",
                "Polynomials", "Trigonometric ratios", "Rational functions", "Absolute value functions",
                "B", 1, 16, "medium"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sin(3x))/(x)",
                "0", "1", "3", "Does not exist",
                "C", 1, 17, "medium"));

        unit1Questions.add(new Question(
                "A function with a hole is said to have what kind of discontinuity?",
                "Jump", "Infinite", "Removable", "Continuous",
                "C", 1, 18, "easy"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (1 + 1/x)^x",
                "1", "e", "0", "Does not exist",
                "A", 1, 19, "hard"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (2x^2 + 3x)/(x^2 + 1)",
                "2", "1", "Infinity", "0",
                "A", 1, 20, "easy"));


        unit1Questions.add(new Question(
                "Find: lim(x->0) (sin(5x))/(x)",
                "5", "1", "0", "Does not exist",
                "A", 1, 21, "medium"));


        unit1Questions.add(new Question(
                "Determine the type of discontinuity for f(x)=1/(x^2 - 4) at x=2.",
                "Removable", "Jump", "Infinite", "Continuous",
                "C", 1, 22, "medium"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (ln(1+x))/x",
                "0", "1", "Infinity", "Does not exist",
                "B", 1, 23, "medium"));


        unit1Questions.add(new Question(
                "What is lim(x->0) (1 - cos(2x))/x^2?",
                "1", "2", "0", "Does not exist",
                "B", 1, 24, "hard"));


        unit1Questions.add(new Question(
                "For f(x)=sqrt(x), is f continuous at x=0?",
                "Yes", "No", "Only from the right", "Removable discontinuity",
                "C", 1, 25, "medium"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (x^2 + 1)/(3x^2 - 2)",
                "1/3", "0", "Infinity", "Does not exist",
                "A", 1, 26, "easy"));


        unit1Questions.add(new Question(
                "Which function is continuous for all real x?",
                "1/x", "tan(x)", "e^x", "sqrt(x)",
                "C", 1, 27, "easy"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->pi/2^-) cos(x)",
                "1", "0", "-1", "Does not exist",
                "B", 1, 28, "medium"));


        unit1Questions.add(new Question(
                "A jump discontinuity occurs when:",
                "Left and right limits differ", "f(x) undefined", "Limit is infinite", "Function is continuous",
                "A", 1, 29, "easy"));


        unit1Questions.add(new Question(
                "Find: lim(x->0) (tan(2x))/(x)",
                "2", "0", "1", "Does not exist",
                "A", 1, 30, "medium"));


        unit1Questions.add(new Question(
                "Which theorem guarantees a maximum value exists on a closed interval?",
                "Intermediate Value Theorem", "Extreme Value Theorem", "Mean Value Theorem", "Squeeze Theorem",
                "B", 1, 31, "medium"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (ln(x))/x",
                "0", "Infinity", "1", "Does not exist",
                "A", 1, 32, "medium"));


        unit1Questions.add(new Question(
                "The function f(x)=sin(x)/x has a removable discontinuity at:",
                "x=0", "x=pi", "x=infinity", "None",
                "A", 1, 33, "medium"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sqrt(1+x) - 1)/x",
                "0", "1/2", "1", "Does not exist",
                "B", 1, 34, "medium"));


        unit1Questions.add(new Question(
                "The Intermediate Value Theorem requires which condition?",
                "Differentiability", "Continuity", "Integrability", "Limit existence",
                "B", 1, 35, "easy"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (x)/(sqrt(x^2+1))",
                "0", "1", "Infinity", "Does not exist",
                "B", 1, 36, "medium"));


        unit1Questions.add(new Question(
                "For f(x)=|x|, is f continuous at x=0?",
                "Yes", "No", "Only from the right", "Removable discontinuity",
                "A", 1, 37, "easy"));


        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sin^2(x))/x^2",
                "1", "0", "Does not exist", "Infinity",
                "A", 1, 38, "medium"));


        unit1Questions.add(new Question(
                "What is lim(x->infinity) (1 + 2/x)^x?",
                "1", "e^2", "e", "Infinity",
                "B", 1, 39, "hard"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sin(4x))/(2x)",
                "2", "4", "0", "Does not exist",
                "A", 1, 40, "medium"));

        unit1Questions.add(new Question(
                "Which of the following functions has an infinite discontinuity at x=0?",
                "1/x", "sin(x)", "e^x", "x^2",
                "A", 1, 41, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (2x^3 + x)/(5x^3 - 1)",
                "0", "2/5", "Infinity", "Does not exist",
                "B", 1, 42, "medium"));

        unit1Questions.add(new Question(
                "The function f(x)=floor(x) has what type of discontinuity at integer values?",
                "Jump", "Removable", "Infinite", "Continuous",
                "A", 1, 43, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (1 - cos(3x))/(x^2)",
                "0", "3/2", "9/2", "Does not exist",
                "B", 1, 44, "hard"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (5x - 7)/(x + 2)",
                "5", "1", "Infinity", "0",
                "A", 1, 45, "easy"));

        unit1Questions.add(new Question(
                "Which theorem states that if f is continuous on [a,b], then it takes on every value between f(a) and f(b)?",
                "Mean Value Theorem", "Intermediate Value Theorem", "Extreme Value Theorem", "Squeeze Theorem",
                "B", 1, 46, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (tan(5x))/(x)",
                "0", "5", "1", "Infinity",
                "B", 1, 47, "medium"));

        unit1Questions.add(new Question(
                "The function f(x)=ln(x) is continuous on:",
                "(0, infinity)", "(-infinity, infinity)", "(-infinity,0)", "[0, infinity)",
                "A", 1, 48, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (ln(x))/(x^2)",
                "0", "Infinity", "1", "Does not exist",
                "A", 1, 49, "medium"));

        unit1Questions.add(new Question(
                "A hole in a graph corresponds to which type of discontinuity?",
                "Jump", "Infinite", "Removable", "Oscillating",
                "C", 1, 50, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sin(x))/(1 - cos(x))",
                "Infinity", "1", "0", "Does not exist",
                "A", 1, 51, "hard"));

        unit1Questions.add(new Question(
                "Which of the following is true of all continuous functions on a closed interval?",
                "They are bounded", "They have no maximum", "They are differentiable", "They are odd functions",
                "A", 1, 52, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sqrt(1+4x) - 1)/(x)",
                "2", "4", "0", "Does not exist",
                "A", 1, 53, "medium"));

        unit1Questions.add(new Question(
                "What type of discontinuity occurs for f(x)=1/(x^2) at x=0?",
                "Jump", "Infinite", "Removable", "None",
                "B", 1, 54, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (x + sin(x))/(x)",
                "1", "Infinity", "0", "Does not exist",
                "A", 1, 55, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (e^(2x) - 1)/(x)",
                "0", "1", "2", "Infinity",
                "C", 1, 56, "medium"));

        unit1Questions.add(new Question(
                "Which theorem can prove that a derivative exists between two points?",
                "Intermediate Value Theorem", "Mean Value Theorem", "Extreme Value Theorem", "Squeeze Theorem",
                "B", 1, 57, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (cos(x) - 1)/x",
                "0", "-Infinity", "Does not exist", "0 from the left only",
                "C", 1, 58, "hard"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (1 + 1/x)^(2x)",
                "1", "e", "e^2", "Infinity",
                "C", 1, 59, "hard"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sin(6x))/(3x)",
                "2", "6", "3", "Does not exist",
                "A", 1, 60, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is continuous everywhere?",
                "1/x", "sin(x)", "tan(x)", "ln(x)",
                "B", 1, 61, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (4x^2 + 1)/(2x^2 + 3)",
                "2", "Infinity", "0", "Does not exist",
                "A", 1, 62, "easy"));

        unit1Questions.add(new Question(
                "The function f(x)=1/(x^2 - 9) has discontinuities at:",
                "x=0", "x=3 and x=-3", "x=9", "No discontinuities",
                "B", 1, 63, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (1 - cos(4x))/(x^2)",
                "0", "4", "8", "Does not exist",
                "C", 1, 64, "hard"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (5x + 2)/(sqrt(x^2+1))",
                "0", "5", "Infinity", "Does not exist",
                "B", 1, 65, "medium"));

        unit1Questions.add(new Question(
                "Find: lim(x->0) (e^x - e^-x)/(2x)",
                "0", "1", "2", "Infinity",
                "B", 1, 66, "medium"));

        unit1Questions.add(new Question(
                "Which theorem ensures f(x) has both a max and min on [a,b] if continuous?",
                "Intermediate Value Theorem", "Extreme Value Theorem", "Squeeze Theorem", "Mean Value Theorem",
                "B", 1, 67, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (tan(x))/(sin(x))",
                "0", "1", "Infinity", "Does not exist",
                "B", 1, 68, "easy"));

        unit1Questions.add(new Question(
                "What is lim(x->0) (ln(1+x^2))/(x^2)?",
                "0", "1", "Infinity", "Does not exist",
                "B", 1, 69, "medium"));

        unit1Questions.add(new Question(
                "The function f(x)=|x| is continuous at x=0 but not differentiable there.",
                "True", "False", "Sometimes", "Never",
                "A", 1, 70, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0^+) (1/x)",
                "0", "Infinity", "-Infinity", "Does not exist",
                "B", 1, 71, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (ln(x))/(sqrt(x))",
                "0", "Infinity", "1", "Does not exist",
                "B", 1, 72, "medium"));

        unit1Questions.add(new Question(
                "Find: lim(x->0) (sin(2x))/(x)",
                "0", "1", "2", "Does not exist",
                "C", 1, 73, "medium"));

        unit1Questions.add(new Question(
                "Which discontinuity does f(x)=1/sin(x) have at x=pi?",
                "Removable", "Jump", "Infinite", "None",
                "C", 1, 74, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sqrt(1+3x) - 1)/(x)",
                "0", "3/2", "3", "Does not exist",
                "B", 1, 75, "medium"));

        unit1Questions.add(new Question(
                "The Intermediate Value Theorem guarantees:",
                "A solution between f(a) and f(b)", "A derivative exists", "Maximum value exists", "Integral exists",
                "A", 1, 76, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (2x^3 + 1)/(5x^3 + 4)",
                "0", "Infinity", "2/5", "Does not exist",
                "C", 1, 77, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (tan(3x))/(x)",
                "3", "0", "Infinity", "Does not exist",
                "A", 1, 78, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is NOT continuous everywhere?",
                "cos(x)", "x^2", "ln(x)", "e^x",
                "C", 1, 79, "easy"));
        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sin(7x))/(x)",
                "0", "1", "7", "Does not exist",
                "C", 1, 80, "medium"));

        unit1Questions.add(new Question(
                "Which of the following has a jump discontinuity?",
                "f(x)=|x|", "f(x)=floor(x)", "f(x)=1/x", "f(x)=tan(x)",
                "B", 1, 81, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (2x^4 + 1)/(5x^4 - 3x)",
                "0", "Infinity", "2/5", "Does not exist",
                "C", 1, 82, "easy"));

        unit1Questions.add(new Question(
                "The function f(x)=ln(x) has which discontinuity at x=0?",
                "Removable", "Jump", "Infinite", "None",
                "C", 1, 83, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (1 - cos(5x))/(x^2)",
                "0", "25/2", "5/2", "Does not exist",
                "B", 1, 84, "hard"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (3x^2 + 4)/(sqrt(x^4+1))",
                "0", "Infinity", "3", "Does not exist",
                "C", 1, 85, "medium"));

        unit1Questions.add(new Question(
                "Find: lim(x->0) (e^(3x) - 1)/(x)",
                "0", "1", "3", "Infinity",
                "C", 1, 86, "medium"));

        unit1Questions.add(new Question(
                "Which theorem guarantees at least one c in (a,b) such that f’(c) exists?",
                "Mean Value Theorem", "Intermediate Value Theorem", "Extreme Value Theorem", "Squeeze Theorem",
                "A", 1, 87, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (tan(2x))/(sin(2x))",
                "0", "1", "2", "Does not exist",
                "B", 1, 88, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (ln(1+5x))/(x)",
                "0", "1", "5", "Does not exist",
                "C", 1, 89, "medium"));

        unit1Questions.add(new Question(
                "The function f(x)=|x-2| is continuous at x=2.",
                "True", "False", "Only from left", "Only from right",
                "A", 1, 90, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0^-) (1/x)",
                "0", "Infinity", "-Infinity", "Does not exist",
                "C", 1, 91, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (ln(x))/(x^3)",
                "0", "Infinity", "1", "Does not exist",
                "A", 1, 92, "medium"));

        unit1Questions.add(new Question(
                "Find: lim(x->0) (sin(4x))/(2x)",
                "2", "4", "0", "Does not exist",
                "A", 1, 93, "medium"));

        unit1Questions.add(new Question(
                "Which discontinuity does f(x)=sec(x) have at x=pi/2?",
                "Removable", "Jump", "Infinite", "None",
                "C", 1, 94, "medium"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (sqrt(1+2x) - 1)/(x)",
                "0", "1", "2", "Does not exist",
                "C", 1, 95, "medium"));

        unit1Questions.add(new Question(
                "Which theorem is used to prove that sqrt(2) exists?",
                "Mean Value Theorem", "Intermediate Value Theorem", "Squeeze Theorem", "Extreme Value Theorem",
                "B", 1, 96, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->infinity) (x^3 + 1)/(4x^3 - 2)",
                "0", "Infinity", "1/4", "Does not exist",
                "C", 1, 97, "easy"));

        unit1Questions.add(new Question(
                "Evaluate: lim(x->0) (tan(4x))/(x)",
                "0", "1", "4", "Does not exist",
                "C", 1, 98, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is NOT continuous at x=0?",
                "f(x)=x^2", "f(x)=cos(x)", "f(x)=|x|", "f(x)=1/x",
                "D", 1, 99, "easy"));


        numUnit1Questions = unit1Questions.size();
        System.out.println(String.format("There are %d questions in unit 1", numUnit1Questions));
    }

}