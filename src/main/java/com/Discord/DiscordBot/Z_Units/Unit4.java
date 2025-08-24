package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit4Questions;

public class Unit4 {

    public static int numUnit4Questions;

    public static void initializeUnit4Questions() {

        unit4Questions.add(new Question(
                "Evaluate ∫0^2 (3x^2) dx.",
                "8", "4", "6", "12",
                "A", 4, 3000, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫1^3 (2x+1) dx.",
                "9", "8", "10", "7",
                "C", 4, 3001, "easy"));

        unit4Questions.add(new Question(
                "Find ∫(x^3-2x) dx.",
                "x^4/4 - x^2 + C", "x^4/4 - x + C", "x^3/3 - x^2 + C", "x^4 - x^2 + C",
                "A", 4, 3002, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫ e^x dx.",
                "e^x + C", "ln(x) + C", "1/e^x + C", "x*e^x + C",
                "A", 4, 3003, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫ cos(x) dx.",
                "sin(x) + C", "-sin(x) + C", "cos(x) + C", "-cos(x) + C",
                "A", 4, 3004, "easy"));

        unit4Questions.add(new Question(
                "Find ∫ sin(3x) dx.",
                "-1/3 cos(3x) + C", "1/3 cos(3x) + C", "-3 cos(3x) + C", "3 cos(3x) + C",
                "A", 4, 3005, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^π sin(x) dx.",
                "2", "0", "1", "-1",
                "A", 4, 3006, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫(1/x) dx.",
                "ln|x| + C", "1/x + C", "x + C", "-1/x + C",
                "A", 4, 3007, "easy"));

        unit4Questions.add(new Question(
                "Find ∫ sec^2(x) dx.",
                "tan(x) + C", "sec(x) + C", "cos(x) + C", "-tan(x) + C",
                "A", 4, 3008, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫(2x^3 - x) dx.",
                "x^4/2 - x^2/2 + C", "x^4/2 - x + C", "x^4 - x^2 + C", "x^4 - x + C",
                "A", 4, 3009, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫(3x^2 + 2x + 1) dx.",
                "x^3 + x^2 + x + C", "x^3 + 2x^2 + x + C", "3x^3 + x^2 + x + C", "x^3 + x^2 + C",
                "A", 4, 3010, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^1 (4x) dx.",
                "2", "1", "4", "0",
                "A", 4, 3011, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫ e^(2x) dx.",
                "1/2 e^(2x) + C", "e^(2x) + C", "2 e^(2x) + C", "ln(2x) + C",
                "A", 4, 3012, "medium"));

        unit4Questions.add(new Question(
                "Find ∫(x^2 + 1/x) dx.",
                "x^3/3 + ln|x| + C", "x^3/3 + x + C", "x^2/2 + ln|x| + C", "x^3 + ln(x) + C",
                "A", 4, 3013, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫ sin^2(x) dx using power-reduction formula.",
                "x/2 - sin(2x)/4 + C", "-x/2 + sin(2x)/4 + C", "sin^2(x)/2 + C", "-cos(2x)/4 + C",
                "A", 4, 3014, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫ cos^2(x) dx using power-reduction formula.",
                "x/2 + sin(2x)/4 + C", "-x/2 + sin(2x)/4 + C", "cos^2(x)/2 + C", "-cos(2x)/4 + C",
                "A", 4, 3015, "hard"));

        unit4Questions.add(new Question(
                "Find ∫0^π x sin(x) dx using integration by parts.",
                "π", "0", "2", "1",
                "A", 4, 3016, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫(x e^x) dx using integration by parts.",
                "x e^x - e^x + C", "e^x - x e^x + C", "x e^x + e^x + C", "e^x + C",
                "A", 4, 3017, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫(ln(x)) dx using integration by parts.",
                "x ln(x) - x + C", "ln(x) + C", "x ln(x) + C", "1/x + C",
                "A", 4, 3018, "hard"));

        unit4Questions.add(new Question(
                "Find ∫0^1 (3x^2 + 4x + 1) dx.",
                "3", "2", "4", "5",
                "A", 4, 3019, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫(5x^4 - 2x^2) dx.",
                "x^5 - 2x^3/3 + C", "x^5 - x^3 + C", "5x^5/4 - x^2 + C", "x^5 + C",
                "A", 4, 3020, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫(2x+3)/(x^2+3x+2) dx using partial fractions.",
                "ln|x+1| - ln|x+2| + C", "ln|x+2| - ln|x+1| + C", "ln|x^2+3x+2| + C", "1/(x+1) - 1/(x+2) + C",
                "A", 4, 3021, "hard"));

        unit4Questions.add(new Question(
                "Find ∫(cos(x)/sin^2(x)) dx.",
                "-1/sin(x) + C", "1/sin(x) + C", "-cos(x) + C", "ln|sin(x)| + C",
                "A", 4, 3022, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫ e^(3x) dx.",
                "1/3 e^(3x) + C", "3 e^(3x) + C", "e^(3x) + C", "ln(3x) + C",
                "A", 4, 3023, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫0^1 x^2 dx.",
                "1/3", "1/2", "1", "2/3",
                "A", 4, 3024, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫(2/x) dx.",
                "2 ln|x| + C", "ln|x| + C", "2/x + C", "x^2 + C",
                "A", 4, 3025, "easy"));

        unit4Questions.add(new Question(
                "Find ∫(3x^2 + 4x + 5) dx.",
                "x^3 + 2x^2 + 5x + C", "x^3 + 2x^2 + 4x + C", "3x^3 + 4x^2 + 5x + C", "x^3 + 4x^2 + 5x + C",
                "A", 4, 3026, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫(1/(x^2+1)) dx.",
                "arctan(x) + C", "ln|x| + C", "1/(x^2+1) + C", "-arctan(x) + C",
                "A", 4, 3027, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^π/2 sin^2(x) dx.",
                "π/4", "π/2", "1/2", "1",
                "A", 4, 3028, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫0^π/2 cos^2(x) dx.",
                "π/4", "π/2", "1/2", "1",
                "A", 4, 3029, "medium"));

        unit4Questions.add(new Question(
                "Find ∫ x e^(2x) dx using integration by parts.",
                "1/2 x e^(2x) - 1/4 e^(2x) + C", "x e^(2x) - e^(2x) + C", "e^(2x)/2 + C", "x e^(2x)/2 + C",
                "A", 4, 3030, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫ ln(x)/x dx.",
                "1/2 (ln(x))^2 + C", "ln(x) + C", "x ln(x) - x + C", "ln(x)/x + C",
                "A", 4, 3031, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫0^1 (4x^3 + 2x) dx.",
                "3", "2", "4", "1",
                "A", 4, 3032, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫(x^2 - 5x + 6) dx.",
                "x^3/3 - 5x^2/2 + 6x + C", "x^3 - 5x^2 + 6x + C", "x^3/3 - 5x^2 + 6x + C", "x^2 - 5x + 6 + C",
                "A", 4, 3033, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫ e^(x) sin(x) dx using integration by parts.",
                "1/2 e^x(sin(x) - cos(x)) + C", "-1/2 e^x(sin(x) - cos(x)) + C", "e^x sin(x) + C", "e^x cos(x) + C",
                "A", 4, 3034, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫1/(x√(x^2-1)) dx.",
                "arcsec(x) + C", "arccos(x) + C", "arcsin(x) + C", "ln|x + √(x^2-1)| + C",
                "A", 4, 3035, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫0^2 (2x^3 - x) dx.",
                "3", "4", "2", "1",
                "A", 4, 3036, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^1 (x^2 + 2x + 1) dx.",
                "7/3", "2", "5/3", "3",
                "A", 4, 3037, "easy"));

        unit4Questions.add(new Question(
                "Find ∫(x^3 - 3x^2 + 2x) dx.",
                "x^4/4 - x^3 + x^2 + C", "x^4/4 - x^2 + C", "x^3/3 - x^2 + C", "x^4 - x^3 + C",
                "A", 4, 3038, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫(1/(1+x^2)) dx.",
                "arctan(x) + C", "ln|x| + C", "1/(1+x^2) + C", "-arctan(x) + C",
                "A", 4, 3039, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^1 (3x^2 + 4x + 5) dx.",
                "11/2", "12/2", "10/2", "9/2",
                "A", 4, 3040, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫(x^2 e^x) dx using integration by parts.",
                "x^2 e^x - 2 ∫ x e^x dx + C", "x^2 e^x + C", "x e^x + C", "e^x + C",
                "A", 4, 3041, "hard"));

        unit4Questions.add(new Question(
                "Find ∫(x/(x^2+1)) dx.",
                "1/2 ln|x^2+1| + C", "ln|x| + C", "1/(x^2+1) + C", "x^2/2 + C",
                "A", 4, 3042, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^π/2 x cos(x) dx using integration by parts.",
                "1", "0", "π/2", "π",
                "C", 4, 3043, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫ sin^3(x) dx.",
                "-cos(x) + cos^3(x)/3 + C", "cos(x) - cos^3(x)/3 + C", "-sin(x) + sin^3(x)/3 + C", "sin(x) - sin^3(x)/3 + C",
                "A", 4, 3044, "hard"));

        unit4Questions.add(new Question(
                "Find ∫0^2 (4x^3 - 2x^2 + x) dx.",
                "8", "7", "6", "9",
                "A", 4, 3045, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫ e^(2x) sin(x) dx using integration by parts.",
                "1/5 e^(2x) (2 sin(x) - cos(x)) + C", "-1/5 e^(2x)(2 sin(x) - cos(x)) + C", "e^(2x) sin(x) + C", "e^(2x) cos(x) + C",
                "A", 4, 3046, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫1/√(1-x^2) dx.",
                "arcsin(x) + C", "arccos(x) + C", "arctan(x) + C", "ln|x + √(1-x^2)| + C",
                "A", 4, 3047, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^1 x ln(x) dx using integration by parts.",
                "-1/4", "1/4", "-1/2", "1/2",
                "A", 4, 3048, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫(x^2 + 2x + 3) dx.",
                "x^3/3 + x^2 + 3x + C", "x^3/3 + 2x^2 + 3x + C", "x^2 + 2x + 3 + C", "x^3 + x^2 + 3x + C",
                "A", 4, 3049, "medium"));

        unit4Questions.add(new Question(
                "Find ∫(1/(x^2-1)) dx using partial fractions.",
                "1/2 ln| (x-1)/(x+1) | + C", "ln|x-1| - ln|x+1| + C", "ln|x+1| - ln|x-1| + C", "1/(x-1) - 1/(x+1) + C",
                "A", 4, 3050, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^1 x^3 dx.",
                "1/4", "1/3", "1/2", "1",
                "A", 4, 3051, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫(x^2+1)^2 dx.",
                "x^5/5 + 2x^3/3 + x + C", "x^4/4 + x^2 + C", "x^5/5 + x^3 + x + C", "x^5/5 + x^3/3 + x + C",
                "A", 4, 3052, "medium"));

        unit4Questions.add(new Question(
                "Find ∫0^π sin(x) cos(x) dx.",
                "1/2", "0", "1", "-1/2",
                "A", 4, 3053, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫(x^2 - 4x + 3) dx.",
                "x^3/3 - 2x^2 + 3x + C", "x^3/3 - 4x^2 + 3x + C", "x^2 - 4x + 3 + C", "x^3 - 4x^2 + 3x + C",
                "A", 4, 3054, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫ x e^(3x) dx using integration by parts.",
                "1/3 x e^(3x) - 1/9 e^(3x) + C", "x e^(3x) - e^(3x) + C", "x e^(3x)/3 + C", "e^(3x) + C",
                "A", 4, 3055, "hard"));

        unit4Questions.add(new Question(
                "Find ∫0^1 (6x^2 - 4x + 2) dx.",
                "4", "3", "5", "2",
                "A", 4, 3056, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫(cos(x)/sin^3(x)) dx.",
                "-1/(2 sin^2(x)) + C", "1/(2 sin^2(x)) + C", "-cos(x) + C", "ln|sin(x)| + C",
                "A", 4, 3057, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫0^π x^2 dx.",
                "π^3/3", "π^2/2", "π^3/2", "π^3/6",
                "A", 4, 3058, "medium"));

        unit4Questions.add(new Question(
                "Find ∫(1/(x√(x^2+1))) dx.",
                "arcsec(x) + C", "arcsinh(x) + C", "arctan(x) + C", "ln|x+√(x^2+1)| + C",
                "D", 4, 3059, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫(2x^3 - 5x + 4) dx.",
                "x^4/2 - 5x^2/2 + 4x + C", "x^4/2 - 5x^2 + 4x + C", "2x^4 - 5x^2 + 4x + C", "x^4 - 5x^2 + 4x + C",
                "A", 4, 3060, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫0^2 (x^3 - x) dx.",
                "0", "2", "-2", "1",
                "A", 4, 3061, "medium"));

        unit4Questions.add(new Question(
                "Find ∫(x^2/(x+1)) dx using long division.",
                "1/2 x^2 - x + ln|x+1| + C", "x - 1/2 x^2 + ln|x+1| + C", "x^2/(2(x+1)) + C", "x^2/2 + ln|x+1| + C",
                "A", 4, 3062, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^π/4 tan(x) dx.",
                "-ln|cos(x)| from 0 to π/4", "ln|sin(x)| from 0 to π/4", "tan(x) from 0 to π/4", "sec(x) from 0 to π/4",
                "A", 4, 3063, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫(x^2 e^(x^2)) dx using substitution.",
                "1/2 e^(x^2) + C", "e^(x^2) + C", "x e^(x^2) + C", "2 e^(x^2) + C",
                "A", 4, 3064, "hard"));

        unit4Questions.add(new Question(
                "Find ∫(3x^2 - 4x + 1) dx.",
                "x^3 - 2x^2 + x + C", "x^3 - 4x^2 + x + C", "3x^3 - 2x^2 + x + C", "x^3 - 2x^2 + 2x + C",
                "A", 4, 3065, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫ e^(x) cos(x) dx using integration by parts.",
                "1/2 e^x (cos(x) + sin(x)) + C", "-1/2 e^x (cos(x) + sin(x)) + C", "e^x cos(x) + C", "e^x sin(x) + C",
                "A", 4, 3066, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫0^1 x/(x^2 + 1) dx using substitution.",
                "1/2 ln(2)", "ln(2)", "1/2 ln(1)", "ln(1)",
                "A", 4, 3067, "medium"));

        unit4Questions.add(new Question(
                "Find ∫0^π sin(x) dx.",
                "2", "1", "0", "-2",
                "A", 4, 3068, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫(1/(1+x^2)) dx.",
                "arctan(x) + C", "arcsin(x) + C", "ln|x| + C", "-arctan(x) + C",
                "A", 4, 3069, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^1 (x^4 - 2x^2 + 1) dx.",
                "1/5 - 2/3 + 1 = 8/15", "1/5 - 1 + 1 = 1/5", "1 - 2/3 + 1 = 4/3", "1/4 - 2/3 + 1 = 7/12",
                "A", 4, 3070, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫(cos(x)/√(1-sin^2(x))) dx.",
                "1 + C", "-1 + C", "cos(x) + C", "sin(x) + C",
                "A", 4, 3071, "hard"));

        unit4Questions.add(new Question(
                "Find ∫0^1 x^3 dx.",
                "1/4", "1/3", "1/2", "1",
                "A", 4, 3072, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫(x^2 + 3x + 2) dx.",
                "x^3/3 + 3x^2/2 + 2x + C", "x^3/3 + x^2 + 2x + C", "x^3 + 3x^2 + 2x + C", "x^2 + 3x + 2 + C",
                "A", 4, 3073, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫0^π/2 x sin(x) dx using integration by parts.",
                "1", "0", "π/2", "π",
                "C", 4, 3074, "hard"));

        unit4Questions.add(new Question(
                "Find ∫(x^3 - x) dx.",
                "x^4/4 - x^2/2 + C", "x^4/4 - x + C", "x^3/3 - x^2 + C", "x^4 - x^2 + C",
                "A", 4, 3075, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫ e^(2x) dx.",
                "1/2 e^(2x) + C", "e^(2x) + C", "2 e^(2x) + C", "ln(2x) + C",
                "A", 4, 3076, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫0^1 (2x+3) dx.",
                "3", "2", "4", "5",
                "A", 4, 3077, "easy"));

        unit4Questions.add(new Question(
                "Find ∫(x^2 - 4) dx.",
                "x^3/3 - 4x + C", "x^3/3 - 4 + C", "x^2 - 4x + C", "x^3 - 4x + C",
                "A", 4, 3078, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^π/2 cos(x) dx.",
                "1", "0", "1/2", "-1",
                "A", 4, 3079, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫ x^2 ln(x) dx using integration by parts.",
                "x^3 ln(x)/3 - x^3/9 + C", "x^3 ln(x)/3 + x^3/9 + C", "x^2 ln(x) - x^2/2 + C", "x^3 ln(x) - x^3/3 + C",
                "A", 4, 3080, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫ (2x + 1)^5 dx.",
                "(2x + 1)^6 / 12 + C", "(2x + 1)^6 / 6 + C", "(2x + 1)^5 / 10 + C", "(2x + 1)^6 / 2 + C",
                "A", 4, 3081, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫0^1 x e^(x^2) dx using substitution.",
                "1/2 (e - 1)", "e - 1", "1/2 (e + 1)", "e + 1/2",
                "A", 4, 3082, "hard"));

        unit4Questions.add(new Question(
                "Find ∫ (1/(x^2 + 4)) dx.",
                "1/2 arctan(x/2) + C", "arctan(x/4) + C", "2 arctan(x/2) + C", "1/4 arctan(x/4) + C",
                "A", 4, 3083, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^2 (3x^2 + 2x) dx.",
                "12", "10", "8", "14",
                "A", 4, 3084, "easy"));

        unit4Questions.add(new Question(
                "Compute ∫ e^x / (1 + e^x) dx using substitution.",
                "ln|1 + e^x| + C", "e^x + C", "ln|e^x| + C", "1/(1 + e^x) + C",
                "A", 4, 3085, "hard"));

        unit4Questions.add(new Question(
                "Find ∫ (cos(x) / (1 + sin(x))) dx.",
                "ln|1 + sin(x)| + C", "-ln|1 + sin(x)| + C", "ln|cos(x)| + C", "-ln|cos(x)| + C",
                "A", 4, 3086, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫0^1 (x^3 - x^2 + x) dx.",
                "1/4", "1/3", "1/2", "2/3",
                "A", 4, 3087, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫ (x^2 - 1)/(x - 1) dx using algebraic simplification.",
                "x + 1 + C", "x - 1 + C", "x^2 + C", "x^2 - 1 + C",
                "A", 4, 3088, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫ (2x - 3)/(x^2 - 3x + 2) dx using partial fractions.",
                "2 ln|x - 2| - ln|x - 1| + C", "ln|x - 2| - 2 ln|x - 1| + C", "ln|x - 1| - ln|x - 2| + C", "2 ln|x - 1| - ln|x - 2| + C",
                "A", 4, 3089, "hard"));

        unit4Questions.add(new Question(
                "Find ∫0^π sin^3(x) dx.",
                "2/3", "1/2", "1/3", "3/2",
                "A", 4, 3090, "medium"));

        unit4Questions.add(new Question(
                "Evaluate ∫ (sec^2(x) / (1 + tan(x))) dx.",
                "ln|1 + tan(x)| + C", "-ln|1 + tan(x)| + C", "tan(x) + C", "1/(1 + tan(x)) + C",
                "A", 4, 3091, "hard"));

        unit4Questions.add(new Question(
                "Compute ∫ (x^2 + 2x + 1)/(x + 1) dx.",
                "x^2 + 2x + C", "x^2 + x + C", "x^2 + x + 1 + C", "x^2 + 2x + 1 + C",
                "A", 4, 3092, "medium"));

        unit4Questions.add(new Question(
                "Find ∫0^1 (4x^3 - 2x + 1) dx.",
                "1", "2", "3", "0",
                "A", 4, 3093, "easy"));

        unit4Questions.add(new Question(
                "Evaluate ∫ (x^3 - 2x^2 + x) dx.",
                "x^4/4 - 2x^3/3 + x^2/2 + C", "x^4/4 - x^3 + x^2/2 + C", "x^3/3 - 2x^2 + x + C", "x^4/4 - 2x^2 + x + C",
                "A", 4, 3094, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫0^π x cos(x) dx using integration by parts.",
                "0", "π/2", "1", "π",
                "B", 4, 3095, "hard"));

        unit4Questions.add(new Question(
                "Find ∫ (1/(x^2 - 4)) dx using partial fractions.",
                "1/4 ln|(x-2)/(x+2)| + C", "1/2 ln|(x-2)/(x+2)| + C", "ln|x-2| - ln|x+2| + C", "ln|x+2| - ln|x-2| + C",
                "A", 4, 3096, "hard"));

        unit4Questions.add(new Question(
                "Evaluate ∫0^1 (x^4 + x^3 + x^2 + x + 1) dx.",
                "31/20", "32/20", "30/20", "33/20",
                "A", 4, 3097, "medium"));

        unit4Questions.add(new Question(
                "Compute ∫ (x^2 cos(x)) dx using integration by parts.",
                "x^2 sin(x) - 2 ∫ x sin(x) dx + C", "x^2 sin(x) + C", "x sin(x) - ∫ sin(x) dx + C", "x^2 cos(x) + C",
                "A", 4, 3098, "hard"));

        unit4Questions.add(new Question(
                "Find ∫0^π/2 sin^2(x) cos(x) dx using substitution.",
                "1/3", "1/2", "1/4", "2/3",
                "A", 4, 3099, "hard"));


        numUnit4Questions = unit4Questions.size();
        System.out.printf("There are %d questions in unit 4%n", numUnit4Questions);

    }

}
