//function with return type as an array
class Ademo6{
    int[] getArray(int i){
        int[] j = null;
        j = new int[i];
        for(int k=0;k<i;k++){
            j[k]=k*k;
        }
        return(j);
    }
    public static void main(String[] args) {
        Ademo6 a1 = new Ademo6();
        int i[] = a1.getArray(10);
        for(int j=0;j<i.length;j++){
            System.out.println(i[j]);
        }
        a1.getArray(5);//return datatype not handled
    }
}