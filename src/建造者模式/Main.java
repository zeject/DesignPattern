package 建造者模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileDirector md = new MobileDirector();
		MobilePackage mp = md.createMobilePackage(new TaoCan1());
		MobilePackage mp2 = md.createMobilePackage(new TaoCan2());
		System.out.println(mp.toString());
		System.out.println(mp2.toString());

	}

}
