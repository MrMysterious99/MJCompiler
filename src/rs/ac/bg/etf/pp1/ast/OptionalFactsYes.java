// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class OptionalFactsYes extends OptionalFacts {

    private OptionalFacts OptionalFacts;
    private OptionalFact OptionalFact;

    public OptionalFactsYes (OptionalFacts OptionalFacts, OptionalFact OptionalFact) {
        this.OptionalFacts=OptionalFacts;
        if(OptionalFacts!=null) OptionalFacts.setParent(this);
        this.OptionalFact=OptionalFact;
        if(OptionalFact!=null) OptionalFact.setParent(this);
    }

    public OptionalFacts getOptionalFacts() {
        return OptionalFacts;
    }

    public void setOptionalFacts(OptionalFacts OptionalFacts) {
        this.OptionalFacts=OptionalFacts;
    }

    public OptionalFact getOptionalFact() {
        return OptionalFact;
    }

    public void setOptionalFact(OptionalFact OptionalFact) {
        this.OptionalFact=OptionalFact;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptionalFacts!=null) OptionalFacts.accept(visitor);
        if(OptionalFact!=null) OptionalFact.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalFacts!=null) OptionalFacts.traverseTopDown(visitor);
        if(OptionalFact!=null) OptionalFact.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalFacts!=null) OptionalFacts.traverseBottomUp(visitor);
        if(OptionalFact!=null) OptionalFact.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OptionalFactsYes(\n");

        if(OptionalFacts!=null)
            buffer.append(OptionalFacts.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalFact!=null)
            buffer.append(OptionalFact.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionalFactsYes]");
        return buffer.toString();
    }
}
