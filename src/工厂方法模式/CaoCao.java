package 工厂方法模式;

public class CaoCao implements ISwordFactory {

	@Override
	public AbstractSword createSword() {
		return new QIXingSword();
	}

}
