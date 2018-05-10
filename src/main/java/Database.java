import java.io.Serializable;

public class Database implements Serializable {
    public netflixBST bst;
    public netflixHeap heap;
    public netflixHash hash;
    public Object netflixHeap;
    public Object netflixHash;
    public Object netflixBST;


    public Database() {
        bst = new netflixBST();
        heap = new netflixHeap();
        hash = new netflixHash();
    }

    public customerNode acessCustomerRecord(int i) {
        return hash.lookUp(i);
    }

    public movieNode seeLeastRMovie() {
        return heap.findMin();
    }

    public void addMovie(movieNode newNode) {
        bst.insert(newNode);
        bst.insertID(newNode);
        heap.insert(newNode);
        hash.insert(newNode);
    }

    public void deleteMovie(movieNode p) {
        bst.delete();
        bst.deleteID(movieNode);
        heap.deleteMin();
        hash.delete(movieNode);
    }

    public void accessMovie(int x) {
        return bst.searchID(x).getTitle();
    }

    public void accessMovie2(int x) {
        return bst.search(x).getTitle();
    }

    public void printMovies() {
        bst.printTree();
    }


}
