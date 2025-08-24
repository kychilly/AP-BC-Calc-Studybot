package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit2Questions;

public class Unit2 {

    public static int numUnit2Questions;

    public static void initializeUnit2Questions() {

        unit2Questions.add(new Question(
                "Find the derivative using the limit definition: f(x)=x^2",
                "2x", "x^2", "1", "Does not exist",
                "A", 2, 1000, "medium"));

        unit2Questions.add(new Question(
                "The derivative of sin(x) is:",
                "cos(x)", "-cos(x)", "-sin(x)", "tan(x)",
                "A", 2, 1001, "easy"));

        unit2Questions.add(new Question(
                "The derivative of cos(x) is:",
                "cos(x)", "sin(x)", "-sin(x)", "-cos(x)",
                "C", 2, 1002, "easy"));

        unit2Questions.add(new Question(
                "The derivative of e^x is:",
                "e^x", "ln(x)", "1/x", "0",
                "A", 2, 1003, "easy"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=ln(x).",
                "1/x", "ln(x)", "x", "e^x",
                "A", 2, 1004, "easy"));

        unit2Questions.add(new Question(
                "The derivative of x^5 is:",
                "5x^4", "x^4", "5x^5", "x^6",
                "A", 2, 1005, "easy"));

        unit2Questions.add(new Question(
                "If f(x)=3x^2+2x-7, what is f'(x)?",
                "6x+2", "3x^2", "2x-7", "6x-2",
                "A", 2, 1006, "easy"));

        unit2Questions.add(new Question(
                "What is the derivative of tan(x)?",
                "sec^2(x)", "csc^2(x)", "cot(x)", "cos^2(x)",
                "A", 2, 1007, "medium"));

        unit2Questions.add(new Question(
                "What is the derivative of cot(x)?",
                "-csc^2(x)", "csc^2(x)", "sec^2(x)", "-sec^2(x)",
                "A", 2, 1008, "medium"));

        unit2Questions.add(new Question(
                "What is the derivative of sec(x)?",
                "sec(x)tan(x)", "-sec(x)tan(x)", "csc(x)cot(x)", "-csc(x)cot(x)",
                "A", 2, 1009, "medium"));

        unit2Questions.add(new Question(
                "What is the derivative of arcsin(x)?",
                "1/sqrt(1-x^2)", "-1/sqrt(1-x^2)", "1/(1+x^2)", "-1/(1+x^2)",
                "A", 2, 1010, "hard"));

        unit2Questions.add(new Question(
                "Using the power rule, the derivative of x^n is:",
                "n*x^(n-1)", "x^n", "n*x^n", "n*x^(n+1)",
                "A", 2, 1011, "easy"));

        unit2Questions.add(new Question(
                "The derivative of ln(5x) is:",
                "1/x", "5/x", "1/(5x)", "ln(x)",
                "A", 2, 1012, "medium"));

        unit2Questions.add(new Question(
                "The derivative of e^(2x) is:",
                "2e^(2x)", "e^(2x)", "x*e^(2x)", "ln(2)*e^(2x)",
                "A", 2, 1013, "medium"));

        unit2Questions.add(new Question(
                "Differentiate: f(x)=sqrt(x).",
                "1/(2sqrt(x))", "sqrt(x)", "x^(3/2)", "2sqrt(x)",
                "A", 2, 1014, "easy"));

        unit2Questions.add(new Question(
                "Which rule is used to differentiate f(x)=u(x)v(x)?",
                "Product Rule", "Quotient Rule", "Chain Rule", "Power Rule",
                "A", 2, 1015, "easy"));

        unit2Questions.add(new Question(
                "Which rule is used to differentiate f(x)=u(v(x))?",
                "Chain Rule", "Quotient Rule", "Product Rule", "Power Rule",
                "A", 2, 1016, "easy"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=1/x using the power rule.",
                "-1/x^2", "1/x", "-x", "ln(x)",
                "A", 2, 1017, "easy"));

        unit2Questions.add(new Question(
                "If f(x)=sin(3x), what is f'(x)?",
                "cos(3x)", "3cos(3x)", "sin(3x)", "3sin(3x)",
                "B", 2, 1018, "medium"));

        unit2Questions.add(new Question(
                "If f(x)=x^3 + 4x, then f''(x) is:",
                "6x+4", "3x^2+4", "6x", "3x^2",
                "C", 2, 1019, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x) = (x^3 - 2x) / (x^2 + 1).",
                "(x^4 + 2x^2 + 2)/(x^2+1)^2", "(3x^2-2)(x^2+1)-(2x)(x^3-2x)/(x^2+1)^2", "3x^2-2", "Does not exist",
                "B", 2, 1020, "hard"));

        unit2Questions.add(new Question(
                "If f(x) = (x^2+1)(x^3-4), what is f'(x)?",
                "2x(x^3-4) + 3x^2(x^2+1)", "5x^4", "x^5-4x^2", "2x+3x^2",
                "A", 2, 1021, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=ln(x^2+1).",
                "2x/(x^2+1)", "1/(x^2+1)", "ln(2x)", "x/(x^2+1)",
                "A", 2, 1022, "medium"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=arctan(x).",
                "1/(1+x^2)", "-1/(1+x^2)", "sqrt(1-x^2)", "1/sqrt(1-x^2)",
                "A", 2, 1023, "medium"));

        unit2Questions.add(new Question(
                "If f(x)=x^x, what is f'(x)?",
                "x^x(1+ln(x))", "x^(x-1)", "ln(x)", "x^x/x",
                "A", 2, 1024, "hard"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=sin^2(x).",
                "2sin(x)cos(x)", "cos^2(x)", "2cos(x)", "sin(2x)",
                "A", 2, 1025, "medium"));

        unit2Questions.add(new Question(
                "The derivative of log base a of x is:",
                "1/(x ln(a))", "1/x", "ln(a)/x", "a^x ln(a)",
                "A", 2, 1026, "hard"));

        unit2Questions.add(new Question(
                "If f(x)=e^(3x^2), what is f'(x)?",
                "6xe^(3x^2)", "3e^(3x^2)", "e^(6x)", "6e^(3x^2)",
                "A", 2, 1027, "medium"));

        unit2Questions.add(new Question(
                "Find the second derivative of f(x)=x^4.",
                "12x^2", "4x^3", "24x", "6x",
                "A", 2, 1028, "easy"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=(2x+1)^5.",
                "10(2x+1)^4", "5(2x+1)^4", "2(2x+1)^4", "10x(2x+1)^4",
                "A", 2, 1029, "medium"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=1/(x^2+1).",
                "-2x/(x^2+1)^2", "1/(x^2+1)", "-1/(x^2+1)^2", "2x/(x^2+1)",
                "A", 2, 1030, "medium"));

        unit2Questions.add(new Question(
                "What is the derivative of |x| for x≠0?",
                "x/|x|", "1", "-1", "Does not exist",
                "A", 2, 1031, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x) = (x^2+3x)/(x).",
                "1 + 3/x", "1 - 3/x^2", "1 + 3/x^2", "2x/x^2",
                "B", 2, 1032, "hard"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=arccos(x).",
                "-1/sqrt(1-x^2)", "1/sqrt(1-x^2)", "-1/(1+x^2)", "1/(1+x^2)",
                "A", 2, 1033, "medium"));

        unit2Questions.add(new Question(
                "If y = 5^x, what is dy/dx?",
                "5^x ln(5)", "x5^(x-1)", "ln(x)5^x", "5^(x-1)",
                "A", 2, 1034, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=cos(2x).",
                "-2sin(2x)", "2cos(2x)", "-sin(2x)", "-2cos(x)",
                "A", 2, 1035, "easy"));

        unit2Questions.add(new Question(
                "If f(x)=ln(sin(x)), find f'(x).",
                "cos(x)/sin(x)", "1/sin(x)", "sin(x)/cos(x)", "-cos(x)/sin(x)",
                "A", 2, 1036, "hard"));

        unit2Questions.add(new Question(
                "Find the derivative of f(x)=sqrt(1+x^2).",
                "x/sqrt(1+x^2)", "1/sqrt(1+x^2)", "sqrt(1+x^2)", "1/(1+x^2)",
                "A", 2, 1037, "medium"));

        unit2Questions.add(new Question(
                "If f(x)=tan^(-1)(2x), what is f'(x)?",
                "2/(1+4x^2)", "1/(1+2x)", "2/(1+2x^2)", "1/(1+4x^2)",
                "A", 2, 1038, "hard"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=xln(x).",
                "1+ln(x)", "ln(x)", "x/x", "x+ln(x)",
                "A", 2, 1039, "medium"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=sec(x).",
                "sec(x)tan(x)", "tan(x)", "1/cos^2(x)", "cos(x)tan(x)",
                "A", 2, 1040, "easy"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=cot(x).",
                "-csc^2(x)", "csc^2(x)", "-sec^2(x)", "-cos(x)/sin^2(x)",
                "A", 2, 1041, "easy"));

        unit2Questions.add(new Question(
                "If f(x)=sin(3x^2), what is f'(x)?",
                "6xcos(3x^2)", "3cos(3x^2)", "cos(3x^2)", "6cos(3x^2)",
                "A", 2, 1042, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=x^2e^x.",
                "x^2e^x+2xe^x", "e^x", "2xe^x", "e^x(x^2-2x)",
                "A", 2, 1043, "medium"));

        unit2Questions.add(new Question(
                "Find the derivative of f(x)=sin(x)/x for x≠0.",
                "(xcos(x)-sin(x))/x^2", "(cos(x)-sin(x))/x", "cos(x)/x", "Does not exist",
                "A", 2, 1044, "hard"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=(x^2+1)^3.",
                "6x(x^2+1)^2", "3(x^2+1)^2", "2x(x^2+1)^3", "6(x^2+1)",
                "A", 2, 1045, "medium"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=ln(cos(x)).",
                "-tan(x)", "tan(x)", "sec(x)", "-sec(x)",
                "A", 2, 1046, "hard"));

        unit2Questions.add(new Question(
                "If f(x)=sqrt(x^2+4), what is f'(x)?",
                "x/sqrt(x^2+4)", "2x/sqrt(x^2+4)", "1/(x^2+4)", "sqrt(x^2+4)",
                "A", 2, 1047, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=arcsin(x).",
                "1/sqrt(1-x^2)", "-1/sqrt(1-x^2)", "1/(1+x^2)", "sqrt(1-x^2)",
                "A", 2, 1048, "easy"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=ln(x^2).",
                "2/x", "1/x^2", "1/x", "2ln(x)",
                "A", 2, 1049, "medium"));

        unit2Questions.add(new Question(
                "If f(x)=tan^2(x), find f'(x).",
                "2tan(x)sec^2(x)", "sec^2(x)", "2sec^2(x)", "tan(x)sec^2(x)",
                "A", 2, 1050, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=e^(sin(x)).",
                "cos(x)e^(sin(x))", "sin(x)e^(cos(x))", "e^(cos(x))", "e^(sin(x))",
                "A", 2, 1051, "medium"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=1/x^3.",
                "-3/x^4", "3/x^2", "-1/x^2", "-3/x^2",
                "A", 2, 1052, "easy"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=cos^3(x).",
                "-3cos^2(x)sin(x)", "3cos^2(x)", "-cos^2(x)", "sin(x)cos^3(x)",
                "A", 2, 1053, "medium"));

        unit2Questions.add(new Question(
                "If y = ln(tan(x)), what is dy/dx?",
                "sec^2(x)/tan(x)", "tan(x)sec^2(x)", "1/tan(x)", "cos(x)/sin(x)",
                "A", 2, 1054, "hard"));

        unit2Questions.add(new Question(
                "Find the second derivative of f(x)=e^x.",
                "e^x", "0", "2e^x", "Does not exist",
                "A", 2, 1055, "easy"));

        unit2Questions.add(new Question(
                "If f(x)=x^5, what is f'''(x)?",
                "60x^2", "20x^2", "30x^2", "120x^2",
                "A", 2, 1056, "easy"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=(3x+2)(x-4).",
                "6x-10", "3x+2", "6x+2", "3x-4",
                "A", 2, 1057, "easy"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=sqrt(x)ln(x).",
                "1/(2sqrt(x))ln(x)+1/sqrt(x)", "ln(x)/2sqrt(x)+1/x", "1/sqrt(x)+ln(x)", "ln(x)/sqrt(x)",
                "A", 2, 1058, "hard"));

        unit2Questions.add(new Question(
                "If f(x)=1/(sqrt(x)), what is f'(x)?",
                "-1/(2x^(3/2))", "1/(2sqrt(x))", "-1/sqrt(x)", "-2/sqrt(x)",
                "A", 2, 1059, "medium"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=arccos(x).",
                "-1/sqrt(1-x^2)", "1/sqrt(1-x^2)", "-1/(1+x^2)", "sqrt(1-x^2)",
                "A", 2, 1060, "easy"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=arctan(x).",
                "1/(1+x^2)", "1/sqrt(1-x^2)", "-1/(1+x^2)", "x/(1+x^2)",
                "A", 2, 1061, "easy"));

        unit2Questions.add(new Question(
                "If f(x)=sin(x)cos(x), what is f'(x)?",
                "cos^2(x)-sin^2(x)", "2cos(x)", "sin^2(x)", "cos^2(x)",
                "A", 2, 1062, "medium"));

        unit2Questions.add(new Question(
                "Find derivative of f(x)=e^(2x^2).",
                "4xe^(2x^2)", "2xe^(2x^2)", "2e^(2x^2)", "x^2e^(2x^2)",
                "A", 2, 1063, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=(ln(x))^2.",
                "2ln(x)/x", "2/x", "1/x", "ln(x)/x",
                "A", 2, 1064, "medium"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=tan^-1(2x).",
                "2/(1+4x^2)", "1/(1+2x)", "2/(1+x^2)", "1/(1+4x^2)",
                "A", 2, 1065, "hard"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=x^x.",
                "x^x(ln(x)+1)", "x^xln(x)", "x^x", "x^(x-1)",
                "A", 2, 1066, "hard"));

        unit2Questions.add(new Question(
                "If y=ln(sin(x)), what is dy/dx?",
                "cot(x)", "1/sin(x)", "cos(x)", "tan(x)",
                "A", 2, 1067, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=e^(tan(x)).",
                "sec^2(x)e^(tan(x))", "tan(x)e^(tan(x))", "e^(tan(x))", "sec(x)e^(tan(x))",
                "A", 2, 1068, "hard"));

        unit2Questions.add(new Question(
                "Find derivative of f(x)=1/(1+x).",
                "-1/(1+x)^2", "1/(1+x)^2", "-1/(1+x)", "1/(1+x)",
                "A", 2, 1069, "easy"));

        unit2Questions.add(new Question(
                "If f(x)=cos(ln(x)), what is f'(x)?",
                "-sin(ln(x))/x", "-cos(ln(x))/x", "sin(ln(x))/x", "1/x",
                "A", 2, 1070, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=log_2(x).",
                "1/(x ln 2)", "1/x", "ln(2)/x", "2/x",
                "A", 2, 1071, "medium"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=arccot(x).",
                "-1/(1+x^2)", "1/(1+x^2)", "-1/sqrt(1-x^2)", "1/sqrt(1-x^2)",
                "A", 2, 1072, "medium"));

        unit2Questions.add(new Question(
                "If y=x^3 ln(x), find dy/dx.",
                "3x^2ln(x)+x^2", "3x^2ln(x)+1/x", "x^2ln(x)", "ln(x)+3x^2",
                "A", 2, 1073, "hard"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=sqrt(ln(x)).",
                "1/(2x sqrt(ln(x)))", "1/(sqrt(ln(x)))", "1/(2ln(x))", "ln(x)/(2x)",
                "A", 2, 1074, "hard"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=cosh(x).",
                "sinh(x)", "cosh(x)", "e^x", "e^-x",
                "A", 2, 1075, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=tanh(x).",
                "sech^2(x)", "coth(x)", "1-sech^2(x)", "sinh(x)/cosh(x)",
                "A", 2, 1076, "medium"));

        unit2Questions.add(new Question(
                "If y=(sin(x))^5, find dy/dx.",
                "5sin^4(x)cos(x)", "5cos^4(x)sin(x)", "cos(x)^5", "5sin^5(x)",
                "A", 2, 1077, "easy"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=ln(sec(x)).",
                "tan(x)", "sec(x)", "1/cos(x)", "-tan(x)",
                "A", 2, 1078, "medium"));

        unit2Questions.add(new Question(
                "Find derivative of f(x)=e^(1/x).",
                "-e^(1/x)/x^2", "e^(1/x)/x", "-1/x^2", "-e^x",
                "A", 2, 1079, "hard"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=x^2*sin(x).",
                "2x*sin(x)+x^2*cos(x)", "x*sin(x)", "2x*cos(x)", "x^2*cos(x)",
                "A", 2, 1080, "medium"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=x*e^x.",
                "e^x+x*e^x", "e^x", "x*e^x", "x^2*e^x",
                "A", 2, 1081, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=(x+1)/(x-1).",
                "-2/(x-1)^2", "2/(x-1)^2", "1/(x-1)", "-1/(x-1)^2",
                "A", 2, 1082, "hard"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=ln(x^2+3).",
                "2x/(x^2+3)", "1/(x^2+3)", "2/(x^2+3)", "x/(x^2+3)",
                "A", 2, 1083, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=x^3*ln(x).",
                "3x^2*ln(x)+x^2", "x^3*1/x", "3x^2", "ln(x)",
                "A", 2, 1084, "hard"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=1/(x^2+1).",
                "-2x/(x^2+1)^2", "2x/(x^2+1)^2", "1/(x^2+1)", "-1/(x^2+1)^2",
                "A", 2, 1085, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=sin^3(x).",
                "3sin^2(x)*cos(x)", "cos^3(x)", "3cos^2(x)*sin(x)", "sin^2(x)",
                "A", 2, 1086, "medium"));

        unit2Questions.add(new Question(
                "If f(x)=x^x*e^x, find f'(x).",
                "x^x*e^x*(1+ln(x)+1)", "x^x*e^x*(1+ln(x))", "x^x*e^x", "x*e^x",
                "A", 2, 1087, "hard"));

        unit2Questions.add(new Question(
                "Find derivative of f(x)=arcsin(2x).",
                "2/sqrt(1-4x^2)", "1/sqrt(1-4x^2)", "1/sqrt(1-x^2)", "2/sqrt(1-x^2)",
                "A", 2, 1088, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=ln(x)*cos(x).",
                "cos(x)/x - ln(x)*sin(x)", "cos(x)*ln(x)", "-sin(x)*ln(x)", "1/x*cos(x)",
                "A", 2, 1089, "hard"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=(x^2+1)^4.",
                "8x*(x^2+1)^3", "4*(x^2+1)^3", "8*(x^2+1)^3", "x*(x^2+1)^3",
                "A", 2, 1090, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=e^x*sin(x).",
                "e^x*sin(x)+e^x*cos(x)", "e^x*sin(x)", "e^x*cos(x)", "sin(x)*cos(x)",
                "A", 2, 1091, "medium"));

        unit2Questions.add(new Question(
                "If f(x)=sqrt(x)*cos(x), find f'(x).",
                "cos(x)/(2sqrt(x)) - sqrt(x)*sin(x)", "cos(x)/sqrt(x)", "-sqrt(x)*sin(x)", "cos(x)/(2x)",
                "A", 2, 1092, "hard"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=x/(x+1).",
                "1/(x+1)^2", "x/(x+1)", "-1/(x+1)^2", "1/x",
                "A", 2, 1093, "medium"));

        unit2Questions.add(new Question(
                "Find derivative of f(x)=e^(x^2).",
                "2x*e^(x^2)", "x*e^(x^2)", "e^(2x)", "e^(x^2)",
                "A", 2, 1094, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=ln(x)/x.",
                "1/(x^2) - ln(x)/x^2", "ln(x)/x", "1/x", "-1/x^2",
                "A", 2, 1095, "hard"));

        unit2Questions.add(new Question(
                "Find f'(x) if f(x)=tan(x)*x^2.",
                "2x*tan(x)+x^2*sec^2(x)", "tan(x)+x^2*sec^2(x)", "2x*tan(x)", "sec^2(x)*x^2",
                "A", 2, 1096, "medium"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=cos(x)/x.",
                "-sin(x)/x - cos(x)/x^2", "cos(x)/x^2 - sin(x)/x", "cos(x)/x", "-sin(x)/x^2",
                "A", 2, 1097, "hard"));

        unit2Questions.add(new Question(
                "Find d/dx of f(x)=x^4*ln(x).",
                "4x^3*ln(x)+x^3", "4x^3*ln(x)", "x^4*1/x", "x^4*ln(x)",
                "A", 2, 1098, "hard"));

        unit2Questions.add(new Question(
                "Differentiate f(x)=x*arctan(x).",
                "arctan(x)+x/(1+x^2)", "arctan(x)*x", "1/(1+x^2)", "x*arctan(x)",
                "A", 2, 1099, "medium"));


        numUnit2Questions = unit2Questions.size();
        System.out.printf("There are %d questions in unit 2%n", numUnit2Questions);
    }



}
