class Solution {
    public int[][] generateMatrix(int n) {
        int direction = 1;//right
        int num = 1;
        int[][] ret = new int[n][n];
        for (int a = 0; a < n; a++) {
        	for (int b = 0; b < n; b++) {
        		ret[a][b] = 0;
        	}
        }//initialize
        int i = 0, j = -1;
        while(true){        	
        	switch(direction){
        		case 1:{
        			if ((j + 1 == n) || ret[i][j+1]!=0) {
        				direction = 2;
        				continue;
        			}
        			else {
        				j = j + 1;
        			}
        			break;
        		}
        		case 2:{
        			if ((i + 1 == n)||ret[i+1][j]!=0) {
        				direction = 3;
        				continue;
        			}
        			else {
        				i = i + 1;
        			}
        			break;
        		}
        		case 3:{
        			if ((i - 1 < 0)||ret[i-1][j]!=0) {
        				direction = 4;
        				continue;
        			}
        			else {
        				i = i - 1;
        			}
        			break;
        		}
        		case 4:{
        			if ((j - 1 < 0)||ret[i][j-1]!=0) {
        				direction = 1;
        				continue;
        			}
        			else {
        				j = j - 1;
        			}
        			break;
        		}
        	}
        	ret[i][j] = num;
        	num++;
        	if (num > n * n) {
        		return ret;
        	}
        }
    }
}