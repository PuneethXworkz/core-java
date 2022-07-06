class WeaponsTester {
	
	public static void main(String args[]){
		
		Weapons weapon = new Weapons();
		
		weapon.setName("M416");
		weapon.setType("Tactical Rifle");
		weapon.setFiringMode("Semi Automatic");
		weapon.setPrice("499.6$");
		weapon.setIsUsedFor("Combat Operation");
		
		System.out.println(weapon.getName()+" "+weapon.getType()+" "+weapon.getFiringMode()+" "+weapon.getPrice()+" "+weapon.getIsUsedFor() );
		
		
	}
	
}