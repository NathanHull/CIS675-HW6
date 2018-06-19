/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AGraphasAttrStmt extends PAttrStmt
{
    private TGraphk _graphk_;
    private PAttrList _attrList_;

    public AGraphasAttrStmt()
    {
        // Constructor
    }

    public AGraphasAttrStmt(
        @SuppressWarnings("hiding") TGraphk _graphk_,
        @SuppressWarnings("hiding") PAttrList _attrList_)
    {
        // Constructor
        setGraphk(_graphk_);

        setAttrList(_attrList_);

    }

    @Override
    public Object clone()
    {
        return new AGraphasAttrStmt(
            cloneNode(this._graphk_),
            cloneNode(this._attrList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGraphasAttrStmt(this);
    }

    public TGraphk getGraphk()
    {
        return this._graphk_;
    }

    public void setGraphk(TGraphk node)
    {
        if(this._graphk_ != null)
        {
            this._graphk_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._graphk_ = node;
    }

    public PAttrList getAttrList()
    {
        return this._attrList_;
    }

    public void setAttrList(PAttrList node)
    {
        if(this._attrList_ != null)
        {
            this._attrList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._attrList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._graphk_)
            + toString(this._attrList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._graphk_ == child)
        {
            this._graphk_ = null;
            return;
        }

        if(this._attrList_ == child)
        {
            this._attrList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._graphk_ == oldChild)
        {
            setGraphk((TGraphk) newChild);
            return;
        }

        if(this._attrList_ == oldChild)
        {
            setAttrList((PAttrList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
