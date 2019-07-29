package com.story.gissoo;

import java.util.ArrayList;

/**
 *
 * @author Mohammad Rahmani <mohammad.rahmani.xyz@gmail.com>
 * @param <AvKBPieces>
 */
abstract public class KB<AvKBPs extends AvKBPieces> {

    abstract public KBPiece getARandomKBPiece(AvKBPieces aKB);

    abstract public ArrayList<KBPiece> getRandomKBPieces(int sampleSize);
}
