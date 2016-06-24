package BuilderMethod;

public class Main {

	public static void main(String[] args) {
		// 制造一台911
		Builder builder = new Builder911();
		Director director = new Director(builder);
		Car car911 = director.build();
		// 制造一台911
		Builder builderCayma = new BuilderCayma();
		Director directorCayma = new Director(builderCayma);
		Car carCayma = directorCayma.build();
	}

}
