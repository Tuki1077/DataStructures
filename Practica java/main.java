public class letra implements Comparable<letra>{
    char letras;
    int n = 0;

    public letra(char a){
        this.letras = a;
    }
    public int compareTo(letra other){
        if(n > other.n){
            return -1;
        }
        else if (n == other.n){
            return 0;
        }
        else {
            return 1;
        }
    }
}
