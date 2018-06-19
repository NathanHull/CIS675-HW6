/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import node.*;
import analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTStrict(@SuppressWarnings("unused") TStrict node)
    {
        this.index = 0;
    }

    @Override
    public void caseTDigraphk(@SuppressWarnings("unused") TDigraphk node)
    {
        this.index = 1;
    }

    @Override
    public void caseTSubgraphk(@SuppressWarnings("unused") TSubgraphk node)
    {
        this.index = 2;
    }

    @Override
    public void caseTGraphk(@SuppressWarnings("unused") TGraphk node)
    {
        this.index = 3;
    }

    @Override
    public void caseTNodek(@SuppressWarnings("unused") TNodek node)
    {
        this.index = 4;
    }

    @Override
    public void caseTEdgek(@SuppressWarnings("unused") TEdgek node)
    {
        this.index = 5;
    }

    @Override
    public void caseTLeftbrace(@SuppressWarnings("unused") TLeftbrace node)
    {
        this.index = 6;
    }

    @Override
    public void caseTRightbrace(@SuppressWarnings("unused") TRightbrace node)
    {
        this.index = 7;
    }

    @Override
    public void caseTLeftbracket(@SuppressWarnings("unused") TLeftbracket node)
    {
        this.index = 8;
    }

    @Override
    public void caseTRightbracket(@SuppressWarnings("unused") TRightbracket node)
    {
        this.index = 9;
    }

    @Override
    public void caseTEdgeop(@SuppressWarnings("unused") TEdgeop node)
    {
        this.index = 10;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 11;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 12;
    }

    @Override
    public void caseTAssignment(@SuppressWarnings("unused") TAssignment node)
    {
        this.index = 13;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 14;
    }

    @Override
    public void caseTN(@SuppressWarnings("unused") TN node)
    {
        this.index = 15;
    }

    @Override
    public void caseTNe(@SuppressWarnings("unused") TNe node)
    {
        this.index = 16;
    }

    @Override
    public void caseTE(@SuppressWarnings("unused") TE node)
    {
        this.index = 17;
    }

    @Override
    public void caseTSe(@SuppressWarnings("unused") TSe node)
    {
        this.index = 18;
    }

    @Override
    public void caseTS(@SuppressWarnings("unused") TS node)
    {
        this.index = 19;
    }

    @Override
    public void caseTSw(@SuppressWarnings("unused") TSw node)
    {
        this.index = 20;
    }

    @Override
    public void caseTW(@SuppressWarnings("unused") TW node)
    {
        this.index = 21;
    }

    @Override
    public void caseTNw(@SuppressWarnings("unused") TNw node)
    {
        this.index = 22;
    }

    @Override
    public void caseTC(@SuppressWarnings("unused") TC node)
    {
        this.index = 23;
    }

    @Override
    public void caseTU(@SuppressWarnings("unused") TU node)
    {
        this.index = 24;
    }

    @Override
    public void caseTId(@SuppressWarnings("unused") TId node)
    {
        this.index = 25;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 26;
    }
}