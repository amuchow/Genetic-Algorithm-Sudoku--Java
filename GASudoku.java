import java.util.Scanner;
import java.io.*;

public class GASudoku {

		private static int puzSize[] = {0,0};

		public static void main(String[] args) throws IOException{
			
			Scanner in = null;
			in = new Scanner (new BufferedReader(new FileReader("easy1.txt")));

			puzSize[0] = in.nextInt();
			puzSize[1] = in.nextInt();
			int[] initialpuzzle = new int[(puzSize[0]*puzSize[1])];
			int i = 0;
			int temp;
			while(in.hasNext()){
				initialpuzzle[i] = in.nextInt()-32;
				i++;

			}
			printPuz(initialpuzzle);
			
			
		}
		public static void printPuz(int[] initialpuz){
			for(int i = 0; i < puzSize[0];i++){
				for(int j = 0; j < puzSize[1]; j++)
					System.out.print(initialpuz[i*puzSize[0]+ j] + ' ');
				System.out.print('\n');
			}
		}
}
