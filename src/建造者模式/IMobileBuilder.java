package 建造者模式;

public interface IMobileBuilder {

	void buildMoney();

	void buildShortInfo();

	void buildMusic();

	MobilePackage getMobilePackage();

}
