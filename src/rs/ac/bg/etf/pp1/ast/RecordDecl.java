// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class RecordDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String I1;
    private RecordVarDecl RecordVarDecl;

    public RecordDecl (String I1, RecordVarDecl RecordVarDecl) {
        this.I1=I1;
        this.RecordVarDecl=RecordVarDecl;
        if(RecordVarDecl!=null) RecordVarDecl.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public RecordVarDecl getRecordVarDecl() {
        return RecordVarDecl;
    }

    public void setRecordVarDecl(RecordVarDecl RecordVarDecl) {
        this.RecordVarDecl=RecordVarDecl;
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
        if(RecordVarDecl!=null) RecordVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(RecordVarDecl!=null) RecordVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(RecordVarDecl!=null) RecordVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("RecordDecl(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(RecordVarDecl!=null)
            buffer.append(RecordVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [RecordDecl]");
        return buffer.toString();
    }
}
