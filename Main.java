import org.antlr.v4.runtime.*;

public class Main {
    private static boolean errored = false;

    static class LexicalErrorListener extends BaseErrorListener {
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            errored = true;
            System.err.println("[LexicalError] line " + line + ":" + charPositionInLine + " " + msg);
        }
    }

    static class SyntacticErrorListener extends BaseErrorListener {
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            errored = true;
            System.err.println("[SyntacticError] line " + line + ":" + charPositionInLine + " " + msg);
        }
    }

    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        tigerLexer lexer = new tigerLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexicalErrorListener());
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        tigerParser parser = new tigerParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new SyntacticErrorListener());
        parser.tigerProgram();
        if (!errored && parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("successful");
        }
    }
}
