
class Circulo implements AreaCalculavel{
	
	private double raio;
	
	public void circulo(double raio){
		this.raio = raio;
		
	}
	
	public double calculaArea(){
		return this.raio *this.raio*Math.PI;
	}

}
