/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAtstmtStmt extends PStmt
{
    private PAttrStmt _attrStmt_;

    public AAtstmtStmt()
    {
        // Constructor
    }

    public AAtstmtStmt(
        @SuppressWarnings("hiding") PAttrStmt _attrStmt_)
    {
        // Constructor
        setAttrStmt(_attrStmt_);

    }

    @Override
    public Object clone()
    {
        return new AAtstmtStmt(
            cloneNode(this._attrStmt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtstmtStmt(this);
    }

    public PAttrStmt getAttrStmt()
    {
        return this._attrStmt_;
    }

    public void setAttrStmt(PAttrStmt node)
    {
        if(this._attrStmt_ != null)
        {
            this._attrStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._attrStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._attrStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._attrStmt_ == child)
        {
            this._attrStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._attrStmt_ == oldChild)
        {
            setAttrStmt((PAttrStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
