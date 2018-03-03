package main;

import java.io.*;
import java.util.*;

public class DGraph<T> {
	private List<LinkedList<Integer>> adjacencyList;
	private Map<T, Integer> mapTtoInteger;
	private int index;
	
	public DGraph() {
		adjacencyList = new ArrayList<LinkedList<Integer>>();
		mapTtoInteger = new HashMap<T, Integer>();
		index = 0;
	}
	
	public void buildDGraph(List<ArrayList<T>> spec) {
		int specSize = spec.size();
		
		for(int x = 0; x < specSize; x++) {
			List<T> line = spec.get(x);
			int lineSize = line.size();
			
			for(int y = 0; y < lineSize; y++) {
				T token = line.get(y);
				
				addVertex(token);
				if (y == 0) {
					
				}
			}
		}
	}
	
	public void addVertex(T vertex) {
		if(!mapTtoInteger.containsKey(vertex)){
			mapTtoInteger.put(vertex, index);
			index++;
		}
	}
	
	public void addEdge(T vertexFrom, T vertexTo) {
		
		if(mapTtoInteger.containsKey(vertexFrom) && mapTtoInteger.containsKey(vertexTo))
			adjacencyList.get(mapTtoInteger.get(vertexFrom)).add(mapTtoInteger.get(vertexTo));
	}
	
	public String topOrdGeneration(T startVertex) {
		return "";
	}
}
