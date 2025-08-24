package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit5Questions;

public class Unit5 {

    public static int numUnit5Questions;

    public static void initializeUnit5Questions() {

        unit5Questions.add(new Question(
                "Find the critical points of the function f(x) = x^3 - 6x^2 + 9x + 2.",
                "x = 1, 3", "x = 0, 3", "x = 1, 2", "x = 2, 3",
                "A", 5, 4000, "medium"));

        unit5Questions.add(new Question(
                "Determine the intervals where f(x) = x^4 - 4x^3 is concave up.",
                "(-∞, 0) ∪ (3, ∞)", "(-∞, 1) ∪ (2, ∞)", "(0, 3)", "(1, 2)",
                "A", 5, 4001, "medium"));

        unit5Questions.add(new Question(
                "Find the local maxima and minima of f(x) = x^3 - 12x + 1.",
                "Max at x = -2, Min at x = 2", "Max at x = 2, Min at x = -2",
                "Max at x = 0, Min at x = 3", "Max at x = 1, Min at x = -1",
                "A", 5, 4002, "medium"));

        unit5Questions.add(new Question(
                "A particle moves along a line with position s(t) = t^3 - 6t^2 + 9t. Find when velocity is zero.",
                "t = 0, 1, 3", "t = 1, 3", "t = 0, 3", "t = 2, 3",
                "B", 5, 4003, "medium"));

        unit5Questions.add(new Question(
                "Find the absolute maximum and minimum of f(x) = x^3 - 3x^2 - 9x + 5 on [-1,4].",
                "Max: 5 at x=-1, Min: -16 at x=4", "Max: 5 at x=4, Min: -16 at x=-1",
                "Max: 0 at x=1, Min: -16 at x=4", "Max: 10 at x=3, Min: -5 at x=0",
                "A", 5, 4004, "hard"));

        unit5Questions.add(new Question(
                "Determine the inflection points of f(x) = x^4 - 4x^3 + 6x^2.",
                "(0,0) and (1,3)", "(1,3) and (2,8)", "(0,0) and (2,8)", "(1,1) and (3,9)",
                "C", 5, 4005, "medium"));

        unit5Questions.add(new Question(
                "Find the derivative of f(x) = x*e^x and determine where it is increasing.",
                "f'(x) = e^x(1+x), increasing for x > -1", "f'(x) = e^x(1-x), increasing for x < 1",
                "f'(x) = xe^x, increasing for x > 0", "f'(x) = e^x, increasing for all x",
                "A", 5, 4006, "medium"));

        unit5Questions.add(new Question(
                "Use the first derivative test to find local extrema of f(x) = x^3 - 3x^2 + 2.",
                "Max at x=0, Min at x=2", "Max at x=2, Min at x=0", "Max at x=1, Min at x=3", "Max at x=3, Min at x=1",
                "A", 5, 4007, "medium"));

        unit5Questions.add(new Question(
                "Find the interval(s) where f(x) = x^3 - 9x^2 + 24x is concave down.",
                "(-∞, 1) ∪ (3, ∞)", "(-∞, 2) ∪ (4, ∞)", "(1,3)", "(2,4)",
                "C", 5, 4008, "medium"));

        unit5Questions.add(new Question(
                "A curve has equation y = x^4 - 4x^2. Determine the x-values of inflection points.",
                "x = -1, 0, 1", "x = -√2, 0, √2", "x = -2, 2", "x = -√3, √3",
                "B", 5, 4009, "medium"));

        unit5Questions.add(new Question(
                "A function f(x) has f''(x) = 6x - 12. Find intervals of concavity.",
                "Concave up x>2, concave down x<2", "Concave up x<2, concave down x>2", "Always concave up", "Always concave down",
                "A", 5, 4010, "medium"));

        unit5Questions.add(new Question(
                "Find the local extrema of f(x) = x/(x^2 + 1).",
                "Max at x=1/√3, Min at x=-1/√3", "Max at x=-1/√3, Min at x=1/√3", "Max at x=1, Min at x=-1", "Max at x=-1, Min at x=1",
                "A", 5, 4011, "hard"));

        unit5Questions.add(new Question(
                "Find critical points of f(x) = sin(x) + cos(2x) in [0, 2π].",
                "x = 0, π/2, π, 3π/2", "x = π/6, 5π/6, 7π/6, 11π/6", "x = π/4, 3π/4, 5π/4, 7π/4", "x = π/3, 2π/3, 4π/3, 5π/3",
                "B", 5, 4012, "hard"));

        unit5Questions.add(new Question(
                "If f(x) = x^5 - 5x^4, find where f is increasing.",
                "x < 0 or x > 4", "0 < x < 4", "x < 1 or x > 3", "1 < x < 3",
                "B", 5, 4013, "medium"));

        unit5Questions.add(new Question(
                "Find absolute maximum of f(x) = x^3 - 3x on [-2,2].",
                "2", "0", "-2", "1",
                "A", 5, 4014, "medium"));

        unit5Questions.add(new Question(
                "A particle moves with position s(t) = t^4 - 4t^3. Find acceleration at t=2.",
                "0", "8", "-8", "16",
                "A", 5, 4015, "medium"));

        unit5Questions.add(new Question(
                "Determine intervals where f(x) = ln(x^2 + 1) is concave down.",
                "(-1, 0) ∪ (0, 1)", "(-∞, -1) ∪ (1, ∞)", "(-∞, 0) ∪ (0, ∞)", "(-1, 1)",
                "B", 5, 4016, "medium"));

        unit5Questions.add(new Question(
                "Find local maximum and minimum of f(x) = x - sin(x) on [0, 2π].",
                "Max at 2π, Min at 0", "Max at π/2, Min at 3π/2", "Max at π, Min at 0", "Max at 0, Min at π",
                "A", 5, 4017, "medium"));

        unit5Questions.add(new Question(
                "Find the derivative and determine critical points: f(x) = x^3 - 9x^2 + 12x.",
                "f'(x) = 3x^2 - 18x + 12, crit points: 1, 4", "f'(x) = 3x^2 - 18x + 12, crit points: 2, 3",
                "f'(x) = 3x^2 + 18x - 12, crit points: -1, 4", "f'(x) = 3x^2 - 9x + 12, crit points: 2, 3",
                "A", 5, 4018, "medium"));

        unit5Questions.add(new Question(
                "Find intervals where f(x) = e^x - x^2 is concave up.",
                "x > 1 - √2, x < 1 + √2", "x > 1 + √2, x < 1 - √2", "x < 1 - √2, x > 1 + √2", "All x",
                "D", 5, 4019, "medium"));

        unit5Questions.add(new Question(
                "Determine the critical points of f(x) = x^4 - 8x^2 + 16.",
                "x = -2, 0, 2", "x = -1, 0, 1", "x = 0, 2", "x = -2, 2",
                "A", 5, 4020, "medium"));

        unit5Questions.add(new Question(
                "Find the intervals where f(x) = x^3 - 12x + 1 is concave up.",
                "x > 2", "x < 2", "x > -2", "x < -2",
                "A", 5, 4021, "medium"));

        unit5Questions.add(new Question(
                "Find local extrema of f(x) = x^4 - 4x^3 + 4.",
                "Max at x=0, Min at x=3", "Max at x=1, Min at x=2", "Max at x=2, Min at x=1", "No local extrema",
                "B", 5, 4022, "medium"));

        unit5Questions.add(new Question(
                "A particle has position s(t) = t^3 - 6t^2 + 9t. Find when velocity = 0.",
                "t = 0, 1, 3", "t = 1, 3", "t = 0, 3", "t = 2, 3",
                "B", 5, 4023, "medium"));

        unit5Questions.add(new Question(
                "Find the absolute maximum and minimum of f(x) = x^3 - 3x^2 + 4 on [0,3].",
                "Max: 4 at x=0, Min: -2 at x=2", "Max: 4 at x=3, Min: -2 at x=1", "Max: 5 at x=3, Min: -1 at x=0", "Max: 3 at x=2, Min: 0 at x=1",
                "B", 5, 4024, "hard"));

        unit5Questions.add(new Question(
                "Determine the inflection points of f(x) = x^3 - 6x^2 + 9x.",
                "(0,0) and (2,2)", "(1,4) and (3,0)", "(0,0) and (3,0)", "(1,0) and (2,0)",
                "C", 5, 4025, "medium"));

        unit5Questions.add(new Question(
                "Find the derivative of f(x) = ln(x^2 + 1) and where it is increasing.",
                "f'(x) = 2x/(x^2+1), increasing x>0", "f'(x) = 2x/(x^2+1), increasing x<0", "f'(x) = 1/(x^2+1), increasing x>1", "f'(x) = 1/(x^2+1), increasing x<1",
                "A", 5, 4026, "medium"));

        unit5Questions.add(new Question(
                "Use the first derivative test to find extrema of f(x) = x^3 - 9x^2 + 24x.",
                "Max at x=1, Min at x=3", "Max at x=3, Min at x=1", "Max at x=2, Min at x=4", "Max at x=0, Min at x=2",
                "A", 5, 4027, "medium"));

        unit5Questions.add(new Question(
                "Find the intervals where f(x) = x^4 - 4x^2 is concave down.",
                "(-∞,-1) ∪ (1,∞)", "(-1,1)", "(-∞,0) ∪ (0,∞)", "(0,2)",
                "A", 5, 4028, "medium"));

        unit5Questions.add(new Question(
                "A curve has equation y = x^3 - 3x^2 + 2x. Determine x-values of inflection points.",
                "x = 0, 1", "x = 1, 2", "x = -1, 2", "x = 0, 2",
                "A", 5, 4029, "medium"));

        unit5Questions.add(new Question(
                "A function f(x) has f''(x) = 12x^2 - 24x + 8. Find intervals of concavity.",
                "Concave up for x<1 or x>2/3", "Concave up for 1<x<2", "Concave up for x<2 or x>4", "Concave up for x>0",
                "A", 5, 4030, "medium"));

        unit5Questions.add(new Question(
                "Find local extrema of f(x) = x/(x^2 + 4).",
                "Max at x=2, Min at x=-2", "Max at x=-2, Min at x=2", "Max at x=1, Min at x=-1", "Max at x=-1, Min at x=1",
                "A", 5, 4031, "hard"));

        unit5Questions.add(new Question(
                "Find critical points of f(x) = e^x - 2x^2.",
                "x = 0, ln(4)/2", "x = 1, 2", "x = -1, 1", "x = 2, ln(2)",
                "A", 5, 4032, "medium"));

        unit5Questions.add(new Question(
                "If f(x) = x^5 - 5x^4 + 4, find where f is increasing.",
                "x < 0 or x > 4", "0 < x < 4", "x < 1 or x > 3", "1 < x < 3",
                "B", 5, 4033, "medium"));

        unit5Questions.add(new Question(
                "Find absolute maximum of f(x) = x^3 - 3x on [-2,2].",
                "2", "0", "-2", "1",
                "A", 5, 4034, "medium"));

        unit5Questions.add(new Question(
                "A particle moves with s(t) = t^4 - 4t^3. Find acceleration at t=1.",
                "0", "4", "-4", "8",
                "D", 5, 4035, "medium"));

        unit5Questions.add(new Question(
                "Determine intervals where f(x) = ln(x+1) - x is concave down.",
                "(-1,0)", "(0,∞)", "(-∞,-1)", "(-1,1)",
                "B", 5, 4036, "medium"));

        unit5Questions.add(new Question(
                "Find local maximum and minimum of f(x) = cos(x) - x^2 on [0,π].",
                "Max at 0, Min at π", "Max at π, Min at 0", "Max at π/2, Min at π", "Max at 0, Min at π/2",
                "A", 5, 4037, "medium"));

        unit5Questions.add(new Question(
                "Find the derivative and critical points: f(x) = x^3 - 6x^2 + 9x + 1.",
                "f'(x) = 3x^2 - 12x + 9, crit points: 1, 3", "f'(x) = 3x^2 - 12x + 9, crit points: 0, 3",
                "f'(x) = 3x^2 - 6x + 9, crit points: 1, 2", "f'(x) = 3x^2 - 9x + 9, crit points: 1, 3",
                "A", 5, 4038, "medium"));

        unit5Questions.add(new Question(
                "Find intervals where f(x) = e^x - x^3 is concave up.",
                "x > 1", "x < 1", "x > 0", "x < 0",
                "C", 5, 4039, "medium"));

        unit5Questions.add(new Question(
                "Find the critical points of f(x) = sin(x) - x/2 on [0, 2π].",
                "x = π/3, 5π/3", "x = 0, π, 2π", "x = π/2, 3π/2", "x = π/4, 3π/4",
                "A", 5, 4040, "medium"));

        unit5Questions.add(new Question(
                "Determine intervals where f(x) = cos(x) + sin(2x) is increasing.",
                "x ∈ (0, π/3) ∪ (2π/3, π)", "x ∈ (π/4, 3π/4)", "x ∈ (0, π/2) ∪ (π, 3π/2)", "x ∈ (π/3, 2π/3)",
                "D", 5, 4041, "medium"));

        unit5Questions.add(new Question(
                "Find local extrema of f(x) = tan(x) - x on [-π/4, π/4].",
                "Max at -π/4, Min at π/4", "Max at 0, Min at π/4", "Max at π/4, Min at -π/4", "Max at 0, Min at -π/4",
                "B", 5, 4042, "medium"));

        unit5Questions.add(new Question(
                "A particle moves along a parametric curve x = t^2, y = t^3 - 3t. Find t where dy/dx = 0.",
                "t = -1, 1", "t = 0, 2", "t = -2, 2", "t = 1, 2",
                "A", 5, 4043, "medium"));

        unit5Questions.add(new Question(
                "Determine intervals of concavity for y = ln(cos(x)) on (-π/2, π/2).",
                "Concave up for x ∈ (-π/4, π/4)", "Concave down for x ∈ (-π/4, π/4)", "Concave up for x ∈ (-π/2, -π/4) ∪ (π/4, π/2)", "Concave down for x ∈ (-π/2, -π/4) ∪ (π/4, π/2)",
                "A", 5, 4044, "hard"));

        unit5Questions.add(new Question(
                "Find the local maximum of f(x) = x - sin(x) on [0, 2π].",
                "x = 2π", "x = 0", "x = π", "x = π/2",
                "A", 5, 4045, "medium"));

        unit5Questions.add(new Question(
                "Find the absolute minimum of f(x) = cos(x) + x^2 on [0, π].",
                "x = π", "x = 0", "x = π/2", "x = π/4",
                "C", 5, 4046, "medium"));

        unit5Questions.add(new Question(
                "For f(x) = arctan(x) - x, find the critical points.",
                "x = 0", "x = 1", "x = -1", "x = 2",
                "A", 5, 4047, "medium"));

        unit5Questions.add(new Question(
                "A particle moves with x(t) = t - sin(t), y(t) = 1 - cos(t). Find dy/dx at t = π.",
                "0", "1", "-1", "Undefined",
                "A", 5, 4048, "medium"));

        unit5Questions.add(new Question(
                "Determine concavity for f(x) = x ln(x) on (0, ∞).",
                "Concave up for x > e", "Concave down for x > e", "Concave up for x < e", "Concave down for x < e",
                "A", 5, 4049, "medium"));

        unit5Questions.add(new Question(
                "Find intervals where f(x) = sin(x) + cos(x) is increasing.",
                "x ∈ (-π/4 + 2nπ, 3π/4 + 2nπ)", "x ∈ (0, π/2)", "x ∈ (π/2, π)", "x ∈ (-π/2, π/2)",
                "A", 5, 4050, "medium"));

        unit5Questions.add(new Question(
                "Determine the local extrema of f(x) = x^2 sin(x) on [0, 2π].",
                "Max at π, Min at 0", "Max at 0, Min at 3π/2", "Max at 2π, Min at π", "Max at π/2, Min at 3π/2",
                "D", 5, 4051, "hard"));

        unit5Questions.add(new Question(
                "A curve is defined parametrically as x = t^3, y = t^2. Find d^2y/dx^2 at t=1.",
                "2/9", "1/3", "3/2", "1/2",
                "A", 5, 4052, "hard"));

        unit5Questions.add(new Question(
                "Find critical points of f(x) = ln(x^2 + 1) - x.",
                "x = 0", "x = 1", "x = -1", "x = 2",
                "A", 5, 4053, "medium"));

        unit5Questions.add(new Question(
                "Find intervals where f(x) = e^x sin(x) is concave down.",
                "x ∈ (π, 2π)", "x ∈ (-π/2, π/2)", "x ∈ (0, π)", "x ∈ (-∞, 0)",
                "B", 5, 4054, "hard"));

        unit5Questions.add(new Question(
                "For f(x) = x / (x^2 + 1), determine local maxima and minima.",
                "Max at x = 1, Min at x = -1", "Max at x = -1, Min at x = 1", "Max at x = 0, Min at x = 1", "Max at x = 1/2, Min at x = -1/2",
                "A", 5, 4055, "medium"));

        unit5Questions.add(new Question(
                "Find local extrema of f(x) = x^2 - 2x cos(x) on [0, 2π].",
                "Max at 2π, Min at 0", "Max at π, Min at 0", "Max at 0, Min at π", "Max at π/2, Min at 3π/2",
                "B", 5, 4056, "hard"));

        unit5Questions.add(new Question(
                "A particle moves with x(t) = t^2, y(t) = t^3. Find when the tangent is horizontal.",
                "t = 0", "t = 1", "t = -1", "t = 2",
                "A", 5, 4057, "medium"));

        unit5Questions.add(new Question(
                "Determine concavity of f(x) = x^3 - 3x^2 + 2x on (-∞, ∞).",
                "Concave up for x>1, concave down for x<1", "Concave up for x<1, concave down for x>1", "Always concave up", "Always concave down",
                "A", 5, 4058, "medium"));

        unit5Questions.add(new Question(
                "Find local maxima of f(x) = cos(x) - x^2 on [-π/2, π/2].",
                "x = 0", "x = π/2", "x = -π/2", "x = π/4",
                "A", 5, 4059, "medium"));

        unit5Questions.add(new Question(
                "A rectangle is inscribed under y = 12 - x^2. Find x that maximizes area.",
                "x = 2", "x = 0", "x = 3", "x = √6",
                "D", 5, 4060, "hard"));

        unit5Questions.add(new Question(
                "A cone has height 10 and radius 5. Find the height when volume is maximized if radius varies with height.",
                "h = 5", "h = 10", "h = 3", "h = 7",
                "A", 5, 4061, "hard"));

        unit5Questions.add(new Question(
                "A particle moves along y = x^2. Find x for maximum slope of tangent line.",
                "x = 1/2", "x = 1", "x = 0", "x = 2",
                "B", 5, 4062, "medium"));

        unit5Questions.add(new Question(
                "A ladder 10 ft long leans against a wall. Bottom moves away at 1 ft/s. Find rate top slides down when bottom is 6 ft from wall.",
                "0.8 ft/s", "1 ft/s", "0.6 ft/s", "1.2 ft/s",
                "A", 5, 4063, "hard"));

        unit5Questions.add(new Question(
                "Maximize volume of a box with square base if surface area is 600 cm².",
                "10 cm", "12 cm", "15 cm", "20 cm",
                "B", 5, 4064, "hard"));

        unit5Questions.add(new Question(
                "Find the point on y = x^2 closest to (0,3).",
                "(1,1)", "(1,2)", "(0,0)", "(1,1.5)",
                "A", 5, 4065, "medium"));

        unit5Questions.add(new Question(
                "A particle moves along x = t^2, y = t^3. Find t where speed is minimum.",
                "t = 0", "t = 1", "t = -1", "t = 2",
                "A", 5, 4066, "medium"));

        unit5Questions.add(new Question(
                "Maximize profit P(x) = 100x - x^2. Find x for maximum profit.",
                "x = 50", "x = 100", "x = 25", "x = 75",
                "A", 5, 4067, "medium"));

        unit5Questions.add(new Question(
                "A farmer has 200 m of fencing. Maximize area of rectangular pen.",
                "50 m by 50 m", "40 m by 60 m", "30 m by 70 m", "100 m by 0 m",
                "A", 5, 4068, "medium"));

        unit5Questions.add(new Question(
                "A particle moves along s(t) = t^3 - 6t^2 + 9t. Find acceleration at velocity maximum.",
                "0", "6", "12", "-6",
                "A", 5, 4069, "hard"));

        unit5Questions.add(new Question(
                "A cylinder is inscribed in a sphere of radius r. Find cylinder height to maximize volume.",
                "h = r√2", "h = r", "h = r/√2", "h = 2r",
                "C", 5, 4070, "hard"));

        unit5Questions.add(new Question(
                "A cone-shaped cup has radius 3 cm, height 6 cm. Water drains at 2 cm³/s. Find rate water level drops when h = 3 cm.",
                "-8/3 cm/s", "-1 cm/s", "-2/3 cm/s", "-4/3 cm/s",
                "A", 5, 4071, "hard"));

        unit5Questions.add(new Question(
                "Maximize the area of a triangle with base on x-axis and vertex on y = 8 - x^2.",
                "b = 4", "b = 2", "b = √8", "b = 0",
                "C", 5, 4072, "medium"));

        unit5Questions.add(new Question(
                "A boat is pulled toward a dock by a rope at 3 ft/s. Find rate boat approaches dock when 4 ft away, rope 5 ft long.",
                "2.4 ft/s", "3 ft/s", "1.8 ft/s", "2 ft/s",
                "A", 5, 4073, "hard"));

        unit5Questions.add(new Question(
                "Find maximum area of rectangle inscribed in circle radius 5.",
                "25", "20", "50", "10",
                "A", 5, 4074, "medium"));

        unit5Questions.add(new Question(
                "Maximize volume of a box with square base and open top, surface area 48.",
                "V = 32", "V = 27", "V = 36", "V = 24",
                "B", 5, 4075, "hard"));

        unit5Questions.add(new Question(
                "Find point on parabola y = x^2 closest to line y = 4.",
                "(0,0)", "(1,1)", "(2,4)", "(0,4)",
                "D", 5, 4076, "medium"));

        unit5Questions.add(new Question(
                "A man walks away from a streetlight 15 ft high at 4 ft/s. Find rate tip of shadow moves when 20 ft from pole.",
                "5 ft/s", "4 ft/s", "3 ft/s", "6 ft/s",
                "A", 5, 4077, "hard"));

        unit5Questions.add(new Question(
                "Maximize area of rectangle inscribed under y = 9 - x^2.",
                "9", "12", "16", "18",
                "B", 5, 4078, "medium"));

        unit5Questions.add(new Question(
                "A balloon rises at 5 m/s. Observer 50 m away. Find rate distance from observer increases when balloon 20 m high.",
                "√29 m/s", "√50 m/s", "5 m/s", "25 m/s",
                "A", 5, 4079, "hard"));

        unit5Questions.add(new Question(
                "A curve is defined parametrically by x = t^2 + 1, y = t^3 - t. Find dy/dx at t = 1.",
                "0", "1", "2", "-1",
                "B", 5, 4080, "medium"));

        unit5Questions.add(new Question(
                "A particle moves along x = cos(t), y = sin(2t). Find t where tangent is horizontal.",
                "t = 0, π/2", "t = π/4, 3π/4", "t = π/6, 5π/6", "t = π/3, 2π/3",
                "B", 5, 4081, "medium"));

        unit5Questions.add(new Question(
                "Find d^2y/dx^2 for x = t - sin(t), y = 1 - cos(t) at t = π/2.",
                "0", "1", "-1", "2",
                "A", 5, 4082, "hard"));

        unit5Questions.add(new Question(
                "A polar curve is r = 2 + 2cos(θ). Find slope dy/dx at θ = π/3.",
                "0", "√3", "-√3", "1",
                "C", 5, 4083, "hard"));

        unit5Questions.add(new Question(
                "A curve is defined by implicit equation x^2 + xy + y^2 = 7. Find dy/dx.",
                "(-2x - y)/(2y + x)", "(x + 2y)/(2x + y)", "(2x - y)/(x - 2y)", "(y - x)/(x + y)",
                "A", 5, 4084, "medium"));

        unit5Questions.add(new Question(
                "A particle moves along y = ln(x^2 + 1). Find acceleration when x = 1 if dx/dt = 2.",
                "4/5", "2/5", "1/2", "1",
                "C", 5, 4085, "hard"));

        unit5Questions.add(new Question(
                "Find local extrema of f(x, y) implicitly defined by x^2 + y^2 = 10y.",
                "Min at (0,0), Max at (0,10)", "Min at (0,10), Max at (0,0)", "Min at (5,5), Max at (-5,5)", "Min at (0,5), Max at (0,10)",
                "A", 5, 4086, "hard"));

        unit5Questions.add(new Question(
                "For parametric curve x = t^2, y = t^3 - 3t, find t where tangent vertical.",
                "t = ±1", "t = 0", "t = ±√3", "t = 2",
                "A", 5, 4087, "medium"));

        unit5Questions.add(new Question(
                "A particle moves with s(t) = t^3 - 3t^2 + 2t. Find acceleration when velocity = 0.",
                "2", "0", "3", "-2",
                "A", 5, 4088, "medium"));

        unit5Questions.add(new Question(
                "Find dy/dx for x^2y + y^3 = 7 at x = 1, y = 2.",
                "-10/13", "7/5", "1", "2",
                "A", 5, 4089, "hard"));

        unit5Questions.add(new Question(
                "Find intervals of concavity for polar curve r = θ^2.",
                "Concave up θ>0", "Concave down θ>0", "Concave up θ<0", "Concave down θ<0",
                "A", 5, 4090, "medium"));

        unit5Questions.add(new Question(
                "A particle moves along x = e^t, y = e^-t. Find dy/dx at t = 0.",
                "-1", "0", "1", "2",
                "A", 5, 4091, "medium"));

        unit5Questions.add(new Question(
                "Find local maximum of f(x, y) defined by x^2 + xy + y^2 = 12.",
                "(2,2)", "(0,0)", "(3,3)", "(1,2)",
                "A", 5, 4092, "hard"));

        unit5Questions.add(new Question(
                "A particle moves along r = 3 + 2sin(θ). Find dy/dx at θ = π/6.",
                "1/2", "√3/2", "√3", "1",
                "B", 5, 4093, "hard"));

        unit5Questions.add(new Question(
                "Implicit curve x^3 + y^3 - 3xy = 0. Find slope at (1,2).",
                "-5/7", "5/7", "1", "-1",
                "A", 5, 4094, "hard"));

        unit5Questions.add(new Question(
                "Find maximum distance from origin for parametric curve x = t - sin(t), y = 1 - cos(t).",
                "2", "√2", "1", "π",
                "B", 5, 4095, "hard"));

        unit5Questions.add(new Question(
                "A particle moves along x = t^2 - t, y = t^3 - t. Find t when speed is minimum.",
                "t = 0", "t = 1/2", "t = 1", "t = -1",
                "B", 5, 4096, "hard"));

        unit5Questions.add(new Question(
                "A balloon rises at 4 m/s. Observer 30 m away. Find rate distance from observer increases when balloon 10 m high.",
                "2 m/s", "3 m/s", "√26 m/s", "5 m/s",
                "C", 5, 4097, "hard"));

        unit5Questions.add(new Question(
                "For polar curve r = 1 + cos(θ), find maximum slope dy/dx.",
                "0", "1", "2", "Undefined",
                "D", 5, 4098, "hard"));

        unit5Questions.add(new Question(
                "Find dy/dx for x^2 + y^2 = 25 at point (3,4).",
                "-3/4", "4/3", "-4/3", "3/4",
                "A", 5, 4099, "medium"));


        numUnit5Questions = unit5Questions.size();
        System.out.printf("There are %d questions in unit 5%n", numUnit5Questions);

    }

}
