/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TEdgek extends Token
{
    public TEdgek()
    {
        super.setText("edge");
    }

    public TEdgek(int line, int pos)
    {
        super.setText("edge");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEdgek(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEdgek(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEdgek text.");
    }
}