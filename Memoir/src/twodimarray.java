public class twodimarray {
    public static void main(String[] args){
        int x[] = {20,30,40};
        int y[][] = {{20,30,40},{11,12,13}};
//        System.out.println(y[0][1]);
//        for (int i=0;i<x.length;i++){
//            System.out.println(x[i]);
//        }
        for (int i=0;i< y.length;i++){
            for (int j=0; j<y[i].length;j++){
                System.out.println(y[i][j]);
            }
        }
    }
}
