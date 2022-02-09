// generated with ast extension for cup
// version 0.8
// 10/1/2022 0:30:6


package rs.ac.bg.etf.pp1.ast;

public class AddopTermArrayRecursion extends AddopTermArray {

    private AddopTermArray AddopTermArray;
    private AddopTerm AddopTerm;

    public AddopTermArrayRecursion (AddopTermArray AddopTermArray, AddopTerm AddopTerm) {
        this.AddopTermArray=AddopTermArray;
        if(AddopTermArray!=null) AddopTermArray.setParent(this);
        this.AddopTerm=AddopTerm;
        if(AddopTerm!=null) AddopTerm.setParent(this);
    }

    public AddopTermArray getAddopTermArray() {
        return AddopTermArray;
    }

    public void setAddopTermArray(AddopTermArray AddopTermArray) {
        this.AddopTermArray=AddopTermArray;
    }

    public AddopTerm getAddopTerm() {
        return AddopTerm;
    }

    public void setAddopTerm(AddopTerm AddopTerm) {
        this.AddopTerm=AddopTerm;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AddopTermArray!=null) AddopTermArray.accept(visitor);
        if(AddopTerm!=null) AddopTerm.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AddopTermArray!=null) AddopTermArray.traverseTopDown(visitor);
        if(AddopTerm!=null) AddopTerm.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AddopTermArray!=null) AddopTermArray.traverseBottomUp(visitor);
        if(AddopTerm!=null) AddopTerm.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AddopTermArrayRecursion(\n");

        if(AddopTermArray!=null)
            buffer.append(AddopTermArray.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddopTerm!=null)
            buffer.append(AddopTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AddopTermArrayRecursion]");
        return buffer.toString();
    }
}
