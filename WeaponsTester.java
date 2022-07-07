class WeaponsTester {
	
	public static void main(String args[]){
		
		WeaponsDTO weapon = new WeaponsDTO();
		
		weapon.setName("M416");
		weapon.setType("Tactical Rifle");
		weapon.setFiringMode("Semi Automatic");
		weapon.setPrice("499.6$");
		weapon.setIsUsedFor("Combat Operation");
		
		System.out.println(weapon.getName()+" "+weapon.getType()+" "+weapon.getFiringMode()+" "+weapon.getPrice()+" "+weapon.getIsUsedFor() );
		
		
	}
	
}