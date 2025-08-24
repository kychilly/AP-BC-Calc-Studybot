package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit6Questions;

public class Unit6 {

    public static int numUnit6Questions;

    public static void initializeUnit6Questions() {

        unit6Questions.add(new Question(
                "Evaluate ∫0^2 (x^3) dx.",
                "4", "2", "8", "1",
                "A", 6, 5000, "easy"));

        unit6Questions.add(new Question(
                "Compute ∫ (2x + 5) dx.",
                "x^2 + 5x + C", "2x^2 + 5x + C", "x^2 + C", "x^2 + 2x + 5 + C",
                "A", 6, 5001, "easy"));

        unit6Questions.add(new Question(
                "Find ∫ (x^2 e^x) dx using integration by parts.",
                "x^2 e^x - 2 ∫ x e^x dx + C", "x^2 e^x + C", "x e^x + C", "2x e^x + C",
                "A", 6, 5002, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π sin(x) dx.",
                "2", "1", "0", "-2",
                "A", 6, 5003, "easy"));

        unit6Questions.add(new Question(
                "Compute ∫ cos(3x) dx.",
                "1/3 sin(3x) + C", "3 sin(3x) + C", "cos(3x) + C", "1/3 cos(3x) + C",
                "A", 6, 5004, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (x/(x^2 + 1)) dx.",
                "1/2 ln|x^2+1| + C", "ln|x| + C", "1/(x^2+1) + C", "x^2/2 + C",
                "A", 6, 5005, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫ e^(2x) dx.",
                "1/2 e^(2x) + C", "2 e^(2x) + C", "e^(2x) + C", "ln(2x) + C",
                "A", 6, 5006, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^1 x^2 dx.",
                "1/3", "1/2", "1/4", "1",
                "A", 6, 5007, "easy"));

        unit6Questions.add(new Question(
                "Find ∫ (1/√(1-x^2)) dx.",
                "arcsin(x) + C", "arccos(x) + C", "arctan(x) + C", "-arcsin(x) + C",
                "A", 6, 5008, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^3 - 2x) dx.",
                "x^4/4 - x^2 + C", "x^4/4 - 2x^2 + C", "x^3/3 - 2x + C", "x^4 - 2x + C",
                "A", 6, 5009, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (3x^2 + 4x + 5) dx.",
                "11/2", "10/2", "12/2", "9/2",
                "A", 6, 5010, "easy"));

        unit6Questions.add(new Question(
                "Compute ∫ x e^x dx using integration by parts.",
                "x e^x - e^x + C", "x e^x + C", "e^x + C", "x e^x - 2 e^x + C",
                "A", 6, 5011, "hard"));

        unit6Questions.add(new Question(
                "Find ∫ (x^2 + 1)^2 dx.",
                "x^5/5 + 2x^3/3 + x + C", "x^4/4 + x^2 + C", "x^5/5 + x^3 + x + C", "x^5/5 + x^3/3 + x + C",
                "A", 6, 5012, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π/2 sin^2(x) dx.",
                "π/4", "π/2", "1/2", "1",
                "A", 6, 5013, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^1 x^3 dx.",
                "1/4", "1/3", "1/2", "1",
                "A", 6, 5014, "easy"));

        unit6Questions.add(new Question(
                "Find ∫0^π x cos(x) dx using integration by parts.",
                "0", "π/2", "1", "π",
                "B", 6, 5015, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (1/(x^2 + 4)) dx.",
                "1/2 arctan(x/2) + C", "arctan(x/4) + C", "2 arctan(x/2) + C", "1/4 arctan(x/4) + C",
                "A", 6, 5016, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^1 (2x^3 - x) dx.",
                "0", "1", "2", "-1",
                "A", 6, 5017, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (x^2 ln(x)) dx using integration by parts.",
                "x^3 ln(x)/3 - x^3/9 + C", "x^3 ln(x)/3 + x^3/9 + C", "x^2 ln(x) - x^2/2 + C", "x^3 ln(x) - x^3/3 + C",
                "A", 6, 5018, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (x^4 + x^3 + x^2 + x + 1) dx.",
                "31/20", "32/20", "30/20", "33/20",
                "A", 6, 5019, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^3 + 2x^2 - x + 1) dx.",
                "x^4/4 + 2x^3/3 - x^2/2 + x + C", "x^4/4 + 2x^2/3 - x^2/2 + x + C", "x^3 + 2x^2 - x + C", "x^4/4 + x^3/3 - x^2/2 + x + C",
                "A", 6, 5020, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π/2 cos^2(x) dx.",
                "π/4", "π/2", "1/2", "1",
                "A", 6, 5021, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ e^(3x) dx.",
                "1/3 e^(3x) + C", "3 e^(3x) + C", "e^(3x) + C", "ln(3x) + C",
                "A", 6, 5022, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (x^2/(x+1)) dx using long division.",
                "1/2 x^2 - x + ln|x+1| + C", "x - 1/2 x^2 + ln|x+1| + C", "x^2/(2(x+1)) + C", "x^2/2 + ln|x+1| + C",
                "A", 6, 5023, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (1/(x√(x^2-1))) dx.",
                "arcsec(x) + C", "arcsin(x) + C", "arctan(x) + C", "ln|x + √(x^2-1)| + C",
                "D", 6, 5024, "hard"));

        unit6Questions.add(new Question(
                "Compute ∫0^2 (4x^3 - 2x^2 + x) dx.",
                "8", "7", "6", "9",
                "A", 6, 5025, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (cos(x)/sin^2(x)) dx.",
                "-1/sin(x) + C", "1/sin(x) + C", "-cos(x) + C", "ln|sin(x)| + C",
                "A", 6, 5026, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 x^2 e^x dx using integration by parts.",
                "1/1 e^1 - 2 ∫ x e^x dx", "x^2 e^x + C", "x e^x + C", "2 x e^x + C",
                "A", 6, 5027, "hard"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^3 - 3x^2 + 2x) dx.",
                "x^4/4 - x^3 + x^2 + C", "x^4/4 - 3x^3 + 2x^2 + C", "x^3/3 - 3x^2 + 2x + C", "x^4 - 3x^3 + 2x^2 + C",
                "A", 6, 5028, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (sec^2(x)) dx.",
                "tan(x) + C", "sec(x) + C", "cos(x) + C", "-tan(x) + C",
                "A", 6, 5029, "easy"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (1/(1+x^2)) dx.",
                "arctan(x) + C", "arcsin(x) + C", "ln|x| + C", "-arctan(x) + C",
                "A", 6, 5030, "easy"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 - 1)/(x - 1) dx using algebraic simplification.",
                "x + 1 + C", "x - 1 + C", "x^2 + C", "x^2 - 1 + C",
                "A", 6, 5031, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (x^4 + x^3 + x^2 + x + 1) dx.",
                "31/20", "32/20", "30/20", "33/20",
                "A", 6, 5032, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^π sin^3(x) dx.",
                "2/3", "1/2", "1/3", "3/2",
                "A", 6, 5033, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (1/(x^2 - 4)) dx using partial fractions.",
                "1/4 ln|(x-2)/(x+2)| + C", "1/2 ln|(x-2)/(x+2)| + C", "ln|x-2| - ln|x+2| + C", "ln|x+2| - ln|x-2| + C",
                "A", 6, 5034, "hard"));

        unit6Questions.add(new Question(
                "Compute ∫ (x e^(3x)) dx using integration by parts.",
                "1/3 x e^(3x) - 1/9 e^(3x) + C", "x e^(3x) - e^(3x) + C", "x e^(3x)/3 + C", "e^(3x) + C",
                "A", 6, 5035, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (3x^2 + 4x + 5) dx.",
                "11/2", "10/2", "12/2", "9/2",
                "A", 6, 5036, "easy"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 cos(x)) dx using integration by parts.",
                "x^2 sin(x) - 2 ∫ x sin(x) dx + C", "x^2 sin(x) + C", "x sin(x) - ∫ sin(x) dx + C", "x^2 cos(x) + C",
                "A", 6, 5037, "hard"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (x^2 + 2x + 1) dx.",
                "7/3", "2", "5/3", "3",
                "A", 6, 5038, "easy"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π/2 x sin(x) dx using integration by parts.",
                "1", "0", "π/2", "π",
                "C", 6, 5039, "hard"));

        unit6Questions.add(new Question(
                "Compute ∫ (4x^3 - x^2 + 2x - 1) dx.",
                "x^4 - x^3/3 + x^2 - x + C", "x^4 - x^3/3 + x^2 + x + C", "x^4/4 - x^3/3 + x^2 - x + C", "x^4/4 - x^2 + x - 1 + C",
                "A", 6, 5040, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (x^5 - 3x^3 + x) dx.",
                "0", "1/6", "-1/6", "1/3",
                "A", 6, 5041, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ e^(2x) sin(3x) dx using integration by parts.",
                "e^(2x)(2 sin(3x) - 3 cos(3x))/13 + C", "-e^(2x)(2 sin(3x) - 3 cos(3x))/13 + C", "e^(2x) sin(3x) + C", "2 e^(2x) sin(3x) + C",
                "A", 6, 5042, "hard"));

        unit6Questions.add(new Question(
                "Find ∫ (x^3 - 2x + 1) dx.",
                "x^4/4 - x^2 + x + C", "x^4/4 - x^2 + 1 + C", "x^3/3 - 2x + C", "x^4/4 - 2x^2 + x + C",
                "A", 6, 5043, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π sin^2(x) dx using the power-reduction formula.",
                "π/2", "π/4", "1", "1/2",
                "B", 6, 5044, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (1/(x^2 + 9)) dx.",
                "1/3 arctan(x/3) + C", "arctan(x/9) + C", "3 arctan(x/3) + C", "1/9 arctan(x/9) + C",
                "A", 6, 5045, "medium"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (x^4 + 2x^3 - x + 1) dx.",
                "11/5", "12/5", "9/5", "10/5",
                "A", 6, 5046, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 cos(2x)) dx using integration by parts.",
                "x^2 sin(2x)/2 - ∫ x sin(2x) dx + C", "x^2 sin(2x) + C", "x sin(2x) - ∫ sin(2x) dx + C", "x^2 cos(2x) + C",
                "A", 6, 5047, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (3x^2 + 4x + 5) dx.",
                "x^3 + 2x^2 + 5x + C", "x^3 + 2x^2 + 5 + C", "x^3/3 + 2x^2 + 5x + C", "x^3 + 4x^2 + 5x + C",
                "A", 6, 5048, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^1 (2x^3 - x^2 + x - 1) dx.",
                "-1/2", "1/2", "0", "1",
                "A", 6, 5049, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (x^3 + x^2 + x + 1) dx.",
                "x^4/4 + x^3/3 + x^2/2 + x + C", "x^3/3 + x^2/2 + x + 1 + C", "x^4/4 + x^3/3 + x + 1 + C", "x^4/4 + x^3/3 + x^2/2 + 1 + C",
                "A", 6, 5050, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π/4 tan(x) dx.",
                "-ln|cos(x)| from 0 to π/4", "ln|sin(x)| from 0 to π/4", "tan(x) from 0 to π/4", "sec(x) from 0 to π/4",
                "A", 6, 5051, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 - 1)^2 dx.",
                "x^5/5 - 2x^3/3 + x + C", "x^4 - x^2 + C", "x^5/5 - 2x^2 + x + C", "x^4/4 - 2x^3/3 + x + C",
                "A", 6, 5052, "medium"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (x^5 - 2x^3 + x) dx.",
                "0", "1/6", "-1/6", "1/3",
                "A", 6, 5053, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (1/(x^2 - 1)) dx using partial fractions.",
                "1/2 ln|(x-1)/(x+1)| + C", "ln|x-1| - ln|x+1| + C", "ln|x+1| - ln|x-1| + C", "1/(x-1) - 1/(x+1) + C",
                "A", 6, 5054, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (4x^3 + 3x^2 + 2x + 1) dx.",
                "11/4", "10/4", "12/4", "9/4",
                "A", 6, 5055, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^3 e^x) dx using integration by parts.",
                "x^3 e^x - 3 ∫ x^2 e^x dx + C", "x^3 e^x + C", "x^2 e^x + C", "3x^3 e^x + C",
                "A", 6, 5056, "hard"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (x^4 + x^2 + 1) dx.",
                "7/5", "6/5", "8/5", "5/4",
                "A", 6, 5057, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (2x^2 - 3x + 1) dx.",
                "2x^3/3 - 3x^2/2 + x + C", "x^3 - 3x^2/2 + x + C", "2x^2 - 3x + 1 + C", "x^3/3 - 3x^2/2 + x + C",
                "A", 6, 5058, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^π/2 x cos(x) dx using integration by parts.",
                "0", "π/2", "1", "π",
                "B", 6, 5059, "hard"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^3 + 2x^2 + x + 1) dx.",
                "x^4/4 + 2x^3/3 + x^2/2 + x + C", "x^4/4 + 2x^2/3 + x^2/2 + x + C", "x^3 + 2x^2 + x + C", "x^4/4 + x^3/3 - x^2/2 + x + C",
                "A", 6, 5060, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (x^5 - 2x^3 + x) dx.",
                "0", "1/6", "-1/6", "1/3",
                "A", 6, 5061, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x e^(2x)) dx using integration by parts.",
                "1/2 x e^(2x) - 1/4 e^(2x) + C", "x e^(2x) - e^(2x) + C", "x e^(2x)/2 + C", "e^(2x) + C",
                "A", 6, 5062, "hard"));

        unit6Questions.add(new Question(
                "Find ∫ (x^4 - 2x^2 + 1) dx.",
                "x^5/5 - 2x^3/3 + x + C", "x^4/4 - 2x^2 + 1 + C", "x^3/3 - 2x^2 + x + C", "x^5/5 - x^2 + x + C",
                "A", 6, 5063, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π/2 sin(x) cos(x) dx using substitution.",
                "1/2", "1", "0", "π/4",
                "A", 6, 5064, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (1/(x^2 + 1)^2) dx.",
                "1/2 (arctan(x) + x/(x^2 + 1)) + C", "arctan(x) + C", "x/(x^2 + 1) + C", "-1/(x^2 + 1) + C",
                "A", 6, 5065, "hard"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (2x^3 - x^2 + 3x - 1) dx.",
                "1/2", "1", "0", "3/2",
                "A", 6, 5066, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 ln(x)) dx using integration by parts.",
                "x^3 ln(x)/3 - x^3/9 + C", "x^3 ln(x)/3 + x^3/9 + C", "x^2 ln(x) - x^2/2 + C", "x^3 ln(x) - x^3/3 + C",
                "A", 6, 5067, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (x^4 + 2x^3 + x^2 + 1) dx.",
                "27/20", "26/20", "25/20", "28/20",
                "A", 6, 5068, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 cos(x)) dx using integration by parts.",
                "x^2 sin(x) - 2 ∫ x sin(x) dx + C", "x^2 sin(x) + C", "x sin(x) - ∫ sin(x) dx + C", "x^2 cos(x) + C",
                "A", 6, 5069, "hard"));

        unit6Questions.add(new Question(
                "Find ∫ (x^3 + x^2 - x + 1) dx.",
                "x^4/4 + x^3/3 - x^2/2 + x + C", "x^4/4 + x^3/3 - x^2 + x + C", "x^3 + x^2 - x + C", "x^4/4 + x^3/3 + x^2/2 + x + C",
                "A", 6, 5070, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π/4 tan^2(x) dx.",
                "1 - π/4", "π/4", "1", "0",
                "A", 6, 5071, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (1/(x^2 - 9)) dx using partial fractions.",
                "1/6 ln|(x-3)/(x+3)| + C", "1/3 ln|(x-3)/(x+3)| + C", "ln|x-3| - ln|x+3| + C", "1/(x-3) - 1/(x+3) + C",
                "A", 6, 5072, "hard"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (x^3 - x^2 + x - 1) dx.",
                "-1/4", "1/4", "0", "1/2",
                "A", 6, 5073, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 e^(2x)) dx using integration by parts.",
                "x^2 e^(2x)/2 - ∫ x e^(2x) dx + C", "x^2 e^(2x) + C", "x e^(2x) + C", "2 x^2 e^(2x) + C",
                "A", 6, 5074, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π (1 - cos(x)) dx.",
                "π", "0", "1", "2π",
                "A", 6, 5075, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^3 - 2x^2 + x) dx.",
                "x^4/4 - 2x^3/3 + x^2/2 + C", "x^4/4 - 2x^2 + x + C", "x^3/3 - 2x^2 + x + C", "x^4 - 2x^3 + x^2 + C",
                "A", 6, 5076, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (cos(x)/(1 + sin(x))) dx.",
                "ln|1 + sin(x)| + C", "-ln|1 + sin(x)| + C", "ln|cos(x)| + C", "-ln|cos(x)| + C",
                "A", 6, 5077, "hard"));

        unit6Questions.add(new Question(
                "Compute ∫0^1 (2x^2 - 3x + 1) dx.",
                "0", "1", "-1", "1/2",
                "A", 6, 5078, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (x^4 + x^2 + 1) dx.",
                "x^5/5 + x^3/3 + x + C", "x^5/5 + x^3 + x + C", "x^4/4 + x^2 + 1 + C", "x^5/5 + x^3/2 + x + C",
                "A", 6, 5079, "medium"));
        unit6Questions.add(new Question(
                "Compute ∫ (x^3 + 2x^2 + x + 1) dx.",
                "x^4/4 + 2x^3/3 + x^2/2 + x + C", "x^4/4 + 2x^2/3 + x^2/2 + x + C", "x^3 + 2x^2 + x + C", "x^4/4 + x^3/3 - x^2/2 + x + C",
                "A", 6, 5080, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (x^5 - 3x^3 + 2x) dx.",
                "0", "1/6", "-1/6", "1/3",
                "A", 6, 5081, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (e^(2x) cos(3x)) dx using integration by parts.",
                "(2 e^(2x) sin(3x) + 3 e^(2x) cos(3x))/13 + C", "-(2 e^(2x) sin(3x) + 3 e^(2x) cos(3x))/13 + C", "e^(2x) cos(3x) + C", "2 e^(2x) cos(3x) + C",
                "A", 6, 5082, "hard"));

        unit6Questions.add(new Question(
                "Find ∫ (x^4 - x^2 + 1) dx.",
                "x^5/5 - x^3/3 + x + C", "x^4 - x^2 + 1 + C", "x^3/3 - x^2 + x + C", "x^5/5 - x^2 + x + C",
                "A", 6, 5083, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^π/2 sin^3(x) dx.",
                "2/3", "1/2", "1/3", "3/2",
                "A", 6, 5084, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (1/(x^2 + 16)) dx.",
                "1/4 arctan(x/4) + C", "arctan(x/16) + C", "4 arctan(x/4) + C", "1/16 arctan(x/16) + C",
                "A", 6, 5085, "medium"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (x^3 + x^2 - x + 1) dx.",
                "7/12", "2/3", "3/4", "5/6",
                "A", 6, 5086, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 sin(2x)) dx using integration by parts.",
                "-x^2 cos(2x)/2 + ∫ x cos(2x) dx + C", "x^2 sin(2x) + C", "x sin(2x) - ∫ sin(2x) dx + C", "-x^2 sin(2x) + C",
                "A", 6, 5087, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (4x^3 - 3x^2 + 2x - 1) dx.",
                "x^4 - x^3 + x^2 - x + C", "x^4 - x^3 + x^2 + x + C", "x^4/4 - x^3 + x^2 - x + C", "x^4/4 - x^2 + x - 1 + C",
                "A", 6, 5088, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^1 (x^5 - 2x^3 + x) dx.",
                "0", "1/6", "-1/6", "1/3",
                "A", 6, 5089, "medium"));

        unit6Questions.add(new Question(
                "Find ∫ (1/(x^2 - 16)) dx using partial fractions.",
                "1/8 ln|(x-4)/(x+4)| + C", "1/4 ln|(x-4)/(x+4)| + C", "ln|x-4| - ln|x+4| + C", "1/(x-4) - 1/(x+4) + C",
                "A", 6, 5090, "hard"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (2x^3 - x^2 + x - 1) dx.",
                "-1/4", "1/4", "0", "1/2",
                "A", 6, 5091, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x^2 e^(3x)) dx using integration by parts.",
                "x^2 e^(3x)/3 - 2 ∫ x e^(3x)/3 dx + C", "x^2 e^(3x) + C", "x e^(3x) + C", "3 x^2 e^(3x) + C",
                "A", 6, 5092, "hard"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (x^4 + x^2 + 1) dx.",
                "7/5", "6/5", "8/5", "5/4",
                "A", 6, 5093, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫ (3x^2 - 2x + 1) dx.",
                "x^3 - x^2 + x + C", "x^3 - 2x^2 + x + C", "3x^3 - 2x^2 + x + C", "x^3 - x^2 + 1 + C",
                "A", 6, 5094, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫0^π/2 x sin(x) dx using integration by parts.",
                "1", "0", "π/2", "1/2",
                "D", 6, 5095, "hard"));

        unit6Questions.add(new Question(
                "Find ∫ (x^3 + 3x^2 + x + 1) dx.",
                "x^4/4 + x^3 + x^2/2 + x + C", "x^4/4 + 3x^3 + x^2/2 + x + C", "x^3 + 3x^2 + x + C", "x^4/4 + 3x^2 + x + C",
                "A", 6, 5096, "medium"));

        unit6Questions.add(new Question(
                "Evaluate ∫0^1 (x^4 - x^3 + x^2 - x + 1) dx.",
                "13/20", "12/20", "11/20", "14/20",
                "A", 6, 5097, "medium"));

        unit6Questions.add(new Question(
                "Compute ∫ (x cos(3x)) dx using integration by parts.",
                "x sin(3x)/3 + ∫ sin(3x)/3 dx + C", "x sin(3x)/3 - ∫ sin(3x)/3 dx + C", "x cos(3x) + C", "sin(3x)/3 + C",
                "B", 6, 5098, "hard"));

        unit6Questions.add(new Question(
                "Find ∫0^1 (2x^2 - 3x + 1) dx.",
                "0", "1", "-1", "1/2",
                "A", 6, 5099, "medium"));



        numUnit6Questions = unit6Questions.size();
        System.out.printf("There are %d questions in unit 6%n", numUnit6Questions);

    }

}
