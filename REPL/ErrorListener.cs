using Antlr4.Runtime;

public class ErrorListener : BaseErrorListener, IAntlrErrorListener<int>{
    public List<string> Errors { get; } = new();

    // Para o lexer
    public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol,
                            int line, int charPositionInLine, string msg, RecognitionException e){
        Errors.Add($"Lexical error on position {charPositionInLine+1}: {msg}.");
    }

    // Para o parser
    public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol,
                                     int line, int charPositionInLine, string msg, RecognitionException e){
        Errors.Add($"Syntax error on position {charPositionInLine+1}: unexpected token '{offendingSymbol.Text}.'");
    }
}