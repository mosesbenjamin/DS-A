public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        // set id of each object to itself
        id = new int[N];
        for (int i=0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        // check whether p and q are in the same component
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        // change all entries with id[p] to id[q]
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
    }

    public static void main(String[] args) {
        QuickFindUF UF = new QuickFindUF(30);
        UF.union(4, 8);
        System.out.println(UF.connected(4, 8));
    }
}
