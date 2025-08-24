package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit10Questions;

public class Unit10 {

    public static int numUnit10Questions;

    public static void initializeUnit10Questions() {

        unit10Questions.add(new Question(
                "Determine if the sequence a_n = 1/n converges or diverges.",
                "Converges", "Diverges", "Oscillates", "None of the above",
                "A", 10, 9000, "easy"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (2n + 3)/(n + 5).",
                "2", "1", "0", "Infinity",
                "A", 10, 9001, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑(1/n^2) from n=1 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9002, "easy"));

        unit10Questions.add(new Question(
                "Determine if the series ∑(1/n) from n=1 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9003, "easy"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑(3/4)^(n-1) from n=1 to ∞.",
                "4", "3", "1", "Does not exist",
                "A", 10, 9004, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑(-1)^(n+1)/n converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9005, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (-1)^n converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9006, "easy"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑(1/2)^n from n=1 to ∞.",
                "1", "1/2", "2", "Does not exist",
                "A", 10, 9007, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n/(n^2 + 1) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9008, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = n/(n+1) converge or diverge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9009, "easy"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n(n+1)) from n=1 to ∞ converges and find its sum.",
                "Converges to 1", "Converges to 0", "Diverges", "Converges to 2",
                "A", 10, 9010, "medium"));

        unit10Questions.add(new Question(
                "Determine if the alternating series ∑(-1)^n/n^2 converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9011, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 2^n/n! converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9012, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = sin(n)/n converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9013, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n√n) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9014, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the series ∑ 1/2^n from n=0 to ∞.",
                "2", "1", "1/2", "Does not exist",
                "A", 10, 9015, "medium"));

        unit10Questions.add(new Question(
                "Determine if the sequence a_n = (n^2 + 1)/(2n^2 + 3) converges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9016, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-3/4)^n converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9017, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = 1 + 1/n converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9018, "easy"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n^2/2^n converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9019, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/n^3 converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9020, "easy"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (-1)^n/n converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9021, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^2 + n) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9022, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (1/3)^n from n=0 to ∞.",
                "3/2", "1/2", "1", "Does not exist",
                "A", 10, 9023, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^n/n^3 converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9024, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = n/(2n + 1) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9025, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n/(2^n) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9026, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (3n + 1)/(2n + 5).",
                "3/2", "1", "0", "Infinity",
                "A", 10, 9027, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n ln(n)) from n=2 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9028, "hard"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (2n^2 + 1)/(n^2 + 3) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9029, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^(n+1)/(n^2 + 1) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9030, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (5/6)^(n-1) from n=1 to ∞.",
                "6", "5", "1", "Does not exist",
                "A", 10, 9031, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n^2/(n^3 + 1) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9032, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (1 + 1/n)^n converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9033, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (1 + (-1)^n)/n^2 converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9034, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (n^3 - n)/(2n^3 + 5).",
                "1/2", "0", "1", "Infinity",
                "A", 10, 9035, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (2^n)/(3^n) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9036, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (-1)^n/(n+1) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9037, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n/(n^2 + 1) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9038, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the series ∑ 1/2^n from n=1 to ∞.",
                "1", "1/2", "2", "Does not exist",
                "A", 10, 9039, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n(n+1)) from n=1 to ∞ converges and find its sum.",
                "Converges to 1", "Converges to 0", "Diverges", "Converges to 2",
                "A", 10, 9040, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = n/(n+2) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9041, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^n/n converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9042, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (n^2 + 3)/(2n^2 + 1).",
                "1/2", "1", "0", "Infinity",
                "A", 10, 9043, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n ln(n)^2) from n=2 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9044, "hard"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (3n + 5)/(3n + 2) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9045, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^4 + 1) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9046, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (1/5)^n from n=0 to ∞.",
                "5/4", "1/4", "1", "Does not exist",
                "A", 10, 9047, "medium"));

        unit10Questions.add(new Question(
                "Determine if the alternating series ∑ (-1)^n/(n+1) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9048, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = sqrt(n)/(n+1) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9049, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n^3/2^n converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9050, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (2n^2 + 1)/(3n^2 + 5).",
                "2/3", "1", "0", "Infinity",
                "A", 10, 9051, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^n n/(n+1) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9052, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (n^2 - 1)/(n^2 + 2) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9053, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^2 + n + 1) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9054, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (2/3)^n from n=0 to ∞.",
                "3", "2", "1", "Does not exist",
                "A", 10, 9055, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^2 - n) from n=2 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9056, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (n^3 + 1)/(2n^3 + 5) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9057, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^(n+1)/sqrt(n) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9058, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the series ∑ 1/3^n from n=1 to ∞.",
                "1/2", "1/3", "1", "Does not exist",
                "A", 10, 9059, "medium"));

        unit10Questions.add(new Question(
                "Determine if the sequence a_n = (3n + 2)/(4n + 5) converges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9060, "medium"));

        unit10Questions.add(new Question(
                "Does the series ∑ 1/(n^2 + 2n) from n=1 to ∞ converge or diverge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9061, "medium"));

        unit10Questions.add(new Question(
                "Determine if the alternating series ∑ (-1)^n/(2n + 1) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9062, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (5n^2 + 3)/(10n^2 + 1).",
                "1/2", "1", "0", "Infinity",
                "A", 10, 9063, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n ln(n)) from n=2 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9064, "hard"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (-1)^n n/(n+1) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9065, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n!/2^n diverges or converges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9066, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (4/5)^n from n=0 to ∞.",
                "5", "4", "1", "Does not exist",
                "A", 10, 9067, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^(n+1)/(n^2 + 2) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9068, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = n/(n^2 + 1) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9069, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 3^n/n! converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9070, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (n^2 + 2n + 1)/(2n^2 + 3n).",
                "1/2", "1", "0", "Infinity",
                "A", 10, 9071, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^n/(n^2 + n) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9072, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (2n^3 + 1)/(n^3 + 3) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9073, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^2 - n + 1) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9074, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (3/4)^n from n=0 to ∞.",
                "4", "3", "1", "Does not exist",
                "A", 10, 9075, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^2 + 3n) from n=1 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9076, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (n^2 + n)/(2n^2 + 5) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9077, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^n/n^(1/2) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9078, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the series ∑ 1/4^n from n=1 to ∞.",
                "1/3", "1/4", "1", "Does not exist",
                "A", 10, 9079, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^3 + 2n) from n=1 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9080, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (5n + 2)/(3n + 7) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9081, "medium"));

        unit10Questions.add(new Question(
                "Determine if the alternating series ∑ (-1)^n/(n^2 + 3) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9082, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (3n^2 + 2)/(6n^2 + 1).",
                "1/2", "1", "0", "Infinity",
                "A", 10, 9083, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n ln(n)^3) from n=2 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9084, "hard"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (-2)^n/n converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "B", 10, 9085, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ n^2/3^n converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9086, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (1/6)^n from n=0 to ∞.",
                "6/5", "1/5", "1", "Does not exist",
                "A", 10, 9087, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^(n+1)/(n^2 + 3n + 1) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9088, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = n/(n^2 + 2n + 1) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9089, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 4^n/n! converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9090, "medium"));

        unit10Questions.add(new Question(
                "Find the limit of the sequence a_n = (n^2 + 5n + 2)/(2n^2 + 3n).",
                "1/2", "1", "0", "Infinity",
                "A", 10, 9091, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^n/(n^3 + n) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "A", 10, 9092, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (n^3 + n)/(2n^3 + 5) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9093, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^2 + n + 2) converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9094, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the geometric series ∑ (5/6)^n from n=0 to ∞.",
                "6", "5", "1", "Does not exist",
                "A", 10, 9095, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ 1/(n^3 + 3n^2) from n=1 to ∞ converges or diverges.",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9096, "medium"));

        unit10Questions.add(new Question(
                "Does the sequence a_n = (n^2 - n + 1)/(2n^2 + 5) converge?",
                "Converges", "Diverges", "Oscillates", "Cannot be determined",
                "A", 10, 9097, "medium"));

        unit10Questions.add(new Question(
                "Determine if the series ∑ (-1)^n/n^(2/3) converges absolutely, conditionally, or diverges.",
                "Absolutely convergent", "Conditionally convergent", "Divergent", "Oscillates",
                "B", 10, 9098, "medium"));

        unit10Questions.add(new Question(
                "Find the sum of the series ∑ 1/5^n from n=1 to ∞.",
                "1/4", "1/5", "1", "Does not exist",
                "A", 10, 9099, "medium"));


        numUnit10Questions = unit10Questions.size();
        System.out.printf("There are %d questions in unit 10%n", numUnit10Questions);

    }

}
