package com.uepb;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

public class LinguagemToPCodeVisitor extends LinguagemBaseVisitor<String> {

    @Override
    public String visitVariableDeclaration(LinguagemParser.VariableDeclarationContext ctx) {
        String id = ctx.ID().getText();
        if (ctx.expr() != null) {
            String value = visit(ctx.expr());
            return "ldc " + value + "\nsto " + id;
        }
        return "";
    }

    @Override
    public String visitAssignment(LinguagemParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.expr());
        return value + "\nsto " + id;
    }

    @Override
    public String visitPrintStatement(LinguagemParser.PrintStatementContext ctx) {
        String value = visit(ctx.expr());
        return value + "\nwri";
    }

    @Override
    public String visitExpr(LinguagemParser.ExprContext ctx) {
        // Exemplo básico: Implementação para operações simples
        if (ctx.op != null) {
            String left = visit(ctx.expr(0));
            String right = visit(ctx.expr(1));
            switch (ctx.op.getType()) {
                case LinguagemParser.ADD: return left + "\n" + right + "\nadd";
                case LinguagemParser.SUB: return left + "\n" + right + "\nsub";
                case LinguagemParser.MUL: return left + "\n" + right + "\nmul";
                case LinguagemParser.DIV: return left + "\n" + right + "\ndiv";
            }
        }
        return ctx.NUMBER() != null ? "ldc " + ctx.NUMBER().getText() : "lod " + ctx.ID().getText();
    }

        @Override
    public String visitIfStatement(LinguagemParser.IfStatementContext ctx) {
        StringBuilder pCode = new StringBuilder();
        
        // Avalia a condição
        pCode.append(visit(ctx.condition()));
        
        // Ponto de salto condicional
        String elseLabel = generateNewLabel();
        pCode.append("jf ").append(elseLabel).append("\n");
        
        // Código para o bloco `if`
        pCode.append(visit(ctx.statement(0))); // assumindo que statement(0) é o bloco `if`
        
        // Final do bloco `if`
        String endLabel = generateNewLabel();
        pCode.append("jmp ").append(endLabel).append("\n");
        
        // Bloco `else`, se houver
        pCode.append(elseLabel).append(":\n");
        if (ctx.statement(1) != null) { // Verifica se existe um bloco `else`
            pCode.append(visit(ctx.statement(1)));
        }
        
        // Fim do `if-else`
        pCode.append(endLabel).append(":\n");
        
        return pCode.toString();
    }

    @Override
    public String visitWhileStatement(LinguagemParser.WhileStatementContext ctx) {
        StringBuilder pCode = new StringBuilder();
        
        // Rótulo para o início do loop
        String startLabel = generateNewLabel();
        pCode.append(startLabel).append(":\n");
        
        // Condição do `while`
        pCode.append(visit(ctx.condition()));
        
        // Se a condição for falsa, pula para o final do loop
        String endLabel = generateNewLabel();
        pCode.append("jf ").append(endLabel).append("\n");
        
        // Corpo do `while`
        pCode.append(visit(ctx.statement()));
        
        // Volta ao início do loop para verificar a condição novamente
        pCode.append("jmp ").append(startLabel).append("\n");
        
        // Fim do `while`
        pCode.append(endLabel).append(":\n");
        
        return pCode.toString();
    }

    private int labelCounter = 0;

    private String generateNewLabel() {
        return "L" + (labelCounter++);
    }

}
