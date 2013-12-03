
public class Model {
	

	public double L;
	public int antal;
	public Particle MyParticle;
	public Particle[] ParticleArray;
	
	public Model(int antalIn){
		int antal = antalIn;
		ParticleArray = new Particle[antalIn];
		for (int i=0; i<antal; i++){
			ParticleArray[i] = new Particle();
												//			System.out.println(i);
												//			MyParticle.setParticle(1,2);    // settern funkar!   
												//			double test = MyParticle.getParticle(); // gettern funkar! 			System.out.println(test);
												//		    System.out.println(ParticleArray[i].x);
		}
		System.out.println(ParticleArray.length);
	
	}
			
	 class Particle {
		public double x;
		public double y;
		
		
		public Particle(double xIn, double yIn) {					// konstruktor med koordinater som argument E1.3 bra fšr att man slipper upprepa sig
			this.x=xIn;
			this.y=yIn;
			
		}
		
		public Particle() {											//argumentlös konstruktor som skapar en MyParticle med slumpmässiga koordinater
			this(Math.random(), Math.random());
		}	

		public void setParticle(double xIn, double yIn) {			//setter: metod som tar två tal och sätter partikelns koordinater till dessa
			this.x = xIn;
			this.y = yIn;
		}
		
		public double getParticle() {								//getter: metod som hämtar partikelns koordinater
			return this.x + this.y;
		}

}
		public void setL(double LIn) {
			this.L = LIn;
		}
	 
//	 public void upDate() {
//		 System.out.println(L);
//	 }
}