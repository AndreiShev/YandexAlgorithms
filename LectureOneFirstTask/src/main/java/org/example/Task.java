package org.example;

public class Task {
    public Task() {
    }


    public int count(String p, String v, String q, String m) {
        int pStartTree = Integer.parseInt(p);
        int pRange = Integer.parseInt(v);
        int minP = 0;
        int maxP = 0;
        if(pRange != 0) {
            minP = pStartTree  - pRange;
            maxP = pStartTree  + pRange;
        }

        int qStartTree = Integer.parseInt(q);
        int qRange = Integer.parseInt(m);
        int minQ = 0;
        int maxQ = 0;
        if (qRange != 0) {
            minQ = qStartTree  - qRange;
            maxQ = qStartTree  + qRange;
        }

        int zeroTree = 1;
        if (pRange == 0 && qRange == 0) {
            if (pStartTree == qStartTree) {
                return zeroTree;
            } else {
               return zeroTree*2;
            }
        } else if (pRange == 0) {
            if (pStartTree >= minQ && pStartTree <= maxQ) {
                return ((maxQ - minQ) + zeroTree);
            } else {
                return ((maxQ - minQ) + zeroTree*2);
            }
        } else if (qRange == 0) {
            if (qStartTree >= minP && qStartTree <= maxP) {
                return (zeroTree + maxP - minP);
            } else {
                return (zeroTree*2 + maxP - minP);
            }
        } else {
            if ((maxP >= minQ && minP <= minQ) || (maxQ >= minP && minQ <= minP)) {
                int max = maxQ > maxP ? maxQ : maxP;
                int min = minQ < minP ? minQ : minP;
                return zeroTree + (max - min);
            } else {
                return (zeroTree + maxP - minP) + ((maxQ - minQ) + zeroTree);
            }
        }
    }


}
