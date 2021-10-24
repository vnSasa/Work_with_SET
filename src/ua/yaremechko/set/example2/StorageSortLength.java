package ua.yaremechko.set.example2;

import java.util.Comparator;

public class StorageSortLength implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getLengthProduct()>o2.getLengthProduct()) {
			return 1;
		} else if (o1.getLengthProduct() < o2.getLengthProduct()) {
			return -1;
		}
		return 0;
	}

}
