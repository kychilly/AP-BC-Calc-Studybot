package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit3Questions;

public class Unit3 {

    public static int numUnit3Questions;

    public static void initializeUnit3Questions() {

        unit3Questions.add(new Question(
                "Find the critical points of f(x)=x^3-3x^2+4.",
                "x=0, x=2", "x=1, x=2", "x=0, x=1", "x=-1, x=1",
                "C", 3, 2000, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals where f(x)=x^3-3x^2 is increasing.",
                "(-∞,0)∪(2,∞)", "(0,2)", "(-∞,∞)", "(-∞,2)",
                "A", 3, 2001, "medium"));

        unit3Questions.add(new Question(
                "Find where f(x)=x^3-6x^2+9x is concave up.",
                "x>1", "x<1", "x>3", "x<3",
                "A", 3, 2002, "medium"));

        unit3Questions.add(new Question(
                "Determine the local maximum of f(x)=2x^3-9x^2+12x.",
                "x=1", "x=2", "x=3", "x=0",
                "A", 3, 2003, "medium"));

        unit3Questions.add(new Question(
                "The derivative test shows f(x)=x^4-4x^3 has a local minimum at:",
                "x=3", "x=0", "x=2", "x=1",
                "C", 3, 2004, "medium"));

        unit3Questions.add(new Question(
                "Find inflection points of f(x)=x^4-4x^3.",
                "x=0 and x=3", "x=1 and x=2", "x=2 only", "x=0 only",
                "B", 3, 2005, "medium"));

        unit3Questions.add(new Question(
                "Find f'(x) of f(x)=x^2*sin(x) to locate critical points.",
                "2x*sin(x)+x^2*cos(x)", "2x*cos(x)+x^2*sin(x)", "sin(x)+x^2*cos(x)", "2x*sin(x)-x^2*cos(x)",
                "A", 3, 2006, "hard"));

        unit3Questions.add(new Question(
                "Find absolute maximum of f(x)=x^3-3x^2+1 on [0,3].",
                "f(0)=1", "f(1)=-1", "f(3)=1", "f(2)=-1",
                "C", 3, 2007, "hard"));

        unit3Questions.add(new Question(
                "The function f(x)=x^3-12x+1 has increasing intervals:",
                "x<-2 or x>2", "-2<x<2", "x>0", "x<0",
                "A", 3, 2008, "medium"));

        unit3Questions.add(new Question(
                "Determine concavity of f(x)=x^4-4x^2.",
                "Concave up x<-1 and x>1", "Concave up x>-1", "Concave down x<-1 and x>1", "Concave up all x",
                "A", 3, 2009, "medium"));

        unit3Questions.add(new Question(
                "Solve related rates: If x^2+y^2=25 and dx/dt=2, find dy/dt at (3,4).",
                "-3/4", "3/4", "4/3", "-4/3",
                "D", 3, 2010, "hard"));

        unit3Questions.add(new Question(
                "Find critical points of f(x)=ln(x^2-1).",
                "x=±√2", "x=±1", "x=0", "x=1",
                "B", 3, 2011, "medium"));

        unit3Questions.add(new Question(
                "Use first derivative test for f(x)=x^3-3x to classify x=1.",
                "Local max", "Local min", "Neither", "Saddle point",
                "B", 3, 2012, "medium"));

        unit3Questions.add(new Question(
                "Mean Value Theorem guarantees f(x)=x^2 on [0,2]:",
                "f'(c)=2", "f'(c)=1", "f'(c)=2x", "f'(c)=4",
                "A", 3, 2013, "easy"));

        unit3Questions.add(new Question(
                "Determine increasing/decreasing intervals for f(x)=x^4-4x^3.",
                "Increasing x>3", "Decreasing x<0", "Increasing 0<x<3", "Decreasing 0<x<3",
                "C", 3, 2014, "medium"));

        unit3Questions.add(new Question(
                "Find local maxima/minima of f(x)=x^3-6x^2+8.",
                "Local max at x=0, min at x=4", "Local max at x=2, min at x=0", "Local max at x=1, min at x=3", "No extrema",
                "C", 3, 2015, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) for f(x)=x^3-3x^2+2x to locate concavity.",
                "6x-6", "3x^2-6x", "6x+6", "2x-6",
                "A", 3, 2016, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Maximize f(x)=-x^2+4x on [0,5].",
                "x=2", "x=0", "x=4", "x=5",
                "A", 3, 2017, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of concavity for f(x)=x^3-3x^2+2.",
                "Concave up x>1, concave down x<1", "Concave up x<1", "Concave down x>1", "Concave up all x",
                "A", 3, 2018, "medium"));

        unit3Questions.add(new Question(
                "Find critical points of f(x)=x^4-4x^2+1.",
                "x=0, x=±1", "x=1 only", "x=±2", "x=0, x=2",
                "A", 3, 2019, "medium"));
        unit3Questions.add(new Question(
                "Find the absolute maximum of f(x)=x^3-6x^2+9x on [0,4].",
                "f(0)=0", "f(2)=4", "f(3)=0", "f(4)=16",
                "D", 3, 2020, "hard"));

        unit3Questions.add(new Question(
                "Determine where f(x)=x^3-3x+1 is increasing.",
                "x<-1 or x>1", "-1<x<1", "x>0", "x<0",
                "B", 3, 2021, "medium"));

        unit3Questions.add(new Question(
                "Find the inflection points of f(x)=x^4-4x^3+2.",
                "x=0 and x=2", "x=1 and x=3", "x=0 only", "x=2 only",
                "A", 3, 2022, "medium"));

        unit3Questions.add(new Question(
                "Critical points of f(x)=x^3-9x^2+24x are:",
                "x=0, x=4", "x=0, x=2", "x=3, x=4", "x=1, x=2",
                "B", 3, 2023, "medium"));

        unit3Questions.add(new Question(
                "Find intervals where f(x)=x^3-3x^2+5 is concave down.",
                "x<1", "x>1", "x<0", "x>0",
                "A", 3, 2024, "medium"));

        unit3Questions.add(new Question(
                "Determine local maximum of f(x)=x^4-4x^3+6.",
                "x=0", "x=1", "x=2", "x=3",
                "B", 3, 2025, "medium"));

        unit3Questions.add(new Question(
                "Find f'(x) for f(x)=x*ln(x) to locate critical points.",
                "ln(x)+1", "1/x", "x*ln(x)", "ln(x)-1",
                "A", 3, 2026, "medium"));

        unit3Questions.add(new Question(
                "Use the first derivative test for f(x)=x^3-3x to classify x=-1.",
                "Local max", "Local min", "Neither", "Saddle point",
                "A", 3, 2027, "medium"));

        unit3Questions.add(new Question(
                "Find critical points of f(x)=sin(x)+cos(2x).",
                "x=π/3, 5π/3", "x=π/4, 3π/4", "x=0, π", "x=π/2",
                "A", 3, 2028, "hard"));

        unit3Questions.add(new Question(
                "Determine increasing intervals of f(x)=x^4-8x^2+10.",
                "x<-2 or x>2", "-2<x<2", "x>0", "x<0",
                "A", 3, 2029, "medium"));

        unit3Questions.add(new Question(
                "Find the second derivative of f(x)=x^3-6x^2+9x to analyze concavity.",
                "6x-12", "3x^2-12x", "6x+12", "2x-12",
                "A", 3, 2030, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Maximize f(x)=-2x^2+8x+3 on [0,5].",
                "x=2", "x=0", "x=5", "x=3",
                "A", 3, 2031, "medium"));

        unit3Questions.add(new Question(
                "Find intervals where f(x)=x^3-3x^2+2 is concave up.",
                "x>1", "x<1", "x>0", "x<0",
                "A", 3, 2032, "medium"));

        unit3Questions.add(new Question(
                "Critical points of f(x)=x^4-4x^2+3 are:",
                "x=0, x=±1", "x=1 only", "x=±2", "x=0, x=2",
                "A", 3, 2033, "medium"));

        unit3Questions.add(new Question(
                "Determine absolute minimum of f(x)=x^3-3x^2+1 on [-1,3].",
                "f(-1)=-3", "f(0)=1", "f(1)=-1", "f(3)=7",
                "C", 3, 2034, "hard"));

        unit3Questions.add(new Question(
                "Related rates: A balloon rises at 3 ft/s. Find rate of distance from point 4 ft away at 2 ft height.",
                "√5 ft/s", "2 ft/s", "3 ft/s", "5 ft/s",
                "A", 3, 2035, "hard"));

        unit3Questions.add(new Question(
                "Find critical points for f(x)=e^x-2x.",
                "x=0", "x=1", "x=-1", "x=2",
                "A", 3, 2036, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of decrease for f(x)=x^3-3x^2+2.",
                "0<x<2", "x<0", "x>2", "All x",
                "A", 3, 2037, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) of f(x)=x^4-4x^3+6x^2 to determine concavity.",
                "12x^2-24x+12", "4x^3-12x^2+12", "12x^2-12x+12", "24x^2-24x+12",
                "A", 3, 2038, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Minimize f(x)=x^2-6x+9 on [0,5].",
                "x=3", "x=0", "x=5", "x=2",
                "A", 3, 2039, "medium"));

        unit3Questions.add(new Question(
                "Find the local maxima of f(x)=2x^3-9x^2+12x+1.",
                "x=1", "x=2", "x=3", "x=0",
                "A", 3, 2040, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of concave down for f(x)=x^3-6x^2+9x+2.",
                "x<1", "x>1", "x<0", "x>0",
                "A", 3, 2041, "medium"));

        unit3Questions.add(new Question(
                "Critical points of f(x)=x^3-3x^2+4 are:",
                "x=0, x=2", "x=1, x=2", "x=0, x=1", "x=-1, x=1",
                "C", 3, 2042, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) for f(x)=x^4-4x^3+6x^2-2.",
                "12x^2-24x+12", "4x^3-12x^2+12", "12x^2-12x+12", "24x^2-24x+12",
                "A", 3, 2043, "medium"));

        unit3Questions.add(new Question(
                "Related rates: A ladder 10 ft long slides down a wall at 2 ft/s. Find dx/dt when bottom is 6 ft from wall.",
                "3/2 ft/s", "4/3 ft/s", "1 ft/s", "2 ft/s",
                "B", 3, 2044, "hard"));

        unit3Questions.add(new Question(
                "Find absolute minimum of f(x)=x^3-3x^2+5 on [0,3].",
                "f(0)=5", "f(1)=3", "f(3)=11", "f(2)=-1",
                "D", 3, 2045, "hard"));

        unit3Questions.add(new Question(
                "Determine intervals of increase for f(x)=x^4-8x^2+16.",
                "x<-2 or x>2", "-2<x<2", "x>0", "x<0",
                "A", 3, 2046, "medium"));

        unit3Questions.add(new Question(
                "Find inflection points of f(x)=x^3-3x^2+2x.",
                "x=0, x=1", "x=1 only", "x=-1", "x=2 only",
                "A", 3, 2047, "medium"));

        unit3Questions.add(new Question(
                "Use the first derivative test for f(x)=x^3-6x^2+9x to classify x=1.",
                "Local max", "Local min", "Neither", "Saddle point",
                "B", 3, 2048, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Maximize f(x)=-x^2+6x-5 on [0,5].",
                "x=3", "x=0", "x=5", "x=2",
                "A", 3, 2049, "medium"));

        unit3Questions.add(new Question(
                "Find critical points for f(x)=ln(x)-x^2.",
                "x=1/√2", "x=√2", "x=0", "x=2",
                "A", 3, 2050, "hard"));

        unit3Questions.add(new Question(
                "Determine intervals of decrease for f(x)=x^3-9x+5.",
                "-√3<x<√3", "x<-√3 or x>√3", "x>0", "x<0",
                "B", 3, 2051, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) for f(x)=x^4-8x^3+18x^2-5.",
                "12x^2-48x+36", "4x^3-24x^2+36", "12x^2-24x+18", "24x^2-48x+36",
                "A", 3, 2052, "medium"));

        unit3Questions.add(new Question(
                "Critical points of f(x)=e^x-3x are:",
                "x=ln(3)", "x=0", "x=1", "x=-1",
                "A", 3, 2053, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of concave up for f(x)=x^3-12x^2+36x-5.",
                "x>2", "x<2", "x>0", "x<0",
                "A", 3, 2054, "medium"));

        unit3Questions.add(new Question(
                "Find local minimum of f(x)=2x^3-12x^2+18x.",
                "x=1", "x=2", "x=3", "x=0",
                "B", 3, 2055, "medium"));

        unit3Questions.add(new Question(
                "Related rates: A cone fills at 3 m^3/min. Find dh/dt when h=2 m, radius 1 m.",
                "1.5 m/min", "3 m/min", "2 m/min", "0.5 m/min",
                "D", 3, 2056, "hard"));

        unit3Questions.add(new Question(
                "Determine absolute maximum of f(x)=x^3-6x^2+9x+1 on [0,3].",
                "f(0)=1", "f(1)=4", "f(2)=1", "f(3)=1",
                "B", 3, 2057, "hard"));

        unit3Questions.add(new Question(
                "Find inflection points of f(x)=x^4-4x^3+6x^2.",
                "x=1, x=2", "x=0, x=3", "x=1 only", "x=2 only",
                "A", 3, 2058, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of decrease for f(x)=x^4-8x^2+16.",
                "-2<x<2", "x<-2 or x>2", "x>0", "x<0",
                "A", 3, 2059, "medium"));

        unit3Questions.add(new Question(
                "Find the critical points of f(x)=x^3-9x^2+24x+5.",
                "x=0, x=4", "x=2, x=4", "x=1, x=3", "x=2 only",
                "B", 3, 2060, "medium"));

        unit3Questions.add(new Question(
                "Determine where f(x)=x^3-3x^2+6 is concave up.",
                "x>1", "x<1", "x>0", "x<0",
                "A", 3, 2061, "medium"));

        unit3Questions.add(new Question(
                "Use the first derivative test for f(x)=x^3-6x^2+8x to classify x=2.",
                "Local max", "Local min", "Neither", "Saddle point",
                "B", 3, 2062, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) for f(x)=x^4-8x^3+12x^2 to determine concavity.",
                "12x^2-48x+24", "4x^3-24x^2+24", "12x^2-24x+12", "24x^2-48x+24",
                "A", 3, 2063, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Maximize f(x)=-x^2+10x-15 on [0,10].",
                "x=5", "x=0", "x=10", "x=2",
                "A", 3, 2064, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of decrease for f(x)=x^3-12x^2+36x-5.",
                "x<1 or x>3", "1<x<3", "x>0", "x<0",
                "B", 3, 2065, "medium"));

        unit3Questions.add(new Question(
                "Find the local maxima of f(x)=3x^3-18x^2+24x+1.",
                "x=1", "x=2", "x=3", "x=0",
                "A", 3, 2066, "medium"));

        unit3Questions.add(new Question(
                "Find inflection points of f(x)=x^3-6x^2+9x.",
                "x=1, x=3", "x=0, x=2", "x=1 only", "x=2 only",
                "B", 3, 2067, "medium"));

        unit3Questions.add(new Question(
                "Determine absolute maximum of f(x)=x^3-9x^2+24x+5 on [0,5].",
                "f(0)=5", "f(2)=13", "f(4)=5", "f(5)=10",
                "B", 3, 2068, "hard"));

        unit3Questions.add(new Question(
                "Find critical points for f(x)=ln(x)-x^2+4.",
                "x=1/√2", "x=√2", "x=0", "x=2",
                "A", 3, 2069, "hard"));

        unit3Questions.add(new Question(
                "Determine increasing intervals for f(x)=x^4-4x^3+6x^2-1.",
                "x<1 or x>3", "1<x<3", "x>0", "x<0",
                "B", 3, 2070, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) of f(x)=2x^3-12x^2+18x to determine concavity.",
                "12x-24", "6x-12", "12x-12", "24x-24",
                "A", 3, 2071, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Minimize f(x)=x^2-8x+15 on [0,6].",
                "x=4", "x=0", "x=6", "x=2",
                "A", 3, 2072, "medium"));

        unit3Questions.add(new Question(
                "Find absolute minimum of f(x)=x^3-6x^2+9x+1 on [0,3].",
                "f(0)=1", "f(1)=3", "f(2)=1", "f(3)=1",
                "C", 3, 2073, "hard"));

        unit3Questions.add(new Question(
                "Related rates: A ladder 13 ft slides down wall at 5 ft/s. Find dx/dt when base is 5 ft from wall.",
                "12/5 ft/s", "5/12 ft/s", "1 ft/s", "13/5 ft/s",
                "B", 3, 2074, "hard"));

        unit3Questions.add(new Question(
                "Determine concavity of f(x)=x^3-9x^2+24x-5.",
                "Concave up x>3, concave down x<3", "Concave up x<3", "Concave down x>3", "Concave up all x",
                "A", 3, 2075, "medium"));

        unit3Questions.add(new Question(
                "Find critical points of f(x)=x^4-4x^3+3x^2.",
                "x=0, x=1, x=3", "x=1, x=2", "x=0 only", "x=2 only",
                "A", 3, 2076, "medium"));

        unit3Questions.add(new Question(
                "Use first derivative test for f(x)=x^3-3x^2+2 to classify x=0.",
                "Local max", "Local min", "Neither", "Saddle point",
                "C", 3, 2077, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Maximize f(x)=-3x^2+18x-20 on [0,6].",
                "x=3", "x=0", "x=6", "x=2",
                "A", 3, 2078, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of decrease for f(x)=x^3-12x^2+30x-5.",
                "x<1 or x>5", "1<x<5", "x>0", "x<0",
                "B", 3, 2079, "medium"));


        unit3Questions.add(new Question(
                "Find local maxima of f(x)=x^3-6x^2+9x-1.",
                "x=1", "x=2", "x=3", "x=0",
                "A", 3, 2080, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of concave down for f(x)=x^3-9x^2+15x.",
                "x<1", "x>1", "x<0", "x>0",
                "A", 3, 2081, "medium"));

        unit3Questions.add(new Question(
                "Find critical points of f(x)=x^3-12x^2+36x+2.",
                "x=1, x=3", "x=0, x=2", "x=2, x=4", "x=0, x=3",
                "B", 3, 2082, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) for f(x)=x^4-6x^3+9x^2 to determine concavity.",
                "12x^2-36x+18", "4x^3-18x^2+18", "12x^2-18x+9", "24x^2-36x+18",
                "A", 3, 2083, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Maximize f(x)=-2x^2+12x-10 on [0,6].",
                "x=3", "x=0", "x=6", "x=2",
                "A", 3, 2084, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of decrease for f(x)=x^3-9x^2+18x-5.",
                "x<1 or x>3", "1<x<3", "x>0", "x<0",
                "B", 3, 2085, "medium"));

        unit3Questions.add(new Question(
                "Find local minima of f(x)=2x^3-12x^2+18x.",
                "x=1", "x=2", "x=3", "x=0",
                "B", 3, 2086, "medium"));

        unit3Questions.add(new Question(
                "Find inflection points of f(x)=x^3-3x^2+3x.",
                "x=1", "x=0", "x=2", "x=-1",
                "A", 3, 2087, "medium"));

        unit3Questions.add(new Question(
                "Determine absolute maximum of f(x)=x^3-6x^2+9x+2 on [0,3].",
                "f(0)=2", "f(1)=4", "f(2)=2", "f(3)=2",
                "B", 3, 2088, "hard"));

        unit3Questions.add(new Question(
                "Find critical points for f(x)=e^x-x^2.",
                "x=0, x=1", "x=1 only", "x=-1, x=1", "x=-1 only",
                "A", 3, 2089, "hard"));

        unit3Questions.add(new Question(
                "Determine increasing intervals for f(x)=x^4-8x^3+18x^2-5.",
                "x<1 or x>3", "1<x<3", "x>0", "x<0",
                "B", 3, 2090, "medium"));

        unit3Questions.add(new Question(
                "Find f''(x) of f(x)=3x^3-12x^2+15x to analyze concavity.",
                "18x-24", "6x-12", "18x-12", "12x-12",
                "A", 3, 2091, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Minimize f(x)=x^2-10x+20 on [0,10].",
                "x=5", "x=0", "x=10", "x=4",
                "A", 3, 2092, "medium"));

        unit3Questions.add(new Question(
                "Find absolute minimum of f(x)=x^3-9x^2+24x+1 on [0,4].",
                "f(0)=1", "f(1)=16", "f(2)=8", "f(4)=1",
                "D", 3, 2093, "hard"));

        unit3Questions.add(new Question(
                "Related rates: A car moves toward a point at 60 km/h. Distance from observer changes. Find rate of change of distance when 50 km away.",
                "36 km/h", "50 km/h", "60 km/h", "30 km/h",
                "A", 3, 2094, "hard"));

        unit3Questions.add(new Question(
                "Determine concavity of f(x)=x^3-12x^2+36x-10.",
                "Concave up x>2, concave down x<2", "Concave up x<2", "Concave down x>2", "Concave up all x",
                "A", 3, 2095, "medium"));

        unit3Questions.add(new Question(
                "Find critical points of f(x)=x^4-6x^3+8x^2.",
                "x=0, x=1, x=2", "x=1, x=2", "x=0 only", "x=2 only",
                "A", 3, 2096, "medium"));

        unit3Questions.add(new Question(
                "Use first derivative test for f(x)=x^3-4x^2+3x to classify x=0.",
                "Local max", "Local min", "Neither", "Saddle point",
                "C", 3, 2097, "medium"));

        unit3Questions.add(new Question(
                "Optimization: Maximize f(x)=-x^2+8x-10 on [0,6].",
                "x=4", "x=0", "x=6", "x=2",
                "A", 3, 2098, "medium"));

        unit3Questions.add(new Question(
                "Determine intervals of decrease for f(x)=x^3-9x^2+20x-4.",
                "x<1 or x>5", "1<x<5", "x>0", "x<0",
                "B", 3, 2099, "medium"));


        numUnit3Questions = unit3Questions.size();
        System.out.printf("There are %d questions in unit 3%n", numUnit3Questions);
    }

}
