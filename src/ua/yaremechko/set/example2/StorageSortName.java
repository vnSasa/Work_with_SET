package ua.yaremechko.set.example2;

import java.util.Comparator;

public class StorageSortName implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getProductName().compareTo(o2.getProductName()) > 0) {
			return 1;
		} else if (o1.getProductName().compareTo(o2.getProductName()) < 0) {
			return -1;
		}
		return 0;
	}

}
