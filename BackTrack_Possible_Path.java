public class BackTrack_Possible_Path {


    // count path number
    static int count(int r,int c){

        if (r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int righ=count(r,c-1);
        return left+righ;
    }

    // Print path
    static void path(String pt,int r,int c){
        if (r==1 && c==1){
            System.out.println(pt);
            return;
        }
        if (r>1){
            path(pt+'D',r-1,c);
        }
        if (c>1){
            path(pt+'R',r,c-1);
        }
    }


    //Permutation
    public static void PrintPermutation(String str,String perm,int index){
        if (str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            PrintPermutation(newStr,perm+currchar,index-1);
        }
    }


    public static void main(String[] args) {
     /*   System.out.println(count(3,3));
        path("",3,3);
        System.out.println("permutation");
        PrintPermutation("ABC","",0);*/


        System.out.println("abc".substring(2));
    }
}
