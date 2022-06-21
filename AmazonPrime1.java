class AmazonPrime1{
//Array Concept with for loop within main method

static String series[]={"Inside Edge","Lakkhon Mein Ek","Breathe","Gangstar","Mirzapur","Vella Raja","Made in Heaven","The Family Man","The Forgotten Army","Shaitaan Haveli","Four More Shots Please","Hostel Daze","Mind The Malhotras","Pushpavalli","The Remix","Comicstaan","Hear Me, Love Me","Skulls & Roses","One Mic Stand","Chacha Vidhayak Hain Humare"};

static String kannadaMovies[]={"Dia","KGF-1","Love Mocktail","Kavaludaari","Avane Sriman Narayana","Kahi","Gantu Moote","Malgudi Days","Katha Sangama","Katheyondu Shuruvagide","Devaki","Nanna Prakara","Kapata Nataka Pathradhari","Chambal","Babru"};

static String hindiMovies[]={"The Lunch Box","Unpaused","shikara","Kai Po Che","Dilwale Dulhania Le Jayenge","Section 375","Hichki","Maqbool","Karwaan","Thappad","Newton","Shankuntala Devi","The Ghazi Attack","Bajiroa Mastani","Raazi","Mitron","Tunbbad","Sonu Ke Tittu Ki Sweety","Gully Boy","Agent Sai"};

static String malayalamMovies[]={"Ayyapanum Koshiyum","Trance","Maheshinte Prathikaaram","Kammara Sambhavam","Kumbalangi Nights","Virus","Drishyam 2","Home","The great Indian Kitchen","Jallikattu","Android Kunjappan version","Joji","Malik","Joseph","Kuruthi","Helen","C U Soon","Kettyolaanu Ente Malakha","Aarkkariyam","Ishq"};

static String movies[]={"One Night in Miami","Raging Ball","Fargo","Lincoln","Train to Busan","Young Frankenstein","Tangerine","The Terminator","Manchester by Sea","You Were never Really Here","Emma","The Big Sick","Hell Raiser","Rushmore","Small Axe","The General","O Brother","Bill Ted's","Office Space","We Need to Talk About Kevin"};

public static void main(String args[]){
	
	System.out.println("Top 20 Web Series On AmazonPrime");
	for(int i=0;i<series.length;i++){
			System.out.println(series[i]);
	}
	
System.out.println("=====================================");
	
	System.out.println("Top 15 Kannada Movies on AmazonPrime");
	for(int i=0;i<kannadaMovies.length;i++){
	System.out.println(series[i]);
 }
	
System.out.println("=====================================");
	
	System.out.println("Top 20 Hindi Movies on Amazon Prime");
	 for(int i=0;i<hindiMovies.length;i++){
	 System.out.println(hindiMovies[i]);
 }	

System.out.println("======================================");

 System.out.println("Top 20 Malayalam Movies on AmazonPrime");
  for(int i=0;i<malayalamMovies.length;i++){
	  System.out.println(malayalamMovies[i]);
  } 
  
System.out.println("=======================================");
 
 System.out.println("Top 20 Movies on AmazonPrime");
  for(int i=0;i<movies.length;i++){
	 System.out.println(movies[i]);
 }
 
}
}