package lambdawrtanonymousclass;

public class TEst2 {
	public static void main(String[] args) {
		
	
	
	Interfacez interfacez = new Interfacez() {
		
		@Override
		public void n() {
			System.out.println("n....interfacez");
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void m() {
			System.out.println("m.....interfacez");
			// TODO Auto-generated method stub
			
		}
	};
	
	interfacez.n();
	interfacez.m();
}
}
