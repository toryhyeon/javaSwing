package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 * 디자인패턴 : 데코레이션 패턴
		 * 데코레이션 패턴( 케이크 만들 때 빵들에다가 장식(생크림) 얹는 패턴)
		 */
		BasicBot myBot = new BasicBot(); // 1. 빵틀을 준비
		GunBot myGun = new GunBot(myBot);
		ShieldBot myShield = new ShieldBot(myBot);
		
		myGun.status();
		myGun.chargeEnergy(50);
		myGun.status();
		myGun.shield(30);
		myGun.run();
		myGun.status();
		
		myShield.status();
		myShield.chargeEnergy(50);
		myShield.status();
		myShield.shield(30);
		myShield.status();
		myShield.run();
		myShield.status();
	}
}
