// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class VarListRecursion extends VarList {

    private VarListMultiple VarListMultiple;
    private VarDeclaration VarDeclaration;

    public VarListRecursion (VarListMultiple VarListMultiple, VarDeclaration VarDeclaration) {
        this.VarListMultiple=VarListMultiple;
        if(VarListMultiple!=null) VarListMultiple.setParent(this);
        this.VarDeclaration=VarDeclaration;
        if(VarDeclaration!=null) VarDeclaration.setParent(this);
    }

    public VarListMultiple getVarListMultiple() {
        return VarListMultiple;
    }

    public void setVarListMultiple(VarListMultiple VarListMultiple) {
        this.VarListMultiple=VarListMultiple;
    }

    public VarDeclaration getVarDeclaration() {
        return VarDeclaration;
    }

    public void setVarDeclaration(VarDeclaration VarDeclaration) {
        this.VarDeclaration=VarDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarListMultiple!=null) VarListMultiple.accept(visitor);
        if(VarDeclaration!=null) VarDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarListMultiple!=null) VarListMultiple.traverseTopDown(visitor);
        if(VarDeclaration!=null) VarDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarListMultiple!=null) VarListMultiple.traverseBottomUp(visitor);
        if(VarDeclaration!=null) VarDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarListRecursion(\n");

        if(VarListMultiple!=null)
            buffer.append(VarListMultiple.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclaration!=null)
            buffer.append(VarDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarListRecursion]");
        return buffer.toString();
    }
}
