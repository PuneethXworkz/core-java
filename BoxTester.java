class BoxTester {

public static void main(String args[]){
	
	BoxDTO box = new BoxDTO();
	box.setBrand ("TupperWare");
	box.setPrice (129.99);
	box.setColor ("Multi");
	box.setSize ("34x34 cms");
	box.setNoOfSets (4);
	
	
	System.out.println(box.getBrand() +" "+box.getPrice() +" "+box.getColor() +" "+ box.getSize() +" "+ box.getNoOfSets()+" ");
	
}

}