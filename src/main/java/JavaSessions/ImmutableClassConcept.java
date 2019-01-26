package JavaSessions;

final public class ImmutableClassConcept {

	private int i;

	public ImmutableClassConcept(int i) {
		this.i = i;
	}

	public ImmutableClassConcept modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new ImmutableClassConcept(i);
		}
	}

	public static void main(String[] args) {

		ImmutableClassConcept obj = new ImmutableClassConcept(10);
		ImmutableClassConcept obj1 = obj.modify(100);
		ImmutableClassConcept obj2 = obj.modify(10);

		System.out.println(obj == obj1);
		System.out.println(obj == obj2);
	}

}
