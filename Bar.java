class Bar{

String name;
int id;
String ownerName;
String type;
String gstNo;
String brands[] = new String[7];
//String brands[] = {"GimBim","Imperial Blue","Blender's Pride","Original Choice","Black & White","Teachers","Black Dog"};

public static void main(String a[]){
	
	Bar bar = new Bar();
bar.name = "Sunrise";
bar.id = 2289;
bar.ownerName = "Raghu";
bar.type = "Bar & Family Restuarant";
bar.gstNo = "GSTXXYHN986";
System.out.println("1st Bar :"+bar.name);
System.out.println("Bar id :"+bar.id);
System.out.println("Owner Name :"+bar.ownerName);
System.out.println("Type :"+bar.type);
System.out.println("GST No :"+bar.gstNo);
bar.brands[0]="GimBim";
bar.brands[1]="Imperial Blue";
bar.brands[2] = "Blender's Pride";
bar.brands[3] = "Original Choice";
bar.brands[4] = " Black & White";
bar.brands[5] = "Teachers";
bar.brands[6] = "Black Dog";
System.out.println("Brands Available in "+bar.name+ " are");
bar.getBrands();

	Bar bar1 = new Bar();
bar1.name = "Padma";
bar1.id = 3387;
bar1.ownerName = "Ramu";
bar1.type = "Bar & Restuarant";
bar1.gstNo = "GSTXXYKJ987";
System.out.println("2nd Bar :"+bar1.name);
System.out.println("Bar id :"+bar1.id);
System.out.println("Owner Name :"+bar1.ownerName);
System.out.println("Type :"+bar1.type);
System.out.println("GST No :"+bar1.gstNo);
bar1.brands[0]="GimBim";
bar1.brands[1]="Imperial Blue";
bar1.brands[2] = "Blender's Pride";
bar1.brands[3] = "Original Choice";
bar1.brands[4] = " Black & White";
bar1.brands[5] = "Teachers";
bar1.brands[6] = "Black Dog";
System.out.println("Brands Available in "+bar1.name+ " are");
bar1.getBrands();

}
	
public void getBrands(){
	for(int i=0; i<brands.length;i++){
	System.out.println(brands[i]);
	}
}
}