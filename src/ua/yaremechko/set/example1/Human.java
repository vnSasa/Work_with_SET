package ua.yaremechko.set.example1;

public class Human implements Comparable<Human> {

	String nameHuman;
	int age;

	public Human(String nameHuman, int age) {
		super();
		this.nameHuman = nameHuman;
		this.age = age;
	}

	public String getNameHuman() {
		return nameHuman;
	}

	public void setNameHuman(String nameHuman) {
		this.nameHuman = nameHuman;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [nameHuman=" + nameHuman + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((nameHuman == null) ? 0 : nameHuman.hashCode());
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
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (nameHuman == null) {
			if (other.nameHuman != null)
				return false;
		} else if (!nameHuman.equals(other.nameHuman))
			return false;
		return true;
	}

	@Override
	public int compareTo(Human o) {
		return this.nameHuman.compareTo(o.getNameHuman());
	}

}
