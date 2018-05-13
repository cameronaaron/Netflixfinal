import java.io.Serializable;

public class Database implements Serializable{
	public netflixBST bst;
	public netflixHeap heap;
	public netflixHash hash;
	public wishList wishlist;
	

	public Database(){
		bst = new netflixBST();
		heap = new netflixHeap();
		hash = new netflixHash();
		wishlist = new wishList();
	}

    public customerNode accessCustomerRecord(int i) {
		return hash.lookUp(i);
	}
	public movieNode seeLeastRMovie() {
		return heap.findMin();
	}
	public void addMovie(movieNode newNode) {
		bst.insert(newNode);
		bst.insertID(newNode);
		heap.insert(newNode);
		//wishlist.insert(newNode);
	}
	public void deleteLowestMovie(){
		heap.deleteMin();
	}
	public void deleteMovie(movieNode newNode) {
		bst.delete(newNode);
		bst.deleteID(newNode);
	}
	public String accessMovie(int x) {
		return bst.searchID(x).getTitle();
	}
	public String accessMovie2(int x) {
		return bst.search(x).getTitle();
	}
	public void printMovies() {
		bst.printTree();
	}



























}