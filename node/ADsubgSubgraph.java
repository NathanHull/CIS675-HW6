/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADsubgSubgraph extends PSubgraph
{
    private TSubgraphk _subgraphk_;
    private TLeftbrace _leftbrace_;
    private PStmtList _stmtList_;
    private TRightbrace _rightbrace_;

    public ADsubgSubgraph()
    {
        // Constructor
    }

    public ADsubgSubgraph(
        @SuppressWarnings("hiding") TSubgraphk _subgraphk_,
        @SuppressWarnings("hiding") TLeftbrace _leftbrace_,
        @SuppressWarnings("hiding") PStmtList _stmtList_,
        @SuppressWarnings("hiding") TRightbrace _rightbrace_)
    {
        // Constructor
        setSubgraphk(_subgraphk_);

        setLeftbrace(_leftbrace_);

        setStmtList(_stmtList_);

        setRightbrace(_rightbrace_);

    }

    @Override
    public Object clone()
    {
        return new ADsubgSubgraph(
            cloneNode(this._subgraphk_),
            cloneNode(this._leftbrace_),
            cloneNode(this._stmtList_),
            cloneNode(this._rightbrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADsubgSubgraph(this);
    }

    public TSubgraphk getSubgraphk()
    {
        return this._subgraphk_;
    }

    public void setSubgraphk(TSubgraphk node)
    {
        if(this._subgraphk_ != null)
        {
            this._subgraphk_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subgraphk_ = node;
    }

    public TLeftbrace getLeftbrace()
    {
        return this._leftbrace_;
    }

    public void setLeftbrace(TLeftbrace node)
    {
        if(this._leftbrace_ != null)
        {
            this._leftbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftbrace_ = node;
    }

    public PStmtList getStmtList()
    {
        return this._stmtList_;
    }

    public void setStmtList(PStmtList node)
    {
        if(this._stmtList_ != null)
        {
            this._stmtList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmtList_ = node;
    }

    public TRightbrace getRightbrace()
    {
        return this._rightbrace_;
    }

    public void setRightbrace(TRightbrace node)
    {
        if(this._rightbrace_ != null)
        {
            this._rightbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightbrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._subgraphk_)
            + toString(this._leftbrace_)
            + toString(this._stmtList_)
            + toString(this._rightbrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._subgraphk_ == child)
        {
            this._subgraphk_ = null;
            return;
        }

        if(this._leftbrace_ == child)
        {
            this._leftbrace_ = null;
            return;
        }

        if(this._stmtList_ == child)
        {
            this._stmtList_ = null;
            return;
        }

        if(this._rightbrace_ == child)
        {
            this._rightbrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._subgraphk_ == oldChild)
        {
            setSubgraphk((TSubgraphk) newChild);
            return;
        }

        if(this._leftbrace_ == oldChild)
        {
            setLeftbrace((TLeftbrace) newChild);
            return;
        }

        if(this._stmtList_ == oldChild)
        {
            setStmtList((PStmtList) newChild);
            return;
        }

        if(this._rightbrace_ == oldChild)
        {
            setRightbrace((TRightbrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
