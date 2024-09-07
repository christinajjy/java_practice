class Ademo1{
    int ar1[];
    float ar2[]= new float [3];
    public static void main(String args[]){
        Ademo1 a1 = new Ademo1();
        System.out.println(a1.ar1);
        System.out.println(a1.ar2);
        a1.ar2[1]= 67f;
        a1.ar1 = new int[3];
        System.out.println(a1.ar1[1]);
        a1.ar1[a1.ar1.length -1]=12;
        int ar1[]= new int[4];
        for(int i=0;i<ar1.length;i++){
            ar1[i]=i*i;
        }
        for(int j=0;j<ar1.length;j++){
            System.out.println(ar1[j]);
        }

    }
}