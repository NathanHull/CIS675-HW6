/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TSubgraphk extends Token
{
    public TSubgraphk()
    {
        super.setText("subgraph");
    }

    public TSubgraphk(int line, int pos)
    {
        super.setText("subgraph");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSubgraphk(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSubgraphk(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSubgraphk text.");
    }
}
