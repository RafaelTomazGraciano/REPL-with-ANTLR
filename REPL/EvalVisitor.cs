using System;
using System.Collections.Generic;

public class EvalVisitor : ExprBaseVisitor<int>{
    private readonly Dictionary<string, int> memory = new();
    public bool LastWasAssignment { get; private set; } = false;

    public override int VisitProg(ExprParser.ProgContext context){
        if (context.VAR() != null){
            string varName = context.VAR().GetText();
            int value = Visit(context.expr());
            memory[varName] = value;
            LastWasAssignment = true;
            return value;
        }
        LastWasAssignment = false;
        return Visit(context.expr());
    }

    public override int VisitExpr(ExprParser.ExprContext context){
        int left = Visit(context.term());
        if (context.ChildCount == 3){
            int right = Visit(context.expr());
            string op = context.GetChild(1).GetText();
            return op == "+" ? left + right : left - right;
        }
        return left;
    }

    public override int VisitTerm(ExprParser.TermContext context){
        int left = Visit(context.fact());
        if (context.ChildCount == 3){
            int right = Visit(context.term());
            string op = context.GetChild(1).GetText();
            return op == "*" ? left * right : left / right;
        }
        return left;
    }

    public override int VisitFact(ExprParser.FactContext context){
        if (context.INT() != null)
            return int.Parse(context.INT().GetText());
        if (context.VAR() != null){
            string varName = context.VAR().GetText();
            if (!memory.ContainsKey(varName))
                throw new Exception($"Variable '{varName}' is not defined.");
            return memory[varName];
        }
        return Visit(context.expr());
    }
}