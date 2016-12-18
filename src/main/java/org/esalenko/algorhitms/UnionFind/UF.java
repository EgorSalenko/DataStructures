package org.esalenko.algorhitms.UnionFind;

public class UF {
    private int id[];
    private int sz[];
    private int count;

    public UF(int size) {
        count = size;
        id = new int[size];
        for (int i = 0; i < size; i++)
            id[i] = i;
        sz = new int[size];
        for (int i = 0; i < size; i++)
            sz[i] = 1;
    }

    //________________________________________________
    // >> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
    // -----------------------------------------------
    // >  0 | 9 | 9 | 3 | 4 | 5 | 9 | 7 | 8 | 9 | 10 |

    public int find(int i) {    // i = 6
        int max = 0;
        while (i != id[i]) {    // 6 != id[6] == true
            i = id[i];          // i = id[6] = 9
            max = i;            // max = 9;
        }
        return max; // return 9
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }


    //________________________________________________
    // >> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |
    // ===============================================
    // >  0 | 9 | 9 | 3 | 4 | 5 | 9 | 7 | 8 | 9 | 10 |
    // -----------------------------------------------
    // >  0 | 9 | 9 | 3 | 4 | 5 | 9 | 7 | 8 | 9 | 10 |

    public void delete(int i) { // i = 1
        while (connected(i, id[i])) { // (1, id[1]==9) : 1, 9 -- true
            id[i] = i; // id[1] = 1; 9 = 1;
        }
    }

    /*
    *             9         0   3   4   5   6   7   8   10
    *          /  |   \
    *         1   2    6
    *
    *
    *
    *
    *
    *
    * */



}
