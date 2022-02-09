// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class OptionalTermsYes extends OptionalTerms {

    private OptionalTerms OptionalTerms;
    private OptionalTerm OptionalTerm;

    public OptionalTermsYes (OptionalTerms OptionalTerms, OptionalTerm OptionalTerm) {
        this.OptionalTerms=OptionalTerms;
        if(OptionalTerms!=null) OptionalTerms.setParent(this);
        this.OptionalTerm=OptionalTerm;
        if(OptionalTerm!=null) OptionalTerm.setParent(this);
    }

    public OptionalTerms getOptionalTerms() {
        return OptionalTerms;
    }

    public void setOptionalTerms(OptionalTerms OptionalTerms) {
        this.OptionalTerms=OptionalTerms;
    }

    public OptionalTerm getOptionalTerm() {
        return OptionalTerm;
    }

    public void setOptionalTerm(OptionalTerm OptionalTerm) {
        this.OptionalTerm=OptionalTerm;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptionalTerms!=null) OptionalTerms.accept(visitor);
        if(OptionalTerm!=null) OptionalTerm.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalTerms!=null) OptionalTerms.traverseTopDown(visitor);
        if(OptionalTerm!=null) OptionalTerm.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalTerms!=null) OptionalTerms.traverseBottomUp(visitor);
        if(OptionalTerm!=null) OptionalTerm.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OptionalTermsYes(\n");

        if(OptionalTerms!=null)
            buffer.append(OptionalTerms.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalTerm!=null)
            buffer.append(OptionalTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionalTermsYes]");
        return buffer.toString();
    }
}
