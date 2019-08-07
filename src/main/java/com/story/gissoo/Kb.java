package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 * @param <AvKBPieces>
 */
abstract public class Kb<AvKBPs extends AvKbPieces> {

    public KbPiece getARandomKbPiece(AvKbPieces aKB) {
        return null;
    }

    public ArrayList<KbPiece> getRandomKbPieces(int sampleSize,AvKbPieces aKB) {
        return null;
    }

    public KbPiece getSimilarKbPiece(KbPiece kbPiece) {
        return null;
    }
    
}
