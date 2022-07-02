package contest;

import java.util.Arrays;
import java.util.Comparator;

public class Contest2 {
	public static void main(String args[]) {
		int n = 7;
		int[][] edges = {{0,2},{0,5},{2,4},{1,6},{5,4}};
		
		Arrays.sort(edges, Comparator.comparingDouble(o -> o[0]));
		
		int length = edges.length;
		int allPossibleCount = (n * (n-1)) / 2;
		int[][] transitive = new int[n][2];
		int index = 0;
		for(int i = 0; i < length - 1; i++) {
			  for(int j = i+1; j < length; j ++) {
				  if(edges[i][0] == edges[j][0]) {
					  transitive[index][0] = edges[i][1];
					  transitive[index][1] = edges[j][1];
					  index++;
				  }
				  if(edges[i][1] == edges[j][1]) {
					  transitive[index][0] = edges[i][0]; 
				      transitive[index][1] = edges[j][0];
				      index++;
				  }
				  if(edges[i][1] == edges[j][0]) {
					  transitive[index][0] = edges[i][0];
					  transitive[index][1] = edges[j][1];
					  index++;
				  }
			  }
		}
		
		int[][] tmp = new int[2][2];
		for(int i = 0; i < transitive.length; i++) {
			for(int j = 0; j < 2; j++) {
				if(transitive[i][j] == tmp[i][j]) {
					
				}
			}
		}
		
		
		
		System.out.println("d");
		
	}
	
	public long countPairs(int n, int[][] edges) {
		return n;
    }
}