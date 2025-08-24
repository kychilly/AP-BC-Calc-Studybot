package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit7Questions;

public class Unit7 {

    public static int numUnit7Questions;

    public static void initializeUnit7Questions() {

        unit7Questions.add(new Question(
                "Solve the differential equation dy/dx = 3y.",
                "y = Ce^(3x)", "y = 3Ce^x", "y = 3x + C", "y = Ce^(x/3)",
                "A", 7, 6000, "medium"));

        unit7Questions.add(new Question(
                "Find the general solution of dy/dx = 2x.",
                "y = x^2 + C", "y = 2x + C", "y = x^2/2 + C", "y = 2x^2 + C",
                "A", 7, 6001, "easy"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y^2 with initial condition y(0) = 1.",
                "y = 1/(1 - x)", "y = 1/(1 + x)", "y = 1/(x - 1)", "y = x/(1 + x)",
                "A", 7, 6002, "hard"));

        unit7Questions.add(new Question(
                "Determine the particular solution for dy/dx = 5y, y(0) = 2.",
                "y = 2e^(5x)", "y = 5e^(2x)", "y = e^(5x)/2", "y = 2e^x",
                "A", 7, 6003, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx + 2y = 6 using an integrating factor.",
                "y = 3 + Ce^(-2x)", "y = 6 + Ce^(2x)", "y = 3e^(2x) + C", "y = 6e^(-2x) + C",
                "A", 7, 6004, "medium"));

        unit7Questions.add(new Question(
                "Find the solution to dy/dx = x*y with y(0) = 1.",
                "y = e^(x^2/2)", "y = e^(2x)", "y = e^(x^2)", "y = e^x",
                "A", 7, 6005, "medium"));

        unit7Questions.add(new Question(
                "Determine equilibrium solutions for dy/dx = y(y-4).",
                "y = 0 and y = 4", "y = 2 and y = 4", "y = 0 and y = -4", "y = 1 and y = -1",
                "A", 7, 6006, "medium"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 - 3 dy/dx + 2y = 0.",
                "y = C1 e^x + C2 e^(2x)", "y = C1 e^(2x) + C2 e^(x)", "y = C1 e^(-x) + C2 e^(-2x)", "y = C1 e^(3x) + C2 e^(-2x)",
                "B", 7, 6007, "hard"));

        unit7Questions.add(new Question(
                "A tank contains 100 L of water. Salt solution enters at 2 L/min with 0.5 kg/L and leaves at 2 L/min. Find differential equation for salt mass S(t).",
                "dS/dt = 1 - (2/100)S", "dS/dt = 1 + (2/100)S", "dS/dt = 2 - (2/100)S", "dS/dt = 2 + (2/100)S",
                "A", 7, 6008, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (x^2 + 1)(y^2) using separation of variables.",
                "y = -1/(x^3/3 + x + C)", "y = 1/(x^3/3 + x + C)", "y = (x^3/3 + x + C)^2", "y = ln(x^3 + 3x + C)",
                "A", 7, 6009, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y - x with initial condition y(0) = 1.",
                "y = x + Ce^x", "y = x + 1 - e^x", "y = x + e^x", "y = x - e^x",
                "A", 7, 6010, "medium"));

        unit7Questions.add(new Question(
                "Find general solution of dy/dx = (y^2 - 1)/x.",
                "y = cos(ln|x| + C)", "y = sin(ln|x| + C)", "y = tan(ln|x| + C)", "y = cot(ln|x| + C)",
                "C", 7, 6011, "hard"));

        unit7Questions.add(new Question(
                "A mixing tank problem: Freshwater enters at 3 L/min, volume 200 L. Find DE for salt amount S(t).",
                "dS/dt = - (3/200) S", "dS/dt = (3/200) S", "dS/dt = 3 - (3/200)S", "dS/dt = 3 + (3/200)S",
                "C", 7, 6012, "medium"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 + 4y = 0.",
                "y = C1 cos(2x) + C2 sin(2x)", "y = C1 e^(2x) + C2 e^(-2x)", "y = C1 cos(x) + C2 sin(x)", "y = C1 e^(4x) + C2 e^(-4x)",
                "A", 7, 6013, "medium"));

        unit7Questions.add(new Question(
                "Determine the solution to dy/dx = xy with y(0) = 2.",
                "y = 2 e^(x^2/2)", "y = e^(x^2/2)", "y = 2 e^x", "y = 2 x e^(x/2)",
                "A", 7, 6014, "medium"));

        unit7Questions.add(new Question(
                "Find the particular solution of dy/dx + y = x with y(0) = 1.",
                "y = x - 1 + 2e^(-x)", "y = x - 1 + e^x", "y = x + e^(-x)", "y = x + 1 - e^(-x)",
                "D", 7, 6015, "medium"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 - 2 dy/dx + 5y = 0.",
                "y = e^x (C1 cos(2x) + C2 sin(2x))", "y = e^(2x) (C1 cos(x) + C2 sin(x))", "y = C1 cos(5x) + C2 sin(5x)", "y = e^(x) (C1 e^(2x) + C2 e^(-2x))",
                "A", 7, 6016, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (y + 1)/x.",
                "y = C x - 1", "y = C/x - 1", "y = C ln|x| - 1", "y = C e^x - 1",
                "C", 7, 6017, "medium"));

        unit7Questions.add(new Question(
                "Find solution of dy/dx = (2x)/(1 + y^2).",
                "y = tan(x^2 + C)", "y = arctan(x^2 + C)", "y = sin(x^2 + C)", "y = cos(x^2 + C)",
                "A", 7, 6018, "medium"));

        unit7Questions.add(new Question(
                "Solve differential equation dy/dx = (y^2 + 1)/x with y(1) = 0.",
                "y = tan(ln|x|)", "y = cot(ln|x|)", "y = sin(ln|x|)", "y = cos(ln|x|)",
                "A", 7, 6019, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = ky for constant k. General solution?",
                "y = Ce^(kx)", "y = kCe^x", "y = kx + C", "y = Ce^(x/k)",
                "A", 7, 6020, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = 4x - 2y using separation of variables.",
                "y = 2x - 1 + Ce^(-2x)", "y = 2x - 1 + Ce^(2x)", "y = 4x - 2 + Ce^x", "y = 4x - 2 + Ce^(-x)",
                "A", 7, 6021, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y/x with y(1) = 3.",
                "y = 3x", "y = 3/x", "y = 3x^2", "y = 3ln(x)",
                "A", 7, 6022, "medium"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 + y = 0.",
                "y = C1 cos(x) + C2 sin(x)", "y = C1 e^x + C2 e^-x", "y = C1 sin(2x) + C2 cos(2x)", "y = C1 e^(ix) + C2 e^(-ix)",
                "A", 7, 6023, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx + 3y = 6x.",
                "y = 2x + Ce^(-3x)", "y = 2x + Ce^(3x)", "y = 6x + Ce^(-3x)", "y = 6x + Ce^(3x)",
                "A", 7, 6024, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = x(y+1) with y(0) = 0.",
                "y = e^(x^2/2) - 1", "y = e^x - 1", "y = e^(2x) - 1", "y = x e^x",
                "A", 7, 6025, "medium"));

        unit7Questions.add(new Question(
                "Find equilibrium solutions of dy/dx = y^2 - 5y + 6.",
                "y = 2 and y = 3", "y = 1 and y = 6", "y = -1 and y = 6", "y = 0 and y = 5",
                "A", 7, 6026, "medium"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 - 4 dy/dx + 4y = 0.",
                "y = (C1 + C2 x) e^(2x)", "y = C1 e^(2x) + C2 e^(2x)", "y = C1 e^(4x) + C2 e^(-x)", "y = C1 cos(2x) + C2 sin(2x)",
                "A", 7, 6027, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (x^2 + 1)/(2y).",
                "y^2 = x^3/3 + x + C", "y = sqrt(x^2 + 1 + C)", "y^2 = x^2 + C", "y = x^2/2 + C",
                "A", 7, 6028, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y(2 - y).",
                "y = 2/(1 + Ce^(-2x))", "y = 2/(1 - Ce^(2x))", "y = 2/(1 + Ce^(2x))", "y = 2/(1 - Ce^(-2x))",
                "A", 7, 6029, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = sin(x) y.",
                "y = Ce^(-cos(x))", "y = Ce^(sin(x))", "y = Ce^(cos(x))", "y = Ce^(-sin(x))",
                "C", 7, 6030, "medium"));

        unit7Questions.add(new Question(
                "Find general solution of dy/dx = x sqrt(y).",
                "y = (x^2/2 + C)^2", "y = (2x + C)^2", "y = (x^2 + C)^2", "y = sqrt(x^2 + C)",
                "A", 7, 6031, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx + 4y = 8.",
                "y = 2 + Ce^(-4x)", "y = 2 + Ce^(4x)", "y = 8 + Ce^(-4x)", "y = 8 + Ce^(4x)",
                "A", 7, 6032, "medium"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 + 9y = 0.",
                "y = C1 cos(3x) + C2 sin(3x)", "y = C1 e^(3x) + C2 e^(-3x)", "y = C1 cos(x) + C2 sin(x)", "y = C1 e^(9x) + C2 e^(-9x)",
                "A", 7, 6033, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y/x + x.",
                "y = x ln|x| + x^2/2 + C", "y = x ln|x| - x^2/2 + C", "y = ln|x| + x + C", "y = x^2 + C",
                "A", 7, 6034, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (1 - y^2)/x.",
                "y = tan(ln|x| + C)", "y = sin(ln|x| + C)", "y = cos(ln|x| + C)", "y = cot(ln|x| + C)",
                "A", 7, 6035, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = x/(1 + y^2).",
                "y = tan(x^2/2 + C)", "y = arctan(x^2/2 + C)", "y = sin(x^2/2 + C)", "y = cos(x^2/2 + C)",
                "A", 7, 6036, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (y - 1)(y - 3).",
                "y = (3 - Ce^(2x))/(1 - Ce^(2x))", "y = (1 - Ce^(2x))/(3 - Ce^(2x))", "y = (3 - Ce^x)/(1 - Ce^x)", "y = (1 - Ce^x)/(3 - Ce^x)",
                "A", 7, 6037, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx + y tan(x) = sin(2x).",
                "y = sin(x) + Ce^(-∫tan(x)dx)", "y = sin(x) + Ce^(∫tan(x)dx)", "y = cos(x) + Ce^(-∫tan(x)dx)", "y = cos(x) + Ce^(∫tan(x)dx)",
                "B", 7, 6038, "hard"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 - y = 0.",
                "y = C1 e^x + C2 e^(-x)", "y = C1 cos(x) + C2 sin(x)", "y = C1 e^(2x) + C2 e^(-2x)", "y = C1 cosh(x) + C2 sinh(x)",
                "A", 7, 6039, "medium"));

        unit7Questions.add(new Question(
                "A population grows at a rate proportional to its size. If P(0) = 100, write the general solution.",
                "P(t) = 100 e^(kt)", "P(t) = ke^(100t)", "P(t) = 100 + kt", "P(t) = kt^2 + 100",
                "A", 7, 6040, "medium"));

        unit7Questions.add(new Question(
                "Newton's Law of Cooling: dT/dt = -k(T - T_env). If T(0) = 90°C, find general solution.",
                "T(t) = T_env + Ce^(-kt)", "T(t) = T_env - Ce^(kt)", "T(t) = Ce^(-kt)", "T(t) = T_env + k t",
                "A", 7, 6041, "medium"));

        unit7Questions.add(new Question(
                "A tank contains 50 L of saltwater. Freshwater enters at 5 L/min and leaves at same rate. DE for salt mass S(t)?",
                "dS/dt = - (5/50) S", "dS/dt = (5/50) S", "dS/dt = -5 S", "dS/dt = 5 - S",
                "A", 7, 6042, "medium"));

        unit7Questions.add(new Question(
                "Solve logistic differential equation dP/dt = kP(1 - P/M).",
                "P = M/(1 + Ce^(-kt))", "P = Ce^(kt)/(1 + M)", "P = M e^(kt)/(1 + C)", "P = Ce^(kt) + M",
                "A", 7, 6043, "hard"));

        unit7Questions.add(new Question(
                "A cup of coffee cools from 90°C to 80°C in 5 minutes. Using Newton's Law, find DE for T(t).",
                "dT/dt = -k(T - T_room)", "dT/dt = k(T - T_room)", "dT/dt = -kT", "dT/dt = kT",
                "A", 7, 6044, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dt = ky(M - y) with y(0) = y0.",
                "y = M/(1 + ((M - y0)/y0)e^(-kMt))", "y = y0 e^(k(M - y0)t)", "y = M e^(kt)/y0", "y = M/(1 - ((M - y0)/y0)e^(kMt))",
                "A", 7, 6045, "hard"));

        unit7Questions.add(new Question(
                "A 100 L tank contains 20 kg salt. Freshwater enters at 2 L/min, solution leaves at 2 L/min. Find S(t).",
                "dS/dt = - (2/100)S", "dS/dt = (2/100)S", "dS/dt = -2S", "dS/dt = 2 + S",
                "A", 7, 6046, "medium"));

        unit7Questions.add(new Question(
                "A population follows logistic growth with carrying capacity 500 and growth rate 0.02. Solve dP/dt = 0.02 P (1 - P/500).",
                "P = 500/(1 + Ce^(-0.02 t))", "P = 500/(1 - Ce^(0.02 t))", "P = Ce^(0.02 t)", "P = 500 e^(0.02 t)",
                "A", 7, 6047, "medium"));

        unit7Questions.add(new Question(
                "A tank with 200 L contains 50 kg salt. Brine enters at 4 L/min, leaves at 4 L/min. DE for S(t)?",
                "dS/dt = 4 - (4/200)S", "dS/dt = 4 + (4/200)S", "dS/dt = -4 S", "dS/dt = 4S",
                "A", 7, 6048, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dt = ky^2, y(0) = y0.",
                "y = y0/(1 - ky0 t)", "y = y0/(1 + ky0 t)", "y = 1/(y0 - kt)", "y = 1/(y0 + kt)",
                "B", 7, 6049, "hard"));

        unit7Questions.add(new Question(
                "A radioactive substance decays at rate proportional to its mass. If m(0) = 100 g, write general solution.",
                "m(t) = 100 e^(-kt)", "m(t) = 100 e^(kt)", "m(t) = 100 - kt", "m(t) = kt + 100",
                "A", 7, 6050, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dt = y(3 - y) with y(0) = 1.",
                "y = 3/(1 + 2 e^(-3 t))", "y = 3/(1 - 2 e^(-3 t))", "y = e^(3t)/(1 + e^(3t))", "y = 1/(1 + 2 e^(-3t))",
                "A", 7, 6051, "hard"));

        unit7Questions.add(new Question(
                "A 200 g object cools in a room at 20°C. If Newton's Law applies, dT/dt = -k(T - 20). T(0) = 100°C. Solve DE.",
                "T = 20 + 80 e^(-kt)", "T = 20 - 80 e^(-kt)", "T = 100 e^(-kt)", "T = 20 + e^(-kt)",
                "A", 7, 6052, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (2 - y)/x with y(1) = 0.",
                "y = 2 - 2/x", "y = 2 + 2/x", "y = 2 - x^2", "y = x^2 - 2",
                "A", 7, 6053, "hard"));

        unit7Questions.add(new Question(
                "A population grows at 5% per year. If initial population is 1000, write DE and solution.",
                "dP/dt = 0.05P, P = 1000 e^(0.05 t)", "dP/dt = 0.05P, P = 1000 e^(5 t)", "dP/dt = P, P = 1000 e^(0.05 t)", "dP/dt = 0.05, P = 1000 + 0.05 t",
                "A", 7, 6054, "medium"));

        unit7Questions.add(new Question(
                "Solve logistic equation dP/dt = 0.03 P (1 - P/1000), P(0) = 50.",
                "P = 1000/(1 + 19 e^(-0.03 t))", "P = 1000/(1 - 19 e^(0.03 t))", "P = 50 e^(0.03 t)", "P = 1000 e^(0.03 t)",
                "A", 7, 6055, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dt = (y^2 - 1)/x with y(1) = 0.",
                "y = tan(ln|x|)", "y = cot(ln|x|)", "y = sin(ln|x|)", "y = cos(ln|x|)",
                "A", 7, 6056, "hard"));

        unit7Questions.add(new Question(
                "A cup of tea cools from 90°C to 70°C in 10 min in room at 20°C. DE: dT/dt = -k(T - 20). Find T(t).",
                "T = 20 + 70 e^(-kt)", "T = 20 + 70 e^(kt)", "T = 20 + 90 e^(-kt)", "T = 20 + 90 e^(kt)",
                "C", 7, 6057, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (x + y)^2 using substitution v = x + y.",
                "y = -x + 1/(C - x)", "y = -x + 1/(C + x)", "y = -x + ln|x + C|", "y = -x + e^(x + C)",
                "B", 7, 6058, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y^2 - 4y + 3.",
                "y = 1 + 2/(Ce^(-2x) - 1)", "y = 3 + 2/(Ce^(2x) - 1)", "y = 1 + 2/(Ce^(2x) - 1)", "y = 3 + 2/(Ce^(-2x) - 1)",
                "C", 7, 6059, "hard"));

        unit7Questions.add(new Question(
                "A tank contains 500 L of brine. Solution enters at 5 L/min with 0.2 kg/L and leaves at 5 L/min. Find DE for salt S(t).",
                "dS/dt = 1 - (5/500)S", "dS/dt = 1 + (5/500)S", "dS/dt = 0.2 - S", "dS/dt = 0.2 + S",
                "A", 7, 6060, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (y^2 + 1)/x, y(1) = 0.",
                "y = tan(ln|x|)", "y = cot(ln|x|)", "y = sin(ln|x|)", "y = cos(ln|x|)",
                "A", 7, 6061, "hard"));

        unit7Questions.add(new Question(
                "A population satisfies dP/dt = 0.04P. If P(0) = 500, find P(t).",
                "P = 500 e^(0.04 t)", "P = 500 e^(4 t)", "P = 0.04*500 t", "P = 500 + 0.04 t",
                "A", 7, 6062, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = x*y^2, y(0) = 1.",
                "y = 1/(1 - x^2/2)", "y = 1/(1 + x^2/2)", "y = 1/(1 - 2x^2)", "y = 1/(1 + 2x^2)",
                "B", 7, 6063, "hard"));

        unit7Questions.add(new Question(
                "Solve the differential equation dy/dx = (x + y)^2 using substitution v = x + y.",
                "y = -x + 1/(C + x)", "y = -x + 1/(C - x)", "y = -x + ln|x + C|", "y = -x + e^(x + C)",
                "A", 7, 6064, "hard"));

        unit7Questions.add(new Question(
                "A 100 kg substance decays at 2% per year. DE and solution?",
                "dm/dt = -0.02 m, m = 100 e^(-0.02 t)", "dm/dt = 0.02 m, m = 100 e^(0.02 t)", "dm/dt = -0.02 m, m = 100 - 0.02 t", "dm/dt = 0.02 m, m = 100 + 0.02 t",
                "A", 7, 6065, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (x^2 - y^2)/(2xy) using substitution v = y/x.",
                "y = x/(C + ln|x|)", "y = vx", "y = x ln|x + C|", "y = C x^2",
                "B", 7, 6066, "hard"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 - 6 dy/dx + 9y = 0.",
                "y = (C1 + C2 x) e^(3x)", "y = C1 e^(6x) + C2 e^(3x)", "y = C1 e^(3x) + C2 e^(9x)", "y = C1 cos(3x) + C2 sin(3x)",
                "A", 7, 6067, "hard"));

        unit7Questions.add(new Question(
                "A cup of tea cools from 95°C in a room of 20°C. dT/dt = -k(T - 20). If T = 60°C after 10 min, find T(t).",
                "T = 20 + 75 e^(-kt)", "T = 20 + 95 e^(-kt)", "T = 20 + 60 e^(-kt)", "T = 20 + 75 e^(kt)",
                "A", 7, 6068, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y^2 - 4y + 3.",
                "y = 1 + 2/(Ce^(2x) - 1)", "y = 3 + 2/(Ce^(-2x) - 1)", "y = 1 + 2/(Ce^(-2x) - 1)", "y = 3 + 2/(Ce^(2x) - 1)",
                "C", 7, 6069, "hard"));

        unit7Questions.add(new Question(
                "A tank initially contains 100 L of pure water. Brine enters at 3 L/min with 0.1 kg/L. DE for salt mass S(t)?",
                "dS/dt = 0.3 - (3/100) S", "dS/dt = 0.3 + (3/100) S", "dS/dt = 3 - (0.3/100) S", "dS/dt = 3 + (0.1/100) S",
                "A", 7, 6070, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = x*y with y(0) = 2.",
                "y = 2 e^(x^2/2)", "y = 2 e^(2x)", "y = 2 x e^(x/2)", "y = e^(x^2/2)",
                "A", 7, 6071, "medium"));

        unit7Questions.add(new Question(
                "A population grows logistically with carrying capacity 1000 and rate 0.01. Solve dP/dt = 0.01 P (1 - P/1000).",
                "P = 1000/(1 + Ce^(-0.01 t))", "P = 1000/(1 - Ce^(0.01 t))", "P = Ce^(0.01 t)", "P = 1000 e^(0.01 t)",
                "A", 7, 6072, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y/x + x with y(1) = 2.",
                "y = x ln|x| + x^2/2 + C", "y = x ln|x| - x^2/2 + C", "y = ln|x| + x + C", "y = x^2 + C",
                "A", 7, 6073, "hard"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 + 4 dy/dx + 4y = 0.",
                "y = (C1 + C2 x) e^(-2x)", "y = C1 e^(-2x) + C2 e^(-2x)", "y = C1 cos(2x) + C2 sin(2x)", "y = C1 e^(2x) + C2 e^(-2x)",
                "A", 7, 6074, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = x/(1 + y^2) with y(0) = 0.",
                "y = tan(x^2/2)", "y = arctan(x^2/2)", "y = sin(x^2/2)", "y = cos(x^2/2)",
                "A", 7, 6075, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (y - 1)(y - 4).",
                "y = 4 - 3/(Ce^(3x) + 1)", "y = 1 + 3/(Ce^(3x) - 1)", "y = 4 - 3/(Ce^(-3x) + 1)", "y = 1 + 3/(Ce^(-3x) - 1)",
                "C", 7, 6076, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx + y/x = x^2 with y(1) = 0.",
                "y = x^2/3 (x + 2)", "y = x^2/3 (x - 2)", "y = x^2 + ln|x|", "y = x^2 - ln|x|",
                "A", 7, 6077, "hard"));

        unit7Questions.add(new Question(
                "A tank initially has 100 L of water with 10 kg salt. Freshwater enters at 5 L/min and leaves at same rate. DE for salt S(t)?",
                "dS/dt = -(5/100) S", "dS/dt = (5/100) S", "dS/dt = 5 - (5/100)S", "dS/dt = 5 + (5/100)S",
                "A", 7, 6078, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y^2 + 1 with y(0) = 0.",
                "y = tan(x)", "y = cot(x)", "y = sin(x)", "y = cos(x)",
                "A", 7, 6079, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (x + 1)y with y(0) = 2.",
                "y = 2 e^(x^2/2 + x)", "y = 2 e^(x^2 + x)", "y = 2 e^(x^2/2)", "y = 2 e^(x + 1)",
                "A", 7, 6080, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y/x + 2x with y(1) = 3.",
                "y = x ln|x| + x^2 + C", "y = x ln|x| + x^2 + 1", "y = x^2 + 2x + C", "y = x^2 ln|x| + C",
                "B", 7, 6081, "hard"));

        unit7Questions.add(new Question(
                "Solve logistic DE dP/dt = 0.05 P (1 - P/500) with P(0) = 50.",
                "P = 500/(1 + 9 e^(-0.05 t))", "P = 500/(1 - 9 e^(0.05 t))", "P = 50 e^(0.05 t)", "P = 500 e^(0.05 t)",
                "A", 7, 6082, "medium"));

        unit7Questions.add(new Question(
                "A tank has 200 L of solution with 20 kg salt. Brine enters at 4 L/min with 0.1 kg/L and leaves at 4 L/min. Find DE for salt S(t).",
                "dS/dt = 0.4 - (4/200) S", "dS/dt = 0.4 + (4/200) S", "dS/dt = 4 - (0.4/200) S", "dS/dt = 4 + (0.1/200) S",
                "A", 7, 6083, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y^2 - 2y + 1.",
                "y = 1 + 1/(C - x)", "y = 1 - 1/(C + x)", "y = 2 + 1/(C - x)", "y = 2 - 1/(C + x)",
                "A", 7, 6084, "hard"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 - y = 0.",
                "y = C1 e^x + C2 e^(-x)", "y = C1 cos(x) + C2 sin(x)", "y = C1 e^(2x) + C2 e^(-2x)", "y = C1 sinh(x) + C2 cosh(x)",
                "A", 7, 6085, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = x/(y + 1) with y(0) = 0.",
                "y = -1 + sqrt(x^2 + 1)", "y = -1 + sqrt(x^2/2 + 1)", "y = -1 + x^2", "y = -1 + x^2/2",
                "B", 7, 6086, "hard"));

        unit7Questions.add(new Question(
                "Solve Newton's Law of Cooling: dT/dt = -k(T - 25), T(0) = 90.",
                "T = 25 + 65 e^(-kt)", "T = 25 + 90 e^(-kt)", "T = 25 - 65 e^(kt)", "T = 25 + 65 e^(kt)",
                "A", 7, 6087, "medium"));

        unit7Questions.add(new Question(
                "A population grows at 3% per year. Initial population 2000. Find P(t).",
                "P = 2000 e^(0.03 t)", "P = 2000 e^(3 t)", "P = 2000 + 0.03 t", "P = 2000 e^(0.3 t)",
                "A", 7, 6088, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y(x - 1) with y(0) = 2.",
                "y = 2 e^(x^2/2 - x)", "y = 2 e^(x^2 - x)", "y = 2 e^(x^2/2 + x)", "y = 2 e^(x - x^2/2)",
                "A", 7, 6089, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = x^2 y^2, y(0) = 1.",
                "y = 1/(1 - x^3/3)", "y = 1/(1 + x^3/3)", "y = 1/(1 - x^2/2)", "y = 1/(1 + x^2/2)",
                "B", 7, 6090, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx + 2y = 4 with y(0) = 1.",
                "y = 2 + e^(-2x)", "y = 2 - e^(-2x)", "y = 4 + e^(-2x)", "y = 4 - e^(2x)",
                "B", 7, 6091, "medium"));

        unit7Questions.add(new Question(
                "Solve logistic DE dP/dt = 0.1 P (1 - P/1000), P(0) = 100.",
                "P = 1000/(1 + 9 e^(-0.1 t))", "P = 1000/(1 - 9 e^(0.1 t))", "P = 100 e^(0.1 t)", "P = 1000 e^(0.1 t)",
                "A", 7, 6092, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y^2 + 4y + 3.",
                "y = -1 + 2/(C - x)", "y = -3 + 2/(C - x)", "y = 1 + 2/(C - x)", "y = 3 + 2/(C - x)",
                "A", 7, 6093, "hard"));

        unit7Questions.add(new Question(
                "A tank has 100 L of water with 5 kg salt. Brine enters at 2 L/min, leaves at 2 L/min. DE for S(t)?",
                "dS/dt = -(2/100) S + 0.1", "dS/dt = (2/100) S - 0.1", "dS/dt = 2 - (2/100)S", "dS/dt = 2 + (2/100)S",
                "A", 7, 6094, "medium"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (2y + x)/x with y(1) = 0.",
                "y = -x/2 + ln|x|", "y = -x + ln|x|", "y = x/2 + ln|x|", "y = x + ln|x|",
                "A", 7, 6095, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = y(1 - y) with y(0) = 0.5.",
                "y = 1/(1 + e^(-t))", "y = e^t/(1 + e^t)", "y = 1/(1 - e^(-t))", "y = e^(-t)/(1 + e^(-t))",
                "A", 7, 6096, "medium"));

        unit7Questions.add(new Question(
                "Solve d^2y/dx^2 + 2 dy/dx + y = 0.",
                "y = (C1 + C2 x) e^(-x)", "y = C1 e^(-2x) + C2 e^(x)", "y = C1 cos(x) + C2 sin(x)", "y = C1 e^x + C2 e^(-x)",
                "A", 7, 6097, "hard"));

        unit7Questions.add(new Question(
                "Solve dy/dx = (y^2 - 1)/x with y(1) = 1.",
                "y = tan(ln|x|)", "y = cot(ln|x|)", "y = sin(ln|x|)", "y = cos(ln|x|)",
                "A", 7, 6098, "hard"));

        unit7Questions.add(new Question(
                "A cup of coffee cools from 80°C in a room at 20°C. DE: dT/dt = -k(T - 20). Find T(t) if T(5) = 50°C.",
                "T = 20 + 60 e^(-kt)", "T = 20 + 80 e^(-kt)", "T = 20 + 50 e^(-kt)", "T = 20 + 60 e^(kt)",
                "A", 7, 6099, "hard"));


        numUnit7Questions = unit7Questions.size();
        System.out.printf("There are %d questions in unit 7%n", numUnit7Questions);

    }

}
