package org.LocalitySensitiveHashingForShortStrings;

import java.util.BitSet;
public class Similarity {
    public static float JaccardSimilarity(BitSet vector1, BitSet vector2){
        BitSet union = (BitSet) vector1.clone();
        union.or(vector2);
        BitSet intersection = (BitSet) vector1.clone();
        intersection.and(vector2);
        int unionSize = union.cardinality();
        int intersectionSize = intersection.cardinality();
        return (float) intersectionSize / (float) unionSize;
    }
}
