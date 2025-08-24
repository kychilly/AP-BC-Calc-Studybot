package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit9Questions;

public class Unit9 {

    public static int numUnit9Questions;

    public static void initializeUnit9Questions() {

        unit9Questions.add(new Question(
                "Find dy/dx for the parametric equations x = t^2, y = t^3.",
                "dy/dx = 3t/2", "dy/dx = 2t/3", "dy/dx = t^2", "dy/dx = 3t^2",
                "A", 9, 8000, "medium"));

        unit9Questions.add(new Question(
                "Find the second derivative d^2y/dx^2 if x = t^2, y = t^3.",
                "d^2y/dx^2 = 3/2t", "d^2y/dx^2 = 3/4t", "d^2y/dx^2 = 3t", "d^2y/dx^2 = 2/3t",
                "B", 9, 8001, "hard"));

        unit9Questions.add(new Question(
                "Eliminate the parameter t: x = cos(t), y = sin(t).",
                "x^2 + y^2 = 1", "x^2 - y^2 = 1", "y = x", "y = sin(x)",
                "A", 9, 8002, "medium"));

        unit9Questions.add(new Question(
                "Find the slope of the tangent line to x = t^2, y = t^2 - 1 at t = 1.",
                "dy/dx = 1", "dy/dx = 0", "dy/dx = 2", "dy/dx = -1",
                "A", 9, 8003, "medium"));

        unit9Questions.add(new Question(
                "Given r = 2 + 3 cos(θ), find dr/dθ.",
                "dr/dθ = -3 sin(θ)", "dr/dθ = 3 cos(θ)", "dr/dθ = 3 sin(θ)", "dr/dθ = -3 cos(θ)",
                "A", 9, 8004, "medium"));

        unit9Questions.add(new Question(
                "Find the area enclosed by r = 2 sin(θ) for θ in [0, π].",
                "A = 2π", "A = π", "A = 4", "A = 2",
                "B", 9, 8005, "hard"));

        unit9Questions.add(new Question(
                "Convert the polar equation r = 4 cos(θ) to Cartesian form.",
                "x^2 + y^2 = 4x", "x^2 + y^2 = 4y", "x^2 + y^2 = 16", "y^2 = 4x",
                "A", 9, 8006, "medium"));

        unit9Questions.add(new Question(
                "Find the velocity vector for r(t) = <t, t^2, t^3>.",
                "v(t) = <1, 2t, 3t^2>", "v(t) = <t, t, t>", "v(t) = <t^2, 2t, 3t^3>", "v(t) = <0, 1, 2t>",
                "A", 9, 8007, "medium"));

        unit9Questions.add(new Question(
                "Find the speed of the particle r(t) = <t, t^2> at t = 1.",
                "√5", "√2", "2", "√3",
                "A", 9, 8008, "medium"));

        unit9Questions.add(new Question(
                "Determine the Cartesian form of r = 3 sec(θ).",
                "x = 3", "y = 3", "x^2 + y^2 = 3", "y = x",
                "A", 9, 8009, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for parametric equations x = e^t, y = e^(2t).",
                "dy/dx = 2 e^t", "dy/dx = 2 e^(2t)", "dy/dx = e^t", "dy/dx = e^(2t)",
                "A", 9, 8010, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent line to r(t) = <t, t^2> at t = 2.",
                "y - 4 = 4(x - 2)", "y - 4 = 2(x - 2)", "y - 2 = 4(x - 2)", "y - 2 = 2(x - 2)",
                "A", 9, 8011, "medium"));

        unit9Questions.add(new Question(
                "Compute the arc length of x = t, y = t^2 from t = 0 to t = 1.",
                "∫0^1 √(1 + 4t^2) dt", "∫0^1 √(1 + t^2) dt", "∫0^1 √(1 + 2t) dt", "∫0^1 √(1 + t) dt",
                "A", 9, 8012, "hard"));

        unit9Questions.add(new Question(
                "Find the area of the polar curve r = 1 + cos(θ) for θ in [0, π].",
                "A = 3π/2", "A = π", "A = 2", "A = 1",
                "A", 9, 8013, "hard"));

        unit9Questions.add(new Question(
                "Determine r when θ = π/4 for r = 4 sin(2θ).",
                "r = 4", "r = 2", "r = √2", "r = 0",
                "B", 9, 8014, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent vector to r(t) = <cos(t), sin(t), t> at t = π/2.",
                "v = <0, 1, 1>", "v = <-1, 0, 1>", "v = <1, 0, 1>", "v = <0, -1, 1>",
                "B", 9, 8015, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = ln(t), y = t^2.",
                "dy/dx = 2t^2", "dy/dx = 2t ln(t)", "dy/dx = 2t/ t", "dy/dx = 2t e^t",
                "C", 9, 8016, "medium"));

        unit9Questions.add(new Question(
                "Convert polar equation r^2 = 4 cos(2θ) to Cartesian coordinates.",
                "x^2 - y^2 = 2", "x^2 + y^2 = 2", "x^2 - y^2 = 4", "x^2 + y^2 = 4",
                "C", 9, 8017, "hard"));

        unit9Questions.add(new Question(
                "Find the speed of r(t) = <t, t^2, t^3> at t = 1.",
                "√14", "√6", "√10", "√12",
                "A", 9, 8018, "medium"));

        unit9Questions.add(new Question(
                "Find the area of one petal of r = sin(3θ).",
                "1/4", "1/2", "1/3", "3/4",
                "B", 9, 8019, "hard"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = t^3 - t, y = t^2 + 1.",
                "dy/dx = 2t / (3t^2 - 1)", "dy/dx = (3t^2 - 1)/2t", "dy/dx = t / (3t^2 - 1)", "dy/dx = 2t / t^3",
                "A", 9, 8020, "medium"));

        unit9Questions.add(new Question(
                "Compute d^2y/dx^2 for x = t^2, y = t^4.",
                "d^2y/dx^2 = 6t", "d^2y/dx^2 = 12t^2", "d^2y/dx^2 = 8t", "d^2y/dx^2 = 4t",
                "B", 9, 8021, "hard"));

        unit9Questions.add(new Question(
                "Eliminate the parameter: x = 2 cos(t), y = 2 sin(t).",
                "x^2 + y^2 = 4", "x^2 - y^2 = 4", "y = x", "y = 2 sin(x)",
                "A", 9, 8022, "medium"));

        unit9Questions.add(new Question(
                "Find the slope of the tangent to x = t^2 + 1, y = t^3 - t at t = 1.",
                "dy/dx = 0", "dy/dx = 1", "dy/dx = 2", "dy/dx = -1",
                "B", 9, 8023, "medium"));

        unit9Questions.add(new Question(
                "Given r = 5 - 2 cos(θ), compute dr/dθ.",
                "dr/dθ = 2 sin(θ)", "dr/dθ = -2 sin(θ)", "dr/dθ = 2 cos(θ)", "dr/dθ = -2 cos(θ)",
                "B", 9, 8024, "medium"));

        unit9Questions.add(new Question(
                "Find the area enclosed by r = 3(1 + cos(θ)) for θ in [0, π].",
                "A = 6π", "A = 9π", "A = 3π", "A = 12π",
                "B", 9, 8025, "hard"));

        unit9Questions.add(new Question(
                "Convert polar equation r = 2 sin(θ) to Cartesian coordinates.",
                "x^2 + y^2 = 2y", "x^2 + y^2 = 2x", "x^2 - y^2 = 2y", "x^2 - y^2 = 2x",
                "A", 9, 8026, "medium"));

        unit9Questions.add(new Question(
                "Find the velocity vector for r(t) = <sin(t), cos(t), t>.",
                "v(t) = <cos(t), -sin(t), 1>", "v(t) = <-cos(t), sin(t), 1>", "v(t) = <sin(t), cos(t), 1>", "v(t) = <cos(t), sin(t), 1>",
                "A", 9, 8027, "medium"));

        unit9Questions.add(new Question(
                "Compute the speed of the particle r(t) = <t, t^2, t^3> at t = 2.",
                "√(1 + 4 + 36)", "√(4 + 16 + 64)", "√(4 + 4 + 16)", "√(1 + 2 + 8)",
                "B", 9, 8028, "medium"));

        unit9Questions.add(new Question(
                "Convert r = 6 sec(θ) to Cartesian coordinates.",
                "x = 6", "y = 6", "x^2 + y^2 = 36", "y = x",
                "A", 9, 8029, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = e^t, y = e^(3t).",
                "dy/dx = 3 e^(2t)", "dy/dx = 3 e^(3t)/e^t", "dy/dx = 3 e^t", "dy/dx = e^(3t)",
                "C", 9, 8030, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent line to r(t) = <t^2, t^3> at t = 1.",
                "y - 1 = (3/2)(x - 1)", "y - 1 = 2(x - 1)", "y - 1 = 1.5(x - 1)", "y - 1 = 3(x - 1)",
                "A", 9, 8031, "medium"));

        unit9Questions.add(new Question(
                "Compute arc length of x = cos(t), y = sin(t) for t in [0, π/2].",
                "∫0^(π/2) √(sin^2(t) + cos^2(t)) dt", "∫0^(π/2) √(1 + t^2) dt", "∫0^(π/2) √(cos^2(t) - sin^2(t)) dt", "∫0^(π/2) √(cos^2(t) + sin^2(t)) dt",
                "D", 9, 8032, "hard"));

        unit9Questions.add(new Question(
                "Find the area of the polar curve r = 2(1 - cos(θ)) for θ in [0, π].",
                "A = 2π", "A = 4π", "A = π", "A = 3π",
                "B", 9, 8033, "hard"));

        unit9Questions.add(new Question(
                "Determine r when θ = π/6 for r = 5 sin(2θ).",
                "r = √3", "r = 5/2", "r = 5", "r = 1",
                "B", 9, 8034, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent vector to r(t) = <t^2, t^3, t> at t = 1.",
                "v = <2, 3, 1>", "v = <2, 1, 3>", "v = <1, 2, 3>", "v = <3, 2, 1>",
                "A", 9, 8035, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = ln(t), y = t^3.",
                "dy/dx = 3t^2 / (1/t)", "dy/dx = 3t^2 ln(t)", "dy/dx = 3 ln(t)", "dy/dx = 3t",
                "A", 9, 8036, "medium"));

        unit9Questions.add(new Question(
                "Convert polar equation r^2 = 9 cos(2θ) to Cartesian coordinates.",
                "x^2 - y^2 = 9/2", "x^2 + y^2 = 9/2", "x^2 - y^2 = 9", "x^2 + y^2 = 9",
                "C", 9, 8037, "hard"));

        unit9Questions.add(new Question(
                "Find the speed of r(t) = <t^2, t^3, t> at t = 1.",
                "√(4 + 9 + 1)", "√(2 + 3 + 1)", "√(1 + 1 + 1)", "√(4 + 6 + 1)",
                "A", 9, 8038, "medium"));

        unit9Questions.add(new Question(
                "Find the area of one petal of r = cos(3θ).",
                "1/4", "1/2", "3/4", "1/3",
                "B", 9, 8039, "hard"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = t^3 + t, y = t^2 - 1.",
                "dy/dx = 2t / (3t^2 + 1)", "dy/dx = (3t^2 + 1)/2t", "dy/dx = t / (3t^2 + 1)", "dy/dx = 2t / t^3",
                "A", 9, 8040, "medium"));

        unit9Questions.add(new Question(
                "Compute d^2y/dx^2 for x = t^3, y = t^4.",
                "d^2y/dx^2 = 4t", "d^2y/dx^2 = 12t^2", "d^2y/dx^2 = 16t^2", "d^2y/dx^2 = 8t",
                "B", 9, 8041, "hard"));

        unit9Questions.add(new Question(
                "Eliminate the parameter: x = 1 + cos(t), y = 1 + sin(t).",
                "x^2 + y^2 = 2", "x^2 + y^2 - 2x - 2y + 1 = 0", "x^2 - y^2 = 1", "y = x",
                "B", 9, 8042, "medium"));

        unit9Questions.add(new Question(
                "Find the slope of the tangent to x = t^2 - 1, y = t^3 - t at t = 2.",
                "dy/dx = 2", "dy/dx = 3", "dy/dx = 5/4", "dy/dx = 7/4",
                "D", 9, 8043, "medium"));

        unit9Questions.add(new Question(
                "Given r = 3 + 2 sin(θ), compute dr/dθ.",
                "dr/dθ = 2 cos(θ)", "dr/dθ = -2 cos(θ)", "dr/dθ = 2 sin(θ)", "dr/dθ = -2 sin(θ)",
                "A", 9, 8044, "medium"));

        unit9Questions.add(new Question(
                "Find the area enclosed by r = 1 + 2 cos(θ) for θ in [0, π].",
                "A = 3π/2", "A = 2π", "A = π", "A = 5π/2",
                "B", 9, 8045, "hard"));

        unit9Questions.add(new Question(
                "Convert polar equation r = 5 sin(θ) to Cartesian coordinates.",
                "x^2 + y^2 = 5y", "x^2 + y^2 = 5x", "x^2 - y^2 = 5y", "x^2 - y^2 = 5x",
                "A", 9, 8046, "medium"));

        unit9Questions.add(new Question(
                "Find the velocity vector for r(t) = <t, t^2, sin(t)>.",
                "v(t) = <1, 2t, cos(t)>", "v(t) = <t, 2t, cos(t)>", "v(t) = <1, t, cos(t)>", "v(t) = <0, 2t, cos(t)>",
                "A", 9, 8047, "medium"));

        unit9Questions.add(new Question(
                "Compute the speed of the particle r(t) = <t^2, t^3, t^4> at t = 1.",
                "√(4 + 9 + 16)", "√(2 + 3 + 4)", "√(1 + 1 + 1)", "√(4 + 6 + 8)",
                "A", 9, 8048, "medium"));

        unit9Questions.add(new Question(
                "Convert r = 8 csc(θ) to Cartesian coordinates.",
                "y = 8", "x = 8", "x^2 + y^2 = 64", "y^2 = 8",
                "A", 9, 8049, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = cos(t), y = sin(2t).",
                "dy/dx = 2 cos(2t)/-sin(t)", "dy/dx = 2 cos(2t)/-cos(t)", "dy/dx = 2 cos(t)/-sin(t)", "dy/dx = cos(t)/-sin(2t)",
                "B", 9, 8050, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent line to r(t) = <t, t^3> at t = 1.",
                "y - 1 = 3(x - 1)", "y - 1 = (1/3)(x - 1)", "y - 1 = 2(x - 1)", "y - 1 = 1.5(x - 1)",
                "A", 9, 8051, "medium"));

        unit9Questions.add(new Question(
                "Compute the arc length of x = t, y = t^2 for t in [0, 2].",
                "∫0^2 √(1 + 4t^2) dt", "∫0^2 √(1 + 2t) dt", "∫0^2 √(1 + t^2) dt", "∫0^2 √(1 + t) dt",
                "A", 9, 8052, "hard"));

        unit9Questions.add(new Question(
                "Find the area of the polar curve r = 2(1 + sin(θ)) for θ in [0, π].",
                "A = 2π", "A = 4π", "A = π", "A = 3π",
                "B", 9, 8053, "hard"));

        unit9Questions.add(new Question(
                "Determine r when θ = π/3 for r = 4 cos(2θ).",
                "r = 2", "r = 1", "r = 4", "r = 0",
                "D", 9, 8054, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent vector to r(t) = <t, t^2, t^3> at t = 2.",
                "v = <1, 4, 8>", "v = <2, 4, 12>", "v = <2, 4, 8>", "v = <2, 2, 8>",
                "B", 9, 8055, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = t^2, y = e^t.",
                "dy/dx = e^t / (2t)", "dy/dx = 2t / e^t", "dy/dx = e^t / t", "dy/dx = t / e^t",
                "A", 9, 8056, "medium"));

        unit9Questions.add(new Question(
                "Convert polar equation r^2 = 16 sin(2θ) to Cartesian coordinates.",
                "2xy = 16", "x^2 + y^2 = 16", "x^2 - y^2 = 16", "x^2 + y^2 = 8",
                "A", 9, 8057, "hard"));

        unit9Questions.add(new Question(
                "Find the speed of r(t) = <t, t^2, ln(t)> at t = 1.",
                "√(1 + 4 + 1)", "√(1 + 2 + 1)", "√(1 + 1 + 1)", "√(2 + 4 + 1)",
                "A", 9, 8058, "medium"));

        unit9Questions.add(new Question(
                "Find the area of one petal of r = cos(4θ).",
                "1/4", "1/2", "1/8", "1/16",
                "C", 9, 8059, "hard"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = t^3 - 3t, y = t^2 + 1.",
                "dy/dx = 2t / (3t^2 - 3)", "dy/dx = (3t^2 - 3)/2t", "dy/dx = t / (3t^2 - 3)", "dy/dx = 2t / t^3",
                "A", 9, 8060, "medium"));

        unit9Questions.add(new Question(
                "Compute d^2y/dx^2 for x = t^2 + 1, y = t^3 - t.",
                "d^2y/dx^2 = 3/(2t)", "d^2y/dx^2 = 2/(3t)", "d^2y/dx^2 = 3/(t^2)", "d^2y/dx^2 = 1/(2t)",
                "A", 9, 8061, "hard"));

        unit9Questions.add(new Question(
                "Eliminate the parameter: x = 1 + t^2, y = 2t.",
                "y^2 = 2(x-1)", "y^2 = 4(x-1)", "x^2 + y^2 = 1", "x^2 - y^2 = 1",
                "B", 9, 8062, "medium"));

        unit9Questions.add(new Question(
                "Find the slope of the tangent to x = t^2 + t, y = t^3 at t = 1.",
                "dy/dx = 3/3", "dy/dx = 3/2", "dy/dx = 3", "dy/dx = 2",
                "B", 9, 8063, "medium"));

        unit9Questions.add(new Question(
                "Given r = 2 + 3 sin(θ), compute dr/dθ.",
                "dr/dθ = 3 cos(θ)", "dr/dθ = -3 cos(θ)", "dr/dθ = 3 sin(θ)", "dr/dθ = -3 sin(θ)",
                "A", 9, 8064, "medium"));

        unit9Questions.add(new Question(
                "Find the area enclosed by r = 2(1 + cos(θ)) for θ in [0, π].",
                "A = 4π", "A = 2π", "A = 3π", "A = π",
                "A", 9, 8065, "hard"));

        unit9Questions.add(new Question(
                "Convert polar equation r = 3 cos(θ) to Cartesian coordinates.",
                "x^2 + y^2 = 3x", "x^2 + y^2 = 3y", "x^2 - y^2 = 3x", "x^2 - y^2 = 3y",
                "A", 9, 8066, "medium"));

        unit9Questions.add(new Question(
                "Find the velocity vector for r(t) = <t, t^2, e^t>.",
                "v(t) = <1, 2t, e^t>", "v(t) = <t, 2t, e^t>", "v(t) = <1, t, e^t>", "v(t) = <0, 2t, e^t>",
                "A", 9, 8067, "medium"));

        unit9Questions.add(new Question(
                "Compute the speed of the particle r(t) = <t, t^2, t^2> at t = 2.",
                "√(4 + 16 + 16)", "√(4 + 4 + 4)", "√(2 + 4 + 4)", "√(1 + 4 + 4)",
                "A", 9, 8068, "medium"));

        unit9Questions.add(new Question(
                "Convert r = 5 sec(θ) to Cartesian coordinates.",
                "x = 5", "y = 5", "x^2 + y^2 = 25", "y^2 = 5",
                "A", 9, 8069, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = sin(t), y = cos(2t).",
                "dy/dx = -2 sin(2t)/cos(t)", "dy/dx = -2 sin(2t)/-cos(t)", "dy/dx = 2 sin(2t)/cos(t)", "dy/dx = 2 sin(2t)/-sin(t)",
                "A", 9, 8070, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent line to r(t) = <t^2, t^3> at t = 2.",
                "y - 8 = 6(x - 4)", "y - 8 = 4(x - 4)", "y - 8 = 3(x - 4)", "y - 8 = 2(x - 4)",
                "A", 9, 8071, "medium"));

        unit9Questions.add(new Question(
                "Compute the arc length of x = t^2, y = t^3 for t in [0, 1].",
                "∫0^1 √(4t^2 + 9t^4) dt", "∫0^1 √(2t + 3t^2) dt", "∫0^1 √(4t^2 + 3t^2) dt", "∫0^1 √(t^2 + t^3) dt",
                "A", 9, 8072, "hard"));

        unit9Questions.add(new Question(
                "Find the area of the polar curve r = 1 - cos(θ) for θ in [0, π].",
                "A = π/2", "A = π", "A = 3π/2", "A = 2π",
                "B", 9, 8073, "hard"));

        unit9Questions.add(new Question(
                "Determine r when θ = π/4 for r = 4 sin(2θ).",
                "r = 4", "r = 2", "r = √2", "r = 0",
                "B", 9, 8074, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent vector to r(t) = <t, t^2, ln(t)> at t = 1.",
                "v = <1, 2, 1>", "v = <1, 2, 0>", "v = <0, 1, 1>", "v = <1, 1, 0>",
                "B", 9, 8075, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = t^2, y = ln(t).",
                "dy/dx = 1/(2t^2)", "dy/dx = 1/t", "dy/dx = 1/(2t)", "dy/dx = 1/(t^2)",
                "C", 9, 8076, "medium"));

        unit9Questions.add(new Question(
                "Convert polar equation r^2 = 9 sin(2θ) to Cartesian coordinates.",
                "2xy = 9", "x^2 + y^2 = 9", "x^2 - y^2 = 9", "x^2 + y^2 = 4.5",
                "A", 9, 8077, "hard"));

        unit9Questions.add(new Question(
                "Find the speed of r(t) = <t, t^2, t^3> at t = 2.",
                "√(4 + 16 + 64)", "√(4 + 4 + 8)", "√(2 + 4 + 8)", "√(1 + 4 + 8)",
                "A", 9, 8078, "medium"));

        unit9Questions.add(new Question(
                "Find the area of one petal of r = sin(5θ).",
                "1/10", "1/5", "1/2", "1/4",
                "B", 9, 8079, "hard"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = t^4, y = t^3 + t.",
                "dy/dx = (3t^2 + 1)/(4t^3)", "dy/dx = (4t^3)/(3t^2 + 1)", "dy/dx = t^3/(3t^2 + 1)", "dy/dx = (3t^2 + 1)/t^4",
                "A", 9, 8080, "medium"));

        unit9Questions.add(new Question(
                "Compute d^2y/dx^2 for x = t^2 + t, y = t^3 - t.",
                "d^2y/dx^2 = (6t - 2)/(2 + 1)", "d^2y/dx^2 = 2/(2t + 1)", "d^2y/dx^2 = 6t/(2t + 1)", "d^2y/dx^2 = (6t - 1)/(2t + 1)",
                "C", 9, 8081, "hard"));

        unit9Questions.add(new Question(
                "Eliminate the parameter: x = t^2 - 1, y = 2t + 1.",
                "y^2 = 4(x + 1) + 1", "y^2 - 2y + 1 = 4(x + 1)", "y^2 + 2y + 1 = 4(x + 1)", "y^2 - 4y = x",
                "B", 9, 8082, "medium"));

        unit9Questions.add(new Question(
                "Find the slope of the tangent to x = t^2, y = t^3 - t at t = 1.",
                "dy/dx = 0", "dy/dx = 1", "dy/dx = 1/2", "dy/dx = 2",
                "B", 9, 8083, "medium"));

        unit9Questions.add(new Question(
                "Given r = 4 - sin(θ), compute dr/dθ.",
                "dr/dθ = -cos(θ)", "dr/dθ = cos(θ)", "dr/dθ = -sin(θ)", "dr/dθ = sin(θ)",
                "A", 9, 8084, "medium"));

        unit9Questions.add(new Question(
                "Find the area enclosed by r = 2 + sin(θ) for θ in [0, π].",
                "A = 5π/2", "A = 3π", "A = 2π", "A = π",
                "A", 9, 8085, "hard"));

        unit9Questions.add(new Question(
                "Convert polar equation r = 3 + 2 cos(θ) to Cartesian coordinates.",
                "(x - 1)^2 + y^2 = 4", "x^2 + y^2 = 3x", "x^2 + y^2 = 3y", "x^2 - y^2 = 4",
                "B", 9, 8086, "medium"));

        unit9Questions.add(new Question(
                "Find the velocity vector for r(t) = <t^2, t^3, cos(t)>.",
                "v(t) = <2t, 3t^2, -sin(t)>", "v(t) = <t, t^2, -sin(t)>", "v(t) = <2t, 3t, cos(t)>", "v(t) = <t^2, t^3, sin(t)>",
                "A", 9, 8087, "medium"));

        unit9Questions.add(new Question(
                "Compute the speed of the particle r(t) = <t, t^2, e^t> at t = 1.",
                "√(1 + 4 + e^2)", "√(1 + 4 + 1)", "√(1 + 2 + e^2)", "√(1 + 4 + e)",
                "A", 9, 8088, "medium"));

        unit9Questions.add(new Question(
                "Convert r = 6 csc(θ) to Cartesian coordinates.",
                "y = 6", "x = 6", "x^2 + y^2 = 36", "y^2 = 6",
                "A", 9, 8089, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = cos(t), y = sin(3t).",
                "dy/dx = 3 cos(3t)/-sin(t)", "dy/dx = 3 cos(3t)/-cos(t)", "dy/dx = 3 sin(3t)/-sin(t)", "dy/dx = 3 sin(3t)/-cos(t)",
                "B", 9, 8090, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent line to r(t) = <t, t^2, t^3> at t = 1.",
                "y - 1 = 2(x - 1)", "y - 1 = 3(x - 1)", "y - 1 = (1/2)(x - 1)", "y - 1 = (1/3)(x - 1)",
                "A", 9, 8091, "medium"));

        unit9Questions.add(new Question(
                "Compute the arc length of x = t^2, y = t^3 for t in [0, 2].",
                "∫0^2 √(4t^2 + 9t^4) dt", "∫0^2 √(2t + 3t^2) dt", "∫0^2 √(4t^2 + 3t^2) dt", "∫0^2 √(t^2 + t^3) dt",
                "A", 9, 8092, "hard"));

        unit9Questions.add(new Question(
                "Find the area of the polar curve r = 1 + 2 sin(θ) for θ in [0, π].",
                "A = 3π", "A = 4π", "A = 2π", "A = π",
                "B", 9, 8093, "hard"));

        unit9Questions.add(new Question(
                "Determine r when θ = π/6 for r = 5 cos(2θ).",
                "r = 5", "r = √3", "r = 2", "r = 0",
                "C", 9, 8094, "medium"));

        unit9Questions.add(new Question(
                "Find the tangent vector to r(t) = <t, t^2, t^4> at t = 1.",
                "v = <1, 2, 4>", "v = <1, 2, 3>", "v = <2, 2, 4>", "v = <1, 1, 4>",
                "A", 9, 8095, "medium"));

        unit9Questions.add(new Question(
                "Find dy/dx for x = t^2 + 1, y = ln(t).",
                "dy/dx = 1/(2t + 1)", "dy/dx = 1/t", "dy/dx = 1/(t^2 + 1)", "dy/dx = 1/(2t)",
                "C", 9, 8096, "medium"));

        unit9Questions.add(new Question(
                "Convert polar equation r^2 = 16 cos(2θ) to Cartesian coordinates.",
                "x^2 - y^2 = 16", "x^2 + y^2 = 16", "2xy = 16", "x^2 + y^2 = 8",
                "C", 9, 8097, "hard"));

        unit9Questions.add(new Question(
                "Find the speed of r(t) = <t^2, t^3, ln(t)> at t = 1.",
                "√(4 + 9 + 1)", "√(1 + 1 + 1)", "√(4 + 6 + 1)", "√(2 + 4 + 1)",
                "A", 9, 8098, "medium"));

        unit9Questions.add(new Question(
                "Find the area of one petal of r = sin(6θ).",
                "1/12", "1/6", "1/8", "1/4",
                "B", 9, 8099, "hard"));


        numUnit9Questions = unit9Questions.size();
        System.out.printf("There are %d questions in unit 9%n", numUnit9Questions);

    }

}
