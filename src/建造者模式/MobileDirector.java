package 建造者模式;

public class MobileDirector {

	public MobilePackage createMobilePackage(IMobileBuilder iMobileBuilder) {
		if (iMobileBuilder == null) {
			return null;
		}

		iMobileBuilder.buildMoney();
		iMobileBuilder.buildMusic();
		iMobileBuilder.buildShortInfo();
		return iMobileBuilder.getMobilePackage();
	}

}
