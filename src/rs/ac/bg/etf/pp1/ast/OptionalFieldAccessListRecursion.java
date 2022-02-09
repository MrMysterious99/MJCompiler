// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class OptionalFieldAccessListRecursion extends OptionalFieldAccessList {

    private OptionalFieldAccessList OptionalFieldAccessList;
    private OptionalFieldAccess OptionalFieldAccess;

    public OptionalFieldAccessListRecursion (OptionalFieldAccessList OptionalFieldAccessList, OptionalFieldAccess OptionalFieldAccess) {
        this.OptionalFieldAccessList=OptionalFieldAccessList;
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.setParent(this);
        this.OptionalFieldAccess=OptionalFieldAccess;
        if(OptionalFieldAccess!=null) OptionalFieldAccess.setParent(this);
    }

    public OptionalFieldAccessList getOptionalFieldAccessList() {
        return OptionalFieldAccessList;
    }

    public void setOptionalFieldAccessList(OptionalFieldAccessList OptionalFieldAccessList) {
        this.OptionalFieldAccessList=OptionalFieldAccessList;
    }

    public OptionalFieldAccess getOptionalFieldAccess() {
        return OptionalFieldAccess;
    }

    public void setOptionalFieldAccess(OptionalFieldAccess OptionalFieldAccess) {
        this.OptionalFieldAccess=OptionalFieldAccess;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.accept(visitor);
        if(OptionalFieldAccess!=null) OptionalFieldAccess.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.traverseTopDown(visitor);
        if(OptionalFieldAccess!=null) OptionalFieldAccess.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalFieldAccessList!=null) OptionalFieldAccessList.traverseBottomUp(visitor);
        if(OptionalFieldAccess!=null) OptionalFieldAccess.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OptionalFieldAccessListRecursion(\n");

        if(OptionalFieldAccessList!=null)
            buffer.append(OptionalFieldAccessList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalFieldAccess!=null)
            buffer.append(OptionalFieldAccess.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionalFieldAccessListRecursion]");
        return buffer.toString();
    }
}
