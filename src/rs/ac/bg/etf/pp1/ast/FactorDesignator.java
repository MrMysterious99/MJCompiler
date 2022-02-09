// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class FactorDesignator extends Factor {

    private Designator Designator;
    private OptionalFactorActPars OptionalFactorActPars;

    public FactorDesignator (Designator Designator, OptionalFactorActPars OptionalFactorActPars) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.OptionalFactorActPars=OptionalFactorActPars;
        if(OptionalFactorActPars!=null) OptionalFactorActPars.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public OptionalFactorActPars getOptionalFactorActPars() {
        return OptionalFactorActPars;
    }

    public void setOptionalFactorActPars(OptionalFactorActPars OptionalFactorActPars) {
        this.OptionalFactorActPars=OptionalFactorActPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(OptionalFactorActPars!=null) OptionalFactorActPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(OptionalFactorActPars!=null) OptionalFactorActPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(OptionalFactorActPars!=null) OptionalFactorActPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorDesignator(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalFactorActPars!=null)
            buffer.append(OptionalFactorActPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorDesignator]");
        return buffer.toString();
    }
}
