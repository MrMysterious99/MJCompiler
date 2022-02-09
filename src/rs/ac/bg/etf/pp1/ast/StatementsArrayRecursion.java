// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class StatementsArrayRecursion extends StatementsArray {

    private StatementsArray StatementsArray;
    private Statement Statement;

    public StatementsArrayRecursion (StatementsArray StatementsArray, Statement Statement) {
        this.StatementsArray=StatementsArray;
        if(StatementsArray!=null) StatementsArray.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public StatementsArray getStatementsArray() {
        return StatementsArray;
    }

    public void setStatementsArray(StatementsArray StatementsArray) {
        this.StatementsArray=StatementsArray;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(StatementsArray!=null) StatementsArray.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(StatementsArray!=null) StatementsArray.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(StatementsArray!=null) StatementsArray.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementsArrayRecursion(\n");

        if(StatementsArray!=null)
            buffer.append(StatementsArray.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementsArrayRecursion]");
        return buffer.toString();
    }
}
