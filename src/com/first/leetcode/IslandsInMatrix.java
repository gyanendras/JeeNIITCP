package com.first.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class IslandsInMatrix {

	HashSet<ArrItem> visited = new HashSet<>();
	LinkedList<ArrItem> stack = new LinkedList<>();
	int islandCount = 0;
	boolean area = false;
    HashMap<ArrItem, Integer> offArea = new HashMap<>();
    ArrItem stackItem = null;
	
	static class ArrItem {
		static int area = 1;
		int i;
		int j;

		public ArrItem(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + i;
			result = prime * result + j;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ArrItem other = (ArrItem) obj;
			
			if (i != other.i)
				return false;
			if (j != other.j)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "ArrItem [i=" + i + ", j=" + j + "]";
		}

		
	}


	public int numIslands(char[][] grid) {
		HashMap<ArrItem, Integer> hs = null;
		
		for (int i = 0; i < grid.length; ++i) {
			for (int j = 0; j < grid[0].length; j++) {
				
				if (grid[i][j] == '1' && !visited.contains(new ArrItem(i,j))) {
					System.out.println("i & j "+i+" "+j);
					hs = getIsland(i, j, grid);
				}

			}

		}
        System.out.println("Area count is "+ hs);
		return islandCount;
	}

	private HashMap<ArrItem, Integer> getIsland(int i, int j, char[][] grid) {
		ArrItem arrItem = new ArrItem(i, j);
		ArrItem arrItemElement = arrItem;
		System.out.println("Visited "+ i + j + visited.toString());
		System.out.println("Stack " + stack.toString());

		if (!visited.contains(arrItem)) {
			if (i - 1 >= 0 && grid[i - 1][j] == '1') {
				arrItemElement = new ArrItem(i-1, j);
				++arrItemElement.area;
				addItem(arrItemElement);
			}
			if (j - 1 >= 0 && grid[i][j - 1] == '1') {
				arrItemElement = new ArrItem(i, j-1);
				++arrItemElement.area;
				addItem(arrItemElement);
			}
			if (i + 1 < grid.length && grid[i + 1][j] == '1') {
				arrItemElement = new ArrItem(i+1, j);
				++arrItemElement.area;
				addItem(arrItemElement);
			}
			if (j + 1 < grid[0].length && grid[i][j + 1] == '1') {
				arrItemElement = new ArrItem(i, j+1);
				++arrItemElement.area;
				addItem(arrItemElement);
			}
			
			visited.add(arrItem);
			
		}

		if (stack.peekFirst() == null ) {
			System.out.println("Island Count is "+ ++islandCount);
			offArea.put(stackItem, stackItem.area);
			arrItemElement.area = 1;
			return offArea;
		} else {
			stackItem = stack.pop();
			getIsland(stackItem.i, stackItem.j, grid);
		}
		return offArea;
	}

	private void addItem(ArrItem arrItem) {
		if (!visited.contains(arrItem)) {
		    stack.push(arrItem);
		}
	};

}
