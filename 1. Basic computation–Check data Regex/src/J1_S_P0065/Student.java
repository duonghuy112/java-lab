package J1_S_P0065;

public class Student {
	private String name;
	private String classes;
	private float math;
	private float chemistry;
	private float physics;
	
	public Student(String name, String classes, float math, float chemistry, float physics) {
		this.name = name;
		this.classes = classes;
		this.math = math;
		this.chemistry = chemistry;
		this.physics = physics;
	}
	
	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public float getMath() {
		return math;
	}

	public void setMath(float math) {
		this.math = math;
	}

	public float getChemistry() {
		return chemistry;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}
	
	public float getAVG() {
		return (this.math + this.chemistry + this.physics) / 3;
	}
	
	public String getType() {
		if (getAVG() < 4) {
			return "D";
		} else if (getAVG() < 6) {
			return "C";
		} else if (getAVG() < 7.5) {
			return "B";
		} else {
			return "A";
		}
	}
	
	public void printStudent() {
		System.out.println("Name: " + this.name);
		System.out.println("Classes: " + this.classes);
		System.out.println("AVG: " + this.getAVG());
		System.out.println("Type: " + this.getType());
	}
}
