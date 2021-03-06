/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ASuberEdgerhs extends PEdgerhs
{
    private TEdgeop _edgeop_;
    private PSubgraph _subgraph_;
    private PEdgerhs _edgerhs_;

    public ASuberEdgerhs()
    {
        // Constructor
    }

    public ASuberEdgerhs(
        @SuppressWarnings("hiding") TEdgeop _edgeop_,
        @SuppressWarnings("hiding") PSubgraph _subgraph_,
        @SuppressWarnings("hiding") PEdgerhs _edgerhs_)
    {
        // Constructor
        setEdgeop(_edgeop_);

        setSubgraph(_subgraph_);

        setEdgerhs(_edgerhs_);

    }

    @Override
    public Object clone()
    {
        return new ASuberEdgerhs(
            cloneNode(this._edgeop_),
            cloneNode(this._subgraph_),
            cloneNode(this._edgerhs_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASuberEdgerhs(this);
    }

    public TEdgeop getEdgeop()
    {
        return this._edgeop_;
    }

    public void setEdgeop(TEdgeop node)
    {
        if(this._edgeop_ != null)
        {
            this._edgeop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._edgeop_ = node;
    }

    public PSubgraph getSubgraph()
    {
        return this._subgraph_;
    }

    public void setSubgraph(PSubgraph node)
    {
        if(this._subgraph_ != null)
        {
            this._subgraph_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subgraph_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._edgeop_)
            + toString(this._subgraph_)
            + toString(this._edgerhs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._edgeop_ == child)
        {
            this._edgeop_ = null;
            return;
        }

        if(this._subgraph_ == child)
        {
            this._subgraph_ = null;
            return;
        }

        if(this._edgerhs_ == child)
        {
            this._edgerhs_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._edgeop_ == oldChild)
        {
            setEdgeop((TEdgeop) newChild);
            return;
        }

        if(this._subgraph_ == oldChild)
        {
            setSubgraph((PSubgraph) newChild);
            return;
        }

        if(this._edgerhs_ == oldChild)
        {
            setEdgerhs((PEdgerhs) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
