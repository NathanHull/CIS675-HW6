/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAttrListAttrList extends PAttrList
{
    private TLeftbracket _leftbracket_;
    private PAList _aList_;
    private TRightbracket _rightbracket_;
    private PAttrList _attrList_;

    public AAttrListAttrList()
    {
        // Constructor
    }

    public AAttrListAttrList(
        @SuppressWarnings("hiding") TLeftbracket _leftbracket_,
        @SuppressWarnings("hiding") PAList _aList_,
        @SuppressWarnings("hiding") TRightbracket _rightbracket_,
        @SuppressWarnings("hiding") PAttrList _attrList_)
    {
        // Constructor
        setLeftbracket(_leftbracket_);

        setAList(_aList_);

        setRightbracket(_rightbracket_);

        setAttrList(_attrList_);

    }

    @Override
    public Object clone()
    {
        return new AAttrListAttrList(
            cloneNode(this._leftbracket_),
            cloneNode(this._aList_),
            cloneNode(this._rightbracket_),
            cloneNode(this._attrList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAttrListAttrList(this);
    }

    public TLeftbracket getLeftbracket()
    {
        return this._leftbracket_;
    }

    public void setLeftbracket(TLeftbracket node)
    {
        if(this._leftbracket_ != null)
        {
            this._leftbracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftbracket_ = node;
    }

    public PAList getAList()
    {
        return this._aList_;
    }

    public void setAList(PAList node)
    {
        if(this._aList_ != null)
        {
            this._aList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._aList_ = node;
    }

    public TRightbracket getRightbracket()
    {
        return this._rightbracket_;
    }

    public void setRightbracket(TRightbracket node)
    {
        if(this._rightbracket_ != null)
        {
            this._rightbracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightbracket_ = node;
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
            + toString(this._leftbracket_)
            + toString(this._aList_)
            + toString(this._rightbracket_)
            + toString(this._attrList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._leftbracket_ == child)
        {
            this._leftbracket_ = null;
            return;
        }

        if(this._aList_ == child)
        {
            this._aList_ = null;
            return;
        }

        if(this._rightbracket_ == child)
        {
            this._rightbracket_ = null;
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
        if(this._leftbracket_ == oldChild)
        {
            setLeftbracket((TLeftbracket) newChild);
            return;
        }

        if(this._aList_ == oldChild)
        {
            setAList((PAList) newChild);
            return;
        }

        if(this._rightbracket_ == oldChild)
        {
            setRightbracket((TRightbracket) newChild);
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
