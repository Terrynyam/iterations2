public class Main {
    public static void main(String[] args) {
//        for(int l = 3; l >= 0; l--){
////            System.out.print(l);
//            for(int m =l; m >= 0; m--){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        for(int l = 3; l >= 0; l--){
//            System.out.print(l);
            for(int n = 1; n <=(3-l); n++)
                System.out.print(' ');
            for(int m =l; m >= 0; m--){
                System.out.print('*');
            }
            for(int m =(l-1); m >= 0; m--){
                System.out.print('*');
            }

            System.out.println();
        }
    }
}