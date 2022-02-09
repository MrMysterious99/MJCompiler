// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class Designator implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String I1;
    private OptionalFieldAccessList OptionalFieldAccessList;

    public Designator (String I1, OptionalFieldAccessList OptionalFieldAccessList) {
        this.I1=I1;
        this.OptionalFieldAccessList=OptionalFieldAccessList;
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public OptionalFieldAccessList getOptionalFieldAccessList() {
        return OptionalFieldAccessList;
    }

    public void setOptionalFieldAccessList(OptionalFieldAccessList OptionalFieldAccessList) {
        this.OptionalFieldAccessList=OptionalFieldAccessList;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Designator(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(OptionalFieldAccessList!=null)
            buffer.append(OptionalFieldAccessList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Designator]");
        return buffer.toString();
    }
}
