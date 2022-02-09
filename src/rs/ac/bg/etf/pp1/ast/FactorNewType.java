// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class FactorNewType extends Factor {

    private Type Type;
    private OptionalFactorExpr OptionalFactorExpr;

    public FactorNewType (Type Type, OptionalFactorExpr OptionalFactorExpr) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.OptionalFactorExpr=OptionalFactorExpr;
        if(OptionalFactorExpr!=null) OptionalFactorExpr.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public OptionalFactorExpr getOptionalFactorExpr() {
        return OptionalFactorExpr;
    }

    public void setOptionalFactorExpr(OptionalFactorExpr OptionalFactorExpr) {
        this.OptionalFactorExpr=OptionalFactorExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(OptionalFactorExpr!=null) OptionalFactorExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(OptionalFactorExpr!=null) OptionalFactorExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(OptionalFactorExpr!=null) OptionalFactorExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorNewType(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalFactorExpr!=null)
            buffer.append(OptionalFactorExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorNewType]");
        return buffer.toString();
    }
}
