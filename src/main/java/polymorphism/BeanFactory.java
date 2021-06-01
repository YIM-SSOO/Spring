package polymorphism;

public class BeanFactory {

	public Object getBean(String beanName) {

		// 인자 값으로 구별
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
	}
}
