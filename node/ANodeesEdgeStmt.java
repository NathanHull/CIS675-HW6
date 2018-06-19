/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANodeesEdgeStmt extends PEdgeStmt
{
    private PNodeId _nodeId_;
    private PEdgerhs _edgerhs_;
    private PAttrList _attrList_;

    public ANodeesEdgeStmt()
    {
        // Constructor
    }

    public ANodeesEdgeStmt(
        @SuppressWarnings("hiding") PNodeId _nodeId_,
        @SuppressWarnings("hiding") PEdgerhs _edgerhs_,
        @SuppressWarnings("hiding") PAttrList _attrList_)
    {
        // Constructor
        setNodeId(_nodeId_);

        setEdgerhs(_edgerhs_);

        setAttrList(_attrList_);

    }

    @Override
    public Object clone()
    {
        return new ANodeesEdgeStmt(
            cloneNode(this._nodeId_),
            cloneNode(this._edgerhs_),
            cloneNode(this._attrList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANodeesEdgeStmt(this);
    }

    public PNodeId getNodeId()
    {
        return this._nodeId_;
    }

    public void setNodeId(PNodeId node)
    {
        if(this._nodeId_ != null)
        {
            this._nodeId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nodeId_ = node;
    }

    public PEdgerhs getEdgerhs()
    {
        return this._edgerhs_;
    }

    public void setEdgerhs(PEdgerhs node)
    {
        if(this._edgerhs_ != null)
        {
            this._edgerhs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._edgerhs_ = node;
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
            + toString(this._nodeId_)
            + toString(this._edgerhs_)
            + toString(this._attrList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nodeId_ == child)
        {
            this._nodeId_ = null;
            return;
        }

        if(this._edgerhs_ == child)
        {
            this._edgerhs_ = null;
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
        if(this._nodeId_ == oldChild)
        {
            setNodeId((PNodeId) newChild);
            return;
        }

        if(this._edgerhs_ == oldChild)
        {
            setEdgerhs((PEdgerhs) newChild);
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
