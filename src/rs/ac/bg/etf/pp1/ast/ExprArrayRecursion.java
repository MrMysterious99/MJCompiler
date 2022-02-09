// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class ExprArrayRecursion extends ExprArray {

    private ExprArray ExprArray;
    private CommaExpr CommaExpr;

    public ExprArrayRecursion (ExprArray ExprArray, CommaExpr CommaExpr) {
        this.ExprArray=ExprArray;
        if(ExprArray!=null) ExprArray.setParent(this);
        this.CommaExpr=CommaExpr;
        if(CommaExpr!=null) CommaExpr.setParent(this);
    }

    public ExprArray getExprArray() {
        return ExprArray;
    }

    public void setExprArray(ExprArray ExprArray) {
        this.ExprArray=ExprArray;
    }

    public CommaExpr getCommaExpr() {
        return CommaExpr;
    }

    public void setCommaExpr(CommaExpr CommaExpr) {
        this.CommaExpr=CommaExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprArray!=null) ExprArray.accept(visitor);
        if(CommaExpr!=null) CommaExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprArray!=null) ExprArray.traverseTopDown(visitor);
        if(CommaExpr!=null) CommaExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprArray!=null) ExprArray.traverseBottomUp(visitor);
        if(CommaExpr!=null) CommaExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprArrayRecursion(\n");

        if(ExprArray!=null)
            buffer.append(ExprArray.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CommaExpr!=null)
            buffer.append(CommaExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprArrayRecursion]");
        return buffer.toString();
    }
}
