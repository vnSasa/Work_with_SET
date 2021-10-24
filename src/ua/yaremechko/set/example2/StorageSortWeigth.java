package ua.yaremechko.set.example2;

import java.util.Comparator;

public class StorageSortWeigth implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getWeightProduct() > o2.getWeightProduct()) {
			return 1;
		} else if(o1.getWeightProduct() < o2.getWeightProduct()) {
			return -1;
		}
		return 0;
	}

}
