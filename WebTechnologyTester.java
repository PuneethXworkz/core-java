class WebTechnologyTester{

public static void main(String a[]){
	
	HTML web = new HTML();
	web.developedBy = "WHATWG";
	web.initialRelease = "1993";
	web.latestRelease = "Living Standard 2022";
	web.containedBy = "Web browser";
	web.extendedFrom = "SGML";
	web.extendedTo = "XHTML";
	
	web.communication();
	System.out.println("HTML was developed by :"+web.developedBy+"\n"+"Containde by :"+web.containedBy+"\n"+"Initial Release :"+web.initialRelease+"\n"+"Latest Release :"+web.latestRelease+"\n"+"Extended from :"+web.extendedFrom+"\n"+"Extended to :"+web.extendedTo+"\n");
	
}


}