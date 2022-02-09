// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class MulopFactorArrayRecursion extends MulopFactorArray {

    private MulopFactorArray MulopFactorArray;
    private MulopFactor MulopFactor;

    public MulopFactorArrayRecursion (MulopFactorArray MulopFactorArray, MulopFactor MulopFactor) {
        this.MulopFactorArray=MulopFactorArray;
        if(MulopFactorArray!=null) MulopFactorArray.setParent(this);
        this.MulopFactor=MulopFactor;
        if(MulopFactor!=null) MulopFactor.setParent(this);
    }

    public MulopFactorArray getMulopFactorArray() {
        return MulopFactorArray;
    }

    public void setMulopFactorArray(MulopFactorArray MulopFactorArray) {
        this.MulopFactorArray=MulopFactorArray;
    }

    public MulopFactor getMulopFactor() {
        return MulopFactor;
    }

    public void setMulopFactor(MulopFactor MulopFactor) {
        this.MulopFactor=MulopFactor;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MulopFactorArray!=null) MulopFactorArray.accept(visitor);
        if(MulopFactor!=null) MulopFactor.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MulopFactorArray!=null) MulopFactorArray.traverseTopDown(visitor);
        if(MulopFactor!=null) MulopFactor.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MulopFactorArray!=null) MulopFactorArray.traverseBottomUp(visitor);
        if(MulopFactor!=null) MulopFactor.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MulopFactorArrayRecursion(\n");

        if(MulopFactorArray!=null)
            buffer.append(MulopFactorArray.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MulopFactor!=null)
            buffer.append(MulopFactor.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MulopFactorArrayRecursion]");
        return buffer.toString();
    }
}
