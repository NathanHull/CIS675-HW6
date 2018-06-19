/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ACpwCompassPt extends PCompassPt
{
    private TW _w_;

    public ACpwCompassPt()
    {
        // Constructor
    }

    public ACpwCompassPt(
        @SuppressWarnings("hiding") TW _w_)
    {
        // Constructor
        setW(_w_);

    }

    @Override
    public Object clone()
    {
        return new ACpwCompassPt(
            cloneNode(this._w_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACpwCompassPt(this);
    }

    public TW getW()
    {
        return this._w_;
    }

    public void setW(TW node)
    {
        if(this._w_ != null)
        {
            this._w_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._w_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._w_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._w_ == child)
        {
            this._w_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._w_ == oldChild)
        {
            setW((TW) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
