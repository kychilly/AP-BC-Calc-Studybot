package com.Discord.DiscordBot;

import com.Discord.DiscordBot.Z_Units.*;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {

    // Change these prefixes to the said AP prefix. Ex: for AP HAG, change prefix to !hag and slashPrefix to hag.
    public static String prefix = "!BCcalc";
    public static String slashPrefix = "bccalc"; // Yea you have to put a / before this everytime

    public static int numUnits = 10; // The number of units the course has. Max of 25 units or else options crash

    public static int unitQuestionTimeoutInMinutes = 3; // (No Change) - Should be 3
    public static int unitQuestionIntervalCheckInSeconds = 30; // (No Change) - Should be 30

    public static int testTimeoutInMinutes = 30; // (No Change) - Should be 30
    public static int testIntervalCheckInMinutes = 5; // (No Change) - Should be 5

    public static int reportCooldown = 10 * 1000 * 60; // (No Change) - 10 minutes(or 600,000ms) for report cooldown

    public static int percentageFor3 = 38; // The percent you need to score a 3 or higher on the AP test

    public static String[] titles = {"Level 1 Sleeper", "Level 2 Learner", "Level 3 Casual", "Level 4 Honored", "Level 5 AP Deity"}; // (No Change) - Profile Titles

    public static int[] pointTitles = {0, 100, 250, 500, 1000}; // (No Change) - Points until next title

    public static int[] scorePercents = {57, 48, 38, 32}; // The percents to score a 5, 4, 3, and 2

    // (No Change) - Collegeboard logo
    public static String collegeBoardThumbnail = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQN2KG3StxIW0KW9EZP4pbSYbW-_1pJw9YtdR3HsZnyGTu1as-kFCJusA-qDROINnG9vJI&usqp=CAU";

    // Picture of the AP course(AP classroom picture)
    public static String APPicture = "https://images-ext-1.discordapp.net/external/BxkrFO_qXkXO2gVddd4DDMzHnlg-3vzFqRogCILP3TQ/%3Fq%3Dtbn%3AANd9GcRxZdW5lLyReWdCscZfMwRaN-RCI3xiu0Re8LQmW-t2J3ormCF5XLhB8H2ArC5Go-XEdkY%26usqp%3DCAU/https/encrypted-tbn0.gstatic.com/images?format=webp&width=224&height=126";

    // To invite the bot to your server
    public static String botInviteLink = "https://discord.com/oauth2/authorize?client_id=1408992624433565809&permissions=2147503104&integration_type=0&scope=bot";

    // Bot mention
    public static String botMention = "<@1408992624433565809>";

    // (No Change) - Integrated AI prompt
    public static String COMMAND_GUIDE_PROMPT =
            "You are the built-in help guide and study assistant for the " + slashPrefix.toUpperCase() + "-Studybot.\n" +
                    "\nYour two main roles are:\n" +
                    "1. Command Guide — Explain only the specific command(s) the user asks about: how they work, required/optional parameters, and give at least one example.\n" +
                    "2. Study Helper — Answer user questions related to AP " + prefix + " content.\n" +
                    "\nNotes:\n" +
                    "- Users may sometimes ask off-topic questions. You may answer politely, but don’t be mean. Only mention your dual purpose if they go off-topic.\n" +
                    "- Keep responses under 1000 characters.\n" +
                    "- Present information in a clear, concise format.\n" +
                    "- When commands have parameters, explain what they do and what happens if left blank.\n" +
                    "- Never use, repeat, or acknowledge offensive/derogatory language (including disguised/bypassed slurs). Always check responses for safety.\n" +
                    "\nCommand details:\n" +
                    "- " + prefix + "<number>: Sends a question from the specified AP" + Constants.slashPrefix.toUpperCase() + " unit (1–" + numUnits + "). Example: !" + prefix + "1 sends a Unit 1 question.\n" +
                    "- /" + slashPrefix + "-practice-question: Slash version of " + prefix + "<number>. Optional param: unit (1–" + numUnits + "). Blank → random unit.\n" +
                    "- /" + slashPrefix + "-test: Starts a quiz. Optional params: number of questions (must be 5, 10, 15, 20, or 50; default 10), unit (1–" + numUnits + "), blank → all units).\n" +
                    "- " + prefix + "-questionbank: Shows all questions.\n" +
                    "- " + prefix + "-info: Overview of the AP course.\n" +
                    "- " + prefix + "-resources: Study resources.\n" +
                    "- " + prefix + "-report <Your message>: Report a bug or issue with the bot. There is a " +
                    "- /" + slashPrefix + "-help: Lists all commands.\n" +
                    "- /" + slashPrefix + "-ask: Ask AI a question directly.\n" +
                    "- /" + slashPrefix + "-profile: Displays your profile. Optional param: @mention of another user to view their profile.\nHere is their response: ";

    // Change this with whatever AP course this bot is - no need to change botInviteLink, as its already changed
    public static MessageEmbed createResourcesEmbed() {
        EmbedBuilder embed = new EmbedBuilder()
                .setTitle("📚 AP " + Constants.slashPrefix.toUpperCase() + " Study Resources")
                .setDescription("Here are some valuable resources to help you succeed in AP Calculus BC:")
                .setColor(0x3498db)
                .setThumbnail(Constants.collegeBoardThumbnail)

                // Official College Board Resources
                .addField("🎓 Official College Board Resources",
                        "• [Course Overview](https://apstudents.collegeboard.org/courses/ap-calculus-bc)\n" +
                                "• [Course Description](https://apcentral.collegeboard.org/pdf/ap-calculus-bc-course-and-exam-description.pdf)\n" +
                                "• [Past Exam Questions](https://apcentral.collegeboard.org/courses/ap-calculus-bc/exam)\n" +
                                "• [AP Classroom](https://myap.collegeboard.org/) (Requires teacher login)", false)

                // Video Tutorials
                .addField("📺 Video Tutorials",
                        "• [Khan Academy AP Calculus BC](https://www.khanacademy.org/math/ap-calculus-bc)\n" +
                                "• [PatrickJMT Calculus BC Videos](https://www.youtube.com/playlist?list=PL1A2CSdiySGJQKniwQERk0T8gRD6vS14f)\n" +
                                "• [MIT OpenCourseWare Calculus](https://ocw.mit.edu/courses/mathematics/18-01sc-single-variable-calculus-fall-2010/)", false)

                // Practice Sites
                .addField("💻 Practice & Problem Solving",
                        "• [AP Calculus BC Practice Exams](https://apstudents.collegeboard.org/courses/ap-calculus-bc/exam)\n" +
                                "• [Paul's Online Math Notes](http://tutorial.math.lamar.edu/Classes/CalcBC/CalcBC.aspx)\n" +
                                "• [Integral Calculator Practice](https://www.integral-calculator.com/)", false)

                // Additional Help
                .addField("🆘 Additional Help",
                        "• [Khan Academy Calculus Notes](https://www.khanacademy.org/math/calculus-1)\n" +
                                "• [PatrickJMT Worked Examples](https://www.youtube.com/user/patrickJMT)\n" +
                                "• [Stack Exchange Math](https://math.stackexchange.com/)", false)

                // Bot Invite
                .addField("🤖 Bot Invite",
                        "[Invite this bot to your server](" + Constants.botInviteLink + ")", false)

                .setFooter("Good luck with your studies! 🍀");

        return embed.build();
    }


    // (No Change) - The total number of questions in the units
    public static int sum;

    // Change this to whatever AP course info you want
    public static void SendAvailableQuestions(MessageReceivedEvent event) {

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("📚 Available Practice Questions 📚");
        embed.setThumbnail(Constants.APPicture);
        embed.setColor(0x3498db);

        embed.setDescription(String.format(
                "**Total Questions:** %d\n\nUse `!" + Constants.slashPrefix + "<number>`,  `/" + Constants.slashPrefix + "-practice-question`, or `/" +
                        Constants.slashPrefix + "-test` to start practicing!\n----------------------------------------------------", sum
        ));

        embed.addField("**Unit 1:** Limits & Continuity",
                String.format(
                        "🔹 **%d questions**\nCovers limits, one-sided limits, continuity, and interpreting graphs.\n\u200B",
                        Unit1.numUnit1Questions),
                false);

        embed.addField("**Unit 2:** Differentiation: Definition & Fundamental Rules",
                String.format(
                        "🔹 **%d questions**\nFocuses on derivative definitions, power rule, sum/difference/product/quotient rules.\n\u200B",
                        Unit2.numUnit2Questions),
                false);

        embed.addField("**Unit 3:** Differentiation: Composite, Implicit, & Logarithmic Functions",
                String.format(
                        "🔹 **%d questions**\nCovers chain rule, implicit differentiation, logarithmic and exponential derivatives.\n\u200B",
                        Unit3.numUnit3Questions),
                false);

        embed.addField("**Unit 4:** Applications of Differentiation",
                String.format(
                        "🔹 **%d questions**\nFocuses on related rates, optimization, linearization, and motion problems.\n\u200B",
                        Unit4.numUnit4Questions),
                false);

        embed.addField("**Unit 5:** Integrals",
                String.format(
                        "🔹 **%d questions**\nCovers antiderivatives, definite integrals, FTC, and area under curves.\n\u200B",
                        Unit5.numUnit5Questions),
                false);

        embed.addField("**Unit 6:** Applications of Integration",
                String.format(
                        "🔹 **%d questions**\nFocuses on volumes, work, average value, and accumulation functions.\n\u200B",
                        Unit6.numUnit6Questions),
                false);

        embed.addField("**Unit 7:** Differential Equations & Slope Fields",
                String.format(
                        "🔹 **%d questions**\nCovers solving basic differential equations, slope fields, and exponential growth/decay.\n\u200B",
                        Unit7.numUnit7Questions),
                false);

        embed.addField("**Unit 8:** Series & Sequences",
                String.format(
                        "🔹 **%d questions**\nFocuses on arithmetic/geometric series, convergence tests, and power series.\n\u200B",
                        Unit8.numUnit8Questions),
                false);

        embed.addField("**Unit 9:** Parametric, Polar, & Vector Functions",
                String.format(
                        "🔹 **%d questions**\nCovers parametric equations, polar coordinates, and basic vector functions.\n\u200B",
                        Unit9.numUnit9Questions),
                false);

        embed.addField("**Unit 10:** Advanced Topics & Review",
                String.format(
                        "🔹 **%d questions**\nIncludes L'Hôpital's Rule, improper integrals, and comprehensive review problems.\n\n" +
                                "[Visit Our Website](https://customdiscordbots.org)\n" +
                                "Contact <@840216337119969301> for any questions",
                        Unit10.numUnit10Questions),
                false);

        embed.setFooter("All questions are student-created! Please report if you see any mistakes!");

        event.getChannel().sendMessageEmbeds(embed.build()).queue();
    }



    // (No Change) - Possible end of test messages
    public static final ArrayList<String> FIVE_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Great job! You're at the top of your game!", "Excellent work! Keep it up!", "Fantastic effort! You nailed it!", "Outstanding performance! Well done!", "You crushed it! Congratulations!", "Superb! You're truly excellent!", "Amazing job! You're a star!", "Bravo! That’s an impressive score!", "You did wonderfully! Keep shining!", "Exceptional! You're one of the best!", "Phenomenal work! Proud of you!", "Top-notch job! Keep soaring!", "Magnificent! You’re on fire!", "Splendid! You should be proud!", "Impressive! You worked hard and it shows!", "Remarkable! Keep pushing those limits!", "Wonderful! You aced it!", "Superb performance! Way to go!", "Terrific! You set the bar high!", "Brilliant! You deserve all the praise!"));
    public static final ArrayList<String> FOUR_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Good job! You're doing really well!", "Nice work! Keep it up!", "Solid effort! You're almost there!", "Well done! You're on the right track!", "Great progress! Keep pushing forward!", "You're doing a good job! Stay focused!", "Good going! A bit more and you’ll ace it!", "Nice job! Keep building on this!", "Well played! You're making steady progress!", "Good work! Keep practicing!", "You're doing well! Keep it consistent!", "Strong performance! Keep improving!", "You're getting there! Keep at it!", "Good effort! Keep striving!", "Nice results! You're showing great potential!", "Well done! Keep aiming higher!", "Good job! You're almost at the top!", "Solid work! Keep moving forward!", "You're doing a great job! Keep it steady!", "Good going! You're making progress!"));
    public static final ArrayList<String> THREE_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Good effort! Keep working and you'll improve!", "You're making progress! Stay motivated!", "Not bad! Keep practicing and you'll get better!", "Keep it up! Every bit of practice helps!", "You're on the right path! Don't give up!", "Nice try! Keep pushing yourself!", "Decent work! Keep aiming higher!", "You're getting there! Keep at it!", "Solid attempt! Keep learning!", "Keep improving! You're doing okay!", "Keep focused! Improvement takes time!", "You're doing fine! Stay consistent!", "Good start! Keep building your skills!", "You're making steady progress! Keep going!", "Keep practicing! You're on your way!", "You're doing alright! Keep pushing!", "Keep working hard! You can do this!", "Don't stop now! Practice makes perfect!", "You're on your way! Stay determined!", "Nice progress! Keep it up!"));
    public static final ArrayList<String> TWO_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Keep trying! Practice will help you improve!", "Don't be discouraged! Keep working hard!", "You can do better! Keep pushing forward!", "Stay motivated! Improvement is a journey!", "Keep practicing! You'll get there!", "Hang in there! Keep putting in effort!", "Keep at it! Every step counts!", "Don't give up! Keep learning!", "Focus and practice! You can improve!", "Keep going! Persistence pays off!", "Stay positive! Keep working on your skills!", "Keep striving! You're making progress!", "Don't lose hope! Keep practicing!", "Work hard! Improvement takes time!", "Keep focused! You'll get better!", "Stay determined! Keep trying!", "Keep moving forward! You can improve!", "Keep practicing! Believe in yourself!", "Stay patient! Progress is progress!", "Keep pushing! You're learning!"));
    public static final ArrayList<String> ONE_SCORE_MESSAGES = new ArrayList<>(Arrays.asList("Don't give up! You can improve!", "Keep trying! Every effort counts!", "Stay positive! Practice helps!", "Keep working! You’ll get better!", "Don’t lose hope! Keep going!", "Keep pushing! Improvement takes time!", "Stay determined! Keep practicing!", "Keep at it! Progress is progress!", "Believe in yourself! Keep trying!", "Keep focused! You’re learning!", "Keep moving forward! Don’t quit!", "Every step helps! Stay strong!", "Work hard! You’ll improve!", "Keep practicing! You can do it!", "Stay motivated! Keep pushing!", "Keep going! Don’t be discouraged!", "Stay patient! You’re making progress!", "Keep striving! You’re getting there!", "Stay positive! Keep at it!", "Don’t give up! You’ve got this!"));

    // Good luck with your studies!
}
