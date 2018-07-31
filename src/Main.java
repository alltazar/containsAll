
public class Main {
    public static void main(String[] args){

    }
}

class ContainsAll{

    static boolean check(int[] a, int[] b){
        int x = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                if (a[i] == b[j]){
                    x++;
                    break;
                }
            }
        }

        if (x == a.length){
            return true;
        } else {
            return false;
        }
    }
}