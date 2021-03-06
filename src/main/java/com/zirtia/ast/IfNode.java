package com.zirtia.ast;

public class IfNode extends StmtNode {
    protected ExprNode cond;
    protected StmtNode thenBody;
    protected StmtNode elseBody;

    public IfNode(Location loc, ExprNode c, StmtNode t, StmtNode e) {
        super(loc);
        this.cond = c;
        this.thenBody = t;
        this.elseBody = e;
    }

    public IfNode(Location loc, ExprNode c, StmtNode t) {
        super(loc);
        this.cond = c;
        this.thenBody = t;
    }

    public ExprNode cond() {
        return cond;
    }

    public StmtNode thenBody() {
        return thenBody;
    }

    public StmtNode elseBody() {
        return elseBody;
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
