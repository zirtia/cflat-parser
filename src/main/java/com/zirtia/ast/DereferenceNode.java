package com.zirtia.ast;
import com.zirtia.type.*;

public class DereferenceNode extends LHSNode {
    private ExprNode expr;

    public DereferenceNode(ExprNode expr) {
        this.expr = expr;
    }

    protected Type origType() {
        return expr.type().baseType();
    }

    public ExprNode expr() {
        return expr;
    }

    public void setExpr(ExprNode expr) {
        this.expr = expr;
    }

    public Location location() {
        return expr.location();
    }



    public <S,E> E accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
