package com.uepb;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class LinguagemToPCodeRunner {
    public static void main(String[] args) throws Exception {
        String inputFile = "input.txt";
        InputStream is = new FileInputStream(inputFile);
        
        // Cria o lexer e o parser
        CharStream input = CharStreams.fromStream(is);
        LinguagemLexer lexer = new LinguagemLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LinguagemParser parser = new LinguagemParser(tokens);
        
        // Parseia o programa e cria a árvore
        ParseTree tree = parser.program();
        
        // Cria o visitor para traduzir para P-Code
        LinguagemToPCodeVisitor visitor = new LinguagemToPCodeVisitor();
        String pCode = visitor.visit(tree);
        
        // Exibe o P-Code gerado
        System.out.println("P-Code gerado:");
        System.out.println(pCode);
    }
}

