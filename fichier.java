class Decipherer {


	public static void main(String[] args) {

		String[] messages = { 
			"0@sn9sirppa@#?ia'jgtvryko1",
			"q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
			"aopi?sedohtém@#?sedhtmg+p9l!",
		};
		
		for (int i = 0; i < messages.length; i= i + 1) {
			int chiffre_clé = (messages[i].length())/2;
				
			String sous_chaîne = messages[i].substring(5, 5 + chiffre_clé);
			
			String sous_chaînebis = sous_chaîne.replace ( "@#?", " ");
			
			String revers = new StringBuffer(sous_chaînebis).reverse().toString();
			System.out.println(revers);
		};
	}
		
		
	
}	