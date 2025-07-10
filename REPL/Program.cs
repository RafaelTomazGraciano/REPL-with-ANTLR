using System;
using Antlr4.Runtime;

[assembly: System.CLSCompliant(false)]

public class Program{
    public static void Main(){
        Console.ForegroundColor = ConsoleColor.Cyan;
        Console.WriteLine("========== REPL =========");
        Console.WriteLine("Type 'exit' to quit");
        Console.WriteLine("=========================");

        var visitor = new EvalVisitor();

        while (true){
            try{
                Console.ForegroundColor = ConsoleColor.White;
                Console.Write("\n>>> ");
                Console.ForegroundColor = ConsoleColor.Green;
                string? input = Console.ReadLine();

                if (input?.Trim().ToLower().Contains("exit") == true){
                    Console.ForegroundColor = ConsoleColor.Cyan;
                    Console.WriteLine("Exiting");
                    break;
                }

                if (string.IsNullOrWhiteSpace(input)){
                    continue;
                }
                var inputStream = new AntlrInputStream(input);
                var lexer = new ExprLexer(inputStream);
                var tokenStream = new CommonTokenStream(lexer);
                var parser = new ExprParser(tokenStream);

                var errorListener = new ErrorListener();
                lexer.RemoveErrorListeners();
                parser.RemoveErrorListeners();
                lexer.AddErrorListener(errorListener);
                parser.AddErrorListener(errorListener);

                var tree = parser.prog();

                if(errorListener.Errors.Count > 0){
                    Console.ForegroundColor = ConsoleColor.Red;
                    foreach (var error in errorListener.Errors){
                        Console.WriteLine(error);
                    }
                    continue;
                }

                
                int result = visitor.Visit(tree);
                
                if (!visitor.LastWasAssignment){
                    Console.ForegroundColor = ConsoleColor.Yellow;
                    Console.WriteLine(result);
                }
            }
            catch (Exception e){
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine(e.Message);
            }
            finally{
                Console.ResetColor();
            }
        }
    }
}
