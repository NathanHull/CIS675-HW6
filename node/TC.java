/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TC extends Token
{
    public TC()
    {
        super.setText("c");
    }

    public TC(int line, int pos)
    {
        super.setText("c");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TC(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTC(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TC text.");
    }
}
