package com.strategy;

import java.util.List;
import com.composite.Leaf;

public class ContextStrategy {
	
	private IStrategy strategy;
	
	public ContextStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void grouping(List<Leaf> studentList) {
		this.strategy.grouping(studentList);
	}
	
}
