/*N cities are connected through roads, the cities are numbered from 0 to N-1. 
The roadmaps are given as a grid of size N*N, roadmap[][], the grid contains
0 and 1 as values where grid[i][j]=0, indicates no road between i to j cities,
grid[i][j]=1, indicates a road between i and j cities.

You are given an integer N, and the roadmap[][]of size N*N.
Your task is to find that there exists a loop in the roadmap, such that 
there exists a route consists of all the cities eaxctly once and the last city 
in the route should be connected to first city of the same route directly.
If you found such route print the route, otherwise print "No Solution"*/

import java.util.*;

class Solution
{
	static int V ;
	int path[];

	
	boolean isSafe(int v, int graph[][], int path[], int pos)
	{
		int getPathValue = path[pos - 1];
		
		printSolution(path);
		
		if (graph[getPathValue][v] == 0)
			return false;

		
		for (int i = 0; i < pos; i++)
			if (path[i] == v)
				return false;

		return true;
	}

	boolean hamCycleUtil(int graph[][], int path[], int pos)
	{
		
		if (pos == V)
		{
			
			
			int getPathValue = path[pos - 1];
			if (graph[getPathValue][path[0]] == 1)
				return true;
			else
				return false;
		}

		for (int v = 1; v < V; v++)
		{
			if (isSafe(v, graph, path, pos))
			{
				
				path[pos] = v;

				
				if (hamCycleUtil(graph, path, pos + 1) == true)
					return true;

				
				path[pos] = -1;
			}
		}

		return false;
	}



	int loopInRoadmap(int graph[][])
	{
		path = new int[V];
		for (int i = 0; i < V; i++)
			path[i] = -1;

		path[0] = 0;
		if (hamCycleUtil(graph, path, 1) == false)
		{
			System.out.println("\nNo Solution");
			return 0;
		}

		printSolution(path);
		return 1;
	}

	void printSolution(int path[])
	{
		for (int i = 0; i < V; i++)
			System.out.print(" " + path[i] + " ");

		System.out.println(" " + path[0] + " ");
	}

	
}
