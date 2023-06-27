public class App {
    public static void main(String[] args) {

        String [][] names=new String[3][3];

        String [][] numbers={
            {"Bo Bo","Kathy","Jonh"},
            {"Beginner","Elementary","Elite"}
        };

         String [][] books={
            {"Atr","politics","business"},
            {"Kyar pauk","San lwin","MK"}
        };
        

        printArray(books);
        
    }

    public static void printArray(String [][] names){
         int numCol=names[0].length;

        for(int i=0;i<names.length;i++){
            for(int j=0; j<numCol;j++){
                System.out.println(names[i][j]+ " ");
            }
        }
    }
}
